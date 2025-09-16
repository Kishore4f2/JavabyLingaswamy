public class FrequencyArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 4, 1, 5, 3, 2, 1 };
		boolean visited[] = new boolean[arr.length];

		System.out.println("Element | Frequency");
		System.out.println("-------------------");

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

			System.out.println("   " + arr[i] + "    |    " + count);
		}
	}
}
