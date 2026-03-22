package ba.edu.ibu.week3.lab;

import java.sql.*;

public class TicketFetcher {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "mtestdb_usr";
    private static final String PASSWORD = "mtest97dbUSR";
    private Connection connection;
    public TicketFetcher() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void getTicketsByStatus(String status) throws SQLException {
        String query = "SELECT id, seat_label, price_paid, payment_method FROM tickets WHERE status = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, status);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " -> " + rs.getString("seat_label") + " -> " + rs.getDouble("price_paid") + " -> " + rs.getString("payment_method"));
        }
    }
    public static void main(String[] args) {
        try {
            TicketFetcher db = new TicketFetcher();
            db.getTicketsByStatus("booked");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}