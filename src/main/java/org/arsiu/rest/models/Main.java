package org.arsiu.rest.models;

import static org.arsiu.rest.models.technique.Companies.BOSCH;
import static org.arsiu.rest.models.technique.Companies.PANASONIC;
import static org.arsiu.rest.models.technique.Companies.PHILIPS;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.arsiu.rest.models.manager.TechniqueManager;
import org.arsiu.rest.models.technique.CuttingPlotter;
import org.arsiu.rest.models.technique.InkjetPrinter;
import org.arsiu.rest.models.technique.LaserPrinter;
import org.arsiu.rest.models.technique.Shredder;
import org.arsiu.rest.models.technique.Technique;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Main {

    public static void main(final String[] args) {
        TechniqueManager manager = new TechniqueManager(new ArrayList<Technique>());
        manager.getTech().add(new InkjetPrinter("INKJ2000",
                "3202", PANASONIC, 2019, 299.9f, 220, 60, 100, 100, 10));
        manager.getTech().add(new LaserPrinter("LP-2040", "4550",
                PANASONIC, 2020, 200.0f, 220, 160, 150, 150, true));
        manager.getTech().add(new CuttingPlotter("CT25", "3542", BOSCH,
                2009, 50, 50, 100, "STL 090"));
        manager.getTech().add(new Shredder("RoyTom", "model-Y", PHILIPS,
                2007, 30, 220, 200, 12, 24));

        manager.sortByName(true).forEach(System.out::println);
        manager.sortByPrice(true).forEach(System.out::println);
            manager.searchBar("INKJ2000").ifPresent(System.out::println);
        manager.show(true, manager.getTech());
        List<Integer> a = new ArrayList<Integer>();

    }
}
