package your.app.components;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;

public class Welcome extends BaseComponent {

  public Welcome(WOContext aContext) {
    super(aContext);
    // TODO Auto-generated constructor stub
    System.out.println("Welcome constructor()");
  }

  public void awake() {
    super.awake();
    System.out.println("Welcome awake()");
  }
  
  public void sleep(){
    super.sleep();
    System.out.println("Welcome sleep()");
  }
  
  public void appendToResponse(WOResponse response, WOContext context) {
    System.out.println("Welcome appendToResponse()");
    super.appendToResponse(response, context);
  }
  
  
}

