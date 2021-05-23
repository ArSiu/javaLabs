package org.arsiu.technique;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Technique {

    private String name;
    private String model;
    private Companies manufactoryCompany;
    private int yearOfManufactory;
    private float price;
    private float inputVoltage;
    private float watts;

    @Override
    public String toString() {
        return objToString() + "|\n________________________\n";
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
}
