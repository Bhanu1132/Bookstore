package test;
import java.sql.*;
public class CustomerLoginDAO
{
	public CustomerLoginBean clb;
	public CustomerLoginBean customerLogin(String uName, String pWord)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from customer where uname=? and pword=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				clb = new CustomerLoginBean();
				clb.setuName(rs.getString(1));
				clb.setpWord(rs.getString(2));
				clb.setfName(rs.getString(3));
				clb.setlName(rs.getString(4));
				clb.setAddr(rs.getString(5));
				clb.setmId(rs.getString(6));
				clb.setPhNo(rs.getLong(7));
			}
		}//end of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return clb;
	}
}
