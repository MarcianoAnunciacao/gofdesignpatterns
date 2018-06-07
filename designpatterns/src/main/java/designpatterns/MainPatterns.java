package designpatterns;

import java.math.BigDecimal;

import designpatterns.adapter.SortListAdapter;
import designpatterns.adapter.Sorter;
import designpatterns.observer.DataStore;
import designpatterns.observer.Tela;
import designpatterns.visitor.CarrinhoCompras;
import designpatterns.visitor.model.Livro;

public class MainPatterns {

	public static void main(String[] args) {
		observer();
	}

	public static void visitor() {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

		Livro livro1 = new Livro(new BigDecimal(12), BigDecimal.valueOf(0.5));
		Livro livro2 = new Livro(new BigDecimal(18), BigDecimal.valueOf(1.5));

		carrinhoCompras.add(livro1);
		carrinhoCompras.add(livro2);

		BigDecimal custoPostagem = carrinhoCompras.calcularFrete();

		System.out.println(custoPostagem);

	}

	public static void adapter() {
		int[] numeros = new int[] { 34, 34, 5, 677, 88 };
		Sorter sorter = new SortListAdapter();
		sorter.sort(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
	}
	
	public static void observer() {
		Tela tela = new Tela();
		
		DataStore x = new DataStore();
		x.addObserver(tela);
		
		x.setData("Fiz uma curva puxando o freio de mão");
		
		x.notifyObservers();
		
		System.out.println(x.getData());
	}

}