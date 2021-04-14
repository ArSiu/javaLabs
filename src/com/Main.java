package com;
import shoes.Shoes;

public class Main {
    public static void main(String[] args) {
        Shoes shoe = new Shoes();
        Shoes abibas = new Shoes("Abibibas", 100, 7, "Brawn");
        Shoes nike = new Shoes("Nike", 150, 8, "White", "AIR", "China",
                "summer 90s", "cotton", true, 10, 1000);

        System.out.println(nike.toString());

        shoe.resetValues("Nike", 500, 7, "Red", "AIR", "USA",
                "summer 80s", "Polyester", true, 8, 10000);

        System.out.println(shoe.toString());

        abibas.printPopularity();
        Shoes.printStaticPopularity();
    }
}
