public class SecMinNum {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 8, 1, 9, 3, 7 };
		int Firstmin = 9;
		int Secmin = 9;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < Firstmin) {
				Secmin = Firstmin;
				Firstmin = arr[i];
			} else if (arr[i] < Secmin && arr[i] != Firstmin) {
				Secmin = arr[i];
			}
		}

		System.out.println("First Minimum Number in the array is : " + Firstmin);
		System.out.println("Second Minimum Number in the array is : " + Secmin);
	}
}
