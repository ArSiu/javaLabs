package org.arsiu.technique;

import lombok.*;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor

public class Technique {
    private Integer id;

    @NotNull(message = "Missing name")
    @Size(min=2, max=30)
    private String name;

    @NotNull(message = "Missing model")
    @Size(min=2, max=30)
    private String model;

    @NotNull(message = "Missing Companies (enum)")
    @Enumerated(EnumType.STRING)
    private Companies manufactoryCompany;

    @NotNull(message = "Missing year")
    @Min(1900)
    @Max(9999)
    private int yearOfManufactory;

    @NotNull(message = "Missing price")
    @Min(1)
    @Max(999999)
    private float price;

    @NotNull(message = "Missing input voltage")
    @Min(1)
    @Max(999999)
    private float inputVoltage;

    @NotNull(message = "Missing watts")
    @Min(1)
    @Max(999999)
    private float watts;

    public Technique(String name, String model, Companies manufactoryCompany, int yearOfManufactory, float price, float inputVoltage, float watts) {
        this.name = name;
        this.model = model;
        this.manufactoryCompany = manufactoryCompany;
        this.yearOfManufactory = yearOfManufactory;
        this.price = price;
        this.inputVoltage = inputVoltage;
        this.watts = watts;
    }

    public String objToString() {
        return "________________________"
                + "\n|Name: " + name
                + "|\n|Model: " + model
                + "|\n|Manufactory Company: " + manufactoryCompany
                + "|\n|Year Of Manufactory: " + yearOfManufactory
                + "|\n|Price: " + price
                + "|\n|Input Voltage: " + inputVoltage
                + "|\n|Watts: " + watts;
    }

    @Override
    public String toString() {
        return objToString() + "|\n________________________\n";
    }
}
