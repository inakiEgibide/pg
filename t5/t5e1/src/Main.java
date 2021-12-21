import propias.Circunferencia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circunferencia obejtoUno = new Circunferencia(Float.parseFloat(JOptionPane.showInputDialog(null,"radio")));
        JOptionPane.showMessageDialog(null, "area: " + obejtoUno.area());
        JOptionPane.showMessageDialog(null, "volumen: " + obejtoUno.volumen());
    }
}
