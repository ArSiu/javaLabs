package com;
import shoes.Shoes;

public class Main {
    public static void main(String[] args) {
        Shoes shoe1 = new Shoes();
        Shoes shoe2 = new Shoes("Abibibas", 100, 7, "Brawn");
        Shoes shoe3 = new Shoes("Nike", 150, 8, "White", "AIR", "China",
                "summer 90s", "cotton", true, 10, 1000);

        System.out.println(shoe3.toString());

        shoe1.resetValues("Nike", 500, 7, "Red", "AIR", "USA",
                "summer 80s", "Polyester", true, 8, 10000);

        System.out.println(shoe1.toString());

        shoe2.printPopularity();
        Shoes.printStaticPopularity();
    }
}
