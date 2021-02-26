import java.text.*;

public class Dog{
                    /****BASE VARIABELS****/
  private String breed;
  private String color;
  private String name;
  private double hours;
  private double size;

                    /****CONSTRUCTORS****/
  //default 
  public Dog(){
    breed = "unknown";
    color = "unknown";
    name = "unknown";
  };
  //overloaded
  public Dog(String startBreed, String startColor, String startName, double startSize,double startHours){
    breed = startBreed;
    color = startColor;
    name = startName;
    hours = startHours;
    size = startSize;
  };

                    /****GET METHODS****/
  public String getBreed(){
    return breed;
  };
  public String getColor(){
    return color;
  };
  public String getName(){
    return name;
  };
  public double getSize(){
    return size;
  };
  public double getHours(){
    return hours;
  };

                    /****SET METHODS****/
  public Dog setBreed(String breed){
    this.breed = breed;
    return this;
  };
  public Dog setColor(String color){
    this.color = color;
    return this;
  };
  public Dog setName(String name){
    this.name = name;
    return this;
  };
  public Dog setSize(double size){
    this.size = size;
    return this;
  };
  public Dog setHours(double hours){
    this.hours = hours;
    return this;
  };
                      /****OTHER METHODS****/
  public double pricePerDog(double sizeOfDog){
    double priceOfDog = 0;
    if(sizeOfDog == 0 ){
      priceOfDog = 0.00;
      return priceOfDog;
    }else if(sizeOfDog > 0.5 && sizeOfDog < 25.5){
      priceOfDog = 10.95;
      return priceOfDog;
    }else if(sizeOfDog >25.5 && sizeOfDog < 75.5){
      priceOfDog = 15.89;
      return priceOfDog;
    }else{
      priceOfDog = 25.05;
      return priceOfDog;
    }
  };
  public double billingPrice(){
    double bill = pricePerDog(size) * hours;
    return bill;
  };

@Override 
  public String toString(){
    DecimalFormat moneyFormat = new DecimalFormat("0.00");

    return "\nDog's name: " + name + "\nDog's Breed and Color: "+ breed + color + "\nSize:  "+ size + "lbs \nHours: " + hours + "\nYour dogs price per hour is: $" + moneyFormat.format(pricePerDog(size)) + "\n-------------------------------- \nYour total bill is: $" + moneyFormat.format(billingPrice());
  }//overide tostring


}// end of class