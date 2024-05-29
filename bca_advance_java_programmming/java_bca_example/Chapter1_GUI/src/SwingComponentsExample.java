import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentsExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add a label
        JLabel label = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);

        // Add a text field
        JTextField textField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(textField, gbc);

        // Add a text area
        JLabel textAreaLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(textAreaLabel, gbc);

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);
        gbc.gridwidth = 1;

        // Add a checkbox
        JCheckBox checkBox = new JCheckBox("Subscribe to newsletter");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(checkBox, gbc);

        // Add radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(genderLabel, gbc);

        JRadioButton maleRadio = new JRadioButton("Male");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(maleRadio, gbc);

        JRadioButton femaleRadio = new JRadioButton("Female");
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(femaleRadio, gbc);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Add a combo box
        JLabel countryLabel = new JLabel("Country:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(countryLabel, gbc);

        String[] countries = {"USA", "Canada", "UK", "Australia", "Other"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(comboBox, gbc);

        // Add a list
        JLabel languageLabel = new JLabel("Languages:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(languageLabel, gbc);

        String[] languages = {"English", "French", "Spanish", "German"};
        JList<String> languageList = new JList<>(languages);
        languageList.setVisibleRowCount(3);
        JScrollPane languageScrollPane = new JScrollPane(languageList);
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(languageScrollPane, gbc);

        // Add a button
        JButton button = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(button, gbc);

        // Add button action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String address = textArea.getText();
                String gender = maleRadio.isSelected() ? "Male" : femaleRadio.isSelected() ? "Female" : "Not specified";
                String country = (String) comboBox.getSelectedItem();
                java.util.List<String> selectedLanguages = languageList.getSelectedValuesList();
                String newsletter = checkBox.isSelected() ? "Yes" : "No";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\n" +
                                "Address: " + address + "\n" +
                                "Gender: " + gender + "\n" +
                                "Country: " + country + "\n" +
                                "Languages: " + selectedLanguages + "\n" +
                                "Newsletter: " + newsletter,
                        "Form Data",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
