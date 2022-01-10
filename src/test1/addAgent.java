/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author nsags
 */
public class AddAgent extends javax.swing.JFrame {

    private String datum;
    private String admin;
    private String losen;
    

    /**
     * Creates new form addAgent
     */
    public AddAgent() {
        initComponents();
        datum = Metoder.datum();
        admin = "N";
        Metoder.laggTillOmrade(cbOmrade);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        pwLosen = new javax.swing.JPasswordField();
        cbVisaLosen = new javax.swing.JCheckBox();
        cbOmrade = new javax.swing.JComboBox<>();
        boxAdmin = new javax.swing.JCheckBox();
        btnOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lReggad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel1.setText("Lägg till agent ");

        txtNamn.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        txtTelefon.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        pwLosen.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        cbVisaLosen.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        cbVisaLosen.setText("Visa lösenord");
        cbVisaLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaLosenActionPerformed(evt);
            }
        });

        cbOmrade.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        cbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj område" }));
        cbOmrade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbOmradeKeyPressed(evt);
            }
        });

        boxAdmin.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        boxAdmin.setText("Är admin");
        boxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAdminActionPerformed(evt);
            }
        });
        boxAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxAdminKeyPressed(evt);
            }
        });

        btnOK.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel2.setText("Namn");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setText("Telefonummer");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel4.setText("Lösenord");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setText("Område");

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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(boxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnOK))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbVisaLosen)
                                    .addComponent(jLabel4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(70, 70, 70))))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lReggad, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnTillbaka))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVisaLosen)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAdmin)
                    .addComponent(btnOK))
                .addGap(33, 33, 33)
                .addComponent(lReggad)
                .addGap(0, 89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void laggTillAgent() {
            //Kallar på metod från SQL-Fragor klassen. Skall lägga till en agent och dess namn, telefon samt område, lösenord.
        String fragaID = SqlFragor.nyID("Agent", "Agent_ID");
        String namn = txtNamn.getText();
        String telefon = txtTelefon.getText();
        String omrode = SqlFragor.fragaSingel("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + cbOmrade.getSelectedItem().toString() + "';");
        losen = new String(pwLosen.getPassword());
        
        //Datum när agent registreras samt om den är admin eller ej.
        String sqlAgent = "INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) \n"
                + "VALUES (" + fragaID + ",'" + namn + "','" + telefon + "','" + datum + "','" + admin + "','" + losen + "'," + omrode + " );";

        String sqlFaltAgent = "INSERT INTO faltagent VALUES (" + fragaID + ");";

        //Kallar på laggTill metoden från SQL-Fragor klassen 
        SqlFragor.laggTill(sqlAgent);
        SqlFragor.laggTill(sqlFaltAgent);
        lReggad.setText("Agenten " + namn + " är registrerad!");
    }

    private boolean okUppgifter() {
        boolean ok = true;

        String alienLosenord2 = new String(pwLosen.getPassword());

        //If-statements som antingen uppfylls eller fortsätter till nästa if-sats.
        
        if (!ValideringsKlass.textFaltHarVarde(txtNamn)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Namn saknas");
            txtNamn.requestFocus();
        } else if (!ValideringsKlass.dublettAgentNamn(txtNamn)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Namn används redan av annan agent!");
            txtNamn.requestFocus();
        } else if (!ValideringsKlass.textFaltHarVarde(txtTelefon)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Telefonnummer saknas");
            txtTelefon.requestFocus();
        } else if(!ValideringsKlass.testaTeleNmr(txtTelefon)){
            ok = false;
            JOptionPane.showMessageDialog(null, "Telfonnummer inte angivet korrekt");
            txtTelefon.requestFocus();
        } else if (!ValideringsKlass.stringHarVarde(alienLosenord2)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord saknas");
            pwLosen.requestFocus();
        } else if (!ValideringsKlass.testLosenStrang(alienLosenord2)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord får ej vara längre än sex tecken");
            pwLosen.requestFocus();
        } else if (cbOmrade.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj plats");
            cbOmrade.requestFocus();
        }
        return ok;
    }
    
    private void boxAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxAdminKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnOK.doClick();
        }
    }//GEN-LAST:event_boxAdminKeyPressed

    private void cbOmradeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbOmradeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnOK.doClick();
        }
    }//GEN-LAST:event_cbOmradeKeyPressed

    private void cbVisaLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaLosenActionPerformed
        if (cbVisaLosen.isSelected()) {
            pwLosen.setEchoChar((char) 0);
        } else {
            pwLosen.setEchoChar('*');
        }
    }//GEN-LAST:event_cbVisaLosenActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (okUppgifter()) {
            laggTillAgent();
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void boxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAdminActionPerformed
        if (boxAdmin.isSelected()) {
            admin = "J";
        } else {
            admin = "N";
        }    }//GEN-LAST:event_boxAdminActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AgentAdminSida().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxAdmin;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JCheckBox cbVisaLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lReggad;
    private javax.swing.JPasswordField pwLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
