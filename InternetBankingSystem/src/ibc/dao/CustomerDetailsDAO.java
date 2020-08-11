package ibc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import ibc.model.CustomerDetailsModel;

public class CustomerDetailsDAO {
	Connection con = DAO.getNewConnection();

	
	public boolean postCredentials(CustomerDetailsModel customerDetailsModel) {
		
		PreparedStatement ps = null;
		try {
			
			//insert new user name and password
			ps =  con.prepareStatement(Queries.registerDetails);
			ps.setString(1,customerDetailsModel.getUsername());
			ps.setString(2,customerDetailsModel.getPassword());	
			ps.setString(3, customerDetailsModel.getAccountType());
			ps.setString(4, customerDetailsModel.getAge());
			ps.setString(5, customerDetailsModel.getMobileNo());
			ps.setString(6, customerDetailsModel.getBranch());

			int m=ps.executeUpdate();	
			if(m==1) {
				return true;
			}
			ps.close();
		} catch(Exception e)
		{
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {}
			}
			
		}

		return false;
	}

}
