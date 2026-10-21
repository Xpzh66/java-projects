/**
 * Exercise 1.5
 * Volumes of the Earth and the Sun, and their ratio.
 * Volume of a sphere = (4/3) * pi * r^3
 * Diameter of the Earth ~ 7,600 miles; Diameter of the Sun ~ 865,000 miles.
 * pi = 3.14
 */
public class Exercise1_5_PlanetVolume {
    public static void main(String[] args) {
        final double PI = 3.14;

        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;

        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);

        double ratio = sunVolume / earthVolume;

        System.out.printf("a) Volume of the Earth: %.2f cubic miles%n", earthVolume);
        System.out.printf("b) Volume of the Sun:   %.2f cubic miles%n", sunVolume);
        System.out.printf("c) Ratio of Sun volume to Earth volume: %.2f%n", ratio);
    }
}
