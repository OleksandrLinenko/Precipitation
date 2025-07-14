/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Data {

    public static Data create() {
        return new Data();
    }

    public void readFile(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            LocalDate date = null;
            String name = "";
            List<Station> stations = new ArrayList();
            String line;
            if ((line = br.readLine()) != null) {
                String[] split = line.split(":");
                String[] dateString = split[1].split(".");
                int day = Integer.parseInt(dateString[0].trim());
                int month = Integer.parseInt(dateString[1].trim());
                int year = Integer.parseInt(dateString[2].trim());
                date = LocalDate.of(year, month, day);
            }

            if ((line = br.readLine()) != null) {
                String[] split = line.split(":");
                name = split[1].trim();
            }
            
            br.readLine();

            while ((line = br.readLine()) != null) {
                List<Float> hoursPrecip = new ArrayList();
                String[] split = line.split(" ");
                String stationName = split[0].trim();
                float height = Float.parseFloat(split[1].trim());
                for (int i = 2; i < split.length; i++) {
                    hoursPrecip.add(Float.parseFloat(split[i].trim()));
                }
                stations.add(new Station(stationName, height, hoursPrecip));
            }

            Application.getInstance().getMeasurements().add(new Measurement(name, date, stations));
        } catch (IOException ex) {
            System.err.print("Errow while reading file");
        }
    }
}
