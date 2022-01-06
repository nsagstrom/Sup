/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import java.util.HashMap;
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

    public static boolean stringHarVarde(String instring) {
        boolean stringFinns = true;
        if (instring.isEmpty()) {
            stringFinns = false;
        }
        return stringFinns;
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

    public static boolean testLosenStrang(String losen) {
        boolean langdOk = true;
        if (losen.length() > 6) {
            langdOk = false;
        }
        return langdOk;
    }

    public static boolean dublettAgentNamn(JTextField namn) {
        int i = 0;
        boolean ejDublett = true;

        String nyNamn = namn.getText();
        ArrayList<HashMap<String, String>> allaNuvarandeNamn = null;
        String namnCheck = "";

        allaNuvarandeNamn = SqlFragor.fragaRader("SELECT Namn FROM agent");

        for (HashMap<String, String> a : allaNuvarandeNamn) {
            namnCheck = a.get("Namn");

            if (namnCheck.equals(nyNamn)) {
                ejDublett = false;
            }
        }
        System.out.println(namnCheck);
        return ejDublett;
    }

    public static boolean dublettAlienNamn(JTextField namn) {
        boolean ejDublett = true;
        int i = 0;

        String nyNamn = namn.getText();
        ArrayList<HashMap<String, String>> allaNuvarandeNamn = null;
        String namnCheck = "";

        allaNuvarandeNamn = SqlFragor.fragaRader("SELECT Namn FROM alien");

        for (HashMap<String, String> a : allaNuvarandeNamn) {
            namnCheck = a.get("Namn");

            if (namnCheck.equals(nyNamn)) {
                ejDublett = false;
            }
        }

        return ejDublett;
    }
}
