import java.util.Scanner;

public class NumberRangeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze its numbers
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int evenSum=0;
        int oddCount=0;
        while(start<=end){
            if(start%2==0){
                evenSum+=start;
            }else{
                oddCount+=1;
            }
            start++;
        }
        System.out.println("Even sum: "+evenSum);
        System.out.println("Odd count: "+oddCount);

        scanner.close();
    }
}
