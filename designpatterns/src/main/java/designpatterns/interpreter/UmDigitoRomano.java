package designpatterns.interpreter;

public class UmDigitoRomano extends NumeroRomanoInterpreter {

	@Override
	public int multiplicador() {
		return 1;
	}

	@Override
	public String um() {
		return "I";
	}

	@Override
	public String quatro() {
		return "IV";
	}

	@Override
	public String cinco() {
		return "V";
	}

	@Override
	public String nove() {
		return "IX";
	}

}
