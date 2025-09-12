import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Odd  num : ");
        int n = sc.nextInt();
        int half = n/2;
        if(n % 2 == 0) {
            System.out.println("Please enter an Odd num");
            return;
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < Math.abs(half-i);j++) {
                System.out.print(" ");
            }
            if(i == 0 || i == n-1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for(int j = 0;j < n-2*Math.abs(half-i)-2;j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
