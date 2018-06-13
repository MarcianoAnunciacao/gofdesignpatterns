package designpatterns.interpreter;

public class QuatroDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public int multiplicador() {
		return 1000;
	}

	@Override
	public String um() {
		return "M";
	}

	@Override
	public String quatro() {
		return "";
	}

	@Override
	public String cinco() {
		return "";
	}

	@Override
	public String nove() {
		return "";
	}

}
