package Fahrenheit_to_celcius;

public class TempConverter {

    // F = (C * 9/5) + 32.

    private double tempCles;
    private double tempFah;

    public TempConverter(double tempCles) {
        this.tempCles = tempCles;
        this.tempFah = 0.0d;
    }

    public double clesToFah() {
        return tempFah = (tempCles * (9/5)) + 32;
    }
}

