import java.util.*;
public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the starting prime num : ");
        int num = sc.nextInt();
        if(!isPrime(num)) {
            System.out.println("Enter only Prime number");
            return;
        }
        System.out.println();
        for(int i =1;i<=rows;i++) {
            for(int j =1;j<=i;j++) {
                while (!isPrime(num)) {
                    num++;
                }
                System.out.print(num+ "\t");
                num++;
            }
            System.out.println();
        }
    }
    static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
