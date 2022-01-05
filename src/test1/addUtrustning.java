/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;

/**
 *
 * @author timme
 */
public class addUtrustning extends javax.swing.JFrame {

    /**
     * Creates new form addUtrustning
     */
    public addUtrustning() {
        initComponents();
        laggTillTyper();
        txtTill.setVisible(false);
    }
    
    private void laggTillTyper(){
        cbUtrustning.addItem("Vapen");
        cbUtrustning.addItem("Teknik");
        cbUtrustning.addItem("Kommunikation");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnRegistrera = new javax.swing.JButton();
        txtBenamning = new javax.swing.JTextField();
        titel = new javax.swing.JLabel();
        benämning = new javax.swing.JLabel();
        jKorrekt = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        cbUtrustning = new javax.swing.JComboBox<>();
        txtTill = new javax.swing.JTextField();
        lTyp = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrera.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        txtBenamning.setColumns(4);
        txtBenamning.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        txtBenamning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBenamningActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        titel.setText("Registrera utrustning");

        benämning.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        benämning.setText("Benämning:");

        btnTillbaka.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Typ av utrustning" }));
        cbUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUtrustningActionPerformed(evt);
            }
        });

        txtTill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTillKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(benämning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lTyp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTill)
                            .addComponent(cbUtrustning, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBenamning))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrera))
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titel)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(benämning)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrera))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // TODO add your handling code here:

 
        String nyID = SqlFragor.nyID("utrustning", "Utrustnings_ID");

        String fraga = "insert into utrustning(Utrustnings_ID, Benamning) VALUES(" + nyID + "," + "'" + txtBenamning.getText()+ "')";
        SqlFragor.laggTill(fraga);

        jKorrekt.setText(txtBenamning.getText() + " registrerad!");

        int i = cbUtrustning.getSelectedIndex();

        switch (i) {
            case 1:
                //Vapen
                SqlFragor.laggTill("INSERT INTO vapen (Utrustnings_ID, Kaliber) VALUES (" + nyID + "," + txtTill.getText() + ");");
                break;
            case 2:
                //Teknik
                SqlFragor.laggTill("INSERT INTO teknik (Utrustnings_ID, Kraftkalla) VALUES (" + nyID + ",'" + txtTill.getText() + "');");
                break;
            case 3:
                //Kommunikation
                SqlFragor.laggTill("INSERT INTO kommunikation (Utrustnings_ID, Overforingsteknik) VALUES (" + nyID + ",'" + txtTill.getText() + "');");
                break;
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void txtBenamningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBenamningActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBenamningActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUtrustningActionPerformed
        int i = cbUtrustning.getSelectedIndex();
        
        switch (i) {
            case 0:
                lTyp.setText("");
                txtTill.setVisible(false);
                break;
            case 1:
                //Vapen
                lTyp.setText("Ange kaliber");
                txtTill.setVisible(true);
                txtTill.setText("");
                txtTill.requestFocus();
                break;
            case 2:
                //Teknik
                lTyp.setText("Kraftkälla");
                txtTill.setVisible(true);
                txtTill.setText("");
                txtTill.requestFocus();
                break;
            case 3:
                //Kommunikation
                lTyp.setText("Överföringsteknik");
                txtTill.setVisible(true);
                txtTill.setText("");
                txtTill.requestFocus();
                break;
        }
    }//GEN-LAST:event_cbUtrustningActionPerformed

    private void txtTillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTillKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnRegistrera.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTillKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benämning;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbUtrustning;
    private javax.swing.JLabel jKorrekt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lTyp;
    private javax.swing.JLabel titel;
    private javax.swing.JTextField txtBenamning;
    private javax.swing.JTextField txtTill;
    // End of variables declaration//GEN-END:variables
}
