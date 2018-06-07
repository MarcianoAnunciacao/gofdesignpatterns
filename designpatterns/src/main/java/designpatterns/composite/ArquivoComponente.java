package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ArquivoComponente extends ArquivoComponent {

	List<ArquivoComponent> arquivos = new ArrayList<>();

	public ArquivoComponente(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeArquivo);

		for (ArquivoComponent arquivoComponent : arquivos) {
			arquivoComponent.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		arquivos.add(novoArquivo);
	}

	@Override
	public void remover(String nomeArquivo) throws Exception {
		for (ArquivoComponent arquivoComponent : arquivos) {
			if (arquivoComponent.getNomeArquivo().equals(nomeArquivo)) {
				this.arquivos.remove(arquivoComponent);
				return;
			}
		}

		throw new Exception("Não existe arquivo");
	}

	@Override
	public ArquivoComponent getArquivo(String nomeArquivo) throws Exception {
		for (ArquivoComponent arquivoComponent : arquivos) {
			if (arquivoComponent.getNomeArquivo().equals(nomeArquivo)) {
				return arquivoComponent;
				
			}

		}
		
		throw new Exception("Não existe arquivo");
	}

}
