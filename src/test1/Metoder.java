/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.ArrayList;
import javax.swing.JComboBox;


/**
 *
 * @author nsags
 */
public class Metoder {



    public static void laggTillPlats(JComboBox cb) {
        String fraga = "SELECT Benamning FROM plats";

        ArrayList<String> allaPlatser;

            allaPlatser = SqlFragor.fragaKolumn(fraga);

            for (String p : allaPlatser) {
                cb.addItem(p);
            }

    }

    public static void laggTillRas(JComboBox cb) {

        cb.addItem("Boglodite");
        cb.addItem("Squid");
        cb.addItem("Worm");
        cb.addItem("Annat");
    }

    public static void laggTillAgent(JComboBox cb) {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;

            allaAgenter = SqlFragor.fragaKolumn(agentFraga);

            for (String a : allaAgenter) {
                cb.addItem(a);
            }
    }
    
     public static void laggTillOmrade(JComboBox cb) {
        String fraga = "SELECT Benamning FROM omrade";

        ArrayList<String> allaPlatser;

            allaPlatser = SqlFragor.fragaKolumn(fraga);

            for (String p : allaPlatser) {
                cb.addItem(p);
            }
        
    }

}
