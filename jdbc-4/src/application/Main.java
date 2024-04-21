package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
            "UPDATE SELLER " +
                "SET BASESALARY = BASESALARY + ?" +
                "WHERE DEPARTMENTID = ?"
            );
            preparedStatement.setDouble(1, 350);
            preparedStatement.setInt(2, 2);
            int rowsAltered = preparedStatement.executeUpdate();
            System.out.println("Done! Rows Altered: " + rowsAltered);
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