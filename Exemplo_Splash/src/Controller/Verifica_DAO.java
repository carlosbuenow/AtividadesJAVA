
package Controller;

import static View.Login_GUI.cont;
import static View.Login_GUI.login_txt;
import static View.Login_GUI.senha_txt;
import View.Menu_GUI;
import javax.swing.JOptionPane;

public class Verifica_DAO {
    public static int cont = 0;
    public static void verifica(){
        String login = login_txt.getText();
        String senha = senha_txt.getText();
        if(cont == 3){
            JOptionPane.showMessageDialog(null, "Número de tentativas excedido!");
            System.exit(0);
            cont++;
        }else{
            if(login.equals("ETEC") && senha.equals("A123")){
                JOptionPane.showMessageDialog(null, "Seja Bem-Vindo !!!");
                new Menu_GUI().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha errado\n Tente novamente!");
                login_txt.setText("");
                senha_txt.setText("");
                cont++;
            }
        }
}
   
    
}
