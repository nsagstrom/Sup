/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class nyRegistreraAlien extends javax.swing.JFrame {

    
    private InfDB idb;
    private String agentNr;
    private String datum;
    private String sqlfraga;
    private String ett;
    /**
     * Creates new form nyRegistreraAlien
     */
    public nyRegistreraAlien(InfDB idb) {
        this.idb = idb;
        initComponents();
        laggTillPlats();
        laggTillAgent();
        laggTillRas();
        datum();
        txtRasTill.setVisible(false);
    }
    
        private void laggTillRas() {

        cbRaser.addItem("Boglodite");
        cbRaser.addItem("Sqiud");
        cbRaser.addItem("Worm");
    }

    private void datum() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        datum = dateFormat.format(date);
    }

    private nyRegistreraAlien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        cbPlats = new javax.swing.JComboBox<>();
        cbAnsvarigAgent = new javax.swing.JComboBox<>();
        btnLaggTill = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pwLosen = new javax.swing.JPasswordField();
        cbVisaLosen = new javax.swing.JCheckBox();
        cbRaser = new javax.swing.JComboBox<>();
        txtRasTill = new javax.swing.JTextField();
        lbRasInfo = new javax.swing.JLabel();
        lReggad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Registrera ny Alien");

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats" }));
        cbPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlatsActionPerformed(evt);
            }
        });

        cbAnsvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ansvarig" }));
        cbAnsvarigAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnsvarigAgentActionPerformed(evt);
            }
        });
        cbAnsvarigAgent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbAnsvarigAgentKeyPressed(evt);
            }
        });

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        jLabel2.setText("Namn");

        jLabel3.setText("Lösenord");

        jLabel4.setText("Telefon");

        cbVisaLosen.setText("Visa Lösenord");
        cbVisaLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaLosenActionPerformed(evt);
            }
        });

        cbRaser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Ras" }));
        cbRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaserActionPerformed(evt);
            }
        });

        txtRasTill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRasTillKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbVisaLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLaggTill)
                        .addGap(28, 28, 28)
                        .addComponent(lReggad, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(277, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(txtRasTill, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbVisaLosen)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRasTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLaggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lReggad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlatsActionPerformed
           
    }//GEN-LAST:event_cbPlatsActionPerformed

    private void cbAnsvarigAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnsvarigAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnsvarigAgentActionPerformed

    private void cbVisaLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaLosenActionPerformed
        if (cbVisaLosen.isSelected()) {
            pwLosen.setEchoChar((char) 0);
        } else {
            pwLosen.setEchoChar('*');
        }
    }//GEN-LAST:event_cbVisaLosenActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed

        try {
            boolean ok = okUppgifter();
            String vilkenAgent = cbAnsvarigAgent.getSelectedItem().toString();
            String agentNrFraga = "SELECT Agent_ID FROM agent WHERE namn = '" + vilkenAgent + "'";
            agentNr = idb.fetchSingle(agentNrFraga);

            String vilkenPlats = cbPlats.getSelectedItem().toString();
            String vilkenPlatsNrFraga = "SELECT Plats_ID FROM plats WHERE Benamning = '" + vilkenPlats + "'";
            String platsNr = idb.fetchSingle(vilkenPlatsNrFraga);

            String alienNamn = txtNamn.getText();
            String alienLosenord = new String(pwLosen.getPassword());
            String telefonNummer = txtTelefon.getText();
            
            String fragaID = idb.getAutoIncrement("Alien", "Alien_ID");
            
            if (ok) {
                sqlfraga = "INSERT INTO alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) VALUES (" + fragaID + ",'" + datum + "','" + alienLosenord + "','" + alienNamn + "','" + telefonNummer + "'," + platsNr + "," + agentNr + ")";
                idb.insert(sqlfraga); 
              
                lReggad.setText("Alien " + alienNamn + " är registrerad!");

                String vilkettilagg = txtRasTill.getText();

                switch (cbRaser.getSelectedIndex()) {
                    case 1:
                        ett = "INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES (" + fragaID + "," + vilkettilagg + ")";
                        idb.insert(ett);
                        break;
                    case 2:
                        ett = "INSERT INTO squid (alien_id, antal_armar) VALUES (" + fragaID + "," + vilkettilagg + ")";
                        idb.insert(ett);
                        break;
                    case 3:
                        ett = "INSERT INTO worm (Alien_ID) VALUES (" + fragaID + ")";
                        idb.insert(ett);
                        break;
                    default:
                        break;
                }
            } 

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
            System.out.println(sqlfraga);
            System.out.println(ett);
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private boolean okUppgifter(){
        boolean ok = true;
        
         String alienLosenord2 = new String(pwLosen.getPassword());
        
        if(txtNamn.getText().isBlank()){
            ok = false;
            JOptionPane.showMessageDialog(null, "Namn saknas");
        } else if (alienLosenord2.isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord saknas");
        } else if (alienLosenord2.length() > 6) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord får ej vara längre än sex tecken");
        } else if (txtTelefon.getText().isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Telefonnummer saknas");
        } else if (cbPlats.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj plats");
        } else if (cbRaser.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj ras");
        } else if (cbRaser.getSelectedIndex()== 1 || cbRaser.getSelectedIndex()== 2 ){
            if(txtRasTill.getText().isBlank()){
                ok = false;
                JOptionPane.showMessageDialog(null, "Ange antal");
            }
        } else if(cbAnsvarigAgent.getSelectedIndex() == 0){
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj agent");
        }
        return ok;
    }
     
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if(forstaSida.arAdmin()){
            new agentAdminSida(idb).setVisible(true);
            dispose();
        }
        else{
            new agentSida(idb).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbAnsvarigAgentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbAnsvarigAgentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnLaggTill.doClick();
        }
    }//GEN-LAST:event_cbAnsvarigAgentKeyPressed

    private void cbRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaserActionPerformed
        int i = cbRaser.getSelectedIndex();
        
        switch (i) {
            case 0:
                txtRasTill.setVisible(false);
                lbRasInfo.setText("");
                break;
            case 1:
                txtRasTill.setVisible(true);
                lbRasInfo.setText("Antal boogies");
                break;
            case 2:
                txtRasTill.setVisible(true);
                lbRasInfo.setText("Antal armar");
                break;
            case 3:
                txtRasTill.setVisible(false);
                lbRasInfo.setText("");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbRaserActionPerformed

    private void txtRasTillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRasTillKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnLaggTill.doClick();
        }
    }//GEN-LAST:event_txtRasTillKeyPressed

    private void laggTillPlats() {
        String fraga = "SELECT Benamning FROM plats";

        ArrayList<String> allaPlatser;
        try {
            allaPlatser = idb.fetchColumn(fraga);

            for (String p : allaPlatser) {
                cbPlats.addItem(p);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
    }

    private void laggTillAgent() {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;
        try {
            allaAgenter = idb.fetchColumn(agentFraga);

            for (String a : allaAgenter) {
                cbAnsvarigAgent.addItem(a);
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");

        }
    }

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
            java.util.logging.Logger.getLogger(nyRegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nyRegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nyRegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nyRegistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nyRegistreraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JComboBox<String> cbRaser;
    private javax.swing.JCheckBox cbVisaLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lReggad;
    private javax.swing.JLabel lbRasInfo;
    private javax.swing.JPasswordField pwLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasTill;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}