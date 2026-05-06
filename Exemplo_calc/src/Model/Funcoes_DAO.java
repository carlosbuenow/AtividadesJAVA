
package Model;

import javax.swing.JOptionPane;
import static View.Inicio_GUI.VALOR1_TXT;
import static View.Inicio_GUI.VALOR2_TXT;

public class Funcoes_DAO {
    
    public static void sair(){
        System.exit(0);
    }
    public static int val1=0, val2=0;
    public static void somar(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        JOptionPane.showMessageDialog(null, val1 + val2);
    }
    public static void sub(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        JOptionPane.showMessageDialog(null, val1 - val2);
    }
    public static void div(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        JOptionPane.showMessageDialog(null, val1 / val2);
    }
    public static void mult(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        JOptionPane.showMessageDialog(null, val1 * val2);
    }
    public static void limpar(){
        VALOR1_TXT.setText("");
        VALOR2_TXT.setText("");
    }
}
