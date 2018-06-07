package designpatterns.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	private List<Visitable> itens = new ArrayList<Visitable>();
	
	public void add(Visitable produto) {
		itens.add(produto);
	}
	
	public BigDecimal calcularFrete() {
		PostagemVisitor visitor = new PostagemVisitor();
		
		itens.forEach(p -> p.accept(visitor));
		
		return visitor.getTotalPostagemCarrinho();
	}
	
}
