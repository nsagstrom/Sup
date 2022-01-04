/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

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
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrerabutton = new javax.swing.JButton();
        jTutrustning = new javax.swing.JTextField();
        titel = new javax.swing.JLabel();
        benämning = new javax.swing.JLabel();
        jKorrekt = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrerabutton.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        registrerabutton.setText("Registrera");
        registrerabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrerabuttonActionPerformed(evt);
            }
        });

        jTutrustning.setColumns(4);
        jTutrustning.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTutrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTutrustningActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(registrerabutton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(benämning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTutrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titel)
                    .addComponent(btnTillbaka))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTutrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(benämning)
                    .addComponent(jKorrekt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrerabutton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrerabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrerabuttonActionPerformed
        // TODO add your handling code here:

        String nyUtrustning = jTutrustning.getText();

        String nyID = SqlFragor.nyID("utrustning", "Utrustnings_ID");

        String fraga = "insert into utrustning(Utrustnings_ID, Benamning) VALUES(" + nyID + "," + "'" + nyUtrustning + "')";
        SqlFragor.laggTill(fraga);

        jKorrekt.setText(nyUtrustning + " registrerad!");
    }//GEN-LAST:event_registrerabuttonActionPerformed

    private void jTutrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTutrustningActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTutrustningActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benämning;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jKorrekt;
    private javax.swing.JTextField jTutrustning;
    private javax.swing.JButton registrerabutton;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
