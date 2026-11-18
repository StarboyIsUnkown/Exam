/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.starboyisunkown.main;

/**
 *
 * @author makho
 */
public class Main {
    public static void main(String[] args) {
        // Data populated to mirror your assignment prompt output
        String[] products = {
            "Cozy Nights Monarch", 
            "Restonic Barbados mattress", 
            "Sealy Phuket mattress"
        };
        
        int[][] sales = {
            {20, 25, 20}, // Sales for Cozy Nights Monarch (Month 1, 2, 3)
            {15, 10, 12}, // Sales for Restonic Barbados (Month 1, 2, 3)
            {18, 15, 20}  // Sales for Sealy Phuket (Month 1, 2, 3)
        };

        Product productObj = new Product(products, sales);
        PrintProduct printer = new PrintProduct(productObj);
        
        // This will print the exact required console output
        printer.printReport();
    }
}