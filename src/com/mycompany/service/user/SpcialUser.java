package com.mycompany.service.user;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

public class SpcialUser {

	@POST
	public void createSpecialUser()
	{
		System.out.println("createSpecialUser has been called");
	}
	
	@GET
	public void getSpecialUser()
	{
		System.out.println("getSpecialUser has been called");
	}
	
	
}
