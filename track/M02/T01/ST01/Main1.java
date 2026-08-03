public class Main1 {
    public static void main(String[] args) {
        // Convert the given pseudocode into Java code

        int javaHoursPerDay = 2;
        int aptitudePerDay = 1;
        int numberOfDays = 5;

        int weeklyJavaHours = javaHoursPerDay * numberOfDays;
        int weeklyAptitudeHours = aptitudePerDay * numberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;

        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptitudeHours);
        System.out.println("Total: " + totalPreparationHours);
    }
}