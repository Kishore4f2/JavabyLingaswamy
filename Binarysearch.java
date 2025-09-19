public class Binarysearch {

	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void binarysearch(int num) {
		int pos = -1;
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (num == arr[mid]) {
				pos = mid;
				break;
			} else if (num < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(num + " is found at  index " + pos);
	}

	public static void main(String[] args) {
		binarysearch(5);
	}
}