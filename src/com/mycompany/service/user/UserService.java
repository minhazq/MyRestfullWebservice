package com.mycompany.service.user;
import javax.ws.rs.*;

@Path("/user/service")
public class UserService {

	@PUT
	@Path("/create")
	public void createUser()
	{
		System.out.println("createUser has been called");
	}
	
	@GET
	public void getUser(){
		System.out.println("getUser has been called");
	}
	
	@POST
	public void updateUser()
	{
		System.out.println("updateUser has been called");
	}
	
	@DELETE
	public void deleteUser()
	{
		System.out.println("deleteUser has been called");
	}
	
	@Path("/special")
	public SpcialUser specialUser(){
		return new SpcialUser();
	}
}
