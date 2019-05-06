package palindromo;

import javax.swing.JOptionPane;

public class Main {

    public String Convertir(String palabra, String alreves) {
        for (int i = palabra.length() - 1; i >= 0; i--) {
            alreves += palabra.charAt(i);
        }
        return alreves;

    }

    public static void main(String[] args) {
        Main m = new Main();
        String p, p1 = "", p2 = "", aux, aux1;
        p = JOptionPane.showInputDialog(null, "Ingrese una palabra");
        int eliminacion = 0, agregacion = 0;
        int total = eliminacion + agregacion;
        aux = p.substring(0, p.length() - 1);
        aux1 = p + p.charAt(0);
        if (p.equals(m.Convertir(p, p1))) {
            JOptionPane.showMessageDialog(null, p + " Sí es palindromo");
        } else {
            JOptionPane.showMessageDialog(null, p + "No es palindromo");
            if (p.length() == 2) {
                p = aux1;
            } else if (p.length() == 3) {
                aux += p.charAt(0);
                p = aux;
                eliminacion++;
                agregacion++;
            } else if (aux.equals(m.Convertir(aux, p1))) {
                p = aux;
                eliminacion++;
            } else if (aux1.equals(m.Convertir(aux1, p2))) {
                p = aux1;
                agregacion++;
            } else {
                p += aux;
                agregacion = aux1.length();
            }
        }
        total = agregacion + eliminacion;
        JOptionPane.showMessageDialog(null, "Palabra: " + p + "\nAgregaciones: " + agregacion + "\nEliminaciones: " + eliminacion + "\nTotal: " + total);

    }

}
