package ba.edu.ibu.week14.labs.prep4.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDatabase {
    private static final String URL = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";

    public void getUsersByNameAndCity(String name, String city) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM users WHERE name = ? AND city = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, city);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String userName = result.getString("name");
                String userCity = result.getString("city");
                System.out.println(id + " " + userName + " " + userCity);
            }

            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
