package afterDependencyInjection;

public class SmsServiceInjector implements IMessageServiceInjector {

	@Override
	public IConsumer getConsumer() {
	  
	        return new MyDiApplication(new SmsMessageService());
	    }
}


