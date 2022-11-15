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

            // create a query for inserting


            String q = "update table1 set tName=?, tCity=? where tId=?";


            

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter new name:- ");
            String name = br.readLine();

            System.out.print("Enter new city:- ");
            String city = br.readLine();


            System.out.println("Enter the student id:- ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(q);

            
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();

            System.out.println("Data updated successfully...");

            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}