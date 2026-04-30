
package Model;

import javax.swing.JOptionPane;

public class Funcoes_DAO {
    public static void fechar(){
        String x = JOptionPane.showInputDialog(null, "Deseja realmente sair?\n 1 - Sim\n 2 - Não");
         int op = Integer.parseInt(x);
         if(op == 1){
             System.exit(0);
         }else if (op == 2){
             JOptionPane.showMessageDialog(null, "Voltando ao sistema");
         }else{
             JOptionPane.showMessageDialog(null, "Opção inválida!");
         }
    
    }
}
