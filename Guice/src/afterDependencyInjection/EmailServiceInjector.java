package afterDependencyInjection;

public class EmailServiceInjector implements IMessageServiceInjector {

	@Override
	public IConsumer getConsumer() {

		 return new MyDiApplication(new EmailService());
	}

}
