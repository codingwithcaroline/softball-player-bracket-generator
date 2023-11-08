import java.text.DecimalFormat;
/**
*This project is the first
*of three that will involve
*the rating and reporting
*for softball players.
*@author Caroline Kirkconnell
*@version 04/03/19
*This project contains an abstract
*class, so the subclasses of this
*class will access class methods 
*through inheritance rather than
*through the creation of instances.
*/
public abstract class SoftballPlayer implements Comparable<SoftballPlayer> {

//instance variables
   protected String playerNumber;
   protected String playerName;
   protected String playerPosition;
   protected double playerSpecialization;
   protected double playerBattingAverage;

//class variable
   protected static int count = 0;

//constant
/**
*
*/
   public static final int BASE_RATING = 10;

//constructor
/**
*@param playerNumberIn - used
*@param playerNameIn - used
*@param playerPositionIn - used
*@param playerSpecializationIn - used
*@param playerBattingAverageIn - used
*/
   public SoftballPlayer(String playerNumberIn, String playerNameIn, 
      String playerPositionIn, double playerSpecializationIn, 
      double playerBattingAverageIn) {
      setNumber(playerNumberIn);
      setName(playerNameIn);
      setPosition(playerPositionIn);
      setSpecializationFactor(playerSpecializationIn);
      setBattingAvg(playerBattingAverageIn);
      count++;
   }

//methods begin
//gets Number
/**
*@return playerNumber - used
*/
   public String getNumber() {
      return playerNumber;
   }

//sets Number
/**
*@param playerNumberIn - used
*/
   public void setNumber(String playerNumberIn) {
      playerNumber = playerNumberIn;
   }

//gets Name
/**
*@return getName - used
*/
   public String getName() {
      return playerName;
   }

//sets Name
/**
*@param playerNameIn - used
*/
   public void setName(String playerNameIn) {
      playerName = playerNameIn;
   }

//gets Position
/**
*@return playerPosition - used
*/
   public String getPosition() {
      return playerPosition;
   }

//sets Position
/**
*@param playerPositionIn - used
*/
   public void setPosition(String playerPositionIn) {
      playerPosition = playerPositionIn;
   }

//gets Batting Average
/**
*@return playerBattingAverage - used
*/
   public double getBattingAvg() {
      return playerBattingAverage;
   }

//sets Batting Average
/**
*@param playerBattingAverageIn - used
*/
   public void setBattingAvg(double playerBattingAverageIn) {
      playerBattingAverage = playerBattingAverageIn;
   }

//gets Specialization Factor
/**
*@return playerSpecialization - used
*/
   public double getSpecializationFactor() {
      return playerSpecialization;
   }

//sets Specialization Factor
/**
*@param playerSpecializationIn - used
*/
   public void setSpecializationFactor(double playerSpecializationIn)  {
      playerSpecialization = playerSpecializationIn;
   }

//gets Count
/**
*@return count - used
*/
   public static int getCount() {
      return count;
   }

//resets Count
/**
*
*/
   public static void resetCount() {
      count = 0;
   }

//compares two softball players
/**
*@return - used
*@param s1 - used
*/
   public int compareTo(SoftballPlayer s1) {
      int result = this.getNumber().compareTo(s1.getNumber());
      return result;
   }

//incorporates stats
/**
*@return playerBattingAverage1 - used
*/
   public String stats() {
      DecimalFormat df 
         = new DecimalFormat(".000");
      String playerBattingAverage1 
         = df.format(playerBattingAverage);
      return playerBattingAverage1;
   }

//toString that gets Batting Average Stats
/**
*@return softballPlayer - used
*/
   public String toString() {
      DecimalFormat df 
         = new DecimalFormat(".000");
      String softballPlayer = playerNumber + " " 
         + playerName + " " + "(" 
         + playerPosition + ")" + " "
         + stats()  
         + "\nSpecialization Factor: "
         + playerSpecialization + " (" + this.getClass() + ") "
         + "Rating: " + df.format(rating());
      return softballPlayer;  
   }

//gets Rating
/**
*@return - used
*/
   public abstract double rating();
}
