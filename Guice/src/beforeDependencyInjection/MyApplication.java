package beforeDependencyInjection;
//class is responsible to initialize the email service and then use it
public class MyApplication {
	 
    private EmailService email = null;
     
    public MyApplication(EmailService svc){
        this.email=svc;
    }
     
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}