import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a Sentence:");
		 String sentence = input.nextLine();
		 
		 int vowels=0 , consonants=0;
		 
		 for(int i=0;i<sentence.length();i++) {
			 
			//returns the character at the specified index.
			 char ch = sentence.charAt(i);
			 
			 if(ch == 'a' || ch == 'e' || ch == 'i'
		                || ch == 'o' || ch == 'u'|| 
		                ch =='A' || ch=='I' || ch=='E'
		           || ch =='O' || ch =='U')
		       {
		              
				 ++vowels;			 
		 }
			 else {
				 consonants++;
			 }
			 
		 }
		 System.out.println("Totals Vowel's are: " +vowels);
		 System.out.println("Totals Consonants are: " +consonants);		
	    
    }

}