
public class Starter {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    ElectricGuitar e = new ElectricGuitar();
    
    
    
    e.setBrand("Yamaha");
    e.setNumOfPickups(6);
    e.setRockStarUsesIt(false);  
    
    System.err.println("Hello " + e.numOfPickups());
    
    
    
    ElectricGuitar e2 = new ElectricGuitar();
    
    
    
    e2.setBrand("Korg");
    e2.setNumOfPickups(4);
    e2.setRockStarUsesIt(true);  
    
    System.err.println("Hello " + e2.numOfPickups());

    
    
    
    
  }

}
