/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class forstaSida extends javax.swing.JFrame {

    
    private InfDB idb;
    private String agent;
    private String alien;
    private static String inAnvandare;
    private static String inlosen;
    
    /**
     * Creates new form forstaSida
     */
    public  forstaSida(InfDB idb) {
        this.idb = idb;
        initComponents();
        this.agent = "Agent";
        this.alien = "Alien";
        fyllLista();
        
        
    }
        private void fyllLista(){
            
        cbVem.addItem("Välj");
        cbVem.addItem(agent);
        cbVem.addItem(alien);
            
        } 
        
        
    

    private forstaSida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnInlogg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbVem = new javax.swing.JComboBox<>();
        pwfalt = new javax.swing.JPasswordField();
        txtVemInlogg = new javax.swing.JTextField();
        cbVisaLosen = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Välkommen till MIBs fucking inloggning");

        btnInlogg.setText("Agent");
        btnInlogg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInloggActionPerformed(evt);
            }
        });

        jLabel2.setText("Vem vill du logga in som");

        cbVem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVemActionPerformed(evt);
            }
        });

        pwfalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwfaltActionPerformed(evt);
            }
        });

        txtVemInlogg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVemInloggActionPerformed(evt);
            }
        });

        cbVisaLosen.setText("Visa lösenord");

        jLabel3.setText("Användarnamn");

        jLabel4.setText("Lösenord");

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInlogg)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pwfalt)
                                    .addComponent(txtVemInlogg)
                                    .addComponent(cbVisaLosen)
                                    .addComponent(cbVem, 0, 119, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addComponent(btnLoggaIn)))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInlogg))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVemInlogg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwfalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoggaIn))
                .addGap(18, 18, 18)
                .addComponent(cbVisaLosen)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInloggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInloggActionPerformed
        // TODO add your handling code here:
        new InlogAgent(idb).setVisible(true);
        
    }//GEN-LAST:event_btnInloggActionPerformed

    private void cbVemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVemActionPerformed

    private void txtVemInloggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVemInloggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVemInloggActionPerformed

    private void pwfaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwfaltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwfaltActionPerformed

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
         inlosen = new String(pwfalt.getPassword());
         inAnvandare = txtVemInlogg.getText();
        
        try {
            if (cbVem.getSelectedItem().toString().equals(agent)) {
                

                String aFraga = "SELECT Namn FROM agent WHERE Namn = " + "'" + inAnvandare + "'";
                String lFraga = "SELECT Losenord FROM agent WHERE Namn = " + "'" + inAnvandare + "'";
  
                String aSvar = idb.fetchSingle(aFraga);
                String alosen = idb.fetchSingle(lFraga);

                if (inAnvandare.equals(aSvar) && inlosen.equals(alosen) && !aSvar.isBlank() && !alosen.isBlank()) {

                    String sysfraga = "SELECT Administrator FROM agent WHERE Namn = " + "'" + inAnvandare + "'";

                    if (sysfraga.equalsIgnoreCase("N")) {

                        new agentSida(idb).setVisible(true);
                        dispose();
                    }
                    else{
                        new agentAdminSida(idb,inAnvandare).setVisible(true);
                        dispose();
                    }


                }
                else{
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                }
                
            }
            else if(cbVem.getSelectedItem().toString().equals(alien)){
                
                String alienFragaAnvandare = "SELECT Namn FROM alien WHERE Namn = " + "'" + inAnvandare + "'";
                String alienFragaLosenord = "SELECT Losenord FROM alien WHERE Namn = " + "'" + inAnvandare + "'";
                
                String alienAnvandare = idb.fetchSingle(alienFragaAnvandare);
                String alienLosen = idb.fetchSingle(alienFragaLosenord);
                
                if (inAnvandare.equals(alienAnvandare) && inlosen.equals(alienLosen) && !alienAnvandare.isBlank() && !alienLosen.isBlank()){
                     new alienSida(idb).setVisible(true);
                        dispose();
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                }
   
            }

        } catch (InfException e) {

            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

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
            java.util.logging.Logger.getLogger(forstaSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forstaSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forstaSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forstaSida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forstaSida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInlogg;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JComboBox<String> cbVem;
    private javax.swing.JCheckBox cbVisaLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwfalt;
    private javax.swing.JTextField txtVemInlogg;
    // End of variables declaration//GEN-END:variables
}
