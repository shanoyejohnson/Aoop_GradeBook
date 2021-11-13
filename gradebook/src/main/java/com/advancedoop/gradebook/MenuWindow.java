package com.advancedoop.gradebook;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class MenuWindow {

	private JFrame frmRegister;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public MenuWindow() {
		initialize();
		}
	
		private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.getContentPane().setBackground(new Color(30, 144, 255));
		frmRegister.setBounds(100, 100, 632, 417);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmRegister.setJMenuBar(menuBar);
		
		JMenu Base = new JMenu("Home");
		menuBar.add(Base);
		
		JMenu mnNewMenu_3 = new JMenu("Staff Chat");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Open");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		Client1 obj = new Client1();
			obj.main(null);
		}
	});
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Close");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_5 = new JMenu("Gradebook");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Open");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GradeBook obj = new GradeBook();				
				obj.main(null);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenu Calcmenu = new JMenu("Calculator");
		menuBar.add(Calcmenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calculator obj = new Calculator();				
				obj.main(null);
			}
		});
				
		Calcmenu.add(mntmNewMenuItem);
		frmRegister.getContentPane().setLayout(null);
		
		JLabel lbldatetime = new JLabel("DateTime");
		lbldatetime.setBounds(570, 0, 46, 14);
		frmRegister.getContentPane().add(lbldatetime);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\COLLEGE\\GBOOK1.png"));
		lblNewLabel.setBounds(163, 78, 306, 124);
		frmRegister.getContentPane().add(lblNewLabel);
		
		JButton btnREG = new JButton("REGISTER");
		btnREG.setBounds(147, 287, 121, 46);
		frmRegister.getContentPane().add(btnREG);
		
		JButton btnLOG = new JButton("LOGIN");
		btnLOG.setBounds(332, 287, 121, 46);
		frmRegister.getContentPane().add(btnLOG);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
