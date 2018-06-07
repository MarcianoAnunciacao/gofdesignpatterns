package designpatterns.visitor.model;

import java.math.BigDecimal;

import designpatterns.visitor.Visitable;
import designpatterns.visitor.Visitor;

public class Livro implements Visitable{
	
	private BigDecimal preco;
	
	private BigDecimal peso;

	public Livro(BigDecimal preco, BigDecimal peso) {
		this.preco = preco;
		this.peso = peso;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}