/**
 * Exercise 1.6
 * Fuel consumption.
 * Normal road: 8 liters per 100 km.
 * Rough road: 15% more fuel than normal.
 * Full tank: 40 liters.
 * Displays the maximum distance the car can travel on normal and rough roads.
 */
public class Exercise1_6_FuelConsumption {
    public static void main(String[] args) {
        double normalLitersPer100Km = 8.0;
        double extraOnRough = 0.15;                     // 15% more
        double roughLitersPer100Km = normalLitersPer100Km * (1 + extraOnRough);

        double tankCapacity = 40.0;                     // liters

        double normalDistance = (tankCapacity / normalLitersPer100Km) * 100.0;
        double roughDistance = (tankCapacity / roughLitersPer100Km) * 100.0;

        System.out.printf("Fuel consumption on normal roads: %.2f L/100km%n", normalLitersPer100Km);
        System.out.printf("Fuel consumption on rough roads: %.2f L/100km%n", roughLitersPer100Km);
        System.out.printf("Distance on a full tank (normal roads): %.2f km%n", normalDistance);
        System.out.printf("Distance on a full tank (rough roads):  %.2f km%n", roughDistance);
    }
}
