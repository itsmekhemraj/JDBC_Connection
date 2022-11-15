import java.sql.*;
class insertjdbc {
    public static void main(String args[]) {
        try {

            // lode the driver 

            Class.forName("com.mysql.jdbc.Driver");

            // creating a connection 

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "!pwd_sql@549#JDBC.";

            Connection con = DriverManager.getConnection(url, username, password);

            // creating a query

            String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // create a statement

            Statement stmt = con.createStatement();

            // preparedstatement is for inserting dynamic data and statement is for inserting static data into the databases
            
            stmt.executeUpdate(q);
            System.out.println("Table created in the database..");

            con.close();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}