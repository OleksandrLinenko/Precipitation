/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import Precipitation.Application;
import Precipitation.Measurement;
import Precipitation.Station;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowStatistic {

    public static ShowStatistic create() {
        return new ShowStatistic();
    }

    public void handle() {
        List<Measurement> measurements = Application.getInstance().getMeasurements();
        for (Measurement msr : measurements) {
            Message.create().show(msr.toString());
            List<Station> stations = msr.getStations();
            for (Station stat : stations) {
                Message.create().show(stat.toString());
            }
        }
    }
}
