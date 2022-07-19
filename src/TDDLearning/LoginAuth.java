package TDDLearning;

public class LoginAuth {
	static String user = "carlos_tdd@yopmail.com";
	static String pass = "Test@123";
	
	public static Boolean login(String userTest, String passTest) {
		
		if(userTest == user && passTest == pass) {
			return true;
		} else {
			return false;
		}
	}
}
