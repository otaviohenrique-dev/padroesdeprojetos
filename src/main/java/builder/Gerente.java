/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author 8292
 */
public class Gerente {
    BurguerBuilder builder;
    public Gerente(BurguerBuilder builder){
        this.builder = builder;
    }
    
    public Burguer buildBurguer(){
        builder.buildBun();
        builder.buildCheese();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildSauce();
        return builder.burguer;
    
    }
    
}
