package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String menu = "\n opcion 1 - suma" +
                "\n opcion 2 - resta";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "elige una ocion: " + menu));

        switch (opcion) {
            case 1:
                int nuermo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un nuemoro uno"));
                int nuermo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un nuemoro dos"));
                int resultado = suma(nuermo1, nuermo2);
                JOptionPane.showMessageDialog(null, resultado);
            case 2:
            break;
        }
    }

    public static int suma(int nuermo1, int numero2) {
        return nuermo1 + numero2;
    }
}
