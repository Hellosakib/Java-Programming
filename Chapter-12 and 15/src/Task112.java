import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task112 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("Salary.txt");
		
		//Check weather the file exists or not
		 if(!f.exists()) {
			 System.out.println("File Dosen't exists");
			 f.createNewFile();
		 }
		 
		 //Take a input from User
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a large Dataset size: ");
		 generateDataset(f , input.nextInt());  //This method will generate data from File
		 System.out.println("Your Data has been Stored. Open the Output");
		
		 
	}
	
	public static void generateDataset(File f , int size)  throws Exception 
	{
		
				
		
		try(PrintWriter output = new PrintWriter(f))
		{
			
			for(int i =0 ; i<size; i++) {
				output.print("First Name " +i+ " Last Name " +i+ " " +getRankSalary() + "\n");
			}
		}
		/*
		catch (Exception ex) {
			if(size>1000) {
				System.out.println("Sorry !! Enter the size between 1 - 1000\n");
				System.exit(1);
			}
		}
		*/
		
		
	}

	public static String getRankSalary() {   //This method will find the values from the data set
		
		Random randnum = new Random();
		int position = randnum.nextInt(3);
		
		if(position==0) {
			return ("Assistant " + String.format("%10.2f", (5000 +Math.random()*3000)));
		}

		else if(position==1) {
			return ("Associate " + String.format("%10.2f", (6000 +Math.random()*4500)));
		}

		else {
			return ("Full " + String.format("%10.2f", (7000 +Math.random()*6000)));
		}
	}
}