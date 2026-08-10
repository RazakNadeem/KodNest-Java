import java.util.Scanner;
public class ILPSummary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        int practiceDays=scanner.nextInt();
        int solvedProblemCount;
        int totalProblems=0;
        for(int i=1;i<=practiceDays;i++){
            solvedProblemCount=scanner.nextInt();
            totalProblems+=solvedProblemCount;
        }
        double average = (double) totalProblems / practiceDays ;
        System.out.println("Learner: "+name);
        System.out.println("Total solved: "+totalProblems);
        System.out.println("Daily average: "+average);
        if(average>=5.0){
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
        scanner.close();
    }
}
