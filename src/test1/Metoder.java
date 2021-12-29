/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */
public class Metoder {

    private InfDB idb;

    public Metoder(InfDB idb) {
        this.idb = idb;
    }

    public void laggTillPlats(JComboBox cb) {
        String fraga = "SELECT Benamning FROM plats";

        ArrayList<String> allaPlatser;
        try {
            allaPlatser = idb.fetchColumn(fraga);

            for (String p : allaPlatser) {
                cb.addItem(p);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
    }

    public void laggTillRas(JComboBox cb) {

        cb.addItem("Boglodite");
        cb.addItem("Squid");
        cb.addItem("Worm");
        cb.addItem("Annat");
    }

    public void laggTillAgent(JComboBox cb) {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;
        try {
            allaAgenter = idb.fetchColumn(agentFraga);

            for (String a : allaAgenter) {
                cb.addItem(a);
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");

        }
    }

}
