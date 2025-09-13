public class Arrassign {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int evenIndex = 0;

		System.out.println("All elements in an array are : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("================================");
		

		System.out.println("Sum of all elements in an array are : ");
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println(sum);

		System.out.println("================================");
		

		System.out.println("Sum of all even elements in an array are : ");

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] % 2 == 0) {
				sumEven += arr[k];
			}
		}
		System.out.println(sumEven);

		System.out.println("================================");
		

		System.out.println("Sum of all odd elements in an array are : ");
		for (int l = 0; l < arr.length; l++) {
			if (arr[l] % 2 != 0) {
				sumOdd += arr[l];
			}
		}
		System.out.println(sumOdd);

		System.out.println("================================");
		
		System.out.println("Sum of even-index elements in an array are : ");
		for (int m = 0; m < arr.length; m++) {
			if (m % 2 == 0) {
				evenIndex += arr[m];
			}
		}
		System.out.println(evenIndex);
	}

}