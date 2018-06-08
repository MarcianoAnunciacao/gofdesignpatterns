package designpatterns.chainofresponsibility;

public class BancoB extends BancoChain {

	
	
	public BancoB() {
		super(IdBanco.BANCOB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Banco B efetuando pagamento: \n");
	}

}
