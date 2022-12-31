package teraforming01;

import java.util.Random;

public class Gold extends MineralObject {
  String name = "Gold";
  Random rand = new Random();
  int impact = rand.nextInt((100-90) + 1) + 90;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}

