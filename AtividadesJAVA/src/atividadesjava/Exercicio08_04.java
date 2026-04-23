
package atividadesjava;

import javax.swing.JOptionPane;

public class Exercicio08_04 {
    public static void Exercicio(){
                System.out.println("----------EXERCÍCIO 1----------");
       
                    double valor, porc, n1, n2;
                    String x;
       
                    x = JOptionPane.showInputDialog(null, "Informe uma quantia em R$: ");
                    valor = Double.parseDouble(x);
                    porc = valor * 0.100;
                    JOptionPane.showMessageDialog(null, "10% de " + "R$" + valor + " é " + "R$" + porc);
       
                   System.out.println("----------EXERCÍCIO 2----------");
       
                    x = JOptionPane.showInputDialog(null, "Informe o primeiro número: ");
                    n1 = Double.parseDouble(x);
                    x = JOptionPane.showInputDialog(null, "Informe o segundo número: ");
                    n2 = Double.parseDouble(x);
                    JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1+n2));
                    JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1-n2));
                    JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + (n1*n2));
                    JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + (n1/n2));
       
                System.out.println("----------EXERCÍCIO 3----------");
                    String peso, altura, nome;
                    float p, imc, a;
                    nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
                    peso = JOptionPane.showInputDialog(null, "Informe o seu peso: ");
                    altura = JOptionPane.showInputDialog(null, "Informe a sua altura: ");
                    p = Float.parseFloat(peso);
                    a = Float.parseFloat(altura);
                    imc = p / (a * a);
                    JOptionPane.showMessageDialog(null, nome + "\nO seu IMC é: " + imc);
       
    }
}
