/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumsystem;

import dubiumview.Login;
import dubiumview.TelaInicial;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Cedup 05
 */
public class DubiumSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TelaInicial telainicial = new TelaInicial();
        telainicial.setVisible(true);
        telainicial.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Login login = new Login();
        //login.setVisible(true);
        //login.setSize(572, 380);
        //login.setLocationRelativeTo(null);
        
        // TODO code application logic here
    }
    
}
