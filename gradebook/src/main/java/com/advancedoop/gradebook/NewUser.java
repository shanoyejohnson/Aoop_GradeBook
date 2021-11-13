package com.advancedoop.gradebook;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class NewUser extends javax.swing.JFrame {


    public NewUser() {
    	getContentPane().setBackground(new Color(30, 144, 255));
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        tf_user = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_fname = new javax.swing.JTextField();
        tf_lname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New User");

        jLabel1.setText("User Name:");

        jLabel2.setText("Email:");

        jLabel3.setText("Password:");

        jLabel4.setText("First Name:");

        jLabel5.setText("Last Name:");

        bt_add.setText("Add User");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(86)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1, Alignment.TRAILING)
        						.addComponent(jLabel2, Alignment.TRAILING)
        						.addComponent(jLabel3, Alignment.TRAILING)
        						.addComponent(jLabel4, Alignment.TRAILING)
        						.addComponent(jLabel5, Alignment.TRAILING))
        					.addGap(35)
        					.addGroup(layout.createParallelGroup(Alignment.CENTER)
        						.addComponent(tf_lname, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_fname, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_password, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_email, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tf_user, 150, 150, 150)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(155)
        					.addComponent(bt_add)))
        			.addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(43)
        					.addComponent(jLabel1)
        					.addGap(40)
        					.addComponent(jLabel2)
        					.addGap(51)
        					.addComponent(jLabel3)
        					.addGap(50)
        					.addComponent(jLabel4)
        					.addGap(48)
        					.addComponent(jLabel5)
        					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(tf_user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGap(24)
        						.addComponent(tf_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGap(35))
        					.addComponent(tf_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(tf_fname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGap(32)
        						.addComponent(tf_lname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)))
        			.addComponent(bt_add)
        			.addGap(28))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        
        // Create session
        Session session = factory.getCurrentSession();
        
        String username = this.tf_user.getText();
        String email = this.tf_email.getText();
        String password = this.tf_password.getText();
        String firstName = this.tf_fname.getText();
        String lastName = this.tf_lname.getText();
        
        try{
            System.out.println("Creating new user...");
            User user = new User(username, email, password, firstName, lastName);
            
            System.out.println("Starting transaction.");
            session.beginTransaction();
            
            System.out.println("Saving transaction");
            session.save(user);
            
            session.getTransaction().commit();
        } finally {
            System.out.println("New user was just added.");
            factory.close();
        }
    }//GEN-LAST:event_bt_addActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}