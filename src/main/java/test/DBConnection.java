package test;
import java.sql.*;
import static test.DBInfo.*;
public class DBConnection
{
	private static Connection con;
	private DBConnection() {}
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dbUrl, uName, pWord);
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
