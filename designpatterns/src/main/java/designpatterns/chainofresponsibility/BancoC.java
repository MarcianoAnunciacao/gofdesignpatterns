package designpatterns.chainofresponsibility;

public class BancoC extends BancoChain {

	
	
	public BancoC() {
		super(IdBanco.BANCOC);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Banco C efetuando pagamento: \n");
	}

}
