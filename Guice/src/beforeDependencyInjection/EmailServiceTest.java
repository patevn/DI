package beforeDependencyInjection;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailServiceTest {


@Test
	public void returnsAResault(){
	
	EmailService email = new EmailService();
	String message = "fuck";
	String receiver = "cunt";
	email.sendEmail(message, receiver);
	
	assertNotNull(message, receiver);
	
	}

//@Test
//	public void doesntReturnAResult(){
//	
//	EmailService email = new EmailService();
//	email.sendEmail(null, null);
//	
//	assertNull(email);
//	
//	}

}

