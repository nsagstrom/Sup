/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nsags
 */
public class alienSida extends javax.swing.JFrame {

    private String namn;

    /**
     * Creates new form alienSida
     */
    public alienSida() {

        initComponents();
        namn = forstaSida.aNamn();
        lblValkommen.setText("Välkommen " + namn);
        omradeAgent();
        listaAlienIomrade();
    }

    private void listaAlienIomrade() {

        String omradeID = SqlFragor.fragaSingel("SELECT Omrades_ID FROM alien\n"
                + "JOIN plats p on p.Plats_ID = alien.Plats\n"
                + "JOIN omrade o on o.Omrades_ID = p.Finns_I\n"
                + "WHERE Namn = '" + namn + "';");
        
        String omradeNamn = SqlFragor.fragaSingel("SELECT Benamning FROM omrade WHERE Omrades_ID = " + omradeID + ";");
        
        lMittomrade.setText("Alien i "  + omradeNamn);

        ArrayList<HashMap<String, String>> allaAlien;

        String fraga = "SELECT Namn FROM omrade\n"
                + "JOIN plats p on omrade.Omrades_ID = p.Finns_I\n"
                + "JOIN alien a on p.Plats_ID = a.Plats\n"
                + "WHERE Omrades_ID = " + omradeID + ";";

        allaAlien = SqlFragor.fragaRader(fraga);

        for (HashMap<String, String> alienOmrade : allaAlien) {
            String namnen = alienOmrade.get("Namn");
            if (!namnen.equals(namn)) {
                txtAlienOmrade.append(namnen + "\n");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommen = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        btnNylosen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        luppgifter = new javax.swing.JLabel();
        lMittomrade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlienOmrade = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setText("ALIEN !!!!");

        jLabel1.setText("Kontakta områdeschef:");

        lMittomrade.setText("Alien i mitt område");

        txtAlienOmrade.setEditable(false);
        txtAlienOmrade.setColumns(2);
        txtAlienOmrade.setRows(5);
        txtAlienOmrade.setPreferredSize(new java.awt.Dimension(23, 84));
        jScrollPane2.setViewportView(txtAlienOmrade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValkommen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLoggaUt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNylosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(286, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMittomrade, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValkommen)
                    .addComponent(btnLoggaUt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNylosen)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(luppgifter)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(lMittomrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new forstaSida().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnNylosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNylosenActionPerformed
        new NyttLosen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNylosenActionPerformed

    private void omradeAgent() {

        HashMap<String, String> kontakt;

        String fraga = "SELECT a.Namn, a.Telefon FROM omrade\n"
                + "JOIN agent a on omrade.Omrades_ID = a.Omrade\n"
                + "JOIN alien a2 on a.Agent_ID = a2.Ansvarig_Agent\n"
                + "WHERE a2.Namn = '" + namn + "';";
        kontakt = SqlFragor.fragaRad(fraga);

        luppgifter.setText(kontakt.get("Namn") + " " + kontakt.get("Telefon"));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNylosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMittomrade;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JLabel luppgifter;
    private javax.swing.JTextArea txtAlienOmrade;
    // End of variables declaration//GEN-END:variables
}
