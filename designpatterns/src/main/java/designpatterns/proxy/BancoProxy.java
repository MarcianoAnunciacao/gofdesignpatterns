package designpatterns.proxy;

public class BancoProxy extends BancoUsuarios {

	private String usuario, senha;
	
	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	@Override
	public String getQuantidadeUsuarios() {
		if(temPermissao()) {
			return super.getQuantidadeUsuarios();
		}
		
		return null;
		
	}
	
	@Override
	public String getUsuariosConectados() {
		if(temPermissao()) {
			return super.getUsuariosConectados();
		}
		
		return null;
	}
	
	private boolean temPermissao() {
		return usuario.equals("admin") && senha.equals("admin");
	}
	
}
