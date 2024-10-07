package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame {

	private MainPanel mainPanel;
	private PopUpWindow popUpWindow;

	public Window() {
		
		mainPanel = new MainPanel();
		popUpWindow = new PopUpWindow();
		setTitle("Traductor");
		setSize(900, 500);
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public PopUpWindow getPopUpWindow() {
		return popUpWindow;
	}

	public void setPopUpWindow(PopUpWindow popUpWindow) {
		this.popUpWindow = popUpWindow;
	}

	
	
	
}
