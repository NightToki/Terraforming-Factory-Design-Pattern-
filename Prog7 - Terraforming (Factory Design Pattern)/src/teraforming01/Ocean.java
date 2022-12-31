package teraforming01;

import java.util.Random;

public class Ocean extends WaterObject{
  String name = "Ocean";
  Random rand = new Random();
  int impact = rand.nextInt((100-50) + 1) + 50;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}