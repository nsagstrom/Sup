/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author timme
 */
public class TaBortAgent extends javax.swing.JFrame {

    /**
     * Creates new form TaBortAgent
     */
    public TaBortAgent() {
        initComponents();
        Metoder.laggTillAgent(cbAgenter);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLKorrekt = new javax.swing.JLabel();
        jAgent = new javax.swing.JLabel();
        cbAgenter = new javax.swing.JComboBox<>();
        cbNyAnsvar = new javax.swing.JComboBox<>();
        lErsatter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel1.setText("Ta bort agent");

        btnTaBort.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnTillbaka.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jAgent.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jAgent.setText("Agent:");

        cbAgenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));
        cbAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgenterActionPerformed(evt);
            }
        });

        cbNyAnsvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent" }));

        lErsatter.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        lErsatter.setText("Vilken agent tar över ansvar för alien ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAgent)
                    .addComponent(lErsatter))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbNyAnsvar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAgenter, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnTillbaka))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTillbaka))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgent)
                    .addComponent(cbAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lErsatter)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaBort)
                    .addComponent(cbNyAnsvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        // TODO add your handling code here:

        //Det som väljs i komboboxen är den variabeln som vi använder i sql frågan för att specifera vilken alien som ska tas bort.
        String agentbort = cbAgenter.getSelectedItem().toString();
        String nyAnsvarig = cbNyAnsvar.getSelectedItem().toString();

        String taBortA = "SELECT Agent_ID FROM Agent WHERE Namn = '" + agentbort + "'";
        String nyAnsvarigFraga = "SELECT Agent_ID FROM Agent WHERE Namn = '" + nyAnsvarig + "'";
        //Kallar på metoden från SQLFragor-klassen för att ta bort Agent_ID för den finns i flera tabeller (främmande nyckel).
        String idBortA = SqlFragor.fragaSingel(taBortA);
        String idNy = SqlFragor.fragaSingel(nyAnsvarigFraga);
        String checking = "SELECT * FROM Agent WHERE Agent_ID = " + idBortA;

        //Checkar ifall värdet som skrivs in är null eller inte.
        if (SqlFragor.fragaSingel(checking) == null) {
            JOptionPane.showMessageDialog(rootPane, "Välj en agent!");
        } else {

            String setNyAnsvar = "UPDATE alien SET Ansvarig_Agent = " + idNy + " WHERE Ansvarig_Agent = " + idBortA + ";";
            String tabortA = "DELETE FROM agent WHERE Agent_ID = " + idBortA;
            String tabortFA = "DELETE FROM faltagent WHERE Agent_ID = " + idBortA;
            String tabortIF = "DELETE FROM innehar_fordon WHERE Agent_ID = " + idBortA;
            String tabortIU = "DELETE FROM innehar_utrustning WHERE Agent_ID = " + idBortA;
            String tabortKC = "DELETE FROM kontorschef WHERE Agent_ID = " + idBortA;
            String tabortOC = "DELETE FROM omradeschef WHERE Agent_ID = " + idBortA;

            //Kallar på metoden från SQLFragor-klassen. Agent tas bort
            SqlFragor.uppdatera(setNyAnsvar);
            SqlFragor.taBort(tabortFA);
            SqlFragor.taBort(tabortIF);
            SqlFragor.taBort(tabortIU);
            SqlFragor.taBort(tabortKC);
            SqlFragor.taBort(tabortOC);
            SqlFragor.taBort(tabortA);

            jLKorrekt.setText(agentbort + " borttagen!");
        }
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void nyAnsvar() {
        cbNyAnsvar.removeAllItems();
        cbNyAnsvar.addItem("Välj Agent");
        Metoder.laggTillAgent(cbNyAnsvar);

        int i = cbAgenter.getSelectedIndex();

        if (i != 0) {
            cbNyAnsvar.removeItemAt(i);
        }
    }

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgenterActionPerformed
        nyAnsvar();
    }//GEN-LAST:event_cbAgenterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAgenter;
    private javax.swing.JComboBox<String> cbNyAnsvar;
    private javax.swing.JLabel jAgent;
    private javax.swing.JLabel jLKorrekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lErsatter;
    // End of variables declaration//GEN-END:variables
}
