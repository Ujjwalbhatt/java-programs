import java.sql.*;
public class database {
    public static void main(String[] args) {
    
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "avantika";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String insertQuery = "INSERT INTO students (rollno,name) VALUES (6,'Finn')";
            statement.executeUpdate(insertQuery);
            System.out.println("Record inserted successfully.");
            String selectQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int rollno = resultSet.getInt(2);
                System.out.println("Roll Number: " + rollno +", Name: " + name );
            }
            String updateQuery = "UPDATE students SET name = 'David' WHERE rollno = 4";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated successfully.");
            String deleteQuery = "DELETE FROM students WHERE rollno =2";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted successfully.");
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
