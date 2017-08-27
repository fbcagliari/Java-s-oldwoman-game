/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author barba
 */
public class Tabuleiro {
    private jogador[][] tabuleiro;
    
    public static enum jogador{
        X,O,N
    }
    
    public Tabuleiro(){
        tabuleiro = new jogador[3][3];
    }
    public void Jogar(int p_x, int p_y,jogador p_j){
        if ((p_x >= 0 && p_x <= 2) && (p_y >= 0 && p_y <= 2)){
        tabuleiro[p_x][p_y] = p_j;
        }
    }
    public void limparTabuleiro(){
        for (int x = 0; x <= 2; x++ ){
            for (int y = 0; y <= 2; y++){
                tabuleiro [x][y] = jogador.N;
            }
        }
    }
    public jogador getPosicao(int p_x, int p_y){
        return tabuleiro[p_x][p_y];
    }
}