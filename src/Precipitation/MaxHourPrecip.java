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
public class MaxHourPrecip {
    public static MaxHourPrecip create() {
        return new MaxHourPrecip();
    }
    
    public String handle(List<Measurement> measurements) {
       float max = -Float.MAX_VALUE;
        String location = "";
        LocalDate date = null;
        String stationName = "";
        float height = 0;
        int hour = 0;
        for(Measurement meas : measurements) {
            List<Station> stations = meas.getStations();
            for(Station stat : stations) {
                Float[] hours = stat.getHourPrecipArr();
                for(int i = 0; i < hours.length; i++) {
                    if(hours[i] >= max) {
                        max = hours[i];
                        hour = i + 1;
                        stationName = stat.getName();
                        height = stat.getHeight();
                        location = meas.getLocationName();
                        date = meas.getDate();
                    }
                }
            }
            
        }

       return String.format("%s %d %d %.1f %s %.2f\n", stationName, date.getDayOfMonth(), hour, max, location, height);
    }   
}
