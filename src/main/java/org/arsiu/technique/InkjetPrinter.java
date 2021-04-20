package org.arsiu.technique;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arsiu.file.File;

@Setter
@Getter
@NoArgsConstructor
public class InkjetPrinter extends Printer {
    private int amountOfCartridges;

    public InkjetPrinter(String name, String model,
                         Companies manufactoryCompany,
                         int yearOfManufactory,
                         float price,
                         float inputVoltage,
                         float watts,
                         int amountOfInputPaper,
                         int amountOfOutputPaper,
                         int amountOfCartridges) {
        super(
                name,
                model,
                manufactoryCompany,
                yearOfManufactory,
                price,
                inputVoltage,
                watts,
                amountOfInputPaper,
                amountOfOutputPaper
        );

        this.amountOfCartridges = amountOfCartridges;

    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Amount Of Cartridges: " + amountOfCartridges
                + "|\n________________________\n";
    }

    public void printPages(List<File> files) {
        if (amountOfCartridges != 0) {
            for (File page : files) {
                System.out.println(page);
            }
        }
    }
}
