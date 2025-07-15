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
public class ShowMaxDayPrecipCommand {
    public static ShowMaxDayPrecipCommand create() {
        return new ShowMaxDayPrecipCommand();
    }
    
    public void handle() {
        Message.create().show(MaxDayPrecip.create().handle(Application.getInstance().getMeasurements()));
        Message.create().show("\n");
    }
}
