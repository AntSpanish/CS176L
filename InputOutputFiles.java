import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	   boolean loop = true;
	   
	   Scanner fileScanner = new Scanner(System.in);
	   System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
	   
	   while (loop == true) {
		   try {
			   
			   String fName = fileScanner.next();
			   File inputFile = new File(fName);
			   PrintWriter outputFile = new PrintWriter("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
			   
			   Scanner in = new Scanner(inputFile);
			   while (in.hasNext()) 
			   {
				   String what =in.next();
				   outputFile.println(what);
				   }
			   
			   in.close();
			   outputFile.close();
			   fileScanner.close();
			   
			   loop = false;
			   
		   } catch (FileNotFoundException e) {
			   
			   System.out.println("File is not found, please try again: ");
			   
		   }
	   }
   }
}
