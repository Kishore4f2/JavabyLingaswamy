public class FirstRepeatingElement {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

		int firstRepeating = -1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					firstRepeating = arr[i];
					break;
				}
			}
			if (firstRepeating != -1) {
				break;
			}
		}

		if (firstRepeating != -1) {
			System.out.println("First repeating element is: " + firstRepeating);
		} else {
			System.out.println("No repeating elements found.");
		}
	}
}
