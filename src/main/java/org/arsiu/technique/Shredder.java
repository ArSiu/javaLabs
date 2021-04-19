package org.arsiu.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Shredder extends Technique {
    public int amountOfBlades;
    public int sharpeningOfBlades;

    public Shredder(String name, String model, Companies.COMPANIES manufactoryCompany, int yearOfManufactory,
                    float price, float inputVoltage, float watts, int amountOfBlades, int sharpeningOfBlades) {
        super(name, model, manufactoryCompany, yearOfManufactory, price, inputVoltage, watts);
        this.amountOfBlades = amountOfBlades;
        this.sharpeningOfBlades = sharpeningOfBlades;
    }

    @Override
    public String toString() {
        return objToString() +
                "|\n|Amount Of Blades: " + amountOfBlades +
                "|\n|Sharpening Of Blades: " + sharpeningOfBlades +
                "|\n________________________\n";
    }
}
