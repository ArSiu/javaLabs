package org.arsiu;
import org.arsiu.technique.Technique;
import org.arsiu.technique.InkjetPrinter;
import org.arsiu.technique.LaserPrinter;
import org.arsiu.technique.CuttingPlotter;
import org.arsiu.technique.Shredder;
import org.arsiu.technique.Companies.COMPANIES;
import org.arsiu.technique_manager.TechniqueManager;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        TechniqueManager manager = new TechniqueManager(new ArrayList<Technique>());
        manager.tech.add(new InkjetPrinter("INKJ2000", "3202", COMPANIES.PANASONIC, 2019,
                299.9f, 220, 60, 100, 100, 10));
        manager.tech.add(new LaserPrinter("LP-2040", "4550", COMPANIES.PANASONIC, 2020,
                200.0f, 220, 160, 150, 150,true));
        manager.tech.add(new CuttingPlotter("CT25", "3542", COMPANIES.BOSCH, 2009, 50,
                50, 100, "STL 090"));
        manager.tech.add(new Shredder("RoyTom", "model-Y", COMPANIES.PHILIPS, 2007, 30,
                220, 200, 12, 24));

        //manager.sortByName(true).forEach(System.out::println);
        //manager.sortByPrice(true).forEach(System.out::println);
        //manager.searchBar("INKJ2000").ifPresent(System.out::println);
        manager.show(true,manager.tech);
    }
}
