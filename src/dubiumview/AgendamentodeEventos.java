/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumview;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author CEDUP16
 */
public class AgendamentodeEventos extends javax.swing.JFrame {

    /**
     * Creates new form AgendamentodeEventos
     */
    public AgendamentodeEventos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNomeEvento = new javax.swing.JTextField();
        campoPublico = new javax.swing.JRadioButton();
        campoPrivado = new javax.swing.JRadioButton();
        campoCapacidae = new javax.swing.JComboBox<>();
        campoDataInicio = new com.toedter.calendar.JDateChooser();
        campoDataFim = new com.toedter.calendar.JDateChooser();
        campoObservações = new java.awt.TextArea();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bVerAgendamento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENDAMENTO DE EVENTOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 540, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/henrypaul.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 290, 170);

        jLabel3.setBackground(new java.awt.Color(102, 51, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Nome do Evento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 130, 290, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("Tipo de Evento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 200, 290, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("Observações");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 290, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        jLabel7.setText("Data de Fim");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 390, 290, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Data de Início");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 330, 290, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("Capacidade");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 270, 290, 30);
        getContentPane().add(campoNomeEvento);
        campoNomeEvento.setBounds(400, 170, 290, 30);

        campoPublico.setBackground(new java.awt.Color(255, 255, 204));
        bgSexo.add(campoPublico);
        campoPublico.setText("Público");
        campoPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPublicoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPublico);
        campoPublico.setBounds(550, 240, 140, 30);

        campoPrivado.setBackground(new java.awt.Color(255, 255, 204));
        bgSexo.add(campoPrivado);
        campoPrivado.setSelected(true);
        campoPrivado.setText("Privado");
        campoPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrivadoActionPerformed(evt);
            }
        });
        getContentPane().add(campoPrivado);
        campoPrivado.setBounds(400, 240, 140, 30);

        campoCapacidae.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Até 100 pessoas", "Até 500 pessoas", "Até 1000 pessoas", "Até 5000 pessoas" }));
        campoCapacidae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCapacidaeActionPerformed(evt);
            }
        });
        getContentPane().add(campoCapacidae);
        campoCapacidae.setBounds(400, 300, 290, 30);
        getContentPane().add(campoDataInicio);
        campoDataInicio.setBounds(400, 360, 290, 30);
        getContentPane().add(campoDataFim);
        campoDataFim.setBounds(400, 420, 290, 30);
        getContentPane().add(campoObservações);
        campoObservações.setBounds(30, 360, 290, 80);

        bSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bSalvar);
        bSalvar.setBounds(30, 480, 150, 25);

        bCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bCancelar);
        bCancelar.setBounds(200, 480, 150, 25);

        bVerAgendamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bVerAgendamento.setText("Ver agendamento");
        bVerAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(bVerAgendamento);
        bVerAgendamento.setBounds(540, 480, 150, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dubiumicons/interfacedefundo2.0.png"))); // NOI18N
        jLabel4.setText("Tipo de Evento");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 4, true));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 750, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCapacidaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCapacidaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCapacidaeActionPerformed

    private void campoPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPublicoActionPerformed

    private void campoPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrivadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrivadoActionPerformed

    private void bVerAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerAgendamentoActionPerformed
       Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Documento.pdf"));
                   
            document.open();
            document.add(new Paragraph("Agendamento confirmado com sucesso!"));
            
                    } catch (FileNotFoundException ex) {
            System.out.println("Error:"+ex);
        } catch (DocumentException ex) {
            Logger.getLogger(AgendamentodeEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        document.close();
        }
        
        try {
            Desktop.getDesktop().open (new File("Documento.pdf"));
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
    }//GEN-LAST:event_bVerAgendamentoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed

        
        
        AgendamentodeEventos eventos = new AgendamentodeEventos();
	eventos.setName(campoNomeEvento.getText());
        eventos.setObservações(campoObservações.getText());
        eventos.setDataFim(campoDataFim.getCalendarButton());
        eventos.setDataInicio(campoDataInicio.getCalendarButton());
        if (campoPublico.isSelected()) {
            eventos.setTipoPublico("Público");
        } else if (campoPrivado.isSelected()) {
            eventos.setTipoPrivado("Privado"); 
        }
        
        // clienteDAO.saveOrUpdate(cliente); trocar clienteDAO pela respectiva classe do DubyumSystem
        
        
        
       // pegar_dados();
       // try {
        //    usuariomodel.verificar_campos(usuariopojo);         *trocar usuariomodel e usuariodao pela respectiva classe criada*
       //     usuariodao.inserirUsuario(usuariopojo);
     //   } catch (IllegalArgumentException e) {
       //     JOptionPane.showMessageDialog(null, "O campo "+e.getMessage()+" é Obrigatório");
       // }


    }//GEN-LAST:event_bSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendamentodeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendamentodeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendamentodeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendamentodeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendamentodeEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton bVerAgendamento;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JComboBox<String> campoCapacidae;
    private com.toedter.calendar.JDateChooser campoDataFim;
    private com.toedter.calendar.JDateChooser campoDataInicio;
    private javax.swing.JTextField campoNomeEvento;
    private java.awt.TextArea campoObservações;
    private javax.swing.JRadioButton campoPrivado;
    private javax.swing.JRadioButton campoPublico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void setExtendedState(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSexo(String feminino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setObservações(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDataFim(JButton calendarButton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDataInicio(JButton calendarButton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTipoPrivado(String privado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTipoPublico(String público) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}