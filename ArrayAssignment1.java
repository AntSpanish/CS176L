
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		int size = 0;
		int negativeCount = 0;
		int constant = 0;
		
		double[] list =
			{25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		size = list.length;
		
		double largest = list[0];
		
		for (int i = 0; i < size; i++) {
			if (list[i] < constant) {
				negativeCount++; }
			if (list[i] > largest) {
				largest = list[i]; }
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(list[i] + " ");
		}
		
		System.out.println();
		System.out.println("The largest element in the array is " + largest);
		System.out.printf("There are %d negative numbers in array", negativeCount);
		

	}

}
