package teraforming01;

import java.util.Scanner;

public class Terraforming {
	 public static void main(String[] args) { 
	    String name;
	    int size;
	    Scanner input = new Scanner(System.in);

	    int percent=100,waterPer=0,plantPer=0,mineralPer=0,animalPer=0;
	    String choice;
	    
	    boolean go = true;

	      System.out.println("Welcome to the TerraForming Program");
	      System.out.println("Enter the name of your new planet: ");
	      name = input.nextLine();
	      
	      
	      System.out.println("What size planet do you want? \n1) Small \n2) Medium \n3) Large \n4) Extra Large");
	      size = input.nextInt();

	      System.out.println("How do you want to distribute the categories as a percent: ");
	      System.out.println("Percentage remaining: "+ percent);
	      System.out.println("Enter water percentage: ");
	      waterPer = input.nextInt();
	      percent = percent - waterPer;

	      System.out.println("Percentage remaining: "+ percent);
	      System.out.println("Enter plant percentage: ");
	      plantPer = input.nextInt();
	      percent = percent - plantPer;

	      System.out.println("Percentage remaining: "+ percent);
	      System.out.println("Enter mineral percentage: ");
	      mineralPer = input.nextInt();
	      percent = percent - mineralPer;

	      System.out.println("Percentage remaining: "+ percent);
	      System.out.println("Enter animal percentage: ");
	      animalPer = input.nextInt();
	      percent = percent - animalPer;

	      

	      System.out.println("You chose the following:");
	      if(size == 1){
	        System.out.println("Planet Size: Small");
	      }
	      else if(size == 2){
	        System.out.println("Planet Size: Medium");
	      }
	      else if(size == 3){
	        System.out.println("Planet Size: Large");
	      }
	      else if(size == 4){
	        System.out.println("Planet Size: Extra Large");
	      }
	      else{
	        System.out.println("ERROR - Planet Size not defined");
	      }
	      System.out.println("TerraObject distribution:");
	      System.out.println("Water: "+ waterPer + "%");
	      System.out.println("Plant: "+plantPer+ "%");
	      System.out.println("Mineral: "+mineralPer+ "%");
	      System.out.println("Animal: "+ animalPer+ "%");
	      
	      System.out.println("Enter yes to go with these choices and no to return to the menu.");
	      choice = input.next();

	      if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
	        go = false;
	        }
	      else{
	          System.out.println("Restart the program");
	        }

	   
	    while(go == true);
	    System.out.println("Planet is being made...");

	    TerraObjectFactory objectFactory = new TerraObjectFactory();
	    Planet planet = new Planet(size);
	    
	    int finalWater = (int)(planet.getSizeValue() * (waterPer / 100.0));
	    int finalPlant = (int)(planet.getSizeValue() * (plantPer / 100.0));
	    int finalMineral = (int)(planet.getSizeValue() * (mineralPer / 100.0));
	    int finalAnimal = (int)(planet.getSizeValue() * (animalPer / 100.0));
	    for(int i = 0; i < finalWater; i++){
	      TerraObject obj = objectFactory.waterFactory();
	      planet.addNewObject(obj);
	    }
	     for(int i = 0; i < finalMineral; i++){
	      TerraObject obj = objectFactory.mineralFactory();
	      planet.addNewObject(obj);
	    }
	     for(int i = 0; i < finalPlant; i++){
	      TerraObject obj = objectFactory.plantFactory();
	      planet.addNewObject(obj);
	    }
	     for(int i = 0; i < finalAnimal; i++){
	      TerraObject obj = objectFactory.animalFactory();
	      planet.addNewObject(obj);
	    }

	    boolean menu = true;
	    while(menu){
	    
	    System.out.println("Planet Name: " + name + "\nTerraObjects: " + planet.getSize() + "\nImpact Score: " + planet.getImpact());
	    System.out.println("1. List all water objects");
	    System.out.println("2. List all plant objects");
	    System.out.println("3. List all mineral objects");
	    System.out.println("4. List all animal objects");
	    System.out.println("5. Exit program");
	    int choice2 = input.nextInt();

	    switch(choice2){
	      case 1:
	      planet.waterPrinter();
	      break;
	      case 2:
	      planet.plantPrinter();
	      break;
	      case 3:
	      planet.mineralPrinter();
	      break;
	      case 4:
	      planet.animalPrinter();
	      break;
	      case 5:
	      menu = false;
	      break;
	      default:
	      break;
	    }
	    }
	  }
	}