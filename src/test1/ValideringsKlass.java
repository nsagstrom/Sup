/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author isakw
 */
public class ValideringsKlass {

    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Inmatningsrutan är tom!");
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
            JOptionPane.showMessageDialog(null, "Måste vara tal valid");
            taltest.requestFocus();
        }
        return arTal;

    }
}
