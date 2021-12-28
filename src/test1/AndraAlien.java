/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class AndraAlien extends javax.swing.JFrame {

    /**
     * Creates new form AndraAlien
     */
    private InfDB idb;

    public AndraAlien(InfDB idb) {
        this.idb = idb;
        initComponents();
        info();
        laggTillRas();
        laggTillAgent();
        laggTillPlats();
        txtRasTill.setVisible(false);

    }

    private void laggTillRas() {

        cbRaser.addItem("Boglodite");
        cbRaser.addItem("Sqiud");
        cbRaser.addItem("Worm");
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

    private AndraAlien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAllInfo = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        cbRaser = new javax.swing.JComboBox<>();
        txtDatum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbPlats = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbAnsvarigAgent = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtLosen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRasTill = new javax.swing.JTextField();
        lbRasInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAllInfo.setEditable(false);
        txtAllInfo.setColumns(20);
        txtAllInfo.setRows(5);
        txtAllInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAllInfo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAllInfo.setEnabled(false);
        txtAllInfo.setSelectionColor(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(txtAllInfo);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnOK.setText("Ok");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra uppgifter");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        jLabel2.setText("Ange ID på alien du vill ändra");

        cbRaser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Ras" }));
        cbRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaserActionPerformed(evt);
            }
        });

        jLabel3.setText("Namn");

        jLabel4.setText("Reg.datum");

        jLabel5.setText("Ras");

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Plats" }));

        jLabel6.setText("Plats");

        cbAnsvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Agent" }));

        jLabel7.setText("Agent");

        jButton1.setText("Ändra");

        jLabel8.setText("Lösenord");

        jLabel9.setText("Telefon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(txtNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(txtID))
                            .addComponent(jLabel7)
                            .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOK)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(txtDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(txtLosen)
                                    .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRasTill, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2)))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTillbaka)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTillbaka))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRasTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void info() {

         ArrayList<HashMap<String, String>> allInfo;

         try {
             String fraga = "SELECT alien.Alien_ID, Ras, alien.Namn AS Namn ,Registreringsdatum,alien.Losenord,alien.Telefon,Benamning, Agent AS Agent , Antal FROM (\n"
                     + "SELECT Alien_ID  , 'Worm' AS Ras, null AS antal FROM worm\n"
                     + "UNION\n"
                     + "SELECT Alien_ID  , 'Sqid' AS Ras, Antal_Armar AS Antal FROM squid\n"
                     + "UNION\n"
                     + "SELECT Alien_ID, 'Boglodite' AS Ras, Antal_Boogies AS Antal FROM boglodite\n"
                     + "UNION\n"
                     + "(SELECT Alien_ID, 'SAKNAS', null FROM alien\n"
                     + "    WHERE Alien_ID NOT IN (SELECT Alien_ID AS id FROM alien\n"
                     + "    WHERE Alien_ID  IN (SELECT id FROM\n"
                     + "        (SELECT Alien_ID AS id  FROM squid\n"
                     + "        UNION SELECT Alien_ID as id FROM worm\n"
                     + "        UNION SELECT Alien_ID as id FROM boglodite) AS a)))) AS ras\n"
                     + "JOIN alien on ras.alien_id = alien.alien_id\n"
                     + "JOIN plats p on p.Plats_ID = alien.Plats\n"
                     + "JOIN (SELECT Namn AS Agent, Agent_ID FROM agent) AS agent on alien.Ansvarig_Agent = agent.Agent_ID;";

             allInfo = idb.fetchRows(fraga);

             String rubrik = "Alien ID:" + "\t" + "Namn:"
                     + "\t" + "Ras:" + "\t" + "Delar" +"\t" + "Reg datum:"
                     + "\t" + "Telefon:" + "\t" + "Lösenord:" + "\t"
                     + "Plats:" + "\t" + "Agent:" + "\n";
             
             txtAllInfo.append(rubrik);
             
             for (HashMap<String, String> info : allInfo) {
                 txtAllInfo.append(info.get("Alien_ID") + "\t" + info.get("Namn")
                         + "\t" + info.get("Ras") + "\t" + info.get("Antal") + "\t" + info.get("Registreringsdatum")
                         + "\t" + info.get("Telefon") + "\t" + info.get("Losenord") + "\t"
                         + info.get("Benamning") + "\t" + info.get("Agent") + "\n");
                 
             }
         } 
         catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
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

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String sok = "";
        
       
        try{
             sok ="SELECT alien.Alien_ID, Ras, alien.Namn AS Namn ,Registreringsdatum,alien.Losenord,alien.Telefon,Benamning, Agent AS Agent , Antal FROM (\n"
                     + "SELECT Alien_ID  , 'Worm' AS Ras, null AS antal FROM worm\n"
                     + "UNION\n"
                     + "SELECT Alien_ID  , 'Sqid' AS Ras, Antal_Armar AS Antal FROM squid\n"
                     + "UNION\n"
                     + "SELECT Alien_ID, 'Boglodite' AS Ras, Antal_Boogies AS Antal FROM boglodite\n"
                     + "UNION\n"
                     + "(SELECT Alien_ID, 'SAKNAS', null FROM alien\n"
                     + "    WHERE Alien_ID NOT IN (SELECT Alien_ID AS id FROM alien\n"
                     + "    WHERE Alien_ID  IN (SELECT id FROM\n"
                     + "        (SELECT Alien_ID AS id  FROM squid\n"
                     + "        UNION SELECT Alien_ID as id FROM worm\n"
                     + "        UNION SELECT Alien_ID as id FROM boglodite) AS a)))) AS ras\n"
                     + "JOIN alien on ras.alien_id = alien.alien_id\n"
                     + "JOIN plats p on p.Plats_ID = alien.Plats\n"
                     + "JOIN (SELECT Namn AS Agent, Agent_ID FROM agent) AS agent on alien.Ansvarig_Agent = agent.Agent_ID\n"
                    + "WHERE alien.Alien_ID = " +  txtID.getText() + " ;";
           
            HashMap<String, String> uppgifter;
            uppgifter = idb.fetchRow(sok);
            
            txtNamn.setText(uppgifter.get("Namn"));
            txtDatum.setText(uppgifter.get("Registreringsdatum"));
            txtLosen.setText(uppgifter.get("Losenord"));
            txtTele.setText(uppgifter.get("Telefon"));
            txtRasTill.setText(uppgifter.get("Antal"));
            cbAnsvarigAgent.setSelectedItem(uppgifter.get("Agent"));
            cbPlats.setSelectedItem(uppgifter.get("Benamning"));
            
            if (uppgifter.get("Ras").equals("SAKNAS")) {
                cbRaser.setSelectedIndex(0);
            } else if (uppgifter.get("Ras").equalsIgnoreCase("Boglodite")) {
                cbRaser.setSelectedIndex(1);
            } else if (uppgifter.get("Ras").equalsIgnoreCase("Sqid")) {
                cbRaser.setSelectedIndex(2);
            } else if (uppgifter.get("Ras").equalsIgnoreCase("Worm")) {
                cbRaser.setSelectedIndex(3);
            }

            
           

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
            
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnOK.doClick();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    
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
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JComboBox<String> cbRaser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRasInfo;
    private javax.swing.JTextArea txtAllInfo;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasTill;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
