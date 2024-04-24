package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.Dao;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements Dao<Department> {

    private Connection connection;

    public DepartmentDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Department department) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(
            "INSERT INTO DEPARTMENT " +
                "(NAME) VALUES (?)"
            );

            preparedStatement.setString(1, department.getName());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new DbException("Unexpected error, no rows affected");
            }

        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void update(Department department) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("UPDATE DEPARTMENT SET NAME = ? WHERE ID = ?");
            preparedStatement.setString(1, department.getName());
            preparedStatement.setInt(2, department.getId());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new DbException("Unexpected error, no rows affected");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("DELETE FROM DEPARTMENT WHERE id = ?");
            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new DbException("Unexpected error, no rows affected");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public Department findById(int id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(
            "SELECT * FROM DEPARTMENT d " +
                "WHERE d.Id = ?"
            );
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department department = initiateDepartment(
                    resultSet.getInt("Id"),
                    resultSet.getString("Name")
                );
                return department;
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(preparedStatement);
        }
        return null;
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(
            "SELECT * FROM DEPARTMENT;"
            );
            resultSet = preparedStatement.executeQuery();
            List<Department> departmentList = new ArrayList<>();
            while (resultSet.next()) {
                departmentList.add(
                    initiateDepartment(
                        resultSet.getInt("Id"),
                        resultSet.getString("Name")
                    )
                );
            }
            return departmentList;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(preparedStatement);
        }
    }

    public Department initiateDepartment(int id, String name) {
        return new Department(id, name);
    }
}
