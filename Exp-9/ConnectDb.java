import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "Isagi@123"
            );
            System.out.println("Connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
