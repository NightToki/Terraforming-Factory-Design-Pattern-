package teraforming01;

import java.util.Random;

public class Pond extends WaterObject {
  String name = "Pond";
  Random rand = new Random();
  int impact = rand.nextInt((10-5) + 1) + 5;

  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}