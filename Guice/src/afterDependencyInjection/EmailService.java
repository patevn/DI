package afterDependencyInjection;

public class EmailService implements IMessageService {

	@Override
	public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("Email sent to "+rec+ " with Message="+msg);

	}

}
