/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import userinterface.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class ShowMaxHourPrecipCommand {
    public static ShowMaxHourPrecipCommand create() {
        return new ShowMaxHourPrecipCommand();
    }
    
    public void handle() {
        Message.create().show(MaxHourPrecip.create().handle(Application.getInstance().getMeasurements()));
    }
}
