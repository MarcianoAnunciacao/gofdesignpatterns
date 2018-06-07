package designpatterns.command;

import javax.swing.JTextArea;

public interface BaseCommand {
	
	public void clicked(JTextArea taMensagens, String server);

}
