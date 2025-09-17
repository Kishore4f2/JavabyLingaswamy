public class RandomInsertion {
	public int[] students = new int[5];
	public boolean[] occupied = new boolean[5];

	public void insert(int index, int student_id) {
		if (index < 0 || index >= students.length) {
			System.out.println("Invalid Index : " + index);
		} else if (!occupied[index]) {
			students[index] = student_id;
			occupied[index] = true;
			System.out.println("Inserted " + student_id + " at index " + index);
		} else {
			System.out.println("Index " + index + " already occupied");
		}
	}

	public void display() {
		System.out.println("Array : ");
		for (int i = 0; i < students.length; i++) {
			if (occupied[i]) {
				System.out.print(students[i] + " ");
			} else {
				System.out.println("\nempty ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RandomInsertion obj = new RandomInsertion();
		obj.insert(1, 45);
		obj.insert(1, 47);
		obj.insert(3, 42);
		obj.insert(0, 46);
		obj.display();
	}
}
