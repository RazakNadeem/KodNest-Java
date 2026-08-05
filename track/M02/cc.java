import java.util.Scanner;
public class cc {
    public static void main (String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();

        if(num > 10){
            System.out.println("Number is greater than 10");
        }
        else{
            System.out.println("Number is not greater than 10");
        }
    }
}