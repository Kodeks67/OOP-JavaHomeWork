package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String name, String brand, double price, int calories) {
        super(name, brand, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + " - Калории: " + calories;
    }
}

