import java.sql.*;  
class check{  
public static void main(String args[]){  
try{  
Class.forName("mysql").newInstance();  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/tej","root","root");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  