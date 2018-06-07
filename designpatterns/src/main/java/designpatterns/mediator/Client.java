package designpatterns.mediator;

public class Client {

	public static void main(String[] args) {
		
		ApplicationMediator mediator = new ApplicationMediator();
		
		Colleague desktop = new ConcreteColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		Colleague computer = new ComputerColleague(mediator);
		
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		mediator.addColleague(computer);
		
		desktop.send("desktop falando: ola mundo");
		
		mobile.send("mobile falando: ola");
		
		computer.send("computer falando: hello!!!");
		
				
		
	}

}
