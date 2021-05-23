package org.arsiu.technique;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arsiu.file.File;

@Setter
@Getter
@NoArgsConstructor
public final class InkjetPrinter extends Printer {
    private int amountOfCartridges;

    public InkjetPrinter(final String name, final String model,
                         final Companies manufactoryCompany,
                         final int yearOfManufactory, final float price,
                         final float inputVoltage, final float watts,
                         final int amountOfInputPaper,
                         final int amountOfOutputPaper,
                         final int amountOfCartridgees) {
        super(name, model, manufactoryCompany, yearOfManufactory, price,
                inputVoltage, watts, amountOfInputPaper, amountOfOutputPaper);
        amountOfCartridges = amountOfCartridgees;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Amount Of Cartridges: " + amountOfCartridges
                + "|\n________________________\n";
    }

    public final void printPages(final List<File> listfiles) {
        if (amountOfCartridges != 0) {
            for (File page : listfiles) {
                System.out.println(page);
            }
        }
    }
}
