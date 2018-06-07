package designpatterns.command;


public class ConfigManager {

   private static ConfigManager configManager= new ConfigManager();
	
  private ConfigManager() {
	  
  }
	
  public static ConfigManager getInstance() {
	  return configManager;
  }
  
  private String serverName;

  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }
}
