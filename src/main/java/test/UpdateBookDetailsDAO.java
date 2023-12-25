package test;
import java.sql.*;
public class UpdateBookDetailsDAO
{
	public int k;
	public int update(BookBean bb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("update bookdetails set price=?, qty=qty+? where code=?");
			ps.setFloat(1, bb.getPrice());
			ps.setInt(2, bb.getQty());
			ps.setString(3, bb.getCode());
			k = ps.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
