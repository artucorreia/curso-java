package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from department");
            while (resultSet.next()) {
                System.out.printf("[%d] %s\n", resultSet.getInt("Id"), resultSet.getString("Name"));
            }
        }
        catch (SQLException e) {
            e.getStackTrace();
        }
        finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}