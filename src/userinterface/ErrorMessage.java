/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 *
 * @author oleksandrlinenko
 */
public class ErrorMessage implements MessageInterface {
    public static ErrorMessage create() {
        return new ErrorMessage();
    }
    
    @Override
    public void show(String string) {
        System.err.println(string);
    }
}
