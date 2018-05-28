import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) throws Exception {
	
		
		if (args.length != 1) {
			System.out.println("Missing Arguments");
			System.exit(1);
		}	

		// Check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		

		int characters = 0;	
		int words = 0;
		int lines = 0;		

		
			// Create input file
			Scanner input = new Scanner(file);
 		while (input.hasNext()) {
				String s = input.nextLine();
				lines++;
			
				String[] split = s.split(" ");
				
				for(int i =0; i<split.length;i++) {
					if(split[i].length()==1) {
						characters++;
					}
					else 
						words++;
				}			
			}
			
			System.out.println("So There are:\n\n" +characters+ " characters\n" +words+ " Words\n" +lines+ " Lines"+"\n\nin the file." );
			input.close();
		

	}
}
