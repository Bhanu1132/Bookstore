package test;
import java.sql.*;
public class DeleteBookDetailsDAO 
{
	public int k;
	public int delete(BookBean bb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("delete from bookdetails where code=?");
			ps.setString(1, bb.getCode());
			k = ps.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
