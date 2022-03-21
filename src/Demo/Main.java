package Demo;

import java.awt.EventQueue;

import javax.swing.JFrame;

import GUI.ClinicGUI;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ClinicGUI window = new ClinicGUI();
				window.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
