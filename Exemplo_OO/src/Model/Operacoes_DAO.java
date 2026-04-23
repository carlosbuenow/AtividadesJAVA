package Model;

import javax.swing.JOptionPane;

public class Operacoes_DAO {
    public static String x="";
    public static double v1=0, v2=0;
    public static void soma(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        v2 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, "O resultado é " + (v1+v2));
    }
    public static void subtracao(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        v2 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, "O resultado é " + (v1-v2));
    }
    public static void div(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        v2 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, "O resultado é " + (v1/v2));
    }
     public static void mult(){
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        v1 = Integer.parseInt(x);
        x = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
        v2 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, "O resultado é " + (v1*v2));
    }
}
