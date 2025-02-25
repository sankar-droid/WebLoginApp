package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.User;

public class UserManager {
	private List<User> users=new ArrayList<>();
	public String display;
	public UserManager(){
		users.add(new User("abc@gmail.com","12345"));
		users.add(new User("abc@yahoo.com","12312"));
		
	}
    public boolean validateUser(User user)
    {
    	for(User u:users)
    	{
    		 if(u.getUsername().equals(user.getUsername())) {
    			 if(u.getPassword().equals(user.getPassword()))
    					 {
    				     
    				        
    				        return true;
    					 }
    			 else {
    				  
    				   display="passwords doesn't match";
    				  
    				    return false;
    			 }
    		 }
    		 else
    		 {
    			 display="username doesn't exist";
    			  return false;
    		 }
    		
    	}
    	 
    	
    	return false;
    }
}
