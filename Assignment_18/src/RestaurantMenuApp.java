import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class RestaurantMenuApp extends JFrame {

	private JTextField itemNameField;
	private JTextField priceField;
	private JComboBox<String> categoryComboBox;
	private JTextArea descriptionArea;
	private JTextArea additionalInfoArea;
	private JToggleButton toggleButton;
	private JDialog dialog;
	private JFileChooser fileChooser;
	private JColorChooser colorChooser;
	private JPanel mainPanel;

	// Array to hold special items
	private String[] specialItems = { "Special Nashik misal", "Burgar", "Paneer Butter Masala" };

	public RestaurantMenuApp() {
		setTitle("Restaurant Menu");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		mainPanel = new JPanel(new GridBagLayout());
		JScrollPane scrollPane = new JScrollPane(mainPanel);
		add(scrollPane, BorderLayout.CENTER);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);

		Font font = new Font("Arial", Font.PLAIN, 18);

		// UIManager for setting button and component colors
		UIManager.put("Button.background", Color.DARK_GRAY);
		UIManager.put("Button.foreground", Color.WHITE);
		UIManager.put("TextField.background", new Color(245, 245, 245));
		UIManager.put("ComboBox.background", new Color(245, 245, 245));
		UIManager.put("TextArea.background", new Color(245, 245, 245));

		// Item Name Label and TextField
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel itemNameLabel = new JLabel("Item Name:");
		itemNameLabel.setFont(font);
		mainPanel.add(itemNameLabel, gbc);
		itemNameField = new JTextField(20);
		itemNameField.setFont(font);
		itemNameField.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		mainPanel.add(itemNameField, gbc);

		// Price Label and TextField
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel priceLabel = new JLabel("Price:");
		priceLabel.setFont(font);
		mainPanel.add(priceLabel, gbc);
		priceField = new JTextField(20);
		priceField.setFont(font);
		priceField.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		mainPanel.add(priceField, gbc);

		// Category Label and ComboBox
		gbc.gridx = 0;
		gbc.gridy = 2;
		JLabel categoryLabel = new JLabel("Category:");
		categoryLabel.setFont(font);
		mainPanel.add(categoryLabel, gbc);
		String[] categories = { "Appetizer", "Main Course", "Dessert", "Beverage" };
		categoryComboBox = new JComboBox<>(categories);
		categoryComboBox.setFont(font);
		categoryComboBox.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		mainPanel.add(categoryComboBox, gbc);

		// Description Label and TextArea
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.NORTH;
		JLabel descriptionLabel = new JLabel("Description:");
		descriptionLabel.setFont(font);
		mainPanel.add(descriptionLabel, gbc);
		descriptionArea = new JTextArea(5, 20);
		descriptionArea.setFont(font);
		descriptionArea.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		mainPanel.add(new JScrollPane(descriptionArea), gbc);

		// Text Area for additional information that opens a new page
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.NORTH;
		JLabel additionalInfoLabel = new JLabel("Additional Info:");
		additionalInfoLabel.setFont(font);
		mainPanel.add(additionalInfoLabel, gbc);
		additionalInfoArea = new JTextArea(5, 20);
		additionalInfoArea.setFont(font);
		additionalInfoArea.setBorder(new LineBorder(Color.GRAY, 1));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		mainPanel.add(new JScrollPane(additionalInfoArea), gbc);

		// Event listener for additional info area to open new page
		additionalInfoArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // Single click
					openNewPage(); // Open new page or dialog
				}
			}
		});

		// Submit Button with color
		JButton submitButton = new JButton("Submit");
		submitButton.setBackground(Color.GREEN);
		submitButton.setForeground(Color.WHITE);
		submitButton.setFont(font);
		submitButton.setToolTipText("Click to submit the form");
		submitButton.addActionListener(e -> submitForm());
		gbc.gridx = 0;
		gbc.gridy = 5;
		mainPanel.add(submitButton, gbc);

		// Toggle Button for special menu item
		toggleButton = new JToggleButton("Special Item");
		toggleButton.setFont(font);
		toggleButton.setToolTipText("Click to mark as special item");
		toggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (toggleButton.isSelected()) {
					showSpecialItemsDialog();
				}
			}
		});
		gbc.gridx = 1;
		gbc.gridy = 5;
		mainPanel.add(toggleButton, gbc);

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
		JLabel dialogLabel = new JLabel("Hello from Restaurant Menu");
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

	private void showSpecialItemsDialog() {
		StringBuilder message = new StringBuilder("Special Items:\n");
		for (String item : specialItems) {
			message.append("- ").append(item).append("\n");
		}
		JOptionPane.showMessageDialog(this, message.toString(), "Special Items", JOptionPane.INFORMATION_MESSAGE);
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
			String[] options = { "Item Name", "Price", "Description", "Additional Info" };
			String input = (String) JOptionPane.showInputDialog(this, "Select component to change color",
					"Choose Component", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			switch (input) {
			case "Item Name":
				itemNameField.setBackground(color);
				break;
			case "Price":
				priceField.setBackground(color);
				break;
			case "Description":
				descriptionArea.setBackground(color);
				break;
			case "Additional Info":
				additionalInfoArea.setBackground(color);
				break;
			}
		}
	}

	private void showDialog() {
		dialog.setVisible(true);
	}

	private void submitForm() {
		String itemName = itemNameField.getText();
		String price = priceField.getText();
		String category = (String) categoryComboBox.getSelectedItem();
		String description = descriptionArea.getText();
		String additionalInfo = additionalInfoArea.getText();
		boolean isSpecial = toggleButton.isSelected();

		JOptionPane.showMessageDialog(this,
				"Item Submitted:\nName: " + itemName + "\nPrice: " + price + "\nCategory: " + category
						+ "\nDescription: " + description + "\nAdditional Info: " + additionalInfo + "\nSpecial Item: "
						+ (isSpecial ? "Yes" : "No"));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new RestaurantMenuApp().setVisible(true);
		});
	}
}
