package DataInfo;

import java.math.BigInteger;
import userAccount.User;
import userAccount.UserService;

public class UserInfo {
	public void put()
	{
	
	User user1=new User();
	user1.setUserType("customer");
	user1.setUserId(BigInteger.valueOf(new Long("987654321")));
	user1.setUserName("ray");
	user1.setUserPassword("ray");
	user1.setUserPhone(BigInteger.valueOf(new Long("987654321")));
	user1.setUserEmail("ray@rex.com");
	(UserService.set).add(user1);
	
	User user2=new User();
	user2.setUserType("customer");
	user2.setUserId(BigInteger.valueOf(new Long("987654321")));
	user2.setUserName("amit");
	user2.setUserPassword("perfect");
	user2.setUserPhone(BigInteger.valueOf(new Long("987653456")));
	user2.setUserEmail("amit@gmail.com");
	(UserService.set).add(user2);
	
	User user3=new User();
	user3.setUserType("customer");
	user3.setUserId(BigInteger.valueOf(new Long("7546564311")));
	user3.setUserName("mahima");
	user3.setUserPassword("black");
	user3.setUserPhone(BigInteger.valueOf(new Long("7788467321")));
	user3.setUserEmail("mahima@gmail.com");
	(UserService.set).add(user3);
	
	User user4=new User();
	user4.setUserType("customer");
	user4.setUserId(BigInteger.valueOf(new Long("5436564311")));
	user4.setUserName("blue");
	user4.setUserPassword("grey");
	user4.setUserPhone(BigInteger.valueOf(new Long("678499321")));
	user4.setUserEmail("blue@gmail.com");
	(UserService.set).add(user4);


	}
}

