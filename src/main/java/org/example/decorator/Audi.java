package org.example.decorator;

public class Audi implements ICar{
    private int cost;

    public Audi(int cost) {
        this.cost = cost;
    }
    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public void showPrice() {
        System.out.println("audi cost is : " + this.cost);
    }
}
