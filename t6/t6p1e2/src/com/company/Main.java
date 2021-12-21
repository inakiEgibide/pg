package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Alumno> listaAlumno = new ArrayList<>();

        boolean continuar = true;
        do {
            String codigo = JOptionPane.showInputDialog(null, "codigo");
            String nombre = JOptionPane.showInputDialog(null, "nombre");
            String domicilio = JOptionPane.showInputDialog(null, "domicilio");
            String telefono = JOptionPane.showInputDialog(null, "telefono");

            //creacion y declaracion del objeto
            Alumno objetoAlumno = new Alumno(codigo, nombre, domicilio, telefono);

            //adicion al array
            listaAlumno.add(objetoAlumno);
        } while (JOptionPane.showConfirmDialog(null, "continuar?") == 0);
    }
}
