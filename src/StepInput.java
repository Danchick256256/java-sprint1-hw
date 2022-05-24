import java.util.Scanner;

public class StepInput {
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
}

