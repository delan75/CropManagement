/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cropmanagement;

public class CropManagement {

    public static void main(String[] args) {
        FarmArray farms = new FarmArray();

        System.out.println(farms);
        System.out.println("Most expensive farm: " + farms.findMostExpensive());
        System.out.println("Most expensive cost: R"
                + String.format("%.2f", farms.getMostExpensiveCost()));
    }
}

