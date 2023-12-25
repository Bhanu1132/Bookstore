package test;
import java.sql.*;
public class AddBookDAO 
{
	public int k;
	public int insert(BookBean bb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("insert into bookdetails values(?,?,?,?,?)");
			ps.setString(1, bb.getCode());
			ps.setString(2, bb.getName());
			ps.setString(3, bb.getAuthor());
			ps.setFloat(4, bb.getPrice());
			ps.setInt(5, bb.getQty());
			k = ps.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
