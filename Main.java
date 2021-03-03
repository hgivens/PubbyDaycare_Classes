/*
Author: hannah Givens 
Date: 
2/25/2021
Project: Doggy Daycare utlizing classes. 
Description: 
  Here is a code that give you a menue to enter a dog into the daycare, view bill, view all entries, or exit. This code utilizes classes with the class Dog (Dog.java). If the user enters a dog they will be asked for breed, color, size, name, and for how long. 
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    /*here is the array that stores the objects being made and called*/
    // the day care can only hold 25 dogs at one time which is why the arry is set to 25
    Location [] dogsInCare_Dover = new Location[25];
    // setting the whole array to default until new entry.
    int k = 0;
    for(Location i : dogsInCare_Dover){
      dogsInCare_Dover[k] = new Location("...","...","...",0.0,0.0,"...");
      k++;
    }
    int j = 0;
    int count =0;
    int menueChoice = 0;
    String startBreed = "";
    String startColor = "";
    String startName ="";
    double startSize = 0.0;
    double startHours = 0.0;
    String setLocation = "";
    /* here is the menue to see tickets or make tickets*/
//0 exit
//1 make entry
//2 view entry
//3 all logs
    System.out.println("Welcome to Doggy DayCare!! ");
    do{
      System.out.println("Menue: \n\n0: Exit \n1: Make Doggy Entry \n2: Veiw A Bill \n3: View DayCare Logs");
      menueChoice = input.nextInt();
      
      if(menueChoice == 1){
        // this if will set the list over and over write the old dogs once 100 entrys happen
        if(count > 25){
          count = 0;
        }
        setLocation = "Dover";
        /*here is where the user is entering the data for there dog*/
          System.out.println("Please enter the following infromation to check your dog in!");
          System.out.println("\nBreed of Dog?");
          startBreed = input.nextLine();

          System.out.println("Color of Dog?");
          startColor = input.nextLine();

          System.out.println("Name of Dog?");
          startName = input.nextLine();

          System.out.println("Size of Dog?(in lbs)");
          startSize = input.nextInt();

          System.out.println("How long will the Dog stay?(in hours)");
          startHours = input.nextDouble();
          dogsInCare_Dover[count] = new Location(startBreed, startColor,startName, startSize,startHours,setLocation);
          
          System.out.println("TICKET: " + count + dogsInCare_Dover[count].toString());
          count++;
          
      }else if (menueChoice == 2){
        System.out.println("Please enter your ticket number to review your bill: ");
        int reviewTicket = input.nextInt();
          System.out.println("TICKET: " + reviewTicket + dogsInCare_Dover[reviewTicket].toString());
      }else if(menueChoice == 3){
        System.out.println("All Dogs On Record:\n-------------------\n ");
        /*this loop is for option 3 the logs of all dogs*/
        
        for(Location i: dogsInCare_Dover){
            
           System.out.println("\nTICKET: " + j + dogsInCare_Dover[j].toString());
           j++;
        }
      }else{
        System.out.println("ERROR: Input Not Found");
      }

    }while(menueChoice != 0);

  }
}