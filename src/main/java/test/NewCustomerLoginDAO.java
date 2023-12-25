package test;
import java.sql.*;
public class NewCustomerLoginDAO 
{
	public int k;
	public int newcustomerLogin(CustomerLoginBean clb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			ps.setString(1, clb.getuName());
			ps.setString(2, clb.getpWord());
			ps.setString(3, clb.getfName());
			ps.setString(4, clb.getlName());
			ps.setString(5, clb.getAddr());
			ps.setString(6, clb.getmId());
			ps.setLong(7, clb.getPhNo());
			k = ps.executeUpdate();
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return k;
	}
}
