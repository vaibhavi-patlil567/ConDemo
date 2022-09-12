import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class EmpStatementInsert {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/vaibhu";
		Properties p = new Properties();
		p.put("user","root");
		p.put("password","root123");
		Connection con = DriverManager.getConnection(url,p);
		Statement st = con.createStatement();
		String s = ("insert into employee value(5,'Vaibhavi',20,'customer')");
		int i = st.executeUpdate(s);
		System.out.println("Number of row affected" +i);
		st.close();
		con.close();
		
		
	}

}
