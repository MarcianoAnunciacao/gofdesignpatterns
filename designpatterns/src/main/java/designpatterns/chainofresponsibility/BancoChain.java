package designpatterns.chainofresponsibility;

public abstract class BancoChain {

	protected BancoChain next;
	protected IdBanco identificador;

	public BancoChain(IdBanco identificador) {
		next = null;
		this.identificador = identificador;
	}

	public void setNext(BancoChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	private boolean podeEfetuarPagamento(IdBanco id) {
		if (identificador == id) {
			return true;
		}

		return false;
	}

	public void efetuarPagamento(IdBanco id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
			System.out.println("Pagamento Efetuado");
		} else {
			if (next == null) {
				throw new Exception();
			}

			next.efetuarPagamento(id);
		}
	}

	protected abstract void efetuaPagamento();

}
