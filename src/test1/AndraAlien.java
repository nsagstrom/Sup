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
public class AndraAlien extends javax.swing.JFrame {

    private String id;

    /**
     * Creates new form AndraAlien
     */

    public AndraAlien() {
        initComponents();
        info();
        Metoder.laggTillPlats(cbPlats);
        Metoder.laggTillRas(cbRaser);
        Metoder.laggTillAgent(cbAnsvarigAgent);
        txtRasTill.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAllInfo = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        cbRaser = new javax.swing.JComboBox<>();
        txtDatum = new javax.swing.JTextField();
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
        btnUppdatera = new javax.swing.JButton();
        landrad = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);

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

        jLabel2.setText("Ange Namn på alien du vill ändra");

        txtNamn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamnKeyPressed(evt);
            }
        });

        cbRaser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Ras" }));
        cbRaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaserActionPerformed(evt);
            }
        });

        jLabel4.setText("Reg.datum");

        jLabel5.setText("Ras");

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Plats" }));

        jLabel6.setText("Plats");

        cbAnsvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Agent" }));

        jLabel7.setText("Agent");

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Lösenord");

        jLabel9.setText("Telefon");

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOK)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRasTill, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addComponent(landrad, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(btnUppdatera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void info() {

        ArrayList<HashMap<String, String>> allInfo;

        String fraga = "SELECT alien.Alien_ID, Ras, alien.Namn AS Namn ,Registreringsdatum,alien.Losenord,alien.Telefon,Benamning, Agent AS Agent , Antal FROM (\n"
                + "SELECT Alien_ID  , 'Worm' AS Ras, null AS antal FROM worm\n"
                + "UNION\n"
                + "SELECT Alien_ID  , 'Sqid' AS Ras, Antal_Armar AS Antal FROM squid\n"
                + "UNION\n"
                + "SELECT Alien_ID, 'Boglodite' AS Ras, Antal_Boogies AS Antal FROM boglodite\n"
                + "UNION\n"
                + "(SELECT Alien_ID, 'Annat' , null FROM alien\n"
                + "    WHERE Alien_ID NOT IN (SELECT Alien_ID AS id FROM alien\n"
                + "    WHERE Alien_ID  IN (SELECT id FROM\n"
                + "        (SELECT Alien_ID AS id  FROM squid\n"
                + "        UNION SELECT Alien_ID as id FROM worm\n"
                + "        UNION SELECT Alien_ID as id FROM boglodite) AS a)))) AS ras\n"
                + "JOIN alien on ras.alien_id = alien.alien_id\n"
                + "JOIN plats p on p.Plats_ID = alien.Plats\n"
                + "JOIN (SELECT Namn AS Agent, Agent_ID FROM agent) AS agent on alien.Ansvarig_Agent = agent.Agent_ID;";

        allInfo = SqlFragor.fragaRader(fraga);

        String rubrik = "Namn:"
                + "\t" + "Ras:" + "\t" + "Delar" + "\t" + "Reg datum:"
                + "\t" + "Telefon:" + "\t" + "Lösenord:" + "\t"
                + "Plats:" + "\t" + "Agent:" + "\n";

        txtAllInfo.append(rubrik);

        for (HashMap<String, String> info : allInfo) {
            txtAllInfo.append(info.get("Namn")
                    + "\t" + info.get("Ras") + "\t" + info.get("Antal") + "\t" + info.get("Registreringsdatum")
                    + "\t" + info.get("Telefon") + "\t" + info.get("Losenord") + "\t"
                    + info.get("Benamning") + "\t" + info.get("Agent") + "\n");
        }
    }

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        if (forstaSida.arAdmin()) {
            new agentAdminSida().setVisible(true);
            dispose();
        } else {
            new agentSida().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbRaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaserActionPerformed
        int i = cbRaser.getSelectedIndex();

        switch (i) {
            case 0:
                // Välj Ras
                txtRasTill.setVisible(false);
                lbRasInfo.setText("");
                break;
            case 1:
                // Boglodite
                txtRasTill.setVisible(true);
                lbRasInfo.setText("Antal boogies");
                break;
            case 2:
                // Squid
                txtRasTill.setVisible(true);
                lbRasInfo.setText("Antal armar");
                break;
            case 3:
                // Worm
                txtRasTill.setVisible(false);
                lbRasInfo.setText("");
                break;
            case 4:
                // Annat
                txtRasTill.setVisible(false);
                lbRasInfo.setText("");
            default:
                break;
        }
    }//GEN-LAST:event_cbRaserActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

//        if (ValideringsKlass.taltest(txtID)) {
        String sok = "SELECT alien.Alien_ID, Ras, alien.Namn AS Namn ,Registreringsdatum,alien.Losenord,alien.Telefon,Benamning, Agent AS Agent , Antal FROM (\n"
                + "SELECT Alien_ID  , 'Worm' AS Ras, null AS antal FROM worm\n"
                + "UNION\n"
                + "SELECT Alien_ID  , 'Sqid' AS Ras, Antal_Armar AS Antal FROM squid\n"
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
                + "WHERE alien.Namn = '" + txtNamn.getText() + "' ;";

        HashMap<String, String> uppgifter;
        uppgifter = SqlFragor.fragaRad(sok);

        id = uppgifter.get("Alien_ID");
        txtDatum.setText(uppgifter.get("Registreringsdatum"));
        txtLosen.setText(uppgifter.get("Losenord"));
        txtTele.setText(uppgifter.get("Telefon"));
        txtRasTill.setText(uppgifter.get("Antal"));
        cbAnsvarigAgent.setSelectedItem(uppgifter.get("Agent"));
        cbPlats.setSelectedItem(uppgifter.get("Benamning"));

        System.out.println(id);

        if (uppgifter.get("Ras").equalsIgnoreCase("Annat")) {
            cbRaser.setSelectedIndex(4);
        } else if (uppgifter.get("Ras").equalsIgnoreCase("Boglodite")) {
            cbRaser.setSelectedIndex(1);
        } else if (uppgifter.get("Ras").equalsIgnoreCase("Sqid")) {
            cbRaser.setSelectedIndex(2);
        } else if (uppgifter.get("Ras").equalsIgnoreCase("Worm")) {
            cbRaser.setSelectedIndex(3);
        }
//    }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        txtAllInfo.setText("");
        info();
    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (okUppgifter()) {
            andraGrund();
            andraRas();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNamnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnOK.doClick();
        }
    }//GEN-LAST:event_txtNamnKeyPressed

    private boolean okUppgifter() {
        boolean ok = true;

//        if (txtID.getText().isBlank()) {
//            ok = false;
//            JOptionPane.showMessageDialog(null, "Ange id");
//            txtID.requestFocus();
//        } else if (!ValideringsKlass.taltest(txtID)) {
//            txtID.requestFocus();
//        }  
        if (txtNamn.getText().isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Namn saknas");
            txtNamn.requestFocus();
        } else if (txtLosen.getText().isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord saknas");
            txtLosen.requestFocus();
        } else if (txtLosen.getText().length() > 6) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Lösenord får ej vara längre än sex tecken");
            txtLosen.requestFocus();
            txtLosen.selectAll();
        } else if (txtTele.getText().isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Telefonnummer saknas");
            txtTele.requestFocus();
        } else if (cbPlats.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj plats");
            cbPlats.requestFocus();
        } else if (cbRaser.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj ras");
            cbRaser.requestFocus();
        } else if (cbRaser.getSelectedIndex() == 1 || cbRaser.getSelectedIndex() == 2) {
            if (txtRasTill.getText().isBlank()) {
                ok = false;
                JOptionPane.showMessageDialog(null, "Ange antal");
            }
        } else if (cbAnsvarigAgent.getSelectedIndex() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Välj agent");
        } else if (txtDatum.getText().isBlank()) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Ange datum");
        }
        return ok;
    }

    private void andraGrund() {

        String platsID = SqlFragor.fragaSingel("SELECT Plats_ID FROM plats WHERE Benamning = '" + cbPlats.getSelectedItem() + "';");
        String agentID = SqlFragor.fragaSingel("SELECT Agent_ID FROM agent WHERE Namn = '" + cbAnsvarigAgent.getSelectedItem() + "';");

        String uppdatera = "UPDATE alien\n"
                + "SET  Registreringsdatum = '" + txtDatum.getText() + "', Losenord =  '" + txtLosen.getText() + "', Namn = '" + txtNamn.getText()
                + "', Telefon = '" + txtTele.getText() + "', Plats = " + platsID + ", Ansvarig_Agent = " + agentID + " WHERE alien.Namn = '" + txtNamn.getText() + "' ;";

        SqlFragor.uppdatera(uppdatera);
        landrad.setText("Ändring genomförd (Hoppas vi)");
    }

    private void andraRas() {

        int i = cbRaser.getSelectedIndex();
        String tabortB = "DELETE FROM boglodite WHERE Alien_ID = " + id + ";";
        String tabortS = "DELETE FROM squid WHERE Alien_ID = " + id + ";";
        String tabortW = "DELETE FROM worm WHERE Alien_ID = " + id + ";";

        String laggInB = "INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES (" + id + "," + txtRasTill.getText() + ");";
        String laggInS = "INSERT INTO squid (Alien_ID, Antal_Armar) VALUES (" + id + "," + txtRasTill.getText() + ");";
        String laggInW = "INSERT INTO worm (Alien_ID) VALUES (" + id + ");";

        switch (i) {
            case 1:
                // Boglodite
                SqlFragor.taBort(tabortB);
                SqlFragor.taBort(tabortS);
                SqlFragor.taBort(tabortW);
                SqlFragor.laggTill(laggInB);
                break;
            case 2:
                // Squid
                SqlFragor.taBort(tabortB);
                SqlFragor.taBort(tabortS);
                SqlFragor.taBort(tabortW);
                SqlFragor.laggTill(laggInS);
                break;
            case 3:
                // Worm
                SqlFragor.taBort(tabortB);
                SqlFragor.taBort(tabortS);
                SqlFragor.taBort(tabortW);
                SqlFragor.laggTill(laggInW);
                break;
            case 4:
                // Annat
                SqlFragor.taBort(tabortB);
                SqlFragor.taBort(tabortS);
                SqlFragor.taBort(tabortW);
            default:
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JComboBox<String> cbAnsvarigAgent;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JComboBox<String> cbRaser;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel landrad;
    private javax.swing.JLabel lbRasInfo;
    private javax.swing.JTextArea txtAllInfo;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtRasTill;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
