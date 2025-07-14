/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Measurement {

    private String locationName;
    private LocalDate date;
    private List<Station> stations = new ArrayList();

    public Measurement(String locationName, LocalDate date, List<Station> stations) {
        this.locationName = locationName;
        this.date = date;
        this.stations = stations;
    }
    
    public void reset() {
        locationName = "";
        date = null;
        stations.clear();
    }

    public String getLocationName() {
        return locationName;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Date: %d. %d. %d\n", date.getDayOfYear(), date.getMonthValue(), date.getYear()));
        sb.append(String.format("Location: %s\n", locationName));
        
        return sb.toString();
    }
}
