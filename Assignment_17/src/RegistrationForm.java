import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegistrationForm extends JFrame implements ActionListener {
	// Components
	private JTextField nameField, emailField;
	private JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;
	private JComboBox<String> mealComboBox;
	private JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
	private JButton submitButton, clearButton;

	public RegistrationForm() {
		// Frame properties
		setTitle("Event Registration Form");
		setSize(450, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Create panel for the form
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(8, 2, 10, 10));
		formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// Name field
		formPanel.add(new JLabel("Name:"));
		nameField = new JTextField();
		formPanel.add(nameField);

		// Email field
		formPanel.add(new JLabel("Email:"));
		emailField = new JTextField();
		formPanel.add(emailField);

		// Gender radio buttons
		formPanel.add(new JLabel("Gender:"));
		JPanel genderPanel = new JPanel();
		ButtonGroup genderGroup = new ButtonGroup();
		maleRadioButton = new JRadioButton("Male");
		femaleRadioButton = new JRadioButton("Female");
		otherRadioButton = new JRadioButton("Other");
		genderGroup.add(maleRadioButton);
		genderGroup.add(femaleRadioButton);
		genderGroup.add(otherRadioButton);
		genderPanel.add(maleRadioButton);
		genderPanel.add(femaleRadioButton);
		genderPanel.add(otherRadioButton);
		formPanel.add(genderPanel);

		// Meal preference combo box
		formPanel.add(new JLabel("Meal Preference:"));
		String[] meals = { "Vegetarian", "Non-Vegetarian", "Vegan" };
		mealComboBox = new JComboBox<>(meals);
		formPanel.add(mealComboBox);

		// Interests checkboxes
		formPanel.add(new JLabel("Interests:"));
		JPanel interestsPanel = new JPanel();
		javaCheckBox = new JCheckBox("Java");
		pythonCheckBox = new JCheckBox("Python");
		cppCheckBox = new JCheckBox("C++");
		interestsPanel.add(javaCheckBox);
		interestsPanel.add(pythonCheckBox);
		interestsPanel.add(cppCheckBox);
		formPanel.add(interestsPanel);

		// Buttons panel
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout());

		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		buttonsPanel.add(submitButton);

		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		buttonsPanel.add(clearButton);

		// Add panels to frame
		add(formPanel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			String name = nameField.getText();
			String email = emailField.getText();
			String gender = maleRadioButton.isSelected() ? "Male" : femaleRadioButton.isSelected() ? "Female" : "Other";
			String meal = (String) mealComboBox.getSelectedItem();
			StringBuilder interests = new StringBuilder();
			if (javaCheckBox.isSelected())
				interests.append("Java ");
			if (pythonCheckBox.isSelected())
				interests.append("Python ");
			if (cppCheckBox.isSelected())
				interests.append("C++ ");

			if (name.isEmpty() || email.isEmpty() || gender.isEmpty() || meal.isEmpty()) {
				JOptionPane.showMessageDialog(this, "All fields must be filled out", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this,
						"Registration successful!\n" + "Name: " + name + "\n" + "Email: " + email + "\n" + "Gender: "
								+ gender + "\n" + "Meal Preference: " + meal + "\n" + "Interests: " + interests,
						"Success", JOptionPane.INFORMATION_MESSAGE);
				clearFields();
			}
		} else if (e.getSource() == clearButton) {
			clearFields();
		}
	}

	private void clearFields() {
		nameField.setText("");
		emailField.setText("");
		maleRadioButton.setSelected(false);
		femaleRadioButton.setSelected(false);
		otherRadioButton.setSelected(false);
		mealComboBox.setSelectedIndex(0);
		javaCheckBox.setSelected(false);
		pythonCheckBox.setSelected(false);
		cppCheckBox.setSelected(false);
	}

	public static void main(String[] args) {
		// Use invokeLater to ensure thread safety when creating the GUI
		SwingUtilities.invokeLater(() -> {
			RegistrationForm registrationForm = new RegistrationForm();
			registrationForm.setVisible(true);
		});
	}
}
