package teraforming01;

import java.util.Random;

public class Cacti extends PlantObject {
	String name = "Cacti";
	Random rand = new Random();
    int impact = rand.nextInt((50-30) + 1) + 30;

    public int getImpact(){
      return impact;
    }
    public String toString(){
      return name + ": " + impact;
    }

}