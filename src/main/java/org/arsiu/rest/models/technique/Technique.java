package org.arsiu.rest.models.technique;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor
@Entity

public class Technique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Missing name")
    @Size(min=2, max=32)
    private String name;

    @NotNull(message = "Missing model")
    @Size(min=2, max=32)
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

    public Technique(final String namePar, final String modelPar, final Companies manufactoryCompanyPar,
                     final int yearOfManufactoryPar, final float pricePar, final float inputVoltagePar,
                     final float wattsPar) {
        this.name = namePar;
        this.model = modelPar;
        this.manufactoryCompany = manufactoryCompanyPar;
        this.yearOfManufactory = yearOfManufactoryPar;
        this.price = pricePar;
        this.inputVoltage = inputVoltagePar;
        this.watts = wattsPar;
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
