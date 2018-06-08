package designpatterns.strategy;

public class CalcularImpostoQuinzeOuDez implements CalcularImposto {

	@Override
	public double calculaSalarioComImporsto(Funcionario umFuncionario) {
		if(umFuncionario.getCargo() > 2000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}else {
			return umFuncionario.getSalarioBase() * 0.9;
		}
	}
}