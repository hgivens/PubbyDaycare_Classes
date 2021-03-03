/*Here is a subclass that allows other brances of the doggie day care use the same dog class but its now adding where they are checked into 
*/
class Location extends Dog{
  public String theLocation;

  //constructor
  public Location(String startBreed, String startColor, String startName, double startSize,double startHours, String startLocation){

    super(startBreed, startColor, startName, startSize, startHours);
    theLocation = startLocation;

  }
  
  public void setLocation(String newLocation){
    theLocation = newLocation;
  }
  
// other methods 
  @Override public String toString(){
    return ("\nLocation: " + theLocation+super.toString());
  }


}//end of class 