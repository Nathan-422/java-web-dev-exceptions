package org.launchcode.Temperature;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        try {
            if (aFahrenheit < absoluteZeroFahrenheit) {
                throw new TemperatureException(aFahrenheit + " is outside the realm of science!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        fahrenheit = aFahrenheit;
    }
}
