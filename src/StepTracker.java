import java.util.Scanner;

public class StepTracker {
    public static int stepGoal(Scanner scanner) {
        System.out.print("Сколько шагов вы хотите пройти сегодня? ");
        int stepDayGoal = scanner.nextInt();
        return stepDayGoal;
    }

    static void stepInput(Scanner scanner, int[][] monthAndDate) {
        System.out.println("Введите число месяца 1-30 ");
        int date = scanner.nextInt();

        System.out.println("Введите месяц: 1-ЯНВАРЬ, 2-ФЕВРАЛЬ, 3-МАРТ, 4-АПРЕЛЬ, 5-МАЙ, 6-ИЮНЬ, 7-ИЮЛЬ, 8-АВГУСТ, 9-СЕНТЯБРЬ, 10-ОКТЯБРЬ, 11-НОЯБРЬ, 12-ДЕКАБРЬ? ");
        int month = scanner.nextInt();


        System.out.println("Введите количество шагов:");
        int newSteps = scanner.nextInt();

        monthAndDate[date - 1][month - 1] = monthAndDate[date - 1][month - 1] + newSteps;
        System.out.println("Обновлено, Пройдено " + newSteps + " шагов");
        System.out.println("Вы прошли: " + Converter.convertToMeters(newSteps) + " метров и потратили: " + Converter.convertToCalories(newSteps) + " килокалорий");
    }

    public static void showStatistic (Scanner scanner, int[][] monthAndDate, int stepDayGoal)
    {
        System.out.println("За какой месяц смотрим: 1-ЯНВАРЬ, 2-ФЕВРАЛЬ, 3-МАРТ, 4-АПРЕЛЬ, 5-МАЙ, 6-ИЮНЬ, 7-ИЮЛЬ, 8-АВГУСТ, 9-СЕНТЯБРЬ, 10-ОКТЯБРЬ, 11-НОЯБРЬ, 12-ДЕКАБРЬ?");

        int series = 0;
        int bestSeries = 0;
        int maxSteps = 0;
        int sumAllSteps = 0;

        int month = scanner.nextInt();
        for (int i = 0; i < monthAndDate.length; i++) {
            for (int j = month - 1; j < month; j++) {
                if (monthAndDate[i][j] > maxSteps) { // Find max steps
                    maxSteps = monthAndDate[i][j];
                }
                if (monthAndDate[i][j] > stepDayGoal) {
                    ++series;
                } else {
                    series = 0;
                }
                if (bestSeries < series) {
                    bestSeries = series;
                }
                sumAllSteps = sumAllSteps + monthAndDate[i][j];
                System.out.print((i + 1) + " день: " + monthAndDate[i][j] + ", "); // show steps in day
            }
        }
        System.out.println("Сумма шагов за месяц: " + sumAllSteps);
        System.out.println("Наибольшее количество шагов в месяце: " + maxSteps);
        System.out.println("Среднее количество шагов за месяц: " + sumAllSteps / 30);
        System.out.println("Дистанция составила: " + (int) ((sumAllSteps * 0.75) / 1000) + " километров");
        System.out.println("Калорий потрачено: " + (int) (sumAllSteps * 0.05) + " к.калорий");
        System.out.println("Лучшая серия составила " + bestSeries + " дней");
    }
}
