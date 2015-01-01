package your.app;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {
  
  private int mainPageCounter;
  
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
		/* ** put your initialization code in here ** */
		setAllowsConcurrentRequestHandling(true);		
		
		mainPageCounter = 0;
	}
	
	public int mainPageCounter() {
	  return mainPageCounter;
	}
	
	public void incrementMainPageCounter() {
	  mainPageCounter++;
    System.err.println("+");
	}
}
