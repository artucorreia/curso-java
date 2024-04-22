package model.dao.impl;

import model.dao.Dao;
import model.entities.Department;

import java.util.List;

public class DepartmentDaoJDBC implements Dao<Department> {
    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obg) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Department findById(int id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}
