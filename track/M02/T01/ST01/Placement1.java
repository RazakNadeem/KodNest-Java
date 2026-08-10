public class Placement1 {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Write your code here
        String result=(marks >=60 && attendance >=75)? "Placement Ready" : "Continue Preparation";
        System.out.println(result);
        for (int day=1;day<=practiceDays;day++){
            System.out.println("Practice Day: "+day);
        }
    }
}