package designpatterns.builder;

public class CarroProduct {
	
	public double preco;
	public String descMotor;
	public int anoFabricacao;
	public String modelo;
	public String montadora;
	@Override
	public String toString() {
		return "CarroProduct [preco=" + preco + ", descMotor=" + descMotor + ", anoFabricacao=" + anoFabricacao
				+ ", modelo=" + modelo + ", montadora=" + montadora + "]";
	}
	
	

}
