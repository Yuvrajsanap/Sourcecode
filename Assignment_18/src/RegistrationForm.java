
//4***
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class RegistrationForm extends JFrame {

	private JTextField nameField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JComboBox<String> genderComboBox;
	private JTextArea addressArea;
	private JTextArea additionalInfoArea;
	private JButton submitButton;
	private JButton resetButton;
	private JDialog dialog;
	private JFileChooser fileChooser;
	private JColorChooser colorChooser;
	private JToggleButton toggleButton;

	public RegistrationForm() {
		setTitle("Registration Form");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);

		Font font = new Font("Arial", Font.PLAIN, 18);

		// UIManager for setting button and component colors
		UIManager.put("Button.background", Color.DARK_GRAY);
		UIManager.put("Button.foreground", Color.WHITE);
		UIManager.put("TextField.background", new Color(245, 245, 245));
		UIManager.put("PasswordField.background", new Color(245, 245, 245));
		UIManager.put("ComboBox.background", new Color(245, 245, 245));
		UIManager.put("TextArea.background", new Color(245, 245, 245));

		// Name Label and TextField
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(font);
		add(nameLabel, gbc);
		nameField = new JTextField(20);
		nameField.setFont(font);
		nameField.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		add(nameField, gbc);

		// Email Label and TextField
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(font);
		add(emailLabel, gbc);
		emailField = new JTextField(20);
		emailField.setFont(font);
		emailField.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		add(emailField, gbc);

		// Password Label and PasswordField
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(font);
		add(passwordLabel, gbc);
		passwordField = new JPasswordField(20);
		passwordField.setFont(font);
		passwordField.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		add(passwordField, gbc);

		// Gender Label and ComboBox
		gbc.gridx = 0;
		gbc.gridy = 3;
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(font);
		add(genderLabel, gbc);
		String[] genders = { "Male", "Female", "Other" };
		genderComboBox = new JComboBox<>(genders);
		genderComboBox.setFont(font);
		genderComboBox.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		add(genderComboBox, gbc);

		// Address Label and TextArea
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.NORTH;
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(font);
		add(addressLabel, gbc);
		addressArea = new JTextArea(5, 20);
		addressArea.setFont(font);
		addressArea.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		JScrollPane scrollPane = new JScrollPane(addressArea);
		add(scrollPane, gbc);

		// Text Area for additional information that opens a new page
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.NORTH;
		JLabel additionalInfoLabel = new JLabel("Additional Info:");
		additionalInfoLabel.setFont(font);
		add(additionalInfoLabel, gbc);
		additionalInfoArea = new JTextArea(5, 20);
		additionalInfoArea.setFont(font);
		additionalInfoArea.setBorder(new LineBorder(Color.GRAY, 1));
		JScrollPane additionalInfoScrollPane = new JScrollPane(additionalInfoArea);
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(additionalInfoScrollPane, gbc);

		// Event listener for additional info area to open new page
		additionalInfoArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // Single click
					openNewPage(); // Open new page or dialog
				}
			}
		});

		// Submit and Reset Buttons with color
		submitButton = new JButton("Submit");
		submitButton.setBackground(Color.GREEN);
		submitButton.setForeground(Color.WHITE);
		submitButton.setFont(font);
		submitButton.setToolTipText("Click to submit the form");
		submitButton.addActionListener(e -> submitForm());
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(submitButton, gbc);

		resetButton = new JButton("Reset");
		resetButton.setBackground(Color.RED);
		resetButton.setForeground(Color.WHITE);
		resetButton.setFont(font);
		resetButton.setToolTipText("Click to reset the form");
		resetButton.addActionListener(e -> resetForm());
		gbc.gridx = 1;
		add(resetButton, gbc);

		// Toggle Button for Show/Hide Password
		toggleButton = new JToggleButton("Show Password");
		toggleButton.setFont(font);
		toggleButton.setToolTipText("Click to show or hide the password");
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(toggleButton, gbc);
		toggleButton.addActionListener(e -> {
			if (toggleButton.isSelected()) {
				passwordField.setEchoChar((char) 0); // Show password
				toggleButton.setText("Hide Password");
			} else {
				passwordField.setEchoChar('*'); // Hide password
				toggleButton.setText("Show Password");
			}
		});

		// Menu Bar with File Menu and Items
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Choose File");
		openItem.setFont(font);
		openItem.addActionListener(e -> openFileChooser());
		fileMenu.add(openItem);

		JMenuItem colorItem = new JMenuItem("Choose Color");
		colorItem.setFont(font);
		colorItem.addActionListener(e -> openColorChooser());
		fileMenu.add(colorItem);

		JMenuItem dialogItem = new JMenuItem("Show Dialog");
		dialogItem.setFont(font);
		dialogItem.addActionListener(e -> showDialog());
		fileMenu.add(dialogItem);

		menuBar.add(fileMenu);
		setJMenuBar(menuBar);

		// Dialog
		dialog = new JDialog(this, "Dialog", true);
		dialog.setSize(300, 200);
		dialog.setLocationRelativeTo(this);
		dialog.setLayout(new BorderLayout());
		JLabel dialogLabel = new JLabel("Hello from yuvraj");
		dialogLabel.setFont(font);
		dialog.add(dialogLabel, BorderLayout.CENTER);
		JButton closeDialogButton = new JButton("Close");
		closeDialogButton.setFont(font);
		closeDialogButton.setBackground(Color.BLUE);
		closeDialogButton.setForeground(Color.WHITE);
		closeDialogButton.addActionListener(e -> dialog.setVisible(false));
		dialog.add(closeDialogButton, BorderLayout.SOUTH);
	}

	private void openNewPage() {
		// Create a new JFrame for the new page
		JFrame newFrame = new JFrame("New Page");
		newFrame.setSize(600, 400);
		newFrame.setLocationRelativeTo(null);
		newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to not exit the entire
																	// application
		JLabel label = new JLabel("Welcome to the new page!");
		label.setFont(new Font("Arial", Font.PLAIN, 24));
		newFrame.add(label);
		newFrame.setVisible(true);
	}

	private void openFileChooser() {
		fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(this);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			try {
				Desktop.getDesktop().open(selectedFile);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Could not open file: " + selectedFile.getAbsolutePath(), "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void openColorChooser() {
		colorChooser = new JColorChooser();
		Color color = colorChooser.showDialog(this, "Choose a color", Color.WHITE);
		if (color != null) {
			String[] options = { "Name", "Email", "Password", "Address", "Additional Info" };
			String input = (String) JOptionPane.showInputDialog(this, "Select component to change color",
					"Choose Component", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			switch (input) {
			case "Name":
				nameField.setBackground(color);
				break;
			case "Email":
				emailField.setBackground(color);
				break;
			case "Password":
				passwordField.setBackground(color);
				break;
			case "Address":
				addressArea.setBackground(color);
				break;
			case "Additional Info":
				additionalInfoArea.setBackground(color);
				break;
			}
		}
	}

	private void submitForm() {
		String name = nameField.getText();
		String email = emailField.getText();
		String password = new String(passwordField.getPassword());
		String gender = (String) genderComboBox.getSelectedItem();
		String address = addressArea.getText();

		JOptionPane.showMessageDialog(this, "Registration Successful:\nName: " + name + "\nEmail: " + email
				+ "\nGender: " + gender + "\nAddress: " + address);
	}

	private void resetForm() {
		nameField.setText("");
		emailField.setText("");
		passwordField.setText("");
		genderComboBox.setSelectedIndex(0);
		addressArea.setText("");
		additionalInfoArea.setText("");
		nameField.setBackground(Color.WHITE);
		emailField.setBackground(Color.WHITE);
		passwordField.setBackground(Color.WHITE);
		addressArea.setBackground(Color.WHITE);
		additionalInfoArea.setBackground(Color.WHITE);
	}

	private void showDialog() {
		dialog.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new RegistrationForm().setVisible(true);
		});
	}
}
