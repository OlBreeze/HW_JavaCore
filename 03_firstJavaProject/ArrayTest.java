
public class ArrayTest {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		int min = 0, max = 20;
		
		// 1. Test Bubble sort 
		System.out.println("1. Test Bubble sort");
		ArrayUtils.fillArray(myArray, min, max);
		ArrayUtils.printArray(myArray);
		
		ArrayUtils.bubbleSort(myArray);

		ArrayUtils.printArray(myArray);
		
		// 2. Test Select sort
		System.out.println("\n2. Test Select sort");
		ArrayUtils.fillArray(myArray, min, max);
		ArrayUtils.printArray(myArray);

		ArrayUtils.selectSort(myArray);

		ArrayUtils.printArray(myArray);

		// 3. First Positive - Last Negative : Reverse
		System.out.println("\n3. First Positive - Last Negative : Reverse ");
		ArrayUtils.fillArray(myArray, min, max);
		ArrayUtils.printArray(myArray);
		
		ArrayUtils.firstPosLastNegReverse(myArray);

		ArrayUtils.printArray(myArray);
		
		// 4. Reverse array
		System.out.println("\n4. Reverse array ");
		ArrayUtils.fillArray(myArray, min, max);
		ArrayUtils.printArray(myArray);
		
		ArrayUtils.reverseArray(myArray);

		ArrayUtils.printArray(myArray);
		
		// 4.1 Reverse array new
		System.out.println("\n4.1 Reverse array new");
		ArrayUtils.fillArray(myArray, min, max);
		ArrayUtils.printArray(myArray);
		
		ArrayUtils.reverseArrayNew(myArray);

		ArrayUtils.printArray(myArray);
		
	}

}
