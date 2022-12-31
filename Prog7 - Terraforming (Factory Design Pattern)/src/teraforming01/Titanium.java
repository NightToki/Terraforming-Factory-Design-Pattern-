package teraforming01;

import java.util.Random;

public class Titanium extends MineralObject {
  String name = "Titanium";
  Random rand = new Random();
  int impact = rand.nextInt((85-80) + 1) + 80;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}

