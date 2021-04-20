package org.arsiu.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Shredder extends Technique {
    private int amountOfBlades;
    private int sharpeningOfBlades;

    public Shredder(final String name,
                    final String model,
                    final Companies manufactoryCompany,
                    final int yearOfManufactory,
                    final float price,
                    final float inputVoltage,
                    final float watts,
                    final int amountOfBlades,
                    final int sharpeningOfBlades) {
        super(
                name,
                model,
                manufactoryCompany,
                yearOfManufactory,
                price,
                inputVoltage,
                watts
        );

        this.amountOfBlades = amountOfBlades;
        this.sharpeningOfBlades = sharpeningOfBlades;

    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Amount Of Blades: " + amountOfBlades
                + "|\n|Sharpening Of Blades: " + sharpeningOfBlades
                + "|\n________________________\n";
    }
}
