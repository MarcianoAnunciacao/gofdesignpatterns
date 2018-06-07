package designpatterns.mediator;

public class ComputerColleague extends Colleague {

	public ComputerColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile receive : " + message);
	}

}