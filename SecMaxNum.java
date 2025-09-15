public class SecMaxNum {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int Firstmax = 0;
		int Secmax = 0;
		int Thirdmax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Firstmax) {
				Thirdmax = Secmax;
				Secmax = Firstmax;
				Firstmax = arr[i];
			}
			if (arr[i] > Secmax && arr[i] != Firstmax) {
				Secmax = arr[i];
			}
			if (arr[i] > Thirdmax && arr[i] != Secmax && arr[i] != Firstmax) {
				Thirdmax = arr[i];
			}
		}

		System.out.println(Firstmax);
		System.out.println(Secmax);
		System.out.println(Thirdmax);

	}

}
