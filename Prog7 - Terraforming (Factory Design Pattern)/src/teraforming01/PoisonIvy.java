package teraforming01;

import java.util.Random;

public class PoisonIvy extends PlantObject {
	String name = "Poison Ivy";
	Random rand = new Random();
	int impact = -1*(rand.nextInt((30-20)+1)+20);
	public int getImpact() {
		return impact;
	}
	public String toString() {
		return name + ": "+impact;
	}

}
