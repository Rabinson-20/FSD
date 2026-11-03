package jdbc_operations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Delete {

	public static void main(String[] args){
		try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/FACEPrep",
	            "root",
	            "Rabins@2006"
	        );
		Statement stmt = con.createStatement();
		String sql="DELETE FROM students WHERE id = 5";
		int result=stmt.executeUpdate(sql);
		System.out.println(result + " record deleted successfully!");

		} catch (Exception e) {
	        System.out.println("sorry for inconvients. check your connections.");
	    }
	}
}