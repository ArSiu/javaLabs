package org.arsiu.technique;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arsiu.technique.Companies.COMPANIES;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Technique {

    public String name;
    public String model;
    public COMPANIES manufactoryCompany;
    public int yearOfManufactory;
    public float price;
    public float inputVoltage;
    public float watts;

    @Override
    public String toString() {
        return objToString() +"|\n________________________\n";
    }

    public String objToString(){
        return "________________________" +
                "\n|Name: " + name +
                "|\n|Model: " + model +
                "|\n|Manufactory Company: " + manufactoryCompany +
                "|\n|Year Of Manufactory: " + yearOfManufactory +
                "|\n|Price: " + getPrice() +
                "|\n|Input Voltage: " + inputVoltage +
                "|\n|Watts: " + watts;
    }




}
