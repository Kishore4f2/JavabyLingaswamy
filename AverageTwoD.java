public class AverageTwoD {
	static int[][] students = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		AvgofStudent();
	}

	public static void AvgofStudent() {

		for (int st = 0; st < students.length; st++) { // loop for fetch all students

			int total = 0;
			int average = 0;
			int len = students[st].length;

			for (int i = 0; i < len; i++) {
				total += students[st][i];
			}
			average = total / len;
			System.out.println(st + " Student average marks : " + average);
		}
	}
}
