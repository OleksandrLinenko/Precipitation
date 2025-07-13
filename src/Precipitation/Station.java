/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Station {

    private String name;
    private float hight;
    List<Float> hourPrecip = new ArrayList();

    public Station(String name, float hight, List<Float> hourPrecip) {
        this.name = name;
        this.hight = hight;
        this.hourPrecip = hourPrecip;
    }

    public String getName() {
        return name;
    }

    public float getHight() {
        return hight;
    }

    public List<Float> getHourPrecip() {
        return hourPrecip;
    }

    public void addPrectip(Float precip) {
        hourPrecip.add(precip);
    }
}
