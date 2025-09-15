public class AddPrimenums {
	public static boolean isPrime(int num) {

		if (num < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (isPrime(arr[i])) {
				sum += arr[i];

			}
		}
		System.out.println(sum);
	}
}
