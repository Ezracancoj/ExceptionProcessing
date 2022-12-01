import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class Chapter11 {

private static void StringWriter(){
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the path to open the input file");
	String str = sc.nextLine();
	 File inputFile = new File(str);
     PrintWriter outputFile = new PrintWriter("C:\\Users\\Jennifer\\Desktop\\Therese\\CS\\CS Lab\\output.txt");
    
     Scanner in = new Scanner(inputFile);
     while (in.hasNext()) 
     {
     String what =in.next();
     outputFile.println(what);
     }
     in.close();
     outputFile.close();
     sc.close();
	}
	catch(IOException e){
		System.out.println("File is not found, please try again");
		StringWriter();
		
	}
	
	
	}
	

	public static void main(String[] args) throws FileNotFoundException{
		StringWriter();
		
		

	}

}
	
