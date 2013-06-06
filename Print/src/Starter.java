
public class Starter {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    
    
    
    Pizza a1 = new Pizza();
    a1.name = "Magarita";
    
    
    a1.setTeig("hart");
    a1.setTopping("Kaese");
    a1.setTopping("Knoblauch");
    a1.setTopping("Spinat");
    
    
    
    
    
    
    
    
    System.err.println(a1.name);
    System.err.println(a1.teig());
    System.err.println(a1.topping());
    
  }

}
