import java.util.Scanner;
public class Main4 {
    public static void main(String[] args){
        int num;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("One");
            break;
            case 2 : System.out.println("Two");
            break;
            case 3 : System.out.println("Three");
            break;
            default : System.out.println("Invalid");

        }
        sc.close();

    }
    
}
