package teraforming01;

import java.util.Random;

public class Snake extends AnimalObject{
  String name = "Snake";
  Random rand = new Random();
  int impact = -1 * (impact = rand.nextInt((75-60) + 1) + 60);
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
  
}