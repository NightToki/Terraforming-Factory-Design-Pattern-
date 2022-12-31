package teraforming01;
import java.util.Random;
public class TerraObjectFactory{
  public TerraObjectFactory(){
    
  }

  public TerraObject waterFactory(){
    Random rand = new Random();
    int num = rand.nextInt((4-1) + 1) + 1;
    TerraObject water = null;
    switch(num){
      case 1:
		  water = new River();
		  break;

      case 2:
	      water = new Pond();
	      break;

      case 3:
	      water = new Lake();
	      break;

      case 4:
	      water = new Ocean();
	      break;

      default:
    	  break;
    } 
    return water;
  }
  public TerraObject mineralFactory(){
    Random rand = new Random();
    int num = rand.nextInt((4-1) + 1) + 1;
    TerraObject mineral = null;
    switch(num){
      case 1:
    	  mineral = new Potassium();
    	  break;

      case 2:
    	  mineral = new Titanium();
    	  break;

      case 3:
    	  mineral = new Gold();
    	  break;

      case 4:
    	  mineral = new Tungsten();
    	  break;

      default:
    	  break;
    } 
    	return mineral;
  }
  public TerraObject plantFactory(){
    Random rand = new Random();
    int num = rand.nextInt((4-1) + 1) + 1;
    TerraObject plant = null;
    switch(num){
      case 1:
    	  plant = new PoisonIvy();
    	  break;

      case 2:
    	  plant = new Bonsai();
    	  break;

      case 3:
    	  plant = new RedOakTree();
    	  break;

      case 4:
    	  plant = new Cacti();
    	  break;

      default:
    	  break;
    } 
    return plant;
  }
  public TerraObject animalFactory(){
    Random rand = new Random();
    int num = rand.nextInt((4-1) + 1) + 1;
    TerraObject animal = null;
    switch(num){
      case 1:
    	  animal = new Duck();
    	  break;

      case 2:
    	  animal = new Fox();
    	  break;

      case 3:
    	  animal = new Bunny();
    	  break;

      case 4:
    	  animal = new Snake();
    	  break;

      default:
    	  break;
    } 
    return animal;
  }
}