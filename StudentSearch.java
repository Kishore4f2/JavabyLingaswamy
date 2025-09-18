public class StudentSearch {

	static String student_names[] = { "Naveen", "Raju", "Pavan", "Charan", "Rahul", "Raju" };

	public void search(String name) {
		int count = 0;

		for (int i = 0; i < student_names.length; i++) {
			if (student_names[i].equals(name)) {
				count++;
				if (count == 1) {
					System.out.println("First student found at index " + i);
				} else if (count == 2) {
					System.out.println("Second student found at index " + i);
				} else if (count == 3) {
					System.out.println("Third student found at index " + i);
				} else {
					System.out.println(count + "th student found at index " + i);
				}
			}
		}
		if (count == 0) {
			System.out.println("student not found");
		}

	}

	public static void main(String[] args) {
		StudentSearch obj = new StudentSearch();
		obj.search("Raju");
		obj.search("Naveen");
		obj.search("Suresh");

	}

}
