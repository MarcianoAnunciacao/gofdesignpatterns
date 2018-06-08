package designpatterns.strategy;

public class Funcionario {
	
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;

	protected double salarioBase;
	protected int cargo;
	protected CalcularImposto estrategiaDeCalculo;
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getCargo() {
		return cargo;
	}
	
	public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImporsto(this);
	}
	
	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		
		switch (cargo) {
		case DESENVOLVEDOR:
			estrategiaDeCalculo = new CalcularImpostoQuinzeOuDez();
			cargo = DESENVOLVEDOR;
			break;

		case DBA:
			estrategiaDeCalculo = new CalcularImpostoQuinzeOuDez();
			cargo = DBA;
			break;

		case GERENTE:
			estrategiaDeCalculo = new CalcularImpostoVinteOuQUinze();
			cargo = GERENTE;
			break;

			
		default:
			new RuntimeException("Cargo não encontrado");
			break;
		}
	}
	
}
