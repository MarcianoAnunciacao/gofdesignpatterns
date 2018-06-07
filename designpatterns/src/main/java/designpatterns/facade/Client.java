package designpatterns.facade;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		TravelFacade facade = new TravelFacade();
		facade.getVoosEHoteis(new Date(), new Date());
		
	}

}