package designpatterns.command;

import javax.swing.JTextArea;

public class GerarPdfCommand implements BaseCommand {

	public void clicked(JTextArea taMensagens, String server) {
		taMensagens.setText("Conex�o com servidor " + server + "\n");
		// C�digo de gera��o do arquivo PDF
		taMensagens.append("Gerando PDF do pedido...");

	}

}
