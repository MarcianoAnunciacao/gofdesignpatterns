package designpatterns;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import designpatterns.visitor.CarrinhoCompras;
import designpatterns.visitor.model.Livro;


public class PastagemVisitorTest {

	Livro livro1 =null;
	Livro livro2 = null;
	
	@Before
	public void criar() {
		livro1 = new Livro(new BigDecimal(12), new BigDecimal(0.5));
		livro2 = new Livro(new BigDecimal(18), new BigDecimal(1.5));
	}
	
	@Test
	public void testaVisitor() {
		/*PostagemVisitor visitor = new PostagemVisitor();
		livro1.accept(visitor);
		livro2.accept(visitor);
		*/
		
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		
		carrinhoCompras.add(livro1);
		carrinhoCompras.add(livro2);
		
		BigDecimal custoPostagem = carrinhoCompras.calcularFrete();
		
		assertTrue(custoPostagem.compareTo(new BigDecimal(50)) < 1);
		
		System.out.println(custoPostagem);
	}
	
}
