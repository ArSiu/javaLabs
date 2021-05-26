package org.arsiu.rest.models.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public final class LaserPrinter extends Printer {
    private boolean isLaser;

    public LaserPrinter(final String name, final String model,
                        final Companies manufactoryCompany,
                        final int yearOfManufactory, final float price,
                        final float inputVoltage, final float watts,
                        final int amountOfInputPaper,
                        final int amountOfOutputPaper, final boolean isLaseer) {
        super(name, model, manufactoryCompany, yearOfManufactory, price,
                inputVoltage, watts, amountOfInputPaper, amountOfOutputPaper);
        isLaser = isLaseer;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Is laser: " + isLaser
                + "|\n________________________\n";
    }
}
