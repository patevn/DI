package afterDependencyInjection;

public interface IMessageService {

	void sendMessage(String msg, String rec);
	
}


//MessageService that will declare the contract for service implementations.