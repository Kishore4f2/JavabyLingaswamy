import java.util.*;
public class Eve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int y;
        switch(num % 2) {
            case 0 :
                switch( y = (num>100)?1: (num<100)?2: 0) {
                    case 0 :
                        System.out.println("Even and equal to 100");
                        break;
                    case 1 :
                        System.out.println("Even and greater than 100");
                        break;
                    case 2 :
                        System.out.println("Even and less than 100");
                        break;
                }
                break;
            case 1 :
                switch( y = (num>100)?1:2) {
                    case 1 :
                        System.out.println("Odd and greater than 100");
                        break;
                    case 2 :
                        System.out.println("Odd and less than 100");
                        break;
                }
                break;
        }
    }sc.close();
}