package designpatterns.chainofresponsibility;

public class Cliente {

	public static void main(String[] args) {
		
		BancoChain bancos = new BancoA();
		bancos.setNext(new BancoB());
		bancos.setNext(new BancoC());
		bancos.setNext(new BancoD());

		try {
			bancos.efetuarPagamento(IdBanco.BANCOC);
			
			bancos.efetuarPagamento(IdBanco.BANCOD);
			
			bancos.efetuarPagamento(IdBanco.BANCOA);
			
			bancos.efetuarPagamento(IdBanco.BANCOB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
