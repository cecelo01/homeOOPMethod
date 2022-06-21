package br.homeoppmethod;

/**
 *
 * @author Marce
 */
public class MoldHome {
    
    int janela;
    int porta;
    int comodos;
    String cor;
    boolean entrada;
    
    
    void status(){
        System.out.println("Casa de cor "+this.cor+ " com "+this.comodos+" comodos, "+
                           +this.janela+" janelas e "+this.porta+" portas.");
    }
    
    void abrirPorta(){
        entrada = true;
        System.out.println("Porta aberta.");
    }
    
    void fecharPorta(){
        entrada = false;
        System.out.println("Porta fechada.");
    }
    
    
    
    
}
