public class UnitConverter {
    // -------QUESTION 4-----
    public static double convertKmToMiles(double km ){
        double km2miles = 0.621371;
        return km*km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles*miles2km;
    }
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters*meters2feet;
    }
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet*feet2meters;
    }
    // --------EXTENDED TO SOLVE QUESTION 5 ----
    public static double yardsToFeet(double yards){
        double yards2feet = 3;
        return yards*yards2feet;
    }
    public static double feetsToYards(double feets){
        double feet2yards = 0.333333;
        return feet2yards*feets;
    }
    public static double metersToInches(double meters){
        double meters2inches = 39.3701;
        return meters2inches*meters;
    }
    public static double inchToMeter(double inch){
        double inches2meters = 0.0254;
        return inch*inches2meters;
    }
    public static double inchToCm(double inch){
        double inches2cm = 2.54;
        return inch*inches2cm;
    }
    //---------EXTENDED TO SOLVE QUESTION 6 ------
    public static double farhenheitToCelsius(double farhenheit){
        return (farhenheit -32) * 5/9;
    }
    public static double celsiusToFarhenheit(double celsius){
        return (celsius * 9/5) +32;

    }
    public static double poundsToKilogram(double pounds){
        double pounds2kilograms = 0.453592;
        return pounds*pounds2kilograms;
    }
    public static double kilogramToPounds(double kilogram){
        double kilograms2pounds = 2.20462;
        return kilogram*kilograms2pounds;
    }
    public static double gallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons*gallons2liters;
    }
    public static double litersToGallons(double liters){
        double liters2gallons = 0.264172;
        return liters2gallons * liters;
    }



}
