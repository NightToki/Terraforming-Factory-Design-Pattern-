package teraforming01;

import java.util.ArrayList;
import java.util.Random;

public class Planet {
  public int size,sizeValue;
  public int score = 0;
  public String name;

  int totalImpact = 0;
  Random rand = new Random();
  public ArrayList<TerraObject> terraObject = new ArrayList<>();
  public Planet(int size){
	  
  
	  Random rand = new Random();
	  if(size == 1)
	  {
		  sizeValue = rand.nextInt((500-200) + 1) + 200; 
	  }
	  if(size == 2)
	  {
		  sizeValue = rand.nextInt((1000-501) + 1) + 501; 
	  }
	  if(size == 3)
	  {
		  sizeValue = rand.nextInt((1500-1001) + 1) + 1001; 
	  }
	  if(size == 4)
	  {
		  sizeValue = rand.nextInt((9999-1501) + 1) + 1501; 
	  }
  	}

  public void addNewObject(TerraObject object){
	  
	  terraObject.add(object);
	  score = score + object.getImpact();
  }

  public int getImpact(){
	  
	    totalImpact = score;
	    return totalImpact;
  }
  
  public int getSize(){
	  return terraObject.size();
  }

  public int getSizeValue()
  {
    return sizeValue;
  }
  public void waterPrinter()
  {
    for(int i = 0; i < terraObject.size(); i++){
      if(terraObject.get(i) instanceof WaterObject){
        System.out.println(terraObject.get(i).toString());
      }
    }
  }

  public void plantPrinter()
  {
    for(int i = 0; i < terraObject.size(); i++){
      if(terraObject.get(i) instanceof PlantObject){
        System.out.println(terraObject.get(i).toString());
      }
    }
  }

  public void mineralPrinter()
  {
    for(int i = 0; i < terraObject.size(); i++){
      if(terraObject.get(i) instanceof MineralObject){
        System.out.println(terraObject.get(i).toString());
      }
    }
  }

  public void animalPrinter()
  {
    for(int i = 0; i < terraObject.size(); i++){
      if(terraObject.get(i) instanceof AnimalObject){
        System.out.println(terraObject.get(i).toString());
      }
    }
  }
}