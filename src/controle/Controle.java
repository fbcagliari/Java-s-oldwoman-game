/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import model.*;
import view.*;

/**
 *
 * @author barba
 */
public class Controle {
    private Tabuleiro tab;
    private Tabuleiro.jogador atual;
    
    public Controle(){
        tab = new Tabuleiro();
        atual = Tabuleiro.jogador.X;
    }
    public boolean Jogar(int p_x, int p_y){
       
        if(tab.getPosicao(p_x, p_y) != Tabuleiro.jogador.N){
            return false;
        }else{
            tab.Jogar(p_x, p_y, atual);
            if (atual == Tabuleiro.jogador.X){
                atual = Tabuleiro.jogador.O;
            }else if(atual == Tabuleiro.jogador.O){
                atual = Tabuleiro.jogador.X;
            }    
        }
        return true;
    }

}   
    
//https://github.com/mflash/jogovelha/blob/master/src/pucrs/alpro2/JogoVelha.java

