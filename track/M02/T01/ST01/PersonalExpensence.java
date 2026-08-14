import java.util.Scanner;

public class PersonalExpensence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        // Calculate and display the budget details
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();
        double totalExpense = rentExpense+foodExpense+travelExpense;
        double remaining = monthlyIncome - totalExpense;
        System.out.println("Total expense: "+totalExpense);
        System.out.println("Remaining: "+remaining);
        if(remaining >=0){
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scanner.close();
    }
}

