/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Precipitation;

import userinterface.Ask;

/**
 *
 * @author oleksandrlinenko
 */
public class LoadFileCommand {
    public static LoadFileCommand create() {
        return new LoadFileCommand();
    }
    
    public void handle() {
        Data.create().readFile(Ask.create().getString("Set path to file: "));
    }
}
