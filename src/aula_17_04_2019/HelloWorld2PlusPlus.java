package aula_17_04_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author Rômulo
 */
public class HelloWorld2PlusPlus {

    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("Nome?");
        JOptionPane.showMessageDialog(null, "Hello " + n);
        //String[] nomes = new String[10];
    }
}
