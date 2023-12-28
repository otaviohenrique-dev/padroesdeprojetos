/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author 8292
 */
public class Burguer {
    private String bun = "No bun";
    private String meat = "No meat";
    private String salad = "No salad";
    private String cheese = "No cheese";
    private String sauce = "No sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print(){
        System.out.println(
        "Burguer is finished: "+
                "burn: "+bun+
                "- meat: "+meat+
                "- salad: "+salad+
                "- cheese: "+cheese+
                "- sauce: "+sauce
        );
    }
    
    
    
    
}
