import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
      try{
       Scanner in = new Scanner(new File("test.in"));
       PrintWriter out = new PrintWriter("test.out");
        while (in.hasNextLine()) {      
             out.println(in.nextLine()); 
           } 
        in.close();   
        out.close();
      } 
           catch(FileNotFoundException I){
             System.err.println("File not Found");
           }
           catch(IOException IOE){
             System.err.println("Input Error");
           }   
           catch(Exception E){
             System.err.println("General Exception");
           }
        
         
        }
    }
