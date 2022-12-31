package teraforming01;

import java.util.Random;

public class RedOakTree extends PlantObject{
	String name = "Red Oak Tree";
	Random rand = new Random();
    int impact = rand.nextInt((100-60) + 1) + 60;

    public int getImpact(){
      return impact;
    }
    public String toString(){
      return name + ": " + impact;
    }

}
