package designpatterns.strategy;

public class CalcularImpostoVinteOuQUinze implements CalcularImposto {

	@Override
	public double calculaSalarioComImporsto(Funcionario umFuncionario) {
		if (umFuncionario.getCargo() > 3500) {
			return umFuncionario.getSalarioBase() * 0.80;
		} else {
			return umFuncionario.getSalarioBase() * 0.85;
		}
	}

}