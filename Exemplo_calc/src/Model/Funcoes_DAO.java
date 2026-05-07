
package Model;

import javax.swing.JOptionPane;
import static View.Inicio_GUI.*;
import java.awt.Color;

public class Funcoes_DAO {
    
    public static void sair(){
        System.exit(0);
    }
    public static int val1=0, val2=0, resp=0;
    public static void somar(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        resp = val1 + val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resp));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    public static void sub(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        resp = val1 - val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resp));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    public static void div(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        resp = val1 / val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resp));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    public static void mult(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        resp = val1 * val2;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resp));
        RESULTADO_TXT.setBackground(Color.yellow);
    }
    public static void porc(){
        val1 = Integer.parseInt(View.Inicio_GUI.VALOR1_TXT.getText());
        val2 = Integer.parseInt(View.Inicio_GUI.VALOR2_TXT.getText());
        resp = (val1 * val2) / 100;
        RESULTADO_TXT.setVisible(true);
        RESULTADO_TXT.setText(String.valueOf(resp));
        RESULTADO_TXT.setBackground(Color.yellow);
    
    }
    public static void potencia(){
        
    }
    public static void limpar(){
        RESULTADO_TXT.setVisible(false);
        VALOR1_TXT.setText("");
        VALOR2_TXT.setText("");
        RESULTADO_TXT.setText("");
    }
}
