import java.io.IOException;
/**
*This project is Part 2 of 
*three that will involve the 
*rating and reporting for 
*softball players. 
*@author Caroline Kirkconnell
*@version 04/18/19
*This program creates a
*SoftballTeam object and then
*calls the readPlayerFile on the
*SoftballTeam object, which will
*add softball players to the team
*as the data is read in from a
*file. 
*/
public class SoftballPlayersPart2 {
/**
* Reads a filename and generates reports.
* @param args command line arguments for filename.
* @throws IOException if there is no file.
*/
   public static void main(String[] args) throws IOException {
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else
      {
         String fileName = args[0];
         SoftballTeam sample = new SoftballTeam();
         sample.readPlayerFile(fileName);
         System.out.println(sample.generateReport());
         System.out.println(sample.generateReportByNumber());
         System.out.println(sample.generateReportByName());
         System.out.println(sample.generateReportByRating());
         System.out.println(sample.generateExcludedRecordsReport());
         System.out.println("Number of ignored records from file: " 
            + sample.getIgnoredCount());
      }
   }
}