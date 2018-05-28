import java.util.Scanner;
public class LabTask06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
		String[] students = new String[num];
		int[] scores = new int[students.length];
		
		System.out.println("Enter the name a score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}
		sortDecreasing(students, scores);
		System.out.println("Student names in decreasing order of their scores are:\n");
		for (String e: students) {
			System.out.println(e);
		}
	}	
	public static void sortDecreasing(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;

			// Find the minimum in the list[i..nums.length - 1]
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}			
			if (maxIndex != i) {
				// Swap string array
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;

				// Swap int array
				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}
}
