public class TwoDArr {
	static int[][] students = { { 1, 2, 3 }, { 2, 3, 1 }, { 2, 1, 3 } };

	public static void main(String[] args) {
		AllStudentsMarks();
	}
	public static void AllStudentsMarks() {

		for (int st = 0; st < students.length; st++) {     // loop for fetch all students
			System.out.println(st + " Student Details : ");

			for (int m = 0; m < students[st].length; m++) {   // loop for assigning marks
				System.out.print(students[st][m] + " ");
			}
			System.out.println();
			System.out.println("***********");
		}
	}
}