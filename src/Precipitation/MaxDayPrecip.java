/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class MaxDayPrecip {
    public static MaxDayPrecip create() {
        return new MaxDayPrecip();
    }
    
    public String handle(List<Measurement> measurements) {
        float max = -Float.MAX_VALUE;
        String location = "";
        LocalDate date = null;
        String stationName = "";
        float height = 0;
        for(Measurement meas : measurements) {
            List<Station> stations = meas.getStations();
            for(Station stat : stations) {
                if(stat.getDayPrecip() >= max) {
                    stationName = stat.getName();
                    height = stat.getHeight();
                    max = stat.getDayPrecip();
                    location = meas.getLocationName();
                    date = meas.getDate();
                }
            }
        }

        return String.format("%s %d %s %.2f %.2f", stationName, date.getDayOfMonth(), location, height, max);
    }
}
