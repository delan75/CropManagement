package com.mycompany.cropmanagement;

public class Farm {
    private String farmName;
    private int area;
    private boolean dam;
    private Crop cropOne;
    private Crop cropTwo;

    public Farm(String inFn, int inA, boolean inD, Crop inC1, Crop inC2) {
        farmName = inFn;
        area = inA;
        dam = inD;
        cropOne = inC1;
        cropTwo = inC2;
    }

    public String getFarmName() {
        return farmName;
    }

    public Crop getCropOne() {
        return cropOne;
    }

    public Crop getCropTwo() {
        return cropTwo;
    }

    public void setDam(boolean chD) {
        dam = chD;
    }

    public double farmCost() {
        return cropOne.totalCost() + cropTwo.totalCost();
    }

    @Override
    public String toString() {
        return "Farm name: " + farmName
                + "\nArea: " + area + " square metres"
                + "\nDam: " + dam
                + "\n\nCrop one:\n" + cropOne
                + "\n\nCrop two:\n" + cropTwo
                + "\n\nTotal farm cost: R" + String.format("%.2f", farmCost());
    }
}

