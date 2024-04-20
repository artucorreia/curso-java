package application;

import db.DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
            "INSERT INTO SELLER " +
                "(NAME, EMAIL, BIRTHDATE, BASESALARY, DEPARTMENTID) " +
                "VALUES " +
                "(?, ?, ?, ?, ?)"
            );

            preparedStatement.setString(1, "Fulano");
            preparedStatement.setString(2, "fulano@outlook.com");
            preparedStatement.setDate(3, Date.valueOf("2000-01-01"));
            preparedStatement.setDouble(4, 3500.00);
            preparedStatement.setInt(5, 1);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            e.getStackTrace();
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}