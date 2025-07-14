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
    private float height;
    List<Float> hourPrecip = new ArrayList();

    public Station(String name, float hight, List<Float> hourPrecip) {
        this.name = name;
        this.height = hight;
        this.hourPrecip = hourPrecip;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public List<Float> getHourPrecip() {
        return hourPrecip;
    }

    public void addPrectip(Float precip) {
        hourPrecip.add(precip);
    }
    
    public float getDayPrecip() {
        float result = 0;
        for(Float value : hourPrecip) {
            result += value;
        }
        
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %.2f ", name, height));

        return sb.toString();
    }
}
