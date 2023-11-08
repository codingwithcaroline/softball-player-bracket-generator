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
public class Outfielder extends SoftballPlayer {

//instance variables
   private double outfielderFieldingAvg;
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
*@param outfielderFieldingAvgIn - used
*/
   public Outfielder(String playerNumberIn, String playerNameIn, 
      String playerPositionIn, double playerSpecializationIn, 
      double playerBattingAverageIn, double outfielderFieldingAvgIn) {
      super(playerNumberIn, playerNameIn, playerPositionIn, 
         playerSpecializationIn, playerBattingAverageIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }

//methods begin
/**
*@return outfielderFieldingAvg - used
*/
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }

/**
*@param outfielderFieldingAvgIn - used
*/
   public void setOutfielderFieldingAvg(double outfielderFieldingAvgIn) {
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }

/**
*@return - used
*/
   public double rating() { 
      return BASE_RATING * playerSpecialization 
         * playerBattingAverage * outfielderFieldingAvg;
   }
}