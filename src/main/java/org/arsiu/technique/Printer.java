package org.arsiu.technique;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arsiu.file.File;


@SuppressWarnings("checkstyle:LineLength")
@Setter
@Getter
@NoArgsConstructor
public class Printer extends Technique {
    private int amountOfInputPaper;
    private int amountOfOutputPaper;
    private List<File> files;
    private boolean isRunning;

    public Printer(String name,
                   String model,
                   Companies manufactoryCompany,
                   int yearOfManufactory,
                   float price,
                   float inputVoltage,
                   float watts,
                   int amountOfInputPaper,
                   int amountOfOutputPaper) {
        super(
                name,
                model,
                manufactoryCompany,
                yearOfManufactory,
                price,
                inputVoltage,
                watts
        );

        this.amountOfInputPaper = amountOfInputPaper;
        this.amountOfOutputPaper = amountOfOutputPaper;

    }

    @Override
    public String toString() {
        return objToString()
                + "|\n|Amount Of Input Paper: " + amountOfInputPaper
                + "|\n|Amount Of Output Paper: " + amountOfOutputPaper
                + "|\n________________________\n";
    }

    public void turnOn() {
        System.out.println("Ski Ba Bop Ba Dop Bop I`m On");
    }

    public void turnOff() {
        System.out.println("Ya narodyvsya v gondurasii misto Sambir bilya lvova I`m Off");
    }

    public void printPages(List<File> files) {
        for (File page : files) {
            System.out.println(page);
        }
    }

    public void copyPage() {
        System.out.println("Ya svoboden slovno ptiza v nebesah");
    }

    public void addFile(File file) {
        files.add(file);
    }

}
