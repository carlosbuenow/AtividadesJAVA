package main;

import javax.swing.JOptionPane;

public class Exercicios {
    public static void ex3(){
        String x = " ";
        for(int valor = 1; valor <=100; valor++){
            valor++;
            if(valor % 3 == 0){
                x = x + valor + "\n"; 
            }         
        }
        JOptionPane.showMessageDialog(null,"Múltiplos de 3\n" + x);
    }
    
    public static void ex4(){
        int t=0;
        String x = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
        int num1 = Integer.parseInt(x);
        String z = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
        int num2 = Integer.parseInt(z);
        String c = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
        int num3 = Integer.parseInt(c);
        for(int contador = 1; contador <=3; contador++){
        if(num1 > num2){
        t = num1;
        num1 = num2;
        num2 = t;
        }else if(num2 > num3){
        t = num2;
        num2 = num3;
        num3 = t;
        }
        }
        JOptionPane.showMessageDialog(null, num1 + " " + num2 + " " + num3);
}
    
    public static void ex5(){
        String y = "";
    for(int cont = 1; cont <= 200; cont++){
        cont++;
        if(cont % 7 == 0){
            y = y + cont + "\n";
        }
    }
        JOptionPane.showMessageDialog(null,"Múltiplos de 7\n" + y);
    
    }
    
    public static void ex6(){
        String b = "";
        for(int con = 1; con < 100; con++){
            if(con % 4 == 0){
                b = b + con + "\n";
            }
            
        }
        JOptionPane.showMessageDialog(null, "Múltiplos de 4:\n" + b);
    }
    
    public static void ex7(){
        int v1;
        String a = JOptionPane.showInputDialog(null, "Informe o número que irá ser dividido: ");
        v1 = Integer.parseInt(a);
        String v = "";
        
        for(int v2 = 1; v2 <= v1; v2++){
            if(v1 % v2 == 0){
                v = v + v2 + "\n";
            }
            v2++;
        }
        JOptionPane.showMessageDialog(null, "Divisores\n" + v);
    }
    
    public static void ex8(){
        int a1, media = 0, seq = 1;
        for(int c = 1; c <= 10; c++){
        String d = JOptionPane.showInputDialog(null, "Informe a idade do "+ seq + "º " + "aluno: ");
        a1 = Integer.parseInt(d);
        seq++;
        media = media + a1;
        }
        media = media / 10;
        JOptionPane.showMessageDialog(null,"A média de idade dos alunos é: " + media);
    }
}
