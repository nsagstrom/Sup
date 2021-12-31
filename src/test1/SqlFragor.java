/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author nsags
 */

public class SqlFragor {

private static InfDB idb;

    public static void setDatabas(InfDB idb) {
        SqlFragor.idb = idb;

    }

    public static String fragaSingel(String fraga) {

         String svar = "";
        try {
             svar = idb.fetchSingle(fraga);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
        return svar;
    }

    public static ArrayList<HashMap<String, String>> fragaRader(String fraga) {

        ArrayList<HashMap<String, String>> svar = null;
        try {
            svar = idb.fetchRows(fraga);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "JÄVLA PAPPSKALLE");
        }
        return svar;

    }
}