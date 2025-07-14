/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Station {

    private String name;
    private float height;
    Float[] hourPrecip = new Float[24];

    public Station(String name, float hight) {
        this.name = name;
        this.height = hight;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public List<Float> getHourPrecip() {
        return Arrays.asList(hourPrecip);
    }

    public void addPrecip(int i, float value) {
        hourPrecip[i] = value;
    }

    public float getDayPrecip() {
        float result = 0;
        for (Float value : hourPrecip) {
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
