package designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Cleinte {

	public static void main(String[] args) {
		
		List<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
		
		interpretadores.add(new QuatroDigitosRomano());
		interpretadores.add(new TresDigitosRomano());
		interpretadores.add(new DoisDigitosRomano());
		interpretadores.add(new UmDigitoRomano());

		String numeroRomano = "CXCIV";
		
		Contexto ctx = new Contexto(numeroRomano);
		
		for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
			numeroRomanoInterpreter.interpretar(ctx);
		}
		
		System.out.println(numeroRomano + "=" + Integer.toString(ctx.getOut()) );
	}

}
