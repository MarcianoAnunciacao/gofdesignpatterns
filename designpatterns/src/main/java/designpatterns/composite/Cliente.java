package designpatterns.composite;

public class Cliente {

	public static void main(String[] args) {
		ArquivoComponent minhaPasta = new ArquivoComponente("minhapastaraiz");
		ArquivoComponent meuVideo = new ArquivoVideo("meuvideo.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("onepiece.avi");
		
		try {
			
			meuVideo.adicionar(meuOutroVideo);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Pesquisando os arquivos...");
			minhaPasta.getArquivo(meuVideo.getNomeArquivo());
			
			System.out.println("remover arquivos...");
			minhaPasta.remover(meuVideo.getNomeArquivo());
			
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}