package designpatterns.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VooBooker {
	
	public List<Voo> getVoosFor(Date from, Date to) {

		return new ArrayList<Voo>();
	}
	
}
