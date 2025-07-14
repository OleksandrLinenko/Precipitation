/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import userinterface.ShowStatistic;

/**
 *
 * @author oleksandrlinenko
 */
public class ListDailyPrecipCommand {
    public static ListDailyPrecipCommand create() {
        return new ListDailyPrecipCommand();
    }
    
    public void handle() {
        ShowStatistic.create().handle();
    }
}
