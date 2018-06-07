package designpatterns.visitor;

import java.math.BigDecimal;

import designpatterns.visitor.model.Livro;

public class PostagemVisitor implements Visitor {

	private BigDecimal totalPostagemCarrinho = new BigDecimal("0");

	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.visitor.Visitor#visit(designpatterns.visitor.model.Livro)
	 * Classe que injeta o comportamento de calculo de postagem
	 */
	public void visit(Livro livro) {
		if (livro.getPreco().compareTo(new BigDecimal("10.00")) < 0) {
			totalPostagemCarrinho = totalPostagemCarrinho.add(
					livro.getPeso().multiply(new BigDecimal("2")));
			
			System.out.println("Valor Postagem : " + totalPostagemCarrinho);
		}
	}
	
	public BigDecimal getTotalPostagemCarrinho() {
		return totalPostagemCarrinho;
	}

}
