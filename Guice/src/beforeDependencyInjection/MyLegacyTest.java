package beforeDependencyInjection;

public class MyLegacyTest {
	 
    public static void main(String[] args) {
    	EmailService var = new EmailService();
        MyApplication app = new MyApplication(var);
        app.processMessages("Hi Pankaj", "pankaj@abc.com");
    }
 
}