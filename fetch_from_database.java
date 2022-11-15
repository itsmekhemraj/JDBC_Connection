import java.sql.*;
import java.io.*;
class insert {
    public static void main(String args[]) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "!pwd_sql@549#JDBC.";

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "select * from table1";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while(set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);

                System.out.print(" " + id + " ");
                System.out.print(name + " ");
                System.out.print(city);
            }           

            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}