package designpatterns.chainofresponsibility;

public class BancoA extends BancoChain {

	
	
	public BancoA() {
		super(IdBanco.BANCOA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Banco A efetuando pagamento: \n");
	}

}
