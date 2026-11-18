/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.github.starboyisunkown.main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class ProductTests {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] mockProducts = {"Cozy Nights Monarch", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] mockSales = {
            {20, 25, 20}, 
            {15, 10, 12}, 
            {18, 15, 20}  
        };
        
        Product product = new Product(mockProducts, mockSales);
        int totalSales = product.GetTotalProductSold();

        assertEquals(153, totalSales);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] mockProducts = {"Cozy Nights Monarch", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] mockSales = {
            {20, 25, 20}, 
            {15, 10, 12}, 
            {18, 15, 20}  
        };
        
        Product product = new Product(mockProducts, mockSales);
        double averageSales = product.GetAverageProductSold();

        assertEquals(17.0, averageSales, 0.001);
    }
}