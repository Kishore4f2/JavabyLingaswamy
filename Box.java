import java.util.*;
class Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1;i<=num*num;i++){
            count++;
            System.out.print("* ");
            if(count==num) {
                System.out.println();
                count = 0;
            }
        }
    }
}