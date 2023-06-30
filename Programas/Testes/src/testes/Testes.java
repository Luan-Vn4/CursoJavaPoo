/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo xadrez = new Jogo();
        Jogador j1 = new Jogador("João", 18);
        
        xadrez.setJogador1(j1);
        System.out.println(xadrez.getJogador1());
        }
    }

       
