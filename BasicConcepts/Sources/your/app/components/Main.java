package your.app.components;

import your.app.Application;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOActionResults;


public class Main extends BaseComponent {
	public Main(WOContext context) {
		super(context);
		Application application = (Application)Application.application();
		application.incrementMainPageCounter();
	}

  public WOActionResults sayHi() {
    Welcome nextPage = pageWithName(Welcome.class);
    return nextPage;
  }
  
  public Main logout() {
    //session().terminate();
    Main nextPage = pageWithName(Main.class);
    return nextPage;
  }
  
  public void awake() {
    super.awake();
    System.out.println("Main awake()");
  }
  
  public void sleep() {
    super.sleep();
    System.out.println("Main sleep()");
  }
  
  public WOActionResults invokeAction(WORequest request, WOContext context) {
    System.out.println("Main invokeAction()");
    return super.invokeAction(request, context);
  }
  
  public void appendToResponse(WOResponse response, WOContext context) {
    System.out.println("Main appendToResponse()");
    super.appendToResponse(response, context);
  }
  
}
