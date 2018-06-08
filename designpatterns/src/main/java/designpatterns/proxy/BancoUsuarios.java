package designpatterns.proxy;

public class BancoUsuarios {

	public BancoUsuarios() {
		quantidadeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	private int quantidadeUsuarios;
	private int usuariosConectados;

	public String getQuantidadeUsuarios() {
		return "Qauntidade de Usuarios : " + quantidadeUsuarios;
	}

	public void setQuantidadeUsuarios(int quantidadeUsuarios) {
		this.quantidadeUsuarios = quantidadeUsuarios;
	}

	public void setUsuariosConectados(int usuariosConectados) {
		this.usuariosConectados = usuariosConectados;
	}

	public String getUsuariosConectados() {
		return "Usuarios conectados : " + usuariosConectados;
	}

}
