/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author isakw
 */
public class ValideringsKlass {

    //Validera så att ett TextField inte är tomt.
    public static boolean textFaltHarVarde(JTextField ruta) {
        boolean rutaHarVarde = true;
        if (ruta.getText().isEmpty()) {
            rutaHarVarde = false;
            ruta.requestFocus();
        }
        return rutaHarVarde;
    }

    //Validera så sträng inte är tom.
    public static boolean stringHarVarde(String instring) {
        boolean stringFinns = true;
        if (instring.isEmpty()) {
            stringFinns = false;
        }
        return stringFinns;
    }

    //Validera så att ett TextField är ett tal.
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

    //Validera ett TextField så att inputen inte är längre än 6 tecken, lösen.
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

    //Validera en sträng så att den inte är längre än 6 tecken, lösen.
    public static boolean testLosenStrang(String losen) {
        boolean langdOk = true;
        if (losen.length() > 6) {
            langdOk = false;
        }
        return langdOk;
    }
    
    //Validera dubletter av namn hos agenter.
    public static boolean dublettAgentNamn(JTextField namn) {
        int i = 0;
        boolean ejDublett = true;

        String nyNamn = namn.getText().toLowerCase();
        ArrayList<HashMap<String, String>> allaNuvarandeNamn = null;
        String namnCheck = "";

        allaNuvarandeNamn = SqlFragor.fragaRader("SELECT Namn FROM agent");

        for (HashMap<String, String> a : allaNuvarandeNamn) {
            namnCheck = a.get("Namn");
            String namnCheck2 = namnCheck.toLowerCase();

            if (namnCheck2.equals(nyNamn)) {
                ejDublett = false;
            }
        }
        return ejDublett;
    }
    
    //Validera dubletter av namn hos alien.
    public static boolean dublettAlienNamn(JTextField namn) {
        boolean ejDublett = true;
        int i = 0;

        String nyNamn = namn.getText().toLowerCase();
        ArrayList<HashMap<String, String>> allaNuvarandeNamn = null;
        String namnCheck = "";

        allaNuvarandeNamn = SqlFragor.fragaRader("SELECT Namn FROM alien");

        for (HashMap<String, String> a : allaNuvarandeNamn) {
            namnCheck = a.get("Namn");
            String namnCheck2 = namnCheck.toLowerCase();

            if (namnCheck2.equals(nyNamn)) {
                ejDublett = false;
            }
        }

        return ejDublett;
    }
    
    //Validera så att positionen på ComboBox inte är noll.
    public static boolean testaIndexPos(JComboBox position){
        boolean indexOk = true;
        
        if(position.getSelectedIndex() == 0){
            indexOk = false;
            }
        
        return indexOk;
    }
    
    //Validera så att telefonnumret innehåller korrekta tecken
    public static boolean testaTeleNmr(JTextField teleNmr){
        boolean nmrOk = true;
        String nmr = teleNmr.getText();
        
        if(!nmr.matches("[0-9-+]+")){
            nmrOk = false;
        }
        
        return nmrOk;
    }
    
    //Validera så att telefonnumret innehåller korrekta tecken, string
    public static boolean testaTeleNmrString(String teleNmr){
        boolean nmrOk = true;
        
        if(!teleNmr.matches("[0-9-+]+")){
            nmrOk = false;
        }
        
        return nmrOk;
    }
    
        public static boolean kollaDatumCheck(String datum) {
        boolean resultat = false;

        if (datum.matches("\\d{4}-\\d{2}-\\d{2}")) {
            resultat = true;
        } else {
            JOptionPane.showMessageDialog(null, "Fel datumformat, prova igen enligt 'YYYY-MM-DD'");
        }

        return resultat;
    }
}