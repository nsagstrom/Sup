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
public class VemOmradesChef extends javax.swing.JFrame {

    /**
     * Creates new form VemOmradesChef
     */
    public VemOmradesChef() {
        initComponents();
        vemArChef();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChef = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        txtChef.setColumns(2);
        txtChef.setRows(5);
        txtChef.setTabSize(3);
        jScrollPane1.setViewportView(txtChef);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnTillbaka)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (ForstaSida.arAdmin()) {
            new AgentAdminSida().setVisible(true);
            dispose();
        } else {
            new AgentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChef;
    // End of variables declaration//GEN-END:variables
}
