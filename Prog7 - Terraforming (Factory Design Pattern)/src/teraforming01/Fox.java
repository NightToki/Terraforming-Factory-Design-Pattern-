package teraforming01;

import java.util.Random;

public class Fox extends AnimalObject{
  String name = "Fox";
  Random rand = new Random();
  int impact = -1 * (impact = rand.nextInt((65-25) + 1) + 25);
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
  
}
