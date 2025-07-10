/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

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

    public static void show() {
        boolean endProgram = false;
        do {
            menu();
            int option = getOption();
            doOption(option);
        } while (!endProgram);
    }

    public static void menu() {
        System.out.println("Precipitation");
        System.out.println("1. New data");
        System.out.println("2. Load another file");
        System.out.println("3. List of daily precipitation from rain gauge stations");
        System.out.println("4. List of hourly precipitation for the basin");
        System.out.println("5. Daily maximum");
        System.out.println("6. Hourly maximum");
        System.out.println("7. Correlation of precipitation and altitude");
        System.out.println("0. End of program");
    }

    public static int getOption() {
        System.out.print("Pick the option: ");
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
                System.out.println("Undefined option");
        }
        
        return false;
    }
    
    public static void newData() {
        
    }
    
    public static void loadAnotherFile() {
        
    }
    
    public static void listDaily() {
        
    }
    
    public static void listHourly() {
        
    }
    
    public static void dailyMaximum() {
        
    }
    
    public static void hourlyMaximum() {
        
    }
    
    public static void correlation() {
        
    }

}
