package customizer;

import javax.swing.*;

public class CustomizerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PersonBean Customizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PersonBean person = new PersonBean();
        PersonBeanCustomizer customizer = new PersonBeanCustomizer();
        customizer.setObject(person);

        frame.getContentPane().add(customizer);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
