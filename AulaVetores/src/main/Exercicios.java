
package main;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicios {
    public static void ex3(){
    int [] vetor1 = new int[10];
    int [] vetor2 = new int[10];
    int [] vetor3 = new int[10];
    int seq = 1;
    String mostra = " ";
    for(int f=0; f<=9; f++){
        String x = JOptionPane.showInputDialog(null, "Digite o " + seq + "º " + "valor do 1º Array: ");
        vetor1[f] = Integer.parseInt(x);
    }
    for(int f=0; f<=9; f++){
        String z = JOptionPane.showInputDialog(null, "Digite o " + seq + "º " + "valor do 2º Array: ");
        vetor2[f] = Integer.parseInt(z);
    }
    for(int f = 0; f<=9; f++){
        vetor3[f] = vetor1[f] * vetor2[f];
        mostra = mostra + vetor3[f] + " | ";
    }
    JOptionPane.showMessageDialog(null, mostra);
    }
    
    public static void ex4(){
    int [] vetor1 = new int[20];
    int pares = 0, seq = 1;
    String mostra = " ";
    for(int f=0; f<=19; f++){
        String x = JOptionPane.showInputDialog(null, "Digite o " + seq + "º " + "valor do Array: ");
        vetor1[f] = Integer.parseInt(x);
        seq++;
        if(vetor1[f] % 2 == 0){
            pares++;
        }
    }
    JOptionPane.showMessageDialog(null, pares);
    }
    
    public static void usandoRandom(){
    int [] valor = new int[20];
    int pares = 0;
    Random gera = new Random();
    String mostra = " ";
    for(int c = 0; c<=19; c++){
        valor[c] = gera.nextInt(100);
        mostra = mostra + valor[c] + " | ";
        if(valor[c] % 2 == 0){
            pares++;
        }
    }
    JOptionPane.showMessageDialog(null, mostra + "\n Quantidade de números pares: " + pares);
    }
    
    public static void sort(){
        int [] valor = new int[10];
        Random gera = new Random();
        String mostra = " ";
        for(int c = 0; c <=9; c++){
            valor[c] = gera.nextInt(100);
           
        }
        Arrays.sort(valor);
        for(int c = 0; c <=9; c++){
            if(valor[c] % 2 == 0){
                mostra = mostra + valor[c] + " | ";
                
            }
        }
        JOptionPane.showMessageDialog(null, mostra);
        
    }
}
