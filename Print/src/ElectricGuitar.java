
public class ElectricGuitar {

  
  public void setRockStarUsesIt(boolean rockStarUsesIt) {
    this.rockStarUsesIt = rockStarUsesIt;
  }
  public boolean rockStarUsesIt() {
    return rockStarUsesIt;
  }
  
  private boolean rockStarUsesIt;

  
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  public String brand() {  
    return brand;
  }
  
  private String brand;

  /**
   * Guitar strings
   * 
   * @param numOfPickups - 4 or 6
   */
  public void setNumOfPickups(int numOfPickups) {
    if(numOfPickups == 4) {
      this.numOfPickups = numOfPickups; 
    }
    if(numOfPickups == 6) {
      this.numOfPickups = numOfPickups; 
    }
    this.numOfPickups = 6;
  }
  
  
  public int numOfPickups() {
    return numOfPickups;
  }
    
  private int numOfPickups;










  
  
}
