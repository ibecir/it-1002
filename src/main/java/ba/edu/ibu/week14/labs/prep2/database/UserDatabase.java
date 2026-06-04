package ba.edu.ibu.week14.labs.prep2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDatabase {
    private static final String URL = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";

    public void getAdultUsers(int age) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM users WHERE age > ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, age);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int userAge = result.getInt("age");
                System.out.println(id + " " + name + " " + userAge);
            }

            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
