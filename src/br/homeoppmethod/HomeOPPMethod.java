/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.homeoppmethod;

/**
 *
 * @author Marce
 */
public class HomeOPPMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MoldHome c1 = new MoldHome();
        
        c1.comodos = 6;
        c1.cor = "Vermelho";
        c1.janela = 7;
        c1.porta = 4;
        
        c1.abrirPorta();
        c1.status();
        
        
        
    }
    
}
