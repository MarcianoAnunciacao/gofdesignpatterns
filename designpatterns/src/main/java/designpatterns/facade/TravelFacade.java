package designpatterns.facade;

import java.util.Date;
import java.util.List;

public class TravelFacade {

	private HotelBooker hotelBooker;
	private VooBooker vooBooker;
	
	public void getVoosEHoteis(Date from, Date to) {
		List<Voo> voo = vooBooker.getVoosFor(from, to);
		List<Hotel> hotel = hotelBooker.getHotelNamesFor(from, to);
		
		
	}
	
}
