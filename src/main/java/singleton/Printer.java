/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author 8292
 */
public class Printer {
    private String text;
    private static Printer printer;
    private Printer(String nome){
        this.text = nome;
    }
    
    public static Printer getInstance (String value){
        if(printer == null){
            printer = new Printer(value);
        }
        return printer;
    }

    public String getText() {
        return text;
    }
    
    
}
