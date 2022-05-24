import java.util.Scanner;

public class StepTracker {
    public static int stepGoal(Scanner scanner) {
        System.out.print("Сколько шагов вы хотите пройти сегодня? ");
        int stepDayGoal = scanner.nextInt();
        return stepDayGoal;
    }
}
