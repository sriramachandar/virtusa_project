package ibc.service;

import ibc.model.CustomerDetailsModel;

public interface CustomerDetailsService {

	public abstract boolean storeCredentials(CustomerDetailsModel customerDetails);
}
