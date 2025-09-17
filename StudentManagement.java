public class StudentManagement {
	
	public int[] students = new int[5];
	int count = 0;
	
	public void add(int rollnumber) {
		if (count < students.length) {
			students[count] = rollnumber;
			count++;
			System.out.println("Added rollnumber is : " + rollnumber);
		} else {
			System.out.println("Cannot add rollnumber : " + rollnumber + ". Array is full");
		}
	}
	public void display() {
		System.out.print("students : ");
		for (int i = 0; i < count; i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StudentManagement obj = new StudentManagement();
		obj.add(18);
		obj.add(19);
		obj.add(20);
		obj.add(21);
		obj.add(22);
		obj.display();
		obj.add(23);
	}
}
