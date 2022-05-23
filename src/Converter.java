public class Converter {

    double exchangingToSteps;
    double exchangingToKilocalories;

    Converter(double meters, double calories) {
        exchangingToSteps = meters;
        exchangingToKilocalories = calories;
    }

    void convert(int steps) {
        System.out.println("Вы прошли: " + (int)(steps * exchangingToSteps) + " метров и потратили: " + (int)(steps * exchangingToKilocalories) + " килокалорий");
    }
}

