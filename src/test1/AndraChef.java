/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author nsags
 */
public class AndraChef extends javax.swing.JFrame {

    /**
     * Creates new form AndraChef
     */
    public AndraChef() {
        initComponents();
        Metoder.laggTillAgent(cbAgenter);
        vemArChef();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbBefattning = new javax.swing.JComboBox<>();
        cbVart = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbAgenter = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        landrad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChef = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbBefattning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj befattning", "Områdeschef", "Kontorschef" }));
        cbBefattning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBefattningActionPerformed(evt);
            }
        });

        cbVart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj plats" }));

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra chef");

        jLabel2.setText("Vilken typ av chef");

        jLabel4.setText("Vart");

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbAgenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Agent" }));

        jLabel7.setText("Agent");

        txtChef.setColumns(2);
        txtChef.setRows(5);
        txtChef.setTabSize(3);
        jScrollPane1.setViewportView(txtChef);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnTillbaka))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(landrad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBefattning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbVart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(161, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbVart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTillbaka)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBefattning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(64, 64, 64)
                .addComponent(landrad)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbBefattningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBefattningActionPerformed
        int i = cbBefattning.getSelectedIndex();

        switch (i) {
            case 1:
                cbVart.removeAllItems();
                cbVart.addItem("Välj plats");
                Metoder.laggTillOmrade(cbVart);
                break;
            case 2:
                cbVart.removeAllItems();
                cbVart.addItem("Välj plats");
                cbVart.addItem("Örebrokontoret");
                break;
        }
    }//GEN-LAST:event_cbBefattningActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = cbBefattning.getSelectedIndex();
        boolean ok = true;
        boolean finns = true;

        String nyChefID = "";
        String omradeID = "";
        String nuvarandeID = "";
        ArrayList<HashMap<String, String>> allaNuvarandeID = null;
        String idcheck = "";

        if (ok) {
            nyChefID = SqlFragor.fragaSingel("SELECT Agent_ID FROM agent WHERE Namn = '" + cbAgenter.getSelectedItem() + "';");
            allaNuvarandeID = SqlFragor.fragaRader("SELECT Agent_ID FROM omradeschef");
            

            switch (i) {
                case 1:
                    for (HashMap<String, String> a : allaNuvarandeID) {
                        idcheck = a.get("Agent_ID");

                        if (idcheck.equals(nyChefID)) {
                            finns = true;
                            break;
                        } else {
                            finns = false;
                        }
                    }
                    if (!finns) {
                        omradeID = SqlFragor.fragaSingel("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + cbVart.getSelectedItem() + "';");
                        nuvarandeID = SqlFragor.fragaSingel("SELECT Agent_ID FROM omradeschef WHERE Omrade = " + omradeID + ";");

                        SqlFragor.taBort("DELETE FROM omradeschef WHERE Agent_ID = " + nuvarandeID + ";");
                        SqlFragor.laggTill("INSERT INTO omradeschef (Agent_ID, Omrade) VALUES (" + nyChefID + "," + omradeID + ");");
                        landrad.setText("Ändring genomförd (Hoppas vi)");
                        txtChef.setText("");
                        vemArChef();
                        
                        System.out.println("DELETE FROM omradeschef WHERE Agent_ID = " + nuvarandeID + ";");
                        System.out.println("INSERT INTO omradeschef (Agent_ID, Omrade) VALUES (" + nyChefID + "," + omradeID + ");");
                        
                        
                        
                        System.out.println(nyChefID + " ny chef id");
                        System.out.println(omradeID + " områdes id");
                        System.out.println(nuvarandeID + " nuvarande id" );
                        System.out.println(allaNuvarandeID + " alla chefers id");
                        System.out.println(idcheck + " test ");
                        System.out.println();
                        
                    } else {
                        String benamning = SqlFragor.fragaSingel("SELECT Benamning FROM omradeschef\n"
                                + "JOIN omrade o on o.Omrades_ID = omradeschef.Omrade\n"
                                + "WHERE Agent_ID = "+ nyChefID);
                        JOptionPane.showMessageDialog(null, "Vald agent är redan chef för " + benamning);
                    }
                    break;
                case 2:
                    nuvarandeID = SqlFragor.fragaSingel("SELECT Agent_ID FROM kontorschef WHERE Kontorsbeteckning = '" + cbVart.getSelectedItem() + "';");
                    SqlFragor.taBort("DELETE FROM kontorschef WHERE Agent_ID = " + nuvarandeID + ";");
                    SqlFragor.laggTill("INSERT INTO kontorschef (Agent_ID, Kontorsbeteckning) VALUES (" + nyChefID + ",'" + cbVart.getSelectedItem() + "');");
                    landrad.setText("Ändring genomförd (Hoppas vi)");
                    break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vemArChef() {

        ArrayList<HashMap<String, String>> omradeChef;

        String fraga = "SELECT Namn, Benamning FROM omradeschef\n"
                + "JOIN omrade o on o.Omrades_ID = omradeschef.Omrade\n"
                + "JOIN agent a on a.Agent_ID = omradeschef.Agent_ID;";

        omradeChef = SqlFragor.fragaRader(fraga);

        txtChef.append("Namn" + "\t" + "Chef för;" + "\n");

        for (HashMap<String, String> chef : omradeChef) {
            txtChef.append(chef.get("Namn") + "\t" + chef.get("Benamning") + "\n");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAgenter;
    private javax.swing.JComboBox<String> cbBefattning;
    private javax.swing.JComboBox<String> cbVart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel landrad;
    private javax.swing.JTextArea txtChef;
    // End of variables declaration//GEN-END:variables
}
