/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author 8292
 */
public class CheeseBurguerBuilder extends BurguerBuilder {

    @Override
    void buildBun() {
        burguer.setBun("Com gergelin");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Picanha");
    }

    @Override
    void buildSalad() {
        burguer.setCheese("Alface");
    }

    @Override
    void buildCheese() {
        burguer.setSalad("Mussarela");
    }

    @Override
    void buildSauce() {
        burguer.setSauce("Secret");
    }
    
}
