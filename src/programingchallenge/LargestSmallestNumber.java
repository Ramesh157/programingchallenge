package programingchallenge;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		int intArray[]= new int [] {24,6,28,95,456,0};
		int largest= Integer.MIN_VALUE;
		int smallest= Integer.MAX_VALUE;
		
		for (int i : intArray) {
			if(i>largest) {
				largest=i;
			}else if (i<smallest) {
				smallest=i;
				
			}
			
		}
		System.out.println("Largest Number in an array = " + largest);
		System.out.println("Smallest Number in an array = " + smallest);

	}
}
