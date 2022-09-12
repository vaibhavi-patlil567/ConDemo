import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpPrepareStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pt= null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhu","root","root123");
	    pt = con.prepareStatement("insert into employee value(?,?,?,?)");
		pt.setInt(1, 6);
		pt.setString(2, "Zainab");
		pt.setInt(3,20);
		pt.setString(4, "Client");
		int i = pt.executeUpdate();
		System.out.println("No of rows affected" + i);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
  try {
	  if(pt!=null) {
		  pt.close();
		  pt=null;
	  }
  }
  catch(Exception e) {
  }
  try {
	  if(con!=null) {
		  con.close();
		  con=null;
	  }
  }
  catch(Exception e) {
  }
  }
	}
}
