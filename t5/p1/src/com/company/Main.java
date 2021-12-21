package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    //arraylist
    static ArrayList<Float> listaNumeros = new ArrayList<Float>();

    public static void main(String[] args) {
        //rellenar arraylist
        do {
            listaNumeros.add(Float.parseFloat(JOptionPane.showInputDialog(null, "introduce un nunmero")));
        } while (JOptionPane.showConfirmDialog(null, "quires continuar?") == 0);

        //menu
        String menu = "\n 1 - valor maximo \n"
                + "2 - buscar un numero \n"
                + "3 - borrar un numero \n"
                + "4 - convertir en array \n"
                + "5 - mostrar numero de elemntos \n"
                + "6 - agregar nuevo elemento al final \n"
                + "7 - agregar nuevo elemento \n"
                + "8 - borrar un elemento \n"
                + "9 - calcular suma y media de los valores \n"
                + "10 - finalizar";
        int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "elige una opcion:" + menu));

        switch (opcionMenu) {
            case 1:
                opcionUno();
            case 2:
                opcionDos();
            case 3:
                opcionTres();
            break;
        }
    }

    //1 - valor maximo
    public static void opcionUno() {
        float valorMaximo = Collections.max(listaNumeros);
        JOptionPane.showMessageDialog(null, "valor maximo = " + valorMaximo);
    }

    //2 - buscar un numero
    public static void opcionDos() {
        float numeroBuscado = Float.parseFloat(JOptionPane.showInputDialog(null, "que numero quieres buscar"));
        if (listaNumeros.contains(numeroBuscado)) {
            JOptionPane.showMessageDialog(null, "existe");
        } else {
            JOptionPane.showMessageDialog(null, "no existe");
        }
    }

    //3 - borrar un numero
    public static void opcionTres() {
        float numeroBorrar = Float.parseFloat(JOptionPane.showInputDialog(null, "que numeor quieres borrar"));
        if (listaNumeros.contains(numeroBorrar)) {
            listaNumeros.remove(numeroBorrar);
            JOptionPane.showMessageDialog(null, "numero borrado");
        } else {
            JOptionPane.showMessageDialog(null, "no existe");
        }
    }
}
