package userAccount;

import java.util.Iterator;

public class ValidateUser {
	
	public boolean Validation(String userName, String password)
	{
		Iterator it=(UserService.set).iterator();
		
		while(it.hasNext())
		{
			User u=(User)it.next();
			if(userName.equals(u.getUserName()) && password.equals(u.getUserPassword()))
			{
				return true;
			}
			
		}
		return false;
	}

}
