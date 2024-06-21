
//2*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ItemEvent;
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
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class EnhancedSwingUI extends JFrame {

	public EnhancedSwingUI() {
		setTitle("Enhanced Swing UI Example");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// Text Area acting as a button
		JTextArea textArea = new JTextArea("Click me to go to the next page");
		textArea.setEditable(false);
		textArea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Arial", Font.BOLD, 16));
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				goToNextPage();
			}
		});
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);

		// Toggle Button acting as an on/off switch
		JToggleButton toggleButton = new JToggleButton("OFF");
		toggleButton.addItemListener(e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				toggleButton.setText("ON");
			} else {
				toggleButton.setText("OFF");
			}
		});
		add(toggleButton, BorderLayout.SOUTH);

		// Combo Box
		String[] items = { "Item 1", "Item 2", "Item 3" };
		JComboBox<String> comboBox = new JComboBox<>(items);
		add(comboBox, BorderLayout.NORTH);

		// Popup Menu
		JPopupMenu popupMenu = new JPopupMenu();
		JMenuItem popupMenuItem = new JMenuItem("Popup Item");
		popupMenu.add(popupMenuItem);
		textArea.setComponentPopupMenu(popupMenu);

		// Menu Bar with Menu and Menu Item
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(e -> openFileChooser());
		fileMenu.add(openItem);
		JMenuItem colorItem = new JMenuItem("Choose Color");
		colorItem.addActionListener(e -> openColorChooser(textArea));
		fileMenu.add(colorItem);
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);

		// JDialog
		JDialog dialog = new JDialog(this, "Dialog", true);
		dialog.setSize(300, 200);
		dialog.setLocationRelativeTo(this);
		dialog.add(new JLabel("Hi from yuvraj"), BorderLayout.CENTER);

		// JButton to show the dialog
		JButton showDialogButton = new JButton("Show Dialog");
		showDialogButton.addActionListener(e -> dialog.setVisible(true));
		add(showDialogButton, BorderLayout.WEST);
	}

	private void goToNextPage() {
		// Create a new JFrame for the next page
		JFrame nextPage = new JFrame("Next Page");
		nextPage.setSize(400, 300);
		nextPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		nextPage.setLocationRelativeTo(this);

		// Add content to the next page
		JTextArea nextPageTextArea = new JTextArea("This is the next page.");
		nextPageTextArea.setEditable(false);
		nextPage.add(nextPageTextArea);

		// Show the next page
		nextPage.setVisible(true);
	}

	private void openFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
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

	private void openColorChooser(JTextArea textArea) {
		Color color = JColorChooser.showDialog(this, "Choose a color", Color.WHITE);
		if (color != null) {
			textArea.setBackground(color);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EnhancedSwingUI().setVisible(true);
		});
	}
}
