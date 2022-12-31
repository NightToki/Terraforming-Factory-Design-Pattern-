package teraforming01;

import java.util.Random;

public class Bonsai extends PlantObject{
	String name = "Bonsai";
	Random rand = new Random();
    int impact = rand.nextInt((15-5) + 1) + 5;

    public int getImpact(){
      return impact;
    }
    public String toString(){
      return name + ": " + impact;
    }

}
