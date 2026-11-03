package jdbc_operations;
import java.sql.*;
public class Insert {

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FACEPrep",
	            "root",
	            "Rabins@2006"
	        );
		Statement stmt=con.createStatement();
		String sql="INSERT INTO students VALUES (2, 'Sam', 'BCA'),(3, 'Rabinson', 'MCA'),(4, 'Zamee', 'M.com')";
		int result=stmt.executeUpdate(sql);
		System.out.println("3 record inserted successfully!");
		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}