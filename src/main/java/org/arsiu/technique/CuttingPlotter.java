package org.arsiu.technique;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("checkstyle:Indentation")
@Setter
@Getter
@NoArgsConstructor
public class CuttingPlotter extends Technique {

    private String nameOfBlade;

    public CuttingPlotter(String name,
                          String model,
                          Companies manufactoryCompany,
                          int yearOfManufactory,
                          float price,
                          float inputVoltage,
                          float watts,
                          String nameOfBlade) {
        super(
                name,
                model,
                manufactoryCompany,
                yearOfManufactory,
                price,
                inputVoltage,
                watts
        );

        this.nameOfBlade = nameOfBlade;

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
