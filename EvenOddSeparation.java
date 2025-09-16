public class EvenOddSeparation {
	public static void main(String[] args) {
		int arr[] = { 10, 21, 4, 45, 66, 93, 22 };

		int evenCount = 0, oddCount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int evenArr[] = new int[evenCount];
		int oddArr[] = new int[oddCount];

		int eIndex = 0, oIndex = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenArr[eIndex++] = num;
			} else {
				oddArr[oIndex++] = num;
			}
		}

		System.out.print("Even Numbers: ");
		for (int num : evenArr) {
			System.out.print(num + " ");
		}

		System.out.print("\nOdd Numbers: ");
		for (int num : oddArr) {
			System.out.print(num + " ");
		}
	}
}

