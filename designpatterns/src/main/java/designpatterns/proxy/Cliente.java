package designpatterns.proxy;

public class Cliente {

	public static void main(String[] args) {
		
		BancoUsuarios bancoUsuarios = new BancoUsuarios();
		System.out.println(bancoUsuarios.getQuantidadeUsuarios());
		System.out.println(bancoUsuarios.getUsuariosConectados());
		
		BancoProxy bancoProxy = new BancoProxy("admin", "admin");
		System.out.println(bancoProxy.getQuantidadeUsuarios());
		System.out.println(bancoProxy.getUsuariosConectados());
		
		BancoProxy bancoProxy2 = new BancoProxy("admin", "root");
		System.out.println(bancoProxy2.getQuantidadeUsuarios());
		System.out.println(bancoProxy2.getUsuariosConectados());
		
	}

}
