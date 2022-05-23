import java.util.Scanner;

public class ShowStatistic {
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
                System.out.print((i + 1) + "день:" + monthAndDate[i][j] + ", "); // show steps in day
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
