import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Currency_converter{
    private static Map<String, Double>exchangeRates = new HashMap<>();
    static{
        exchangeRates.put("INR", 1.0);       
        exchangeRates.put("USD", 0.013);     
        exchangeRates.put("EUR", 0.011);     
        exchangeRates.put("GBP", 0.0099);    
        exchangeRates.put("JPY", 1.42);      
        exchangeRates.put("AUD", 0.018);     
        exchangeRates.put("CAD", 0.017);     
        exchangeRates.put("CHF", 0.012);     
        exchangeRates.put("CNY", 0.083);     
        exchangeRates.put("RUB", 0.94);      
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        while(true){
            System.out.print("\nEnter the amount in INR to convert (or 0 to exit): ");
            double amount = scanner.nextDouble();

            if(amount == 0){
                System.out.println("Exiting the Currency converter. Goodbye!");
                break;
            }

            System.out.print("Enter the target currency (INR, USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY, RUB): ");
            String targetCurrency = scanner.next().toUpperCase();

            if(!exchangeRates.containsKey(targetCurrency)){
                System.out.println("Unsupported currency. Please enter valid currency code.");
                continue;
            }
        
            double convertedAmount = amount * exchangeRates.get(targetCurrency);
            System.out.printf("%.2f INR is equal to %.2f %s%n", amount, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}