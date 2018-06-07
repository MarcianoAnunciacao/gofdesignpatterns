package designpatterns.command;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Aplicativo extends JFrame {
	
	/**
	 * UID
	 */
	private static final long serialVersionUID = -8057708618043576352L;
	
	private CommandFactory commandFactory = new CommandFactory();
	
	JTextArea taMensagens = new JTextArea();
	ConfigManager config = ConfigManager.getInstance();
	

    public static void main(String[] args) {
        new Aplicativo();
    }
    
    public Aplicativo() {
        super("Curso de Design Patterns - lab01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = montaPainelBotoes();
        add(panel,BorderLayout.SOUTH);
        add(taMensagens,BorderLayout.CENTER);
        setSize(500,200);
        setVisible(true);
    }
    
    private JPanel montaPainelBotoes() {
    	config.setServerName("GlobalCode Patterns");
        JPanel panel = new JPanel();
        JButton btEnviarPedido = new JButton("Enviar Pedido");
        JButton btGerarPDF = new JButton("Gerar PDF");
        JButton btNovoPedido = new JButton("Novo Pedido");
        JButton btExcluirPedido = new JButton("Excluir Pedido");
        
        panel.add(btExcluirPedido);
        panel.add(btNovoPedido);
        panel.add(btGerarPDF);
        panel.add(btEnviarPedido);
        
        btEnviarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonEnviar_clicked();
            }
        });
        btGerarPDF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonGerarPDF_clicked();
            }
        });
        btNovoPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonNovoPedido_clicked();
            }
        });
        btExcluirPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonExcluirPedido_clicked();
            }
        });
        
        return panel;
    }
    
    private void buttonEnviar_clicked() {
    	BaseCommand comandoEnviar = commandFactory.create("EnviarPedido");
    	comandoEnviar.clicked(taMensagens, config.getServerName());
    }
    
    private void buttonGerarPDF_clicked() {
    	BaseCommand comandoEnviar = commandFactory.create("GerarPDF");
    	comandoEnviar.clicked(taMensagens, config.getServerName());
    }
    
    private void buttonNovoPedido_clicked() {
    	BaseCommand comandoEnviar = commandFactory.create("NovoPedido");
    	comandoEnviar.clicked(taMensagens, config.getServerName());
    }
    
    private void buttonExcluirPedido_clicked() {
    	BaseCommand comandoEnviar = commandFactory.create("ExcluirPedido");
    	comandoEnviar.clicked(taMensagens, config.getServerName());
    }
}
