import java.util.Scanner;

public class CompanyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store monthly profits
        double[] monthlyProfits = new double[12];

        // Input monthly profits
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter profit for month " + (i + 1) + ": ");
            monthlyProfits[i] = scanner.nextDouble();
        }

        // Calculate total profit
        double totalProfit = 0;
        for (double profit : monthlyProfits) {
            totalProfit += profit;
        }

        // Calculate average profit
        double averageProfit = totalProfit / 12;

        // Display results
        System.out.println("\nCompany Profits:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i + 1) + ": $" + monthlyProfits[i]);
        }

        System.out.println("\nTotal Profit: $" + totalProfit);
        System.out.println("Average Monthly Profit: $" + averageProfit);

        scanner.close();
    }
}
