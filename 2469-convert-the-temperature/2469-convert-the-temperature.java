class Solution {
    public double[] convertTemperature(double celsius) {
        // Kelvin = Celsius + 273.15
        double kelvin = celsius + 273.15;
        
        // Fahrenheit = Celsius * 1.80 + 32.00
        double fahrenheit = celsius * 1.80 + 32.00;
        
        return new double[]{kelvin, fahrenheit};
    }
}
