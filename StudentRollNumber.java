public class StudentRollNumber {

	static int[] student = new int[] { 5, 8, 3, 6, 8, 9 };

	public void search(int rollnumber) {
		boolean found = false;

		for (int i = 0; i < student.length; i++) {
			if (student[i] == rollnumber) {
				System.out.println("Student found at index " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Student not found");
		}

	}

	public static void main(String[] args) {
		StudentRollNumber obj = new StudentRollNumber();
		obj.search(9);
		obj.search(7);

	}

}