import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ContactForm extends JFrame implements ActionListener {
	// Components
	private JTextField nameField, emailField;
	private JTextArea messageArea;
	private JButton submitButton, clearButton;

	public ContactForm() {
		// Frame properties
		setTitle("Contact Form");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Create panel for the form
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 2, 10, 10));
		formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// Name field
		formPanel.add(new JLabel("Name:"));
		nameField = new JTextField();
		formPanel.add(nameField);

		// Email field
		formPanel.add(new JLabel("Email:"));
		emailField = new JTextField();
		formPanel.add(emailField);

		// Message area
		formPanel.add(new JLabel("Message:"));
		messageArea = new JTextArea(5, 20);
		messageArea.setLineWrap(true);
		messageArea.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(messageArea);
		formPanel.add(scrollPane);

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
			String message = messageArea.getText();

			if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
				JOptionPane.showMessageDialog(this, "All fields must be filled out", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "Message sent successfully!", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				clearFields();
			}
		} else if (e.getSource() == clearButton) {
			clearFields();
		}
	}

	private void clearFields() {
		nameField.setText("");
		emailField.setText("");
		messageArea.setText("");
	}

	public static void main(String[] args) {
		// Use invokeLater to ensure thread safety when creating the GUI
		SwingUtilities.invokeLater(() -> {
			ContactForm contactForm = new ContactForm();
			contactForm.setVisible(true);
		});
	}
}
