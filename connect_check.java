import java.sql.*;
class insertjdbc {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // creating a connection 

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "!pwd_sql@549#JDBC.";

            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()) {
                System.out.println("Connection is Closed");
            }
            else {
                System.out.println("Connection is created");
            }


        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}