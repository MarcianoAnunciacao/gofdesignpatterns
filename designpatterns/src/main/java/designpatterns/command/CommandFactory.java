package designpatterns.command;

import java.io.FileInputStream;
import java.util.Properties;

public class CommandFactory {
	
	Properties prop = new Properties();
	
	public CommandFactory() {
		try {
			prop.load(new FileInputStream("/home/marciano/Desenvolvimento/properties/commands.properties"));
		}catch (Exception e) {
			System.out.println("Erro ao carregar o arquivo");
		}	
	}
	
	public BaseCommand create(String name) {
		BaseCommand command = null;
		String stringClasse = prop.getProperty(name);
		
		try {
			Class<?> classe = Class.forName(stringClasse);
			Object object = classe.newInstance();
			command = (BaseCommand) object;
		}catch (Exception e) {
			System.out.println("Erro ao carregar a classe");
		}
		return command;
	}

}
