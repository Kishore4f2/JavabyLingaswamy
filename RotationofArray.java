import java.util.Arrays;

public class RotationofArray {

	static int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

	public static void rotate(int k) {
		int[] temp = new int[k];

		// loop to add first k values into temp array
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		// loop to shift the elements from 'k' position
		for (int i = k; i < arr.length; i++) {
			arr[i - k] = arr[i];
		}

		// loop to add the elements into original array
		for (int i = 0; i < temp.length; i++) {
			arr[arr.length - k + i] = temp[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rotate(1);
	}

}