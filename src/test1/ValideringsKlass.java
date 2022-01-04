/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author isakw
 */
public class ValideringsKlass {

    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        if (rutaAttKolla.getText().isEmpty()) {
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }

    public static boolean isHelTal(JTextField rutaAttKolla) {
        boolean resultat = true;

        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);

        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Var god ange ett heltal!");
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }

    public static String datum() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String datum = dateFormat.format(date);
        return datum;
    }

    public static boolean taltest(JTextField taltest) {
        boolean arTal = false;
        String idid = taltest.getText();

        if (idid.matches("\\d+")) {
            arTal = true;

        } else {
            JOptionPane.showMessageDialog(null, "Måste vara tal");
            taltest.requestFocus();
        }
        return arTal;
    }

    public static boolean testLangd(JTextField namn) {
        boolean langdOk = false;
        String langd = namn.getText();

        if (langd.length() > 1) {
            langdOk = true;
        } else {
            JOptionPane.showMessageDialog(null, "Namn måste va större än en karaktär");
            namn.requestFocus();
        }

        return langdOk;
    }

    public static boolean testLoA(JComboBox anvandare, JPasswordField losen, JTextField anvandarnamn) {
        boolean arOk = false;

        String inLosen = new String(losen.getPassword());
        String inAnvandare = anvandarnamn.getText();

        String aFraga = "SELECT Namn FROM " + "'" + anvandare.getSelectedItem().toString().toLowerCase() + "'" + "WHERE Namn = " + "'" + inAnvandare + "'";
        String lFraga = "SELECT Namn FROM " + "'" + anvandare.getSelectedItem().toString().toLowerCase() + "'" + "WHERE Namn = " + "'" + inLosen + "'";

        String aSvar = SqlFragor.fragaSingel(aFraga);
        String alosen = SqlFragor.fragaSingel(lFraga);

        if (inAnvandare.equals(aSvar) && inLosen.equals(alosen) && !inLosen.isBlank() && !inAnvandare.isBlank()) {
            arOk = true;
        } else {
            JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
            anvandare.requestFocus();
        }

        return arOk;
    }
    


}
