package Utils;

public class TemperatureCalculator {
    
    //Formula (x °C × 9 / 5) + 32 = x °F
    public double toFahrenheit(double temperature){
        
        double fahrenheits = (temperature * 9 / 5) + 32;
        return fahrenheits;
    }
    
    //(x °F − 32) × 5 / 9 = x °C
    public double toCelsius(double temperature){
        
        double celsius = (temperature - 32) * 5 / 9;
        return celsius;
    }
}
