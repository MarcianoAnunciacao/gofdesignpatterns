package designpatterns.interpreter;

public class TresDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public int multiplicador() {
		return 100;
	}

	@Override
	public String um() {
		return "C";
	}

	@Override
	public String quatro() {
		return "CD";
	}

	@Override
	public String cinco() {
		return "D";
	}

	@Override
	public String nove() {
		return "CM";
	}

}
