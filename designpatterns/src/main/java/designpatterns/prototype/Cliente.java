package designpatterns.prototype;

public class Cliente {

	public static void main(String[] args) {
		FiestaPrototype prototipoFiesta = new FiestaPrototype();
		CarroPrototype fiestaNovo = prototipoFiesta.clonar();
		fiestaNovo.setValorCompra(50000);
		
		
		CarroPrototype fiestaUsado = prototipoFiesta.clonar();
		fiestaUsado.setValorCompra(25000);
		
		System.out.println("Novo\n");
		System.out.println(fiestaNovo.exibirInfo());
		
		System.out.println("Usado\n");
		System.out.println(fiestaUsado.exibirInfo());
		
	}

}