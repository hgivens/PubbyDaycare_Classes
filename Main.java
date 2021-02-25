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

/* here is the menue to see tickets or make tickets*/
//0 exit
//1 make entry
//2 view entry
//3 all logs

/*here is where the user is entering the data for there dog*/
    System.out.println("Welcome to Doggy DayCare!! \nPlease enter the following infromation to check your dog in!");

    System.out.println("Breed of Dog?");
    String startBreed = input.nextLine();

    System.out.println("Color of Dog?");
    String startColor = input.nextLine();

    System.out.println("Name of Dog?");
    String startName = input.nextLine();

    System.out.println("Size of Dog?(in lbs)");
    double startSize = input.nextInt();

    System.out.println("How long will the Dog stay?(in hours)");
    double startHours = input.nextDouble();
/*here is the array that stores the objects being made and called*/
    Dog [] dogs = new Dog[5];
    
    dogs[0] = new Dog(startBreed, startColor,startName, startSize,startHours);
    dogs[1] = new Dog();
    dogs[2] = new Dog();
    dogs[3] = new Dog();
    dogs[4] = new Dog();

/*this loop is for option 3 the logs of all dogs*/
    //Dog(startBreed, startColor,startName, startSize,startHours);
    System.out.println(dogs[0].toString());
    // for(int i : dogs){
    //   System.out.println(dogs[i].getBreed);
    // };
    

  }
}