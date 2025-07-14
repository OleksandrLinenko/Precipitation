/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import userinterface.ShowDayPrecip;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowDayPrecipCommand {
    public static ShowDayPrecipCommand create() {
        return new ShowDayPrecipCommand();
    }
    
    public void handle() {
        ShowDayPrecip.create().handle(Application.getInstance().getMeasurements());
    }
}
