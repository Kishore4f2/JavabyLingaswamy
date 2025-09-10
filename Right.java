import java.util.*;
class Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String st = "";
        for(int i=1;i<=num;i++){
            st = st+"* ";
            System.out.println(st);
        }
    }
}
