package teraforming01;
import java.util.Random;
public class River extends WaterObject {
  String name = "River";
  Random rand = new Random();
  int impact = rand.nextInt((60-10) + 1) + 10;
  
  public int getImpact(){
    return impact;
  }
  public String toString(){
    return name + ": " + impact;
  }
}
