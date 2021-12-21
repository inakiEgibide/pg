package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] billetes = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        //int[] valores = new int[billetes.length];

        //inicializar entradas
        double importe = Double.parseDouble(JOptionPane.showInputDialog(null, "importe"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog(null, "pago"));

        //iteracion
        double vueltas = importe - pago;
        String recibo = "";
        for (int i = 0; i < billetes.length; i++) {
            double billete = billetes[i];
            int cantidad = 0;

            while (vueltas >= billete) {
                cantidad ++;
                vueltas = vueltas - billete;
            }

            recibo += "Billete de " + billete + ": " + cantidad + "\n";
        }

        //salidas
        JOptionPane.showMessageDialog(null, recibo);
    }
}
