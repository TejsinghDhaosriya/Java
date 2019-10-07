import java.sql.*;
class type1driver
{
	public static void main(String[] args) throws Exceptions
	{
		Class.forname("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con = DriverManager.getConnection("jdbc:odbc:demodsn","root","root");
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery(select * from movies);
		 while(rs.next())
		 { 
			 System.out.println(rs.getInt(1)+ \t  + rs.getString(1));
		 }
		 con.close();
		
	}
	
	
}