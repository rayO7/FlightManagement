package userAccount;

import java.math.BigInteger;
import daoImpl.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserService implements UserDaoImpl{
	
	 public static ArrayList<User> set=new ArrayList<User>();
	
	public void addUser(User u)
	{
		
		Scanner sc=new Scanner(System.in);
		
		//input user data
		
		System.out.println("Enter User type: ");
		String userType=sc.nextLine();
		
		Random random=new Random();
	    BigInteger userId=BigInteger.valueOf(Math.round(random.nextFloat()*Math.pow(10,12)));
		
	    System.out.println("Enter User Name: ");
		String userName=sc.nextLine();
		
		System.out.println("Enter Password: ");
		String userPassword=sc.nextLine();
		
		System.out.println("Enter PhoneNo: ");
		String phone=sc.nextLine();
		BigInteger userPhone=new BigInteger(phone);
		
		System.out.println("Enter User Email: ");
		String userEmail=sc.nextLine();
		
		//adding data in the userClass
		
		User user=new User();
		user.setUserType(userType);
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserPhone(userPhone);
		user.setUserEmail(userEmail);
		
		//adding data to dataBase
		
		set.add(user);
		
//		Iterator it=set.iterator();
//		while(it.hasNext())
//		{
//			User u1=(User)it.next();
//			System.out.println(u1.getUserName());
//			System.out.println(u1.getUserPassword());
//		}
		
		
		sc.close();
		
		System.out.println("Note your USERID: "+userId);
		
		
		
	}
	
	

}
