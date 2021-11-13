package com.advancedoop.gradebook;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
 
public class User_Registration implements ActionListener {
    JFrame frame;
    String[] gender={"Male","Female"};
    JLabel nameLabel=new JLabel("NAME");
    JLabel genderLabel=new JLabel("GENDER");
    JLabel UserNameLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
    JLabel emailLabel=new JLabel("EMAIL");
    JTextField nameTextField=new JTextField();
    JComboBox genderComboBox=new JComboBox(gender);
    JTextField UserTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JTextField emailTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    private final JLabel lblNewLabel = new JLabel("New label");
 
 
    User_Registration()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(new Color(30, 144, 255));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
        nameLabel.setBounds(24,109,40,70);
        genderLabel.setBounds(24,369,80,70);
        UserNameLabel.setBounds(24,155,100,70);
        passwordLabel.setBounds(24,205,100,70);
        confirmPasswordLabel.setBounds(24,255,140,70);
        emailLabel.setBounds(24,312,100,70);
        nameTextField.setBounds(184,132,165,23);
        genderComboBox.setBounds(184,392,165,23);
        UserTextField.setBounds(184,178,165,23);
        passwordField.setBounds(184,228,165,23);
        confirmPasswordField.setBounds(184,278,165,23);
        emailTextField.setBounds(184,335,165,23);
        registerButton.setBounds(71,497,100,35);
        resetButton.setBounds(221,497,100,35);
    }
    public void addComponentsToFrame()
    {
        frame.getContentPane().add(nameLabel);
        frame.getContentPane().add(genderLabel);
        frame.getContentPane().add(UserNameLabel);
        frame.getContentPane().add(passwordLabel);
        frame.getContentPane().add(confirmPasswordLabel);
        frame.getContentPane().add(emailLabel);
        frame.getContentPane().add(nameTextField);
        frame.getContentPane().add(genderComboBox);
        frame.getContentPane().add(UserTextField);
        frame.getContentPane().add(passwordField);
        frame.getContentPane().add(confirmPasswordField);
        frame.getContentPane().add(emailTextField);
        frame.getContentPane().add(registerButton);
        frame.getContentPane().add(resetButton);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\COLLEGE\\GBOOK1.png"));
        lblNewLabel.setBounds(54, 32, 264, 89);
        
        frame.getContentPane().add(lblNewLabel);
    }
    public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registerButton)
        {
            try {
                //Creating Connection Object
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/gradebook","root","");
                //Prepared Statement
                PreparedStatement Pstatement=connection.prepareStatement("insert into user values(?,?,?,?,?,)");
                //Specifying the values of it's parameter
                Pstatement.setString(1,nameTextField.getText());
                Pstatement.setString(2,UserTextField.getText().toString());
                Pstatement.setString(3,passwordField.getText());
                Pstatement.setString(4,confirmPasswordField.getText());
                Pstatement.setString(5,emailTextField.getText());
                
                //Pstatement.setString(6,genderComboBox.getSelectedItem());		
                //Checking for the Password match
                if(passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
                {
                    //Executing query
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password Did Not Match");
                }
 
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
 
 
        }
        if(e.getSource()==resetButton)
        {
            //Clearing Fields
            nameTextField.setText("");
            genderComboBox.setSelectedItem("Male");
            UserTextField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            emailTextField.setText("");
        }
 
    }
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}