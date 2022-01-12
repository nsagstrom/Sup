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
public class AlienAvRas extends javax.swing.JFrame {

    /**
     * Creates new form alienAvRas
     */
    public AlienAvRas() {
        initComponents();
        Metoder.laggTillRas(cbRaser);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbRaser = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAlienRas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel1.setText("Alla alien per ras");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel2.setText("Välj ras");

        cbRaser.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        cbRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaserActionPerformed(evt);
            }
        });

        txtAreaAlienRas.setEditable(false);
        txtAreaAlienRas.setColumns(20);
        txtAreaAlienRas.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        txtAreaAlienRas.setRows(5);
        jScrollPane1.setViewportView(txtAreaAlienRas);

        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaserActionPerformed

        txtAreaAlienRas.setText("");

        ArrayList<HashMap<String, String>> SoktaAlien;

        String valdRas = cbRaser.getSelectedItem().toString();
        String fraga = "SELECT alien.Namn AS Namn FROM (\n"
                + "SELECT Alien_ID  , 'Worm' AS Ras, null AS antal FROM worm\n"
                + "UNION\n"
                + "SELECT Alien_ID  , 'Squid' AS Ras, Antal_Armar AS Antal FROM squid\n"
                + "UNION\n"
                + "SELECT Alien_ID, 'Boglodite' AS Ras, Antal_Boogies AS Antal FROM boglodite\n"
                + "UNION\n"
                + "(SELECT Alien_ID, 'Annat', null FROM alien\n"
                + "    WHERE Alien_ID NOT IN (SELECT Alien_ID AS id FROM alien\n"
                + "    WHERE Alien_ID  IN (SELECT id FROM\n"
                + "        (SELECT Alien_ID AS id  FROM squid\n"
                + "        UNION SELECT Alien_ID as id FROM worm\n"
                + "        UNION SELECT Alien_ID as id FROM boglodite) AS a)))) AS ras\n"
                + "JOIN alien on ras.alien_id = alien.alien_id\n"
                + "JOIN plats p on p.Plats_ID = alien.Plats\n"
                + "JOIN (SELECT Namn AS Agent, Agent_ID FROM agent) AS agent on alien.Ansvarig_Agent = agent.Agent_ID\n"
                + "WHERE Ras= '" + valdRas + "';";

        SoktaAlien = SqlFragor.fragaRader(fraga);

        for (HashMap<String, String> a : SoktaAlien) {
            txtAreaAlienRas.append(a.get("Namn") + "\n");
        }
    }//GEN-LAST:event_cbRaserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ForstaSida.arAdmin()) {
            new AgentAdminSida().setVisible(true);
            dispose();
        } else {
            new AgentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbRaser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaAlienRas;
    // End of variables declaration//GEN-END:variables
}
