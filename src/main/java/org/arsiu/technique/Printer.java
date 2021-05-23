package org.arsiu.technique;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arsiu.file.File;

@Setter
@Getter
@NoArgsConstructor
public class Printer extends Technique {
    private int amountOfInputPapers;
    private int amountOfOutputPapers;
    private List<File> files;
    private boolean isRunning;

    public Printer(final String name, final String model,
                   final Companies manufactoryCompany,
                   final int yearOfManufactory, final float price,
                   final float inputVoltage, final float watts,
                   final int amountOfInputPaper,
                   final int amountOfOutputPaper) {
        super(name, model, manufactoryCompany, yearOfManufactory, price,
                inputVoltage, watts);
        amountOfInputPapers = amountOfInputPaper;
        amountOfOutputPapers = amountOfOutputPaper;
    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Amount Of Input Paper: " + amountOfInputPapers
                + "|\n|Amount Of Output Paper: " + amountOfOutputPapers
                + "|\n________________________\n";
    }

    public final void turnOn() {
        System.out.println("Ski Ba Bop Ba Dop Bop I`m On");
    }

    public final void turnOff() {
        System.out.println("Ya narodyvsya v gondurasii misto "
                + "Sambir bilya lvova I`m Off");
    }

    public void printPages(final List<File> listfiles) {
        for (File page : listfiles) {
            System.out.println(page);
        }
    }

    public final void copyPage() {
        System.out.println("Ya svoboden slovno ptiza v nebesah");
    }

    public final void addFile(final File file) {
        files.add(file);
    }

}
