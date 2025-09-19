import java.util.Arrays;

public class RightRotation {

	static int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

	public static void rotate(int k) {
		int n = arr.length;
		k = k % n;

		int temp[] = new int[k];

		for (int i = 0; i < k; i++) {
			temp[i] = arr[n - k + i];
		}

		for (int i = n - k - 1; i >= 0; i--) {
			arr[i + k] = arr[i];
		}

		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rotate(1); 
	}
}
