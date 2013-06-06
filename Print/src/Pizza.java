
public class Pizza {

  public String name;
  private String topping = null;
  
  
  
  
  
  public void setTeig(String teig) {
    if("weich".equalsIgnoreCase(teig)) {
      this.teig = teig;
      
    } else if("hart".equalsIgnoreCase(teig)) {
      this.teig = teig;
      
    } else {
      this.teig = "weich";
      
    }    
  }
  public String teig() {
    return teig;
  }
  private String teig;
  
  
  
  




  public void setTopping(String topping) {
    System.err.println(this.topping);
    if(this.topping == null) {
      this.topping = "Tomaten ";
    }
    
    this.topping = this.topping + topping + " ";
    
    
    
  }

  public String topping() {
    return topping;
  }

  
  
}
