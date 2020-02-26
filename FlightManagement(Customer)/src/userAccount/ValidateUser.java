package userAccount;

import java.util.Iterator;
import java.util.Scanner;

public class ValidateUser {
	public static boolean check;
	
	public void entry()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("USER NAME :");
		String userName=sc.nextLine();
		
		System.out.println("PASSWORD :");
		String password=sc.nextLine();
		
		check=Validation(userName, password);
	}
	
	public boolean Validation(String userName, String password)
	{
		Iterator<User> it=(UserService.set).iterator();
		
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
