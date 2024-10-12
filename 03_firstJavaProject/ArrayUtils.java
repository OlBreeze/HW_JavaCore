
public class ArrayUtils {
	public static void printArray(int[] ar) {
		if (!checkArrayInt(ar)) return;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	public static void printArrayInd(int ar[]) {
		if (!checkArrayInt(ar)) return;
		
		int i;
		System.out.println("index:\t");
		for (i = 0; i < ar.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\nvalue:");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
		System.out.println("\n");
	}

	public static void fillArray(int ar[], int min, int max) {
		if (ar == null || min >= max) {
			System.out.println("Wrong args");
			return;
		}
		for (int i = 0; i < ar.length; i++) {
			ar[i] = min + (int) (Math.random() * ((max - min) + 1));
		}
	}

	public static boolean checkArrayInt(int ar[]) {
		if (ar == null || ar.length == 0) {
			System.out.println("Array is null or empty");
			return false;
		}
		return true;
	}
	
	public static void swap(int ar[], int i, int j) {
		if (!checkArrayInt(ar)) return;
		
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static double average(int[] ar) {
		if (!checkArrayInt(ar)) return 0.;
		
		double res = 0.;
		for (int i = 0; i < ar.length; i++) {
			res += ar[i];
		}
		return res / ar.length;
	}

	public static int[] getReverseArray(int[] ar) {
		if (!checkArrayInt(ar)) return ar;
		
		int[] res = new int[ar.length];
		for (int i = 0, j = ar.length - 1; i < ar.length; i++, j--) {
			res[i] = ar[j];
		}
		return res;
	}

	public static void bubbleSort(int[] ar) {
		if (!checkArrayInt(ar)) return;
		
		int i, j, flag;
		for (j = ar.length - 1; j > 0; j--) {
			flag = 1;
			for (i = 0; i < j; i++) {
				if (ar[i] > ar[i + 1]) {

					swap(ar, i, i + 1);

					flag = 0;
				}
			}
			if (flag == 1)
				return;
		}
	}

	public static void reverseArray(int[] ar) { //bubbleSort reverse
		if (!checkArrayInt(ar)) return;
		
		int i, j, flag;
		for (j = ar.length - 1; j > 0; j--) {
			flag = 1;
			for (i = 0; i < j; i++) {
				if (ar[i] < ar[i + 1]) {

					swap(ar, i, i + 1);

					flag = 0;
				}
			}
			if (flag == 1)
				return;
		}
	}
	
	public static void reverseArrayNew(int[] ar) { // reverse Array
		if (!checkArrayInt(ar)) return;
			for (int i = 0; i < ar.length/2; i++) {
					swap(ar, i, ar.length - 1 - i);
			}
	}
	
	public static void selectSort(int ar[]) {
		if (!checkArrayInt(ar)) return;
		
		int min, min_i;
		for (int i = 0; i < ar.length - 1; i++) {
			min = ar[i];
			min_i = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < min) {
					min = ar[j];
					min_i = j;
				}
			}
			if (min_i != i)
				swap(ar, i, min_i);

		}
	}

	public static void firstPosLastNegReverse(int[] ar) {
		if (!checkArrayInt(ar)) return;
		
		int firstPosInd = -1, lastNegInd = -1;

		for (int i = 0; i < ar.length; i++) {
			if (firstPosInd == -1 && ar[i] > 0)
				firstPosInd = i;
			if (ar[i] < 0)
				lastNegInd = i;
		}

		if (firstPosInd != -1 && lastNegInd != -1)
			swap(ar, firstPosInd, lastNegInd);
	}

}
