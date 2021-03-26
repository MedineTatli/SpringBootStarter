package com.spring.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message="firstName can not be null")
	private String firstName;
	@NotNull(message="lastname can not be null")
	private String lastName;
	@NotNull(message="email can not be null")
	@Email()
	private String email;
	@NotNull(message="password can not be null")
	@Size(min =8, max=15, message ="Password must be equal or grater than 8 and less than 16 chaeracters!")
	private String password;

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
