package com.spring.app.ws.userservice;

import com.spring.app.ws.ui.model.request.UserDetailsRequestModel;
import com.spring.app.ws.ui.model.response.UserRest;

public interface UserService {
	
	UserRest createUser(UserDetailsRequestModel userDetails);

}
