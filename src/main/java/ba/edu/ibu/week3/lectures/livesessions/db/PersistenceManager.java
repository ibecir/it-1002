package ba.edu.ibu.week3.lectures.livesessions.db;

import java.sql.*;

public class PersistenceManager {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection = null;

    public static void main(String[] args) {
        PersistenceManager dbManager = new PersistenceManager();
        dbManager.getCustomersByCity("Frankfurt", null);
        dbManager.updateCustomerById(128, "Becir Isakovic");
    }

    public PersistenceManager() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Successfully connected to database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getCustomersByCity(String cityName, String state) {
        String query = """
                    SELECT customerNumber, customerName, state, city
                    FROM customers
                    WHERE city = ? OR state = ?;
                """;

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cityName);
            statement.setString(2, state);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("customerNumber"));
                System.out.println(rs.getString("customerName"));
                System.out.println(rs.getString("state"));
                System.out.println(rs.getString("city"));
                System.out.println("#############################");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCustomerById(int customerId, String name) {
        try {
            String query = "UPDATE customers SET customerName = ? WHERE customerNumber = ?;";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, customerId);

            int numOfRows = statement.executeUpdate();
            System.out.println(numOfRows + " AFFECTED BY THE UPDATE");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteCustomerById(int customerId) {
        try {
            String query = "DELETE FROM customers WHERE customerNumber = ?;";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, customerId);

            int numOfRows = statement.executeUpdate();
            System.out.println(numOfRows + " AFFECTED BY THE DELETE");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
