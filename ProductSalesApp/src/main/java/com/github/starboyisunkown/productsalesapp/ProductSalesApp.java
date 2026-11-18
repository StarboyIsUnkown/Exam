/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.starboyisunkown.productsalesapp;

/**
 *
 * @author makho
 */
import java.util.Scanner;

public class ProductSalesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Arrays
        String[] productNames = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        String[] shortNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];
        int[] productTotals = new int[3];
        int totalProductSales = 0;
//For loop,goes through from month 1 to 3 per type of product
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + ": ");
                sales[i][j] = scanner.nextInt();
                
                productTotals[i] += sales[i][j];
                totalProductSales += sales[i][j];
            }
        }

        int averageProductSales = totalProductSales / productNames.length;

        int maxIndex = 0;
        for (int i = 1; i < productTotals.length; i++) {
            if (productTotals[i] > productTotals[maxIndex]) {
                maxIndex = i;
            }
        }
//Final display of products
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + totalProductSales);
        System.out.println("AVERAGE PRODUCT SALES: " + averageProductSales);
        System.out.println("MOST POPULAR PRODUCT: " + shortNames[maxIndex] + " (" + productTotals[maxIndex] + ")");

        scanner.close();
    }
}