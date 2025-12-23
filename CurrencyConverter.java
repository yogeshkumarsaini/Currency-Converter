import java.util.HashMap;
import java.util.Scanner;

enum Currency {
    INR, USD, EUR, GBP, JPY, AUD, CAD
}

public class CurrencyConverter {

    // Static exchange rates (base: INR)
    private static final HashMap<Currency, Double> rates = new HashMap<>();

    static {
        rates.put(Currency.INR, 1.0);
        rates.put(Currency.USD, 0.012);
        rates.put(Currency.EUR, 0.011);
        rates.put(Currency.GBP, 0.0095);
        rates.put(Currency.JPY, 1.75);
        rates.put(Currency.AUD, 0.018);
        rates.put(Currency.CAD, 0.016);
    }

    public static double convert(Currency from, Currency to, double amount) {
        double amountInINR = amount / rates.get(from);
        return amountInINR * rates.get(to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        System.out.println("💱 Currency Converter (Static Rates)");

        do {
            System.out.println("\nAvailable Currencies:");
            for (Currency c : Currency.values()) {
                System.out.print(c + " ");
            }

            try {
                System.out.print("\n\nEnter source currency: ");
                Currency from = Currency.valueOf(sc.next().toUpperCase());

                System.out.print("Enter target currency: ");
                Currency to = Currency.valueOf(sc.next().toUpperCase());

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                double result = convert(from, to, amount);
                System.out.printf("Converted Amount: %.2f %s%n", result, to);

            } catch (IllegalArgumentException e) {
                System.out.println("❌ Invalid currency code!");
            }

            System.out.print("\nDo you want to convert again? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("Thank you for using Currency Converter!");
        sc.close();
    }
}
