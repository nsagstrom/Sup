/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

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

}
