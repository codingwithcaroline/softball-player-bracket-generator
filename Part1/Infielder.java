/**
*This project is the first
*of three that will involve
*the rating and reporting
*for softball players.
*@author Caroline Kirkconnell
*@version 04/03/19
*This project contains a class
*that derives from SoftballPlayer.
*/
public class Infielder extends SoftballPlayer {

//instance variables 
   private double infielderFieldingAvg;
/**
*
*/

//constructor
/**
*@param playerNumberIn - used
*@param playerNameIn - used
*@param playerPositionIn - used
*@param playerSpecializationIn - used
*@param playerBattingAverageIn - used
*@param infielderFieldingAvgIn - used
*/
   public Infielder(String playerNumberIn, String playerNameIn, 
      String playerPositionIn, double playerSpecializationIn, 
      double playerBattingAverageIn, double infielderFieldingAvgIn) {
      super(playerNumberIn, playerNameIn, playerPositionIn, 
         playerSpecializationIn, playerBattingAverageIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   //methods begin
   /**
   *@return infielderFieldingAvg - used
   */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
   *@param infielderFieldingAvgIn - used
   */
   public void setInfielderFieldingAvg(double infielderFieldingAvgIn) {
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
   *@return - used
   */
   public double rating() {
      return BASE_RATING * playerSpecialization 
         * playerBattingAverage * infielderFieldingAvg;
   }
}
