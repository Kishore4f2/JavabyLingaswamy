public class Arrfirst {

	public static void main(String[] args) {
		
		//declaration
		//datatype ref_variable[]
		int[] arr;
		
		//memory allocation -> arr = new datatype[size];
		arr = new int[5];
		
		//assign -> indexes
		//whole numbers -> 0 to ....
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//accessing particular element
		System.out.println(arr[2]);
		
		System.out.println();
		
		//access the elements
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]);
		}

	}

}
