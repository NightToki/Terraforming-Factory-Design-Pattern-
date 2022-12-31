package teraforming01;

import java.util.Random;

public class Duck extends AnimalObject{
  String name = "Duck";
  Random rand = new Random();
  int impact = -1 * (impact = rand.nextInt((50-30) + 1) + 30);
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
  
}