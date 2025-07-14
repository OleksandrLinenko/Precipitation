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
public class ShowDayPrecip {
    public static ShowDayPrecip create() {
        return new ShowDayPrecip();
    }
    
    public void handle(List<Measurement> measurements) {
        for(Measurement measur : measurements) {
            List<Station> stations = measur.getStations();
            for(Station station : stations) {
                Message.create().show(station.toString());
                Message.create().show(String.format("%.2f\n", station.getDayPrecip()));
            }
        }
    }
    
}
