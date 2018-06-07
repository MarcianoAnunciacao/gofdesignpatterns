package designpatterns.command;

import javax.swing.JTextArea;

public class EnviarPedidoComand implements BaseCommand {

	public void clicked(JTextArea taMensagens, String server) {
		
		taMensagens.setText("Conex�o com servidor " + server + "\n");
		// C�digo de envio do pedido por email
		taMensagens.append("Enviando Pedido por Email...");
	}

}
