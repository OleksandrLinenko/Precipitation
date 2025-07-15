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
        if (name.isEmpty() || height <= 0) {
            throw new IllegalArgumentException("Empty stations parameters");
        }
        this.name = name;
        this.height = hight;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public Float[] getHourPrecipArr() {
        return hourPrecip;
    }

    public List<Float> getHourPrecip() {
        return Arrays.asList(hourPrecip);
    }

    public void addPrecip(int hour, float value) {
        if (hour < 0 || hour > 24) {
            throw new IllegalArgumentException("Invalid hour");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Negative percip");
        }
        hourPrecip[hour] = value;
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
