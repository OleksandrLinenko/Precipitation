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
                List<Float> precips = stat.getHourPrecip();
                for(Float precip : precips) {
                    Message.create().show(String.format("%.2f ", precip));
                }
            }
        }
    }
}
