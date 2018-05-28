import java.io.*;
import java.util.*;

public class Task11 {

	public static void main(String[] args) throws FileNotFoundException {			
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter a File: ");
		File f = new File(in.nextLine()); //Enter the file name that you store your data
		
		if(!f.exists()) {
			System.out.println("File Doesn't Exists.");
			System.exit(1);
		}
		
		int count = 0;
		int total = 0;
		
		try (Scanner input = new Scanner(f))  // this line means: it reads data from the file that you store at line 13
		
		{
			while(input.hasNext()) {
				total += input.nextInt();
				count++;
				
			}
			
		}
		catch(Exception ex) {
            System.out.println("Error !!!!!!!!!! \nPlease Enter the Correct File name and Path.");
            System.exit(0);
		}
		
		System.out.println("\nFile Name: " + f.getName());
		System.out.println("Total scores: " +total);
		System.out.println("Average scores: " + (total / count));
		in.close();
	
	}
}
