import java.sql.*;
class insert {
    public static void main(String args[]) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "!pwd_sql@549#JDBC.";

            Connection con = DriverManager.getConnection(url, username, password);

            // create a query for inserting

            String q = "insert into table1(tName, tCity) values (?,?)";

            //get the prepared statement objext

            PreparedStatement pstmt = con.prepareStatement(q);

            // preparedstatement is for inserting dynamic data and statement is for inserting static data into the databases

            // set the values to query

            pstmt.setString(1, "Khemraj Shrestha");
            pstmt.setString(2, "Kathmandu");

            pstmt.executeUpdate();

            System.out.println("Data inserted successfully");

            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}