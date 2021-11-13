package com.advancedoop.gradebook;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
//import com.toedter.calendar.JCalendar;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("unused")
public class GradeBook extends JFrame {
	
	
Connection con= null;
PreparedStatement pst = null;
ResultSet rs=null;

public void Connect()
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/gradebook ", "root","");
    }
    catch (ClassNotFoundException ex)
    {
      ex.printStackTrace();
    }
    catch (SQLException ex)
    {
        ex.printStackTrace();{
        }
    }
 }

public void table_load()
{
	try 
	{
    pst = con.prepareStatement("select * from student");
    rs = pst.executeQuery();
    table.setModel(DbUtils.resultSetToTableModel(rs));
} 
	catch (SQLException e) 
	 {
		e.printStackTrace();
  } 
}


	private JPanel contentPane;
	private JTable table;
	private JTextField textstudcourse;
	private JTextField textstudname;
	private JTextField textstudcomment;
	private JTextField textsearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeBook frame = new GradeBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GradeBook() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Desktop\\GBOOK1.png"));
		setTitle("GradeBook");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnadd = new JButton("ADD");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String studname,studcourse,studcomment;
				studname = textstudname.getText();
				studcourse = textstudcourse.getText();
				studcomment = textstudcomment.getText();
							
				 try {
					pst = con.prepareStatement("insert into student (studname,studourse,studcomment)values(?,?,?)");
					pst.setString(1, studname);
					pst.setString(2, studcourse);
					pst.setString(3, studcomment);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Student Record Added!!!!!");
					table_load();
						           
					textstudname.setText("");
					textstudcourse.setText("");
					textstudcomment.setText("");
					textstudname.requestFocus();
				   }

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}

			}	
		});
		btnadd.setBounds(56, 428, 89, 23);
		contentPane.add(btnadd);
		
		JButton btnclear = new JButton("CLEAR");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textstudname.setText("");
				textstudcourse.setText("");
				textstudcomment.setText("");
				textstudname.requestFocus();
				
				dispose();
			}
		});
		btnclear.setBounds(363, 428, 89, 23);
		contentPane.add(btnclear);
		
		JLabel lblsubject = new JLabel("Name Of Student:");
		lblsubject.setBounds(58, 187, 87, 14);
		contentPane.add(lblsubject);
		
		JLabel lblmainTask = new JLabel("Course:");
		lblmainTask.setBounds(57, 262, 60, 14);
		contentPane.add(lblmainTask);
		
		JLabel lblothertask = new JLabel("Comments:");
		lblothertask.setBounds(56, 304, 75, 68);
		contentPane.add(lblothertask);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(462, 206, 406, 387);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
		
		));
		
		textstudcourse = new JTextField();
		textstudcourse.setBounds(56, 280, 396, 35);
		contentPane.add(textstudcourse);
		textstudcourse.setColumns(10);
		
		textstudname = new JTextField();
		textstudname.setColumns(10);
		textstudname.setBounds(56, 206, 396, 35);
		contentPane.add(textstudname);
		
		textstudcomment = new JTextField();
		textstudcomment.setBounds(56, 352, 396, 65);
		contentPane.add(textstudcomment);
		textstudcomment.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\COLLEGE\\GBOOK1.png"));
		lblNewLabel.setBounds(290, 67, 374, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblSEARCH = new JLabel("STUDENT NAME:");
		lblSEARCH.setBounds(56, 503, 89, 14);
		contentPane.add(lblSEARCH);
		
		JLabel lblSEARCH_1 = new JLabel("SEARCH");
		lblSEARCH_1.setBounds(56, 477, 46, 14);
		contentPane.add(lblSEARCH_1);
		
		textsearch = new JTextField();
		textsearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					String id=textsearch.getText();
				
					 pst = con.prepareStatement("select studname,studcourse,studcomment from student where idstudent = ?");
		             pst.setString(1, id);
		             ResultSet rs = pst.executeQuery();
		             
		             if(rs.next()==true)
		             {
		               
		                 String studname = rs.getString(1);
		                 String studcourse = rs.getString(2);
		                 String studcomment = rs.getString(3);
		                 
		                 textstudname.setText(studname);
		                 textstudcourse.setText(studcourse);
		                 textstudcomment.setText(studcomment);
		                 		                 
		             }  
		             else
		             {
		              textstudname.setText("");
		              textstudcourse.setText("");
		              textstudcomment.setText("");
		                 
		             }
		             
		  
		  
		         }
		 catch (SQLException ex) {
		           
		         }
		 }
				
			
			
		
		});
		textsearch.setBounds(56, 528, 393, 20);
		contentPane.add(textsearch);
		textsearch.setColumns(10);
		
		JButton btnUPDATE = new JButton("UPDATE");
		btnUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String studname,studcourse,studcomment,studsearch;
				studname = textstudname.getText();
				studcourse = textstudcourse.getText();
				studcomment = textstudcomment.getText();
				studsearch  = textsearch.getText();
							
				 try {
					pst = con.prepareStatement("update student set studname=?,studcourse=?,studcomment=? where idstudent=?");
					pst.setString(1, studname);
					pst.setString(2, studcourse);
					pst.setString(3, studcomment);
					pst.setString(4, studsearch);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Student Record Added!!!!!");
					table_load();
						           
					textstudname.setText("");
					textstudcourse.setText("");
					textstudcomment.setText("");
					textstudname.requestFocus();
				   }

				catch (SQLException e1) 
			        {
									
				e1.printStackTrace();
				}

			}
		});
		btnUPDATE.setBounds(214, 428, 89, 23);
		contentPane.add(btnUPDATE);
		
		JButton btnDELETE = new JButton("DELETE");
		btnDELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String studsearch;
				studsearch  = textsearch.getText();
				try {
				pst = con.prepareStatement("delete from student where idstudent =?");
				            pst.setString(1, studsearch);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
				            table_load();
				          
				        	textstudname.setText("");
							textstudcourse.setText("");
							textstudcomment.setText("");
							textstudname.requestFocus();
				}
				 
				            catch (SQLException e1) {
				e1.printStackTrace();
				}
			}
		});
		btnDELETE.setBounds(56, 559, 89, 23);
		contentPane.add(btnDELETE);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setBounds(363, 559, 89, 23);
		contentPane.add(btnexit);
	}
}
