public class HighestThird {
	static int[][] students = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		Highestget();
	}

	public static void Highestget() {
		int highest = 0;
		int count = -1;
		for (int i = 0; i < students.length; i++) {
			int temp = students[i][students[i].length - 1];
			if (temp > highest) {
				highest = temp;
				count++;
			}
		}
		System.out.println(count + " person get  highest marks in problem solving : " + highest);
	}
}
