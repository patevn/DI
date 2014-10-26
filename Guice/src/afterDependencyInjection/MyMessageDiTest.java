package afterDependencyInjection;

public class MyMessageDiTest {
	

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        IMessageServiceInjector injector = null;
        IConsumer app = null;
         
        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);
         
        //Send SMS
        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}