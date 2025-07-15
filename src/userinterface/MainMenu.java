/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import Precipitation.ShowHourPrecipCommand;
import Precipitation.LoadFileCommand;
import Precipitation.NewDataCommand;
import Precipitation.ShowDayPrecipCommand;
import Precipitation.ShowMaxDayPrecipCommand;
import Precipitation.ShowMaxHourPrecipCommand;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static MainMenu create() {
        return new MainMenu();
    }
    
    public void show() {
        boolean endProgram = false;
        do {
            menu();
            int option = getOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }
    
    public static void menu() {
        Message.create().show("\nPrecipitation\n");
        Message.create().show("1. New data\n");
        Message.create().show("2. Load another file\n");
        Message.create().show("3. List of daily precipitation from rain gauge stations\n");
        Message.create().show("4. List of hourly precipitation for the basin\n");
        Message.create().show("5. Daily maximum\n");
        Message.create().show("6. Hourly maximum\n");
        Message.create().show("7. Correlation of precipitation and altitude\n");
        Message.create().show("0. End of program\n");
    }
    
    public static int getOption() {
        Message.create().show("Pick the option: ");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return - 1;
        }
        
        return option;
    }
    
    public static boolean doOption(int option) {
        switch (option) {
            case 0:
                return true;
            case 1:
                newData();
                break;
            case 2:
                loadAnotherFile();
                break;
            case 3:
                listDaily();
                break;
            case 4:
                listHourly();
                break;
            case 5:
                dailyMaximum();
                break;
            case 6:
                hourlyMaximum();
                break;
            case 7:
                correlation();
                break;
            default:
                Message.create().show("Undefined option");
        }
        
        return false;
    }
    
    public static void newData() {
        NewDataCommand.create().handle();
    }
    
    public static void loadAnotherFile() {
        LoadFileCommand.create().handle();
    }
    
    public static void listDaily() {
        ShowDayPrecipCommand.create().handle();
    }
    
    public static void listHourly() {
        ShowHourPrecipCommand.create().handle();
    }
    
    public static void dailyMaximum() {
        try {
            ShowMaxDayPrecipCommand.create().handle();
        } catch (Exception ex) {
            ErrorMessage.create().show(ex.getMessage());
        }
    }
    
    public static void hourlyMaximum() {
        try {
            ShowMaxHourPrecipCommand.create().handle();
        } catch (Exception ex) {
            ErrorMessage.create().show(ex.getMessage());
        }
    }
    
    public static void correlation() {
        
    }
    
}
