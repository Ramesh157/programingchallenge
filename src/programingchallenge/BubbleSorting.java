package programingchallenge;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] intArray = { 5, 9, 2, 8, 6 };
		System.out.println("Before Sorting");

		for (int i : intArray) {
			System.out.println(i);
		}
		bubbleSort(intArray);
		System.out.println("After Sorting");

		for (int i : intArray) {
			System.out.println(i);
		}
	}

	public static void bubbleSort(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < (intArray.length) - i; j++) {
				if (intArray[j - 1] > intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}

		}
	}
}