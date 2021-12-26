/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class agentAdminSida extends javax.swing.JFrame {

    private InfDB idb;
    String namn;
    
    /**
     * Creates new form agentAdminSida
     */
    public agentAdminSida(InfDB idb) {
        this.idb = idb;
        initComponents();
        namn = forstaSida.aNamn();
        lblValkommen.setText("Välkommen " + namn);
        laggTillAtgard();
        listaAllUtrustning();

    }

    private void laggTillAtgard() {

        cbKontrollAvAlien.addItem("Välj");
        cbKontrollAvAlien.addItem("Alla Alier per ras");
        cbKontrollAvAlien.addItem("Alla Alier per plats");
        cbKontrollAvAlien.addItem("Alla Alier per datum");

        cbAtgarder.addItem("Välj");
        cbAtgarder.addItem("Lägg till Vapen");
        cbAtgarder.addItem("Lägg till Alien");
        cbAtgarder.addItem("Lägg till Agent");
        

    }

    private agentAdminSida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        cbKontrollAvAlien = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblValkommen = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        btnNylosen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbAtgarder = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfUtrustning = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbKontrollAvAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKontrollAvAlienActionPerformed(evt);
            }
        });

        jLabel2.setText("Kontroll av alien ");

        lblValkommen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValkommen.setText("jLabel1");

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnNylosen.setText("Byt lösenord");
        btnNylosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNylosenActionPerformed(evt);
            }
        });

        jLabel3.setText("Inloggad som administratör");

        jLabel4.setText("Åtgärder");

        cbAtgarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtgarderActionPerformed(evt);
            }
        });

        txtfUtrustning.setEditable(false);
        txtfUtrustning.setColumns(1);
        txtfUtrustning.setRows(5);
        jScrollPane1.setViewportView(txtfUtrustning);
        txtfUtrustning.getAccessibleContext().setAccessibleParent(null);

        jLabel5.setText("Utcheckad utustning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValkommen)
                    .addComponent(jLabel3)
                    .addComponent(cbAtgarder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbKontrollAvAlien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(btnLoggaUt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNylosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValkommen)
                    .addComponent(btnLoggaUt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNylosen)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKontrollAvAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtgarder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbKontrollAvAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKontrollAvAlienActionPerformed
        // Välj inloggningstyp
        int i = cbKontrollAvAlien.getSelectedIndex();

        if(i == 0){

        }
        switch (i) {
            case 1:
                new alienAvRas(idb).setVisible(true);
                dispose();
                break;
            case 2:
                new allaAlienPlats(idb).setVisible(true);
                dispose();
                break;
            case 3:
                new alienDatum(idb).setVisible(true);
                dispose();
                break;
            default:
                break;
        }

        

    }//GEN-LAST:event_cbKontrollAvAlienActionPerformed

    private void listaAllUtrustning(){
        
        ArrayList<HashMap<String, String>> allUtrustning;
        try {
            String id = idb.fetchSingle("SELECT Agent_id FROM agent WHERE Namn = '" + namn + "'");

//            txtfUtrustning.setLineWrap(true);
            
            String utFraga = "SELECT Benamning FROM utrustning join innehar_utrustning iu on utrustning.Utrustnings_ID = iu.Utrustnings_ID WHERE Agent_ID = " + id;
            allUtrustning = idb.fetchRows(utFraga);

            for (HashMap<String, String> utR : allUtrustning) {

                txtfUtrustning.append(utR.get("Benamning") + "\n");
            
         
            }
            
            
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
    }
    
    
    
    
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new forstaSida(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnNylosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNylosenActionPerformed
        new NyttLosen(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNylosenActionPerformed

    private void cbAtgarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtgarderActionPerformed
        int i = cbAtgarder.getSelectedIndex();

        if (i == 0) {

        }
        if (i == 1) {
            new addUtrustning(idb).setVisible(true);
            dispose();
        } else if (i == 2) {
            new nyRegistreraAlien(idb).setVisible(true);
            dispose();
        } else if (i == 3) {
            new addAgent(idb).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_cbAtgarderActionPerformed

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
            java.util.logging.Logger.getLogger(agentAdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agentAdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agentAdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agentAdminSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agentAdminSida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNylosen;
    private javax.swing.JComboBox<String> cbAtgarder;
    private javax.swing.JComboBox<String> cbKontrollAvAlien;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextArea txtfUtrustning;
    // End of variables declaration//GEN-END:variables
}
