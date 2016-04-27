package com.javaninja.batch;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author norris.shelton
 */
@XmlRootElement
public class Truck {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean extendedCab;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isExtendedCab() {
        return extendedCab;
    }

    public void setExtendedCab(boolean extendedCab) {
        this.extendedCab = extendedCab;
    }
}
