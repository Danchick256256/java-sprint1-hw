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
                System.out.print("Сколько шагов вы хотите пройти сегодня? ");
                stepDayGoal = scanner.nextInt();
                StepTracker.stepGoal(stepDayGoal);
            } else if (userInput == 2) {
                // Step input
                System.out.println("Введите число месяца 1-30 ");
                int date = scanner.nextInt();

                System.out.println("Введите месяц: 1-ЯНВАРЬ, 2-ФЕВРАЛЬ, 3-МАРТ, 4-АПРЕЛЬ, 5-МАЙ, 6-ИЮНЬ, 7-ИЮЛЬ, 8-АВГУСТ, 9-СЕНТЯБРЬ, 10-ОКТЯБРЬ, 11-НОЯБРЬ, 12-ДЕКАБРЬ? ");
                int month = scanner.nextInt();


                System.out.println("Введите количество шагов:");
                int newSteps = scanner.nextInt();

                monthAndDate[date - 1][month - 1] = monthAndDate[date - 1][month - 1] + newSteps;
                System.out.println("Обновлено, Пройдено " + newSteps + " шагов");
                converter.convert(newSteps);

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

