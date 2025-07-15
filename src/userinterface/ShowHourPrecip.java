/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import Precipitation.Measurement;
import Precipitation.Station;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowHourPrecip {

    public static ShowHourPrecip create() {
        return new ShowHourPrecip();
    }

    public void handle(List<Measurement> measurements) {
        for (Measurement msr : measurements) {
            Message.create().show(msr.toString());
            List<Station> stations = msr.getStations();
            for (Station stat : stations) {
                Float[] precips = stat.getHourPrecipArr();
                for(int i = 0; i < precips.length; i++) {
                    Message.create().show(String.format("%d %.1f\n", i + 1, precips[i]));
                }
            }
        }
    }
}
