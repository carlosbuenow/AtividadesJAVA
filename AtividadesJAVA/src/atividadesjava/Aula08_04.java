package atividadesjava;

//import java.util.Scanner;

//Importando a biblioteca

import javax.swing.JOptionPane;


public class Aula08_04 {
    public static void Aula08(){
        //Mostrando mensagem com interação gráfica
        JOptionPane.showMessageDialog(null, "Digite o seu nome","Topo",1);
//        Armazena em uma string o texto que o usuário digitou
        String y = JOptionPane.showInputDialog(null);
        //Mostra uma mensagem em interação gráfica com a varíavel string armazenada
        JOptionPane.showMessageDialog(null, "O nome armazenado é: " + y);
        //Realizando mensagem de interação gráfica 20 vezes
        for(int c = 1; c <= 20; c++){
        JOptionPane.showMessageDialog(null,y + ", você está com vírus");
        }
        
        int n1, n2, n3;
        double media;
        String x;
            //A string x recebe um valor pelo usuário
            x = JOptionPane.showInputDialog(null, "Digite a nota 1: ");
            //Converte a string x em inteiro dentro da varíavel n1
            n1 = Integer.parseInt(x);
            x = JOptionPane.showInputDialog(null, "Digite a nota 1: ");
            n2 = Integer.parseInt(x);
            x = JOptionPane.showInputDialog(null, "Digite a nota 1: ");
            n3 = Integer.parseInt(x);
        
            media = (n1 + n2 + n3) / 3;
            
            JOptionPane.showMessageDialog(null,"A nota do aluno é: " + media);
}
}
