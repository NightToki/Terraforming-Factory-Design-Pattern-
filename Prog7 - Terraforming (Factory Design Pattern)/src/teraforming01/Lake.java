package teraforming01;

import java.util.Random;

public class Lake extends WaterObject {
  String name = "Lake";
  Random rand = new Random();
  int impact = rand.nextInt((50-40) + 1) + 40;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}