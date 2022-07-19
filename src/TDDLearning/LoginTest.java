package TDDLearning;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {
	String userTest = "carlos_tdd@yopmail.com";
	String passTest = "Test@123";
	
	@Test
	public void ValidCredentials() throws Exception {
		
		//LoginAuth validLogin = new LoginAuth();
		//Boolean valid = validLogin.login(userTest, passTest);
		
		//método login da classe LoginAuth como static
		Boolean valid = LoginAuth.login(userTest, passTest);
		
		assertEquals(true, valid);
	}
}
