package com.marlabs.model;



public class Admin 
{
	private String userid;
	private String password;
	
	public Admin() 
	{
	
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public String getUserid() 
	{
		return userid;
	}
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "AdminDTO [userid=" + userid + ", password=" + password + ", getUserid()=" + getUserid()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	
	
	
}
