package calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> prices = priceList();
        printPrices(prices);

    }

    public static void printPrices(Map<String, Double> prices) {
        System.out.println("Prices:");
        for(Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    private  static Map<String, Double> priceList() {
        Map<String, Double> prices = new HashMap<>();

        prices.put("Bubblegum", 2d);
        prices.put("Toffee", 0.2);
        prices.put("Ice cream", 5d);
        prices.put("Milk chocolate", 4d);
        prices.put("Doughnut", 2.5);
        prices.put("Pancake", 3.2);

        return prices;
    }
}