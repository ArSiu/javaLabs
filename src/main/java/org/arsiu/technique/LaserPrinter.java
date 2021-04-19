package org.arsiu.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LaserPrinter extends Printer {
    private boolean isLaser;


    public LaserPrinter(String name, String model, Companies.COMPANIES manufactoryCompany, int yearOfManufactory,
                        float price, float inputVoltage, float watts, int amountOfInputPaper, int amountOfOutputPaper,
                        boolean isLaser) {
        super(name, model, manufactoryCompany, yearOfManufactory, price, inputVoltage, watts, amountOfInputPaper, amountOfOutputPaper);
        this.isLaser = isLaser;
    }

    @Override
    public String toString() {
        return objToString() +
                "|\n|Is laser: " + isLaser +
                "|\n________________________\n";
    }
}
