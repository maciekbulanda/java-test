package com.company;

import java.util.Date;

public class Car {
    private String registrationNumber;
    private String carModel;
    private Date technicalInspectionDate;

    public Car(String registrationNumber, String carModel) {
        this.registrationNumber = registrationNumber;
        this.carModel = carModel;
    }

    public void setTechnicalInspectionDate(Date technicalInspectionDate) {
        this.technicalInspectionDate = technicalInspectionDate;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public Date getTechnicalInspectionDate() {
        return technicalInspectionDate;
    }
}
