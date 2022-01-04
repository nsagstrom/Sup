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

    public static boolean textFaltHarVarde(JTextField ruta) {
        boolean rutaHarVarde = true;
        if (ruta.getText().isEmpty()) {
            rutaHarVarde = false;
            ruta.requestFocus();
        }
        return rutaHarVarde;
    }
    
    public static boolean stringHarVarde(String instring){
        boolean stringFinns = true;
        if(instring.isEmpty()){
            stringFinns = false;
        }
        return stringFinns;
    }

    public static String datum() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String datum = dateFormat.format(date);
        return datum;
    }

    public static boolean taltest(JTextField taltest) {
        boolean arTal = true;
        String idid = taltest.getText();

        if (!idid.matches("\\d+")) {
            arTal = false;

        } else {
            taltest.requestFocus();
        }
        return arTal;
    }

    public static boolean testLangdLosen(JTextField losen) {
        boolean langdOk = true;
        String langd = losen.getText();
        if (langd.length() > 6) {
            langdOk = false;
        } else {
            losen.requestFocus();
        }
        return langdOk;
    }
    
    public static boolean testLosenStrang(String losen){
        boolean langdOk = true;
        if(losen.length() < 7){
            langdOk = false;
        }
        return langdOk;
    }
}
