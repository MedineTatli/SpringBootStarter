package com.spring.app.ws.costumerservice.impl;

import com.spring.app.ws.costumerservice.CustomerService;
import com.spring.app.ws.costumerservice.MedineAbstractClass;
import com.spring.app.ws.ui.model.request.UserDetailsRequestModel;
import com.spring.app.ws.ui.model.response.UserRest;
import com.spring.app.ws.userservice.UserService;

public class CustomerServiceImpl extends MedineAbstractClass implements CustomerService, UserService {

	@Override
	public void getCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		delete();
		return null;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

}
