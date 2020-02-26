package userAccount;

import java.math.BigInteger;
import daoImpl.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserService implements UserDaoImpl{
	
	 public static ArrayList<User> set=new ArrayList<User>();
	
	public void addUser(User u)
	{
		
		Scanner sc=new Scanner(System.in);
		
		//input user data
		
		System.out.println("Enter User type:(customer/admin) ");
		String userType=sc.nextLine();
		
		Random random=new Random();
	    BigInteger userId=BigInteger.valueOf(Math.round(random.nextFloat()*Math.pow(10,12)));
		
	    System.out.println("Enter User Name: ");
		String userName=sc.nextLine();
		
		System.out.println("Enter Password: ");
		String userPassword=sc.nextLine();
		
		BigInteger userPhone;
		while(true)
		{
		System.out.println("Enter PhoneNo: ");
		String phone=sc.nextLine();
		
		if(phone.length()==10 && phone.charAt(0)!='0')
		{
		userPhone=new BigInteger(phone);
		break;
		}
		else
		{
			System.out.println("..!!enter valid phone no!!..");
		}
		}
		String userEmail;
		while(true)
		{
		System.out.println("Enter User Email: ");
		
		userEmail=sc.nextLine();
		
		if(!isValidEmailId(userEmail))
		{
			System.out.println("..!!enter valid email!!..");
		}
		else
			break;
		}
		
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
		
		System.out.println();
		System.out.println("Note your USERID: "+userId);
		System.out.println();
		
		
	}
	
	 public static boolean isValidEmailId(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	
	

}
