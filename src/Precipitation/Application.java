/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private List<Measurement> measurements = new ArrayList();

    private Application() {

    }

    public void reset() {
        measurements.clear();
    }

    public static Application getInstance() {
        return app;
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }
}
