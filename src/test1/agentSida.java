/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class agentSida extends javax.swing.JFrame {


    String namn;


    /**
     * Creates new form agentSida
     */
    public agentSida() {

//        sql = new SqlFragor(idb);
        initComponents();
        laggTill();
        namn = forstaSida.aNamn();
        lblValkommen.setText("Välkommen " + namn);
        listaAllUtrustning();
        toppLista();
         
    }

    public void laggTill() {

        cbKontrollAvAlien.addItem("Välj");
        cbKontrollAvAlien.addItem("Alla Alier per ras");
        cbKontrollAvAlien.addItem("Alla Alier per plats");
        cbKontrollAvAlien.addItem("Alla Alier per datum");

        cbAtgarder.addItem("Välj");
        cbAtgarder.addItem("Lägg till vapen");
        cbAtgarder.addItem("Lägg till alien");
        cbAtgarder.addItem("Vem är chef");
        cbAtgarder.addItem("Ändra alien");

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
        cbKontrollAvAlien = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbAtgarder = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfUtrustning = new javax.swing.JTextArea();
        txtTopp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

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

        cbKontrollAvAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKontrollAvAlienActionPerformed(evt);
            }
        });

        jLabel2.setText("Kontroll av alien ");

        cbAtgarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtgarderActionPerformed(evt);
            }
        });

        jLabel3.setText("Åtgärder");

        txtfUtrustning.setEditable(false);
        txtfUtrustning.setColumns(1);
        txtfUtrustning.setRows(5);
        txtfUtrustning.setToolTipText("");
        jScrollPane1.setViewportView(txtfUtrustning);

        txtTopp.setEditable(false);
        txtTopp.setColumns(2);
        txtTopp.setRows(3);
        txtTopp.setTabSize(3);
        txtTopp.setToolTipText("");
        txtTopp.setAutoscrolls(false);
        txtTopp.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Agenter som ansvarar över flest aliens");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAtgarder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbKontrollAvAlien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblValkommen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTopp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLoggaUt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNylosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValkommen)
                    .addComponent(btnLoggaUt))
                .addGap(18, 18, 18)
                .addComponent(btnNylosen)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKontrollAvAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtgarder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTopp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void toppLista(){

        ArrayList<HashMap<String, String>> topp;

        String fraga = "SELECT a.Namn , COUNT(Ansvarig_Agent) AS Antal FROM alien\n"
                + "JOIN agent a on a.Agent_ID = alien.Ansvarig_Agent\n"
                + "GROUP BY Ansvarig_Agent\n"
                + "ORDER BY COUNT(Ansvarig_Agent) DESC;";
        topp = SqlFragor.fragaRader(fraga);

        txtTopp.append("Namn" + "   " + "Antal" + "\n");
        for (HashMap<String, String> t : topp) {
            txtTopp.append(t.get("Namn") + "   " + t.get("Antal") + "\n");

        }

    }
    
    
    private void listaAllUtrustning(){
        
        ArrayList<HashMap<String, String>> allUtrustning;

            String id = SqlFragor.fragaSingel("SELECT Agent_id FROM agent WHERE Namn = '" + namn + "'");

            String utFraga = "SELECT Benamning FROM utrustning\n"
                    + "join innehar_utrustning iu on utrustning.Utrustnings_ID = iu.Utrustnings_ID WHERE Agent_ID = " + id;
            allUtrustning = SqlFragor.fragaRader(utFraga);

            for (HashMap<String, String> utR : allUtrustning) {

                txtfUtrustning.append(utR.get("Benamning") + "\n");
            
         
            }
            
            

    }
    
    
//         private void listaAllUtrustning() {
//
//        String id = sql.fragaSingel("SELECT Agent_id FROM agent WHERE Namn = '" + namn + "';");
//        String utFraga = "SELECT Benamning FROM utrustning join innehar_utrustning iu on utrustning.Utrustnings_ID = iu.Utrustnings_ID WHERE Agent_ID = " + id + ";";
//
//        ArrayList<HashMap<String, String>> allUtrustning = sql.fragaRader(utFraga);
//
//        for (HashMap<String, String> utR : allUtrustning) {
//            txtfUtrustning.append(utR.get("Benamning") + "\n");
//        }
//    }
    
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new forstaSida().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnNylosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNylosenActionPerformed
        new NyttLosen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNylosenActionPerformed

    private void cbKontrollAvAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKontrollAvAlienActionPerformed
        // Välj inloggningstyp
        int i = cbKontrollAvAlien.getSelectedIndex();


        switch (i) {
            case 1:
                new alienAvRas().setVisible(true);
                dispose();
                break;
            case 2:
                new allaAlienPlats().setVisible(true);
                dispose();
                break;
            case 3:
                new alienDatum().setVisible(true);
                dispose();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbKontrollAvAlienActionPerformed

    private void cbAtgarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtgarderActionPerformed
        int i = cbAtgarder.getSelectedIndex();

        switch (i) {
            case 1:
                new addUtrustning().setVisible(true);
                dispose();
                break;
            case 2:
                new nyRegistreraAlien().setVisible(true);
                dispose();
                break;
            case 3:
                new VemOmradesChef().setVisible(true);
                dispose();
                break;
            case 4:
                new AndraAlien().setVisible(true);
                dispose();
                break;
        }

//        if (i == 0) {
//
//        }
//        if (i == 1) {
//            new addUtrustning(idb).setVisible(true);
//            dispose();
//        }
//        if (i == 2) {
//            new nyRegistreraAlien(idb).setVisible(true);
//            dispose();
//        }
//        if (i == 3 ){
//            new VemOmradesChef(idb).setVisible(true);
//            dispose();
//        }
        
    }//GEN-LAST:event_cbAtgarderActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNylosen;
    private javax.swing.JComboBox<String> cbAtgarder;
    private javax.swing.JComboBox<String> cbKontrollAvAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextArea txtTopp;
    private javax.swing.JTextArea txtfUtrustning;
    // End of variables declaration//GEN-END:variables
}
