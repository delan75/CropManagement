package com.mycompany.cropmanagement;

public class FarmArray {
    private Farm[] fArr;
    private int size;

    public FarmArray() {
        fArr = new Farm[3];
        size = 0;

        addFarm(new Farm(
                "Happy Farm",
                2000,
                true,
                new Crop("Onions", 29.00, 1000),
                new Crop("Lettuce", 19.50, 5000)));

        addFarm(new Farm(
                "Moonshine Farm",
                5000,
                false,
                new Crop("Tomatoes", 21.99, 2000),
                new Crop("Cabbage", 12.00, 30000)));

        addFarm(new Farm(
                "Green Glades",
                10000,
                true,
                new Crop("Beans", 29.00, 10000),
                new Crop("Chilli", 9.50, 2000)));
    }

    public void addFarm(Farm farm) {
        if (size < fArr.length) {
            fArr[size] = farm;
            size++;
        }
    }

    public String findMostExpensive() {
        String farmName = "";
        double farmCost;
        double biggestCost = 0.0;

        for (int i = 0; i < size; i++) {
            farmCost = fArr[i].farmCost();

            if (farmCost > biggestCost) {
                farmName = fArr[i].getFarmName();
                biggestCost = farmCost;
            }
        }

        return farmName;
    }

    public double getMostExpensiveCost() {
        double biggestCost = 0.0;

        for (int i = 0; i < size; i++) {
            if (fArr[i].farmCost() > biggestCost) {
                biggestCost = fArr[i].farmCost();
            }
        }

        return biggestCost;
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += fArr[i] + "\n\n------------------------------\n\n";
        }

        return output;
    }
}



