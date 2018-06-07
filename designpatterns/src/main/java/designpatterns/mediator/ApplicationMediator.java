package designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {

	private List<Colleague> colleagues;

	public ApplicationMediator() {
		colleagues = new ArrayList<Colleague>();
	}

	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	@Override
	public void send(String message, Colleague origem) {

		for (Colleague colleague : colleagues) {
			if (colleague != origem) {
				colleague.receive(message);
			}
		}

	}

}
