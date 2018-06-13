package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GolpesPesoMosca {

	private static Map<String, Golpe> golpes = new HashMap<String, Golpe>();
	
	static {
		golpes.put("Soco", new SocoFraco());
		golpes.put("Soco Forte", new SocoForte());
		golpes.put("Chute", new Chute());
		golpes.put("Cotovelada", new Joelhada());
		golpes.put("Joelhada", new Joelhada());
	}
	
	public static Golpe get(String nome) {
		return golpes.get(nome);
	}
}
