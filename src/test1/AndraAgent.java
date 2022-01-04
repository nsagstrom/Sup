/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author nsags
 */
public class AndraAgent extends javax.swing.JFrame {

    private String admin;

    /**
     * Creates new form AndraAgent
     */
    public AndraAgent() {
        initComponents();
        info();
        Metoder.laggTillOmrade(cbOmrade);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOK = new javax.swing.JButton();
        landrad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbOmrade = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtLosen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAllInfo = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JButton();
        checkAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setText("Ange ID på agenten du vill ändra");

        jLabel3.setText("Namn");

        jLabel4.setText("Anställ datum");

        cbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Område" }));

        jLabel6.setText("Plats");

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Lösenord");

        txtAllInfo.setEditable(false);
        txtAllInfo.setColumns(20);
        txtAllInfo.setRows(5);
        txtAllInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAllInfo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAllInfo.setEnabled(false);
        txtAllInfo.setSelectionColor(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(txtAllInfo);

        jLabel9.setText("Telefon");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        checkAdmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUppdatera)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(txtNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(txtID))
                            .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOK)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(240, 240, 240))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkAdmin)
                                .addGap(255, 255, 255))))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(landrad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                .addGap(30, 30, 30)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkAdmin))))
                .addGap(18, 18, 18)
                .addComponent(landrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(btnUppdatera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        if (ValideringsKlass.taltest(txtID)) {
            String sok = "SELECT Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Benamning FROM agent\n"
                    + "JOIN omrade o on agent.Omrade = o.Omrades_ID\n"
                    + "WHERE Agent_ID = " + txtID.getText() + " ;";

            HashMap<String, String> uppgifter;
            uppgifter = SqlFragor.fragaRad(sok);

            txtNamn.setText(uppgifter.get("Namn"));
            txtDatum.setText(uppgifter.get("Anstallningsdatum"));
            txtLosen.setText(uppgifter.get("Losenord"));
            txtTele.setText(uppgifter.get("Telefon"));
            cbOmrade.setSelectedItem(uppgifter.get("Benamning"));

            if (uppgifter.get("Administrator").equals("J")) {
                checkAdmin.setSelected(true);
                admin = "J";
            } else {
                checkAdmin.setSelected(false);
                admin = "N";
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void info() {

        ArrayList<HashMap<String, String>> allInfo;
        String fraga = "SELECT Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Benamning FROM agent\n"
                + "JOIN omrade o on agent.Omrade = o.Omrades_ID ORDER BY Agent_ID;";

        allInfo = SqlFragor.fragaRader(fraga);

        String rubrik = "Agent ID:"
                + "\t" + "Namn:"
                + "\t" + "Telefon:"
                + "\t" + "Anst datum:"
                + "\t" + "Admin:"
                + "\t" + "Lösenord:"
                + "\t" + "Område:" + "\n";

        txtAllInfo.append(rubrik);

        for (HashMap<String, String> info : allInfo) {
            txtAllInfo.append(info.get("Agent_ID")
                    + "\t" + info.get("Namn")
                    + "\t" + info.get("Telefon")
                    + "\t" + info.get("Anstallningsdatum")
                    + "\t" + info.get("Administrator")
                    + "\t" + info.get("Losenord")
                    + "\t" + info.get("Benamning") + "\n");
        }
    }

    private boolean okUppgifter() {
        boolean ok = true;

        if (!ValideringsKlass.textFaltHarVarde(txtID)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Ange ID");
            txtID.requestFocus();
        } else if (!ValideringsKlass.taltest(txtID)) {
            JOptionPane.showMessageDialog(null, "Ange korrekt ID");
            txtID.requestFocus();
        } else if (!ValideringsKlass.textFaltHarVarde(txtNamn)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Namn saknas");
            txtNamn.requestFocus();
        } else if (!ValideringsKlass.textFaltHarVarde(txtLosen)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord saknas");
            txtLosen.requestFocus();
        } else if (!ValideringsKlass.testLangdLosen(txtLosen)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord får ej vara längre än sex tecken");
            txtLosen.requestFocus();
            txtLosen.selectAll();
        } else if (!ValideringsKlass.textFaltHarVarde(txtTele)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Telefonnummer saknas");
            txtTele.requestFocus();
        } else if (cbOmrade.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj område");
            cbOmrade.requestFocus();
        } else if (!ValideringsKlass.textFaltHarVarde(txtDatum)) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Ange datum");
        }
        return ok;
    }

    private void andraGrund() {

        String omradeID = SqlFragor.fragaSingel("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + cbOmrade.getSelectedItem() + "';");

        String uppdatera = "UPDATE agent\n"
                + "SET Anstallningsdatum = '" + txtDatum.getText() + "', Losenord =  '" + txtLosen.getText() + "', Namn = '" + txtNamn.getText()
                + "', Telefon = '" + txtTele.getText() + "', Omrade = " + omradeID + ", Administrator = '" + admin + "' WHERE Agent_ID = " + txtID.getText() + ";";

        SqlFragor.uppdatera(uppdatera);

        landrad.setText("Ändring genomförd (Hoppas vi)");
    }


    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnOK.doClick();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (okUppgifter()) {
            andraGrund();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        txtAllInfo.setText("");
        info();
    }//GEN-LAST:event_btnUppdateraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JCheckBox checkAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel landrad;
    private javax.swing.JTextArea txtAllInfo;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
