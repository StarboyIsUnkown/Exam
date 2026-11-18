/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.starboyisunkown.main;

/**
 *
 * @author makho
 */
public class Product implements IProducts {
    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        if (count == 0) return 0.0;
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        String mostPopular = "";

        for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                mostPopular = products[i] + " (" + maxSales + ")";
            }
        }
        return mostPopular;
    }
}