package guice;

import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		//bind the service to implementation class
		bind(MessageService.class).to(EmailService.class);
		
		//bind MessageService to Facebook Message implementation
		//bind(MessageService.class).to(FacebookService.class);
		
	}

}


// http://www.journaldev.com/2394/dependency-injection-design-pattern-in-java-example-tutorial
// http://www.journaldev.com/2403/google-guice-dependency-injection-example-tutorial