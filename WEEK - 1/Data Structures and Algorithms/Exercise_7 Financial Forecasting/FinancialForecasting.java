import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinancialForecasting{

    // Memoization Map
    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive Method with Memoization
    public static double calculateFutureValueMemoized(double principal, double rate, int years){

        // Base Case
        if (years == 0){
            return principal;
        }

        // Check if already computed
        if (memo.containsKey(years)){
            return memo.get(years);
        }

        double result = calculateFutureValueMemoized(
                principal * (1 + rate),
                rate,
                years - 1
        );

        memo.put(years, result);

        return result;
    }

    // Display Year-wise Forecast
    public static void displayForecast(double principal, double rate, int years){

        System.out.println("\n========== Yearly Forecast ==========");

        for (int i = 0; i <= years; i++){

            double amount = principal * Math.pow(1 + rate, i);

            System.out.printf("Year %2d : %.2f%n", i, amount);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" Financial Forecasting System");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("=====================================");

        // User Input
        System.out.print("\nEnter Initial Amount : ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Growth Rate (decimal) : ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Number of Years : ");
        int years = scanner.nextInt();

        // Calculate Future Value
        double futureValue = calculateFutureValueMemoized(
                principal,
                rate,
                years
        );

        // Display Forecast Table
        displayForecast(principal, rate, years);

        // Final Result
        System.out.println("\n========== Result ==========");

        System.out.printf("Future Value after %d years : %.2f%n", years, futureValue);

        System.out.println("\n========== Analysis ==========");
        System.out.println("Recursion is used to calculate future value.");
        System.out.println("Memoization stores previously computed results.");
        System.out.println("This avoids redundant calculations and improves efficiency.");

        System.out.println("\nForecast Generated Successfully.");

        scanner.close();
    }
}