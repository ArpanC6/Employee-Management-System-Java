package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {
    private DBConnection() {

    }

    public static Connection getConnection() {
        Connection con = null;

        try {
            Properties prop = new Properties();

            InputStream is = DBConnection.class
                    .getClassLoader()
                    .getResourceAsStream("db.properties");

            if (is == null) {
                System.out.println("db.properties file not found!");
                return null;
            }

            prop.load(is);

            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.user");
            String pass = prop.getProperty("db.pass");

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
        }
        return con;
    }
}