public class Converter {

    private static double exchangingToMeters;
    private static double exchangingToKilocalories;

    Converter(double meters, double calories) {
        exchangingToMeters = meters;
        exchangingToKilocalories = calories;
    }

    static double convertToMeters(double newSteps) {
        return newSteps * exchangingToMeters;
    }
    static double convertToCalories(double newSteps) {
        return newSteps * exchangingToKilocalories;
    }
}

