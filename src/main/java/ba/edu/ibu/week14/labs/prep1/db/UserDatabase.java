package ba.edu.ibu.week14.labs.prep1.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDatabase {
    private static final String URL = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";

    public void getUsersByCity(String city) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM users WHERE city = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, city);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String userCity = result.getString("city");
                System.out.println(id + " " + name + " " + userCity);
            }

            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
