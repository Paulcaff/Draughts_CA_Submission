//Welcome.java
/*This program*/

import javax.swing.*;


public class Welcome {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog( "Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Welcome "+name+ " to year 2!!");
    }
}
