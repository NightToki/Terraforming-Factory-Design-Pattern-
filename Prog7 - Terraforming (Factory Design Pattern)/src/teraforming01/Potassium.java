package teraforming01;

import java.util.Random;

public class Potassium extends MineralObject {
  String name = "Potassium";
  Random rand = new Random();
  int impact = rand.nextInt((55-40) + 1) + 40;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}
