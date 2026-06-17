/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cropmanagement;

public class Crop {
    private String name;
    private double seedCost;
    private int packsBought;

    static final int GROWING_COST = 2850;

    public Crop() {
        name = "";
        seedCost = 0.0;
        packsBought = 0;
    }

    public Crop(String inN, double inSc, int inPb) {
        name = inN;
        seedCost = inSc;
        packsBought = inPb;
    }

    public double getSeedCost() {
        return seedCost;
    }

    public int getPacksBought() {
        return packsBought;
    }

    public double totalCost() {
        return seedCost * packsBought + GROWING_COST;
    }

    @Override
    public String toString() {
        return "Crop name: " + name
                + "\nSeed cost: R" + String.format("%.2f", seedCost)
                + "\nPacks bought: " + packsBought
                + "\nGrowing cost: R" + String.format("%.2f", (double) GROWING_COST)
                + "\nTotal crop cost: R" + String.format("%.2f", totalCost());
    }
}
