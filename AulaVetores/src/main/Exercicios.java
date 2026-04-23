
package main;

import javax.swing.JOptionPane;

public class Exercicios {
    public static void ex3(){
    int [] vetor1 = {1,2,3,4,5,6,7,8,9,10};
    int [] vetor2 = {2,3,4,5,6,7,8,9,10,11};
    int [] vetor3 = new int[10];
    String mostra = " ";
    for(int f = 0; f<=9; f++){
        vetor3[f] = vetor1[f] * vetor2[f];
        mostra = mostra + vetor3[f] + " | ";
    }
    JOptionPane.showMessageDialog(null, mostra);
    }
    
    public static void ex4(){
    int [] vetor1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int pares = 0;
    String mostra = " ";
    for(int f=0; f<=19; f++){
        if(vetor1[f] % 2 == 0){
            pares++;
        }
    }
    JOptionPane.showMessageDialog(null, pares);
    }
    
    
}
