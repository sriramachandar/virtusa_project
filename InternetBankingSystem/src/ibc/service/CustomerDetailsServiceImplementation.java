package ibc.service;

import ibc.dao.CustomerDetailsDAO;
import ibc.model.CustomerDetailsModel;

public class CustomerDetailsServiceImplementation implements CustomerDetailsService {

	@Override
	public boolean storeCredentials(CustomerDetailsModel customerDetails) {
		
		CustomerDetailsDAO cs = new CustomerDetailsDAO();
		boolean res = cs.postCredentials(customerDetails);
		return res;
	}
}
