/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author 8292
 */
public class Demo {
    public static void main (String[] args){
        Gerente gerente = new Gerente(new CheeseBurguerBuilder());
        gerente.buildBurguer().print();
    }
}
