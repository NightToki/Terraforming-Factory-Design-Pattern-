package teraforming01;

import java.util.Random;

public class Bunny extends AnimalObject{
  String name = "Bunny";
  Random rand = new Random();
  int impact = rand.nextInt((25-10) + 1) + 10;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
  
}
