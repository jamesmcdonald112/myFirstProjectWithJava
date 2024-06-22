package calculator;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Double> prices = priceList();
        printPrices(prices);
        System.out.println(" ");
        Map<String, Double> incomeList = incomeList();
        printEarnedAmount(incomeList);
        double income = calculateIncome(incomeList);
        System.out.println(" ");
        printIncome(income);
        System.out.println(" ");

        double staff = expense("Staff expenses:");
        double other = expense("Other expenses:");

        System.out.println(" ");
        double netIncome = income - staff - other;

        System.out.println("Net income: $" + netIncome);
    }

    public static void printPrices(Map<String, Double> prices) {
        System.out.println("Prices:");
        for(Map.Entry<String, Double> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    private  static Map<String, Double> priceList() {
        Map<String, Double> prices = new TreeMap<>();

        prices.put("Bubblegum", 2d);
        prices.put("Toffee", 0.2);
        prices.put("Ice cream", 5d);
        prices.put("Milk chocolate", 4d);
        prices.put("Doughnut", 2.5);
        prices.put("Pancake", 3.2);

        return prices;
    }

    public static void printEarnedAmount(Map<String, Double> incomeList) {
        System.out.println("Earned amount:");
        for(Map.Entry<String, Double> entry : incomeList.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    private static Map<String, Double> incomeList() {
        Map<String, Double> incomeList = new TreeMap<>();

        incomeList.put("Bubblegum", 202d);
        incomeList.put("Toffee", 118d);
        incomeList.put("Ice cream", 2250d);
        incomeList.put("Milk chocolate", 1680d);
        incomeList.put("Doughnut", 1075d);
        incomeList.put("Pancake", 80d);

        return incomeList;
    }

    private static double calculateIncome(Map<String, Double> incomeList) {
        double sum = 0;
        for(Map.Entry<String, Double> entry : incomeList.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    private static void printIncome(double sum) {
        System.out.println("Income: " + sum);
    }

    private static double expense(String expense) {
        System.out.println(expense);
        return scanner.nextDouble();
    }


}