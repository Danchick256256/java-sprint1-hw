import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] monthAndDate = new int[30][12];

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter(0.75, 0.05);
        int stepDayGoal = 10000;

        while (true) {

            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                // Step goal
                stepDayGoal = StepTracker.stepGoal(scanner);
                System.out.println(stepDayGoal);

            } else if (userInput == 2) {
                // Step input
                StepInput.stepInput(scanner, monthAndDate);

            } else if (userInput == 3) {
                // Show statistic
                ShowStatistic.showStatistic(scanner, monthAndDate, stepDayGoal);
            } else if (userInput == 0) {
                break;
            }

        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести цель по шагам на день");
        System.out.println("2 - Ввести пройденное количество шагов за определенный день");
        System.out.println("3 - Посмотреть статистику за выбранный месяц");
        System.out.println("0 - Выход");
    }

}

