/**
 * Exercise 1.4
 * Compound Interest.
 * A = P * (1 + r)^n
 * P = $5000.00 investment, r = 4% per year, n = 10 years.
 */
public class Exercise1_4_CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;      // 4% per year
        int years = 10;

        double amount = principal * Math.pow(1 + rate, years);

        System.out.printf("Principal: $%.2f%n", principal);
        System.out.printf("Annual interest rate: %.0f%%%n", rate * 100);
        System.out.printf("Years: %d%n", years);
        System.out.printf("Amount after %d years: $%.2f%n", years, amount);
    }
}
