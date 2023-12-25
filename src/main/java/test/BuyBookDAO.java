package test;
import java.sql.*;
public class BuyBookDAO 
{
	public int k;
	public int buybook(BookBean bb, int rQty)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("update bookdetails set qty=qty-? where code=?");
			ps.setInt(1, rQty);
			ps.setString(2, bb.getCode());
			k = ps.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
