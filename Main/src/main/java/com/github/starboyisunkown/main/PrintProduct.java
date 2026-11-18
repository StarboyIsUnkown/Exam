/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.starboyisunkown.main;

/**
 *
 * @author makho
 */
public class PrintProduct {
    private IProducts productObj;

    public PrintProduct(IProducts productObj) {
        this.productObj = productObj;
    }

    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + productObj.GetTotalProductSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int)Math.round(productObj.GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + productObj.GetMostPopularProduct());
    }
}