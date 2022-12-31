package teraforming01;

import java.util.Random;

public class Tungsten extends MineralObject {
  String name = "Tungsten";
  Random rand = new Random();
  int impact = rand.nextInt((75-55) + 1) + 55;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}
