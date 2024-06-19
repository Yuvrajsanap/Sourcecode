import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginPage extends JFrame {

	public LoginPage() {
		// Create the frame
		setTitle("Login Page");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center the frame

		// Create the panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		add(panel);

		// Add Username label and text field
		JLabel userLabel = new JLabel("Username:");
		userLabel.setBounds(30, 30, 80, 25);
		panel.add(userLabel);

		final JTextField userText = new JTextField(20);
		userText.setBounds(120, 30, 160, 25);
		panel.add(userText);

		// Add Password label and text field
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(30, 70, 80, 25);
		panel.add(passwordLabel);

		final JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(120, 70, 160, 25);
		panel.add(passwordText);

		// Add Login button
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(50, 120, 100, 25);
		panel.add(loginButton);

		// Add Cancel button
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(180, 120, 100, 25);
		panel.add(cancelButton);

		// Add action listener for the Login button
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = userText.getText();
				String password = new String(passwordText.getPassword());

				// Perform login action (this is just a placeholder)
				if (username.equals("admin") && password.equals("password")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
			}
		});

		// Add action listener for the Cancel button
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginPage().setVisible(true);
			}
		});
	}
}
