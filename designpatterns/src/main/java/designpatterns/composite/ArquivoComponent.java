package designpatterns.composite;

public abstract class ArquivoComponent {

	String nomeArquivo;

	public void printNomeDoArquivo() {
		System.out.println(this.nomeArquivo);
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void adicionar(ArquivoComponent novoArquivo) throws Exception{
		throw new Exception("Não pode inserir arquivos em" + this.nomeArquivo + " - não é uma pasta");
	}

	public void remover(String novoArquivo) throws Exception{
		throw new Exception("Não pode remover arquivos em" + this.nomeArquivo + " - não é uma pasta");
	}

	public ArquivoComponent getArquivo(String nomeArquivo)throws Exception{
		throw new Exception("Não pode pesquisar arquivos em " + this.nomeArquivo + " - não é uma pasta");
	}
}