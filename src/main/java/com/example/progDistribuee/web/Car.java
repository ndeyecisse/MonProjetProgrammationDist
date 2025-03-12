package com.example.progDistribuee.web;

public class Car {
    
    private String plateNumber;
    private String brand;
    private int price;
    private boolean isRent; // Renommé pour suivre les conventions Java

    public Car(String plateNumber, String brand, int price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.isRent = false; // La voiture est libre par défaut
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRent() {  // Correction du getter pour Spring
        return isRent;
    }

    public void setRent(boolean isRent) {  // Correction du setter
        this.isRent = isRent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "{ plateNumber: " + plateNumber + ", brand: " + brand + ", price: " + price + ", isRent: " + isRent + " }";
    }
}
