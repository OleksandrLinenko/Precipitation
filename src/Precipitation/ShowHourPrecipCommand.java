/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import userinterface.ShowHourPrecip;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowHourPrecipCommand {
    public static ShowHourPrecipCommand create() {
        return new ShowHourPrecipCommand();
    }
    
    public void handle() {
        ShowHourPrecip.create().handle(Application.getInstance().getMeasurements());
    }
}
