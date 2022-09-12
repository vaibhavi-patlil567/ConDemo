import java.sql.*;
public class mysqlcon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement stmt=con.createStatement();
			String s = ("create table emp(empid int primary key,empname varchar(45), empsal double");	
			int i=stmt.executeUpdate(s);
		System.out.println("Number of row affected" +i);
		stmt.close();
		con.close();
		}catch (Exception e) {}
		}
	}



