import java.util.Scanner;
public class inputCondition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        String status;
        int days = scanner.nextInt();
        for(int i=1;i<=days;i++){
            int solvedProblems=scanner.nextInt();
            total=total+solvedProblems;
        }
        System.out.println("Total solved: "+total);
        if(total>=20){
            System.out.println("Status: Strong progress");
        } else if (10<=total && total<=19){
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }
        scanner.close();
    }
}
