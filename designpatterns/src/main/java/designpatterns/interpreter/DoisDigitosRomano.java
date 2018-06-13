package designpatterns.interpreter;

public class DoisDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public int multiplicador() {
		return 10;
	}

	@Override
	public String um() {
		return "X";
	}

	@Override
	public String quatro() {
		return "XL";
	}

	@Override
	public String cinco() {
		return "L";
	}

	@Override
	public String nove() {
		return "XC";
	}

}
