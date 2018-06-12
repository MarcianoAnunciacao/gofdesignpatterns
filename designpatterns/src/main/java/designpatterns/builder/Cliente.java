package designpatterns.builder;

public class Cliente {

	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		concessionaria.contruirCarro();
		CarroProduct carro = concessionaria.getCarro();
		
		System.out.println(carro);
		
		concessionaria = new ConcessionariaDirector(new VolksBuilder());
		concessionaria.contruirCarro();
		carro = concessionaria.getCarro();
		
		System.out.println(carro);
		
	}

}
