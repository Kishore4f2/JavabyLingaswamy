public class CountPosNeg {
	public static void main(String[] args) {
		int arr[] = { 10, -3, 5, -7, 0, 8, -2, 12 };

		int positiveCount = 0;
		int negativeCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positiveCount++;
			} else if (arr[i] < 0) {
				negativeCount++;
			}
		}

		System.out.println("Number of Positive elements: " + positiveCount);
		System.out.println("Number of Negative elements: " + negativeCount);
	}
}
