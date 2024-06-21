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
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class LoginPage extends JFrame {

	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextArea additionalInfoArea;
	private JComboBox<String> colorTargetComboBox;

	public LoginPage() {
		setTitle("Login Page");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);

		Font font = new Font("Arial", Font.PLAIN, 18);

		// Username Label and TextField
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(font);
		add(usernameLabel, gbc);
		usernameField = new JTextField(20);
		usernameField.setFont(font);
		gbc.gridx = 1;
		add(usernameField, gbc);

		// Password Label and PasswordField
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(font);
		add(passwordLabel, gbc);
		passwordField = new JPasswordField(20);
		passwordField.setFont(font);
		gbc.gridx = 1;
		add(passwordField, gbc);

		// Toggle Button for Show/Hide Password
		JToggleButton showPasswordToggle = new JToggleButton("Show Password");
		showPasswordToggle.setFont(font);
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(showPasswordToggle, gbc);
		showPasswordToggle.addActionListener(e -> {
			if (showPasswordToggle.isSelected()) {
				passwordField.setEchoChar((char) 0); // Show password
			} else {
				passwordField.setEchoChar('*'); // Hide password
			}
		});

		// Additional Information Label and TextArea with Scrollbar
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel additionalInfoLabel = new JLabel("Additional Info:");
		additionalInfoLabel.setFont(font);
		add(additionalInfoLabel, gbc);
		additionalInfoArea = new JTextArea(10, 30);
		additionalInfoArea.setFont(font);
		additionalInfoArea.setLineWrap(true);
		additionalInfoArea.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(additionalInfoArea);
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(scrollPane, gbc);

		// Clicking on TextArea opens a new page
		additionalInfoArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // Single click
					openNewPage(); // Open new page or dialog
				}
			}
		});

		// ComboBox for Language Selection
		gbc.gridx = 0;
		gbc.gridy = 3;
		JLabel languageLabel = new JLabel("Language:");
		languageLabel.setFont(font);
		add(languageLabel, gbc);
		String[] languages = { "Marathi", "Hindi", "English" };
		JComboBox<String> languageComboBox = new JComboBox<>(languages);
		languageComboBox.setFont(font);
		gbc.gridx = 1;
		add(languageComboBox, gbc);

		// ComboBox for Color Target Selection
		gbc.gridx = 0;
		gbc.gridy = 4;
		JLabel colorTargetLabel = new JLabel("Choose color for:");
		colorTargetLabel.setFont(font);
		add(colorTargetLabel, gbc);
		String[] colorTargets = { "Username Field", "Password Field", "Additional Info Area" };
		colorTargetComboBox = new JComboBox<>(colorTargets);
		colorTargetComboBox.setFont(font);
		gbc.gridx = 1;
		add(colorTargetComboBox, gbc);

		// Login and Reset Buttons
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(Color.BLUE);
		loginButton.setForeground(Color.WHITE);
		loginButton.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		add(loginButton, gbc);

		JButton resetButton = new JButton("Reset");
		resetButton.setBackground(Color.RED);
		resetButton.setForeground(Color.WHITE);
		resetButton.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		add(resetButton, gbc);

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

		// Popup Menu for Additional Information Area
		JPopupMenu popupMenu = new JPopupMenu();
		JMenuItem popupItem = new JMenuItem("Popup Menu Item");
		popupItem.setFont(font);
		popupMenu.add(popupItem);
		additionalInfoArea.setComponentPopupMenu(popupMenu);

		// Action listeners
		loginButton.addActionListener(e -> login());
		resetButton.addActionListener(e -> reset());

		// Pack and set visible
		pack();
		setVisible(true);
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

	private void login() {
		String username = usernameField.getText();
		String password = new String(passwordField.getPassword());

		// Simulate authentication (replace with your own authentication logic)
		if (username.equals("yuvraj") && password.equals("yuvraj123")) {
			JOptionPane.showMessageDialog(this, "Login Successful!");
			// Open new window or perform other actions upon successful login
		} else {
			JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Login Failed",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void reset() {
		usernameField.setText("");
		passwordField.setText("");
		additionalInfoArea.setText("");
	}

	private void openFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(this);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			try {
				Desktop.getDesktop().open(selectedFile); // Open the selected file with default application
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void openColorChooser() {
		Color color = JColorChooser.showDialog(this, "Choose a color", Color.WHITE);
		if (color != null) {
			String selectedTarget = (String) colorTargetComboBox.getSelectedItem();
			if (selectedTarget != null) {
				switch (selectedTarget) {
				case "Username Field":
					usernameField.setBackground(color);
					break;
				case "Password Field":
					passwordField.setBackground(color);
					break;
				case "Additional Info Area":
					additionalInfoArea.setBackground(color);
					break;
				}
			}
		}
	}

	private void showDialog() {
		JDialog dialog = new JDialog(this, "Dialog", true);
		dialog.setSize(300, 200);
		dialog.setLocationRelativeTo(this);
		dialog.setLayout(new BorderLayout());
		JLabel dialogLabel = new JLabel("hello from yuvraj");
		dialogLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		dialog.add(dialogLabel, BorderLayout.CENTER);
		JButton closeDialogButton = new JButton("Close");
		closeDialogButton.setFont(new Font("Arial", Font.PLAIN, 18));
		closeDialogButton.addActionListener(e -> dialog.setVisible(false));
		dialog.add(closeDialogButton, BorderLayout.SOUTH);
		dialog.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new LoginPage();
		});
	}
}
