package org.arsiu.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public final class CuttingPlotter extends Technique {

    private String nameOfBlade;

    public CuttingPlotter(final String name, final String model,
                          final Companies manufactoryCompany,
                          final int yearOfManufactory, final float price,
                          final float inputVoltage, final float watts,
                          final String nameOfBlad) {
        super(name, model, manufactoryCompany, yearOfManufactory, price,
                inputVoltage, watts);
        nameOfBlade = nameOfBlad;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Name of blade: "
                + nameOfBlade
                + "|\n________________________\n";
    }

    public void cut() {
        System.out.println("Cut Cut Cut");
    }
}
