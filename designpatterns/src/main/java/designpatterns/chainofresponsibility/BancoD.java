package designpatterns.chainofresponsibility;

public class BancoD extends BancoChain {

	
	
	public BancoD() {
		super(IdBanco.BANCOD);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Banco D efetuando pagamento: \n");
	}

}