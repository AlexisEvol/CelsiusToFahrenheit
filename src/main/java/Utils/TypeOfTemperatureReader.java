package Utils;

import javax.swing.JComboBox;

public class TypeOfTemperatureReader {

    public void swapTemperaturesTypeText(String actualType, JComboBox oppositeComboBox) {

        if (actualType.equals("Celsius")) {
            oppositeComboBox.setSelectedItem("Fahrenheit");
        } else {
            oppositeComboBox.setSelectedItem("Celsius");
        }
    }

    public double calculateTemperatures(String actualComboBoxValue, double temperature, TemperatureCalculator temperatureCalculator) {
        if (actualComboBoxValue.equals("Celsius")) {
            return temperatureCalculator.toFahrenheit(temperature);
        } else {
            return temperatureCalculator.toCelsius(temperature);
        }
    }
}
