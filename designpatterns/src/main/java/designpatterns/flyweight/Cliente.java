package designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {

		GolpesPesoMosca pesoMosca = new GolpesPesoMosca();

		List<Golpe> combo = new ArrayList<>();
		combo.add(pesoMosca.get("Soco"));
		combo.add(pesoMosca.get("Soco Forte"));
		combo.add(pesoMosca.get("Chute"));
		combo.add(pesoMosca.get("Cotovelada"));
		combo.add(pesoMosca.get("Joelhada"));

		System.out.println(combo);

		for (Golpe golpe : combo) {
			System.out.println(golpe.executa());
		}

	}
}
