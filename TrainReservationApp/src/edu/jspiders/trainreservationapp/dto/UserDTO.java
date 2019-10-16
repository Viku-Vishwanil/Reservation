package edu.jspiders.trainreservationapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_table")
public class UserDTO implements Serializable
{
	@Id
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	
	public UserDTO() 
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + userName + ", password=" + password + "]";
	}
	
	
}
