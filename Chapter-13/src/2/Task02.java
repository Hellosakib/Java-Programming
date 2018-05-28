import java.util.Scanner;
import java.util.ArrayList;
public class Task02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		System.out.println("Enter the elements:");
		for(int i=0;i<5;i++) {			
			double val = input.nextDouble();
			list.add(val);
		}
		
		sort(list);
		System.out.println("Increasing order:" +list);
		
	}
	public static void sort(ArrayList<Double> list) {
		
		

		for (int i = 0; i < list.size() - 1; i++) {
			// Find the mimimum in the list
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			// Swap list.get(i) with list.get(minIndex) if necessary
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, (Double) min);
			} 
		}
	}

}
