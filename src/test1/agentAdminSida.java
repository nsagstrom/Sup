/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.tree.TreePath;

/**
 *
 * @author nsags
 */
public class agentAdminSida extends javax.swing.JFrame {

    String namn;
    private String typ;
    private String fonster;

    /**
     * Creates new form agentAdminSida
     */
    public agentAdminSida() {
        initComponents();
        namn = forstaSida.aNamn();
        lblValkommen.setText("Välkommen " + namn);
        listaAllUtrustning();
        for (int i = 0; i < jTree1.getRowCount(); i++) {
            jTree1.expandRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        lblValkommen = new javax.swing.JLabel();
        btnLoggaUt = new javax.swing.JButton();
        btnNylosen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfUtrustning = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        lblValkommen.setText("jLabel1");

        btnLoggaUt.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnNylosen.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnNylosen.setText("Byt lösenord");
        btnNylosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNylosenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setText("Inloggad som administratör");

        txtfUtrustning.setEditable(false);
        txtfUtrustning.setColumns(1);
        txtfUtrustning.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        txtfUtrustning.setRows(5);
        jScrollPane1.setViewportView(txtfUtrustning);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setText("Utcheckad utustning");

        jTree1.setBorder(null);
        jTree1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Lägg till:");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alien");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Agent");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ändra:");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alien");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Agent");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Chef");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ta bort:");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alien");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Agent");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Utrustning");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Information:");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Agent");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setToolTipText("");
        jTree1.setRootVisible(false);
        jTree1.setShowsRootHandles(true);
        jTree1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTree1ComponentAdded(evt);
            }
        });
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValkommen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNylosen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLoggaUt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValkommen)
                    .addComponent(btnLoggaUt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnNylosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAllUtrustning() {

        String id = SqlFragor.fragaSingel("SELECT Agent_id FROM agent WHERE Namn = '" + namn + "';");
        String utFraga = "SELECT Benamning FROM utrustning join innehar_utrustning iu on utrustning.Utrustnings_ID = iu.Utrustnings_ID WHERE Agent_ID = " + id + ";";

        ArrayList<HashMap<String, String>> allUtrustning = SqlFragor.fragaRader(utFraga);

        for (HashMap<String, String> utR : allUtrustning) {
            txtfUtrustning.append(utR.get("Benamning") + "\n");
        }
    }

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        new forstaSida().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnNylosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNylosenActionPerformed
        new NyttLosen().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNylosenActionPerformed

    private void jTree1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTree1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTree1ComponentAdded

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked

        TreePath aa = jTree1.getSelectionPath();
        if (aa != null) {

            String bb = aa.toString();
            String string = bb.replaceAll("[\\[\\](){}]", "");
            String[] parts = string.split(",");

            if (parts.length > 2) {

                //                String part1 = parts[0]; // root
                String part2 = parts[1]; // parent
                String part3 = parts[2]; // leaf

                typ = part2.trim();
                fonster = part3.trim();

                System.out.println(typ);
                System.out.println(fonster);

                if (typ.equals("Lägg till:")) {
                    switch (fonster) {
                        case "Alien":
                            new nyRegistreraAlien().setVisible(true);
                            dispose();
                            break;
                        case "Agent":
                            new addAgent().setVisible(true);
                            dispose();
                            break;
                        case "Utrustning":
                            new addUtrustning().setVisible(true);
                            dispose();
                            break;
                        default:
                            break;
                    }
                }
                if (typ.equals("Ändra:")) {
                    switch (fonster) {
                        case "Alien":
                            new AndraAlien().setVisible(true);
                            dispose();
                            break;
                        case "Agent":
                            new AndraAgent().setVisible(true);
                            dispose();
                            break;
                        case "Chef":
                            new AndraChef().setVisible(true);
                            dispose();
                            break;
                        default:
                            break;
                    }
                }
                if (typ.equals("Ta bort:")) {
                    switch (fonster) {
                        case "Alien":
                            new TaBortAlien().setVisible(true);
                            dispose();
                            break;
                        case "Agent":
                            new TaBortAgent().setVisible(true);
                            dispose();
                            break;
                        case "Utrustning":
                            new TaBortUtrustning().setVisible(true);
                            dispose();
                            break;
                        default:
                            break;
                    }
                }
                if (typ.equals("Sök upp:")) {
                    switch (fonster) {
                        case "Alien per ras":
                            new alienAvRas().setVisible(true);
                            dispose();
                            break;
                        case "Registreringsdatum":
                            new alienDatum().setVisible(true);
                            dispose();
                            break;
                        case "Plats":
                            new allaAlienPlats().setVisible(true);
                            dispose();
                            break;
                        default:
                            break;
                    }
                }
                if (typ.equals("Information:")) {
                    switch (fonster) {
                        case "Alien":
                            new sökAllinfoAlien().setVisible(true);
                            dispose();
                            break;
                        case "Agent":
                            new AllInfoEnAgent().setVisible(true);
                            dispose();
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }//GEN-LAST:event_jTree1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnNylosen;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextArea txtfUtrustning;
    // End of variables declaration//GEN-END:variables
}
