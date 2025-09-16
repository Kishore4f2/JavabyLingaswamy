public class CountDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3, 6, 1 };

		boolean visited[] = new boolean[arr.length];
		int duplicateCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}

			if (count > 1) {
				duplicateCount++;
				System.out.println("Element " + arr[i] + " is duplicated " + count + " times.");
			}
		}

		System.out.println("Total number of duplicate elements: " + duplicateCount);
	}
}