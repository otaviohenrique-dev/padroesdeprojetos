/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyglobar.padroesdeprojetos;

import singleton.Printer;

/**
 *
 * @author 8292
 */
public class PadroesDeProjetos {

    public static void main(String[] args) {
        //Teste utilizando Singleton
        /*Printer p = Printer.getInstance();
        System.out.print(p);
        Printer q = Printer.getInstance();
        System.out.print(q);*/
        
        // Implementação com Threads
        
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadFoo2());
        t1.start();
        t2.start();
        
        
    }
    
    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            /*Printer printer = Printer.getInstance("0");
            System.out.print(printer.getText());*/
            
            while (0 == 0 ){
                System.out.print("Uma sessão");
            }
        }
    
    }
    
    static class ThreadFoo2 implements Runnable{

        @Override
        public void run() {
            /*Printer printer = Printer.getInstance("1");
            System.out.print(printer.getText());*/
            for(int i = 0; i<=20; i++){
                System.out.print("Outra sessão!");
            }   
        }
    }
}
