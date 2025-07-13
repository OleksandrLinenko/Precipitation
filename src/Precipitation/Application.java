/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

/**
 *
 * @author oleksandrlinenko
 */
public class Application {

    private static Application app = new Application();
    private Measurement measurement;

    private Application() {

    }

    public static Application getInstance() {
        return app;
    }

    public Measurement getMeasurement() {
        return measurement;
    }
}
