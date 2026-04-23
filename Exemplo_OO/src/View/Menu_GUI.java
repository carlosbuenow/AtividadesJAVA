
package View;

import javax.swing.JOptionPane;

public class Menu_GUI {
    public static void Menu(){
        
        String x = JOptionPane.showInputDialog(null, "Calculadora\n 1 - Soma\n 2 - Subtração\n 3 - Divisão\n 4 - Multiplicação");
        int op = Integer.parseInt(x);
        switch(op){
            case 1:
                    Model.Operacoes_DAO.soma();
                    break;
            case 2: 
                    Model.Operacoes_DAO.subtracao();
                    break;
            case 3:
                    Model.Operacoes_DAO.div();
                    break;
            case 4:
                    Model.Operacoes_DAO.mult();
                    break;
            case 5: 
                    JOptionPane.showMessageDialog(null, "Saindo...");
            default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
                   
        }
    
    }
}
