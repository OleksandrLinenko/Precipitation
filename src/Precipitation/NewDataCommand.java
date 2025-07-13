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
public class NewDataCommand {
    public static NewDataCommand create() {
        return new NewDataCommand();
    }
    
    public void handle() {
        Application.getInstance().reset();
        Message.create().show("Data had been reset");
    }
}
