import java.io.*;
import java.util.Scanner;

public class Module6 

{

 public static void main(String[] args)throws IOException {
 
 try
 {
 
 File text = new File ("E:/Module6/Jaguirre.txt");
 
  Scanner scan = new Scanner(text);
  
  
  int lineNumber = 1;
  
   while (scan.hasNextLine()){
        String line = scan.nextLine();
        System.out.println(" " + lineNumber + ". " + line);
        lineNumber ++;
        
        
      }
      scan.close(); 
      System.out.println(" The total number of lines in E:/Module6/Jaguirre.txt is " + lineNumber);
     }
      
      catch (FileNotFoundException e)
{

System.out.println("Unable to locate Jaguirre.txt");
}//end catch

System.out.println();
System.out.println("Coded by Juan Aguirre");

     }
    }
        
        
   


