import java.util.*;
class Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String st = "";
        for(int i=1;i<=num;i++){
            st = "* "+st;
            int spaces = (num-i)*2;
            String pad = " ".repeat(Math.max(0, spaces));
            System.out.println(pad+st);
        }
    }
}
