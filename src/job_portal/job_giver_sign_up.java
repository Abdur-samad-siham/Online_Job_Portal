/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package job_portal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Siham
 */
public class job_giver_sign_up extends javax.swing.JFrame {

    /** Creates new form job_giver_sign_up */
    public job_giver_sign_up() {
        initComponents();
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
             /*Finding ID*/  
             Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT company_id FROM company");
            while (resultSet.next()) {    
                row++;
            }
            row+=1000;
            System.out.println(""+row);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        company_name = new javax.swing.JTextField();
        company_url = new javax.swing.JTextField();
        company_mail = new javax.swing.JTextField();
        company_contact = new javax.swing.JTextField();
        company_signup = new javax.swing.JButton();
        company_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        company_pass = new javax.swing.JPasswordField();
        back_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Company Name : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Website URL : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("  Email : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 50, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Contact No : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 40));
        jPanel1.add(company_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, -1));
        jPanel1.add(company_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 170, -1));
        jPanel1.add(company_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, -1));
        jPanel1.add(company_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, -1));

        company_signup.setBackground(new java.awt.Color(102, 255, 51));
        company_signup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        company_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/sign-up.png"))); // NOI18N
        company_signup.setText("Sign Up");
        company_signup.setBorder(new javax.swing.border.MatteBorder(null));
        company_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_signupActionPerformed(evt);
            }
        });
        jPanel1.add(company_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 40));

        company_reset.setBackground(new java.awt.Color(255, 102, 102));
        company_reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        company_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/Reset.png"))); // NOI18N
        company_reset.setText("Reset");
        company_reset.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(company_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("password : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 40));
        jPanel1.add(company_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, -1));

        back_btn.setBackground(new java.awt.Color(0, 0, 0));
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/undo.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.setBorder(new javax.swing.border.MatteBorder(null));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 100, 40));

        jLabel7.setFont(new java.awt.Font("TATU", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/add new patient.png"))); // NOI18N
        jLabel7.setText("Sign Up");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/signup.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(1200, 559));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1200, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Connection connection;
    int row=0;
    String email,ID; //for displaying ID in dialog box
    private void company_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_signupActionPerformed
        // TODO add your handling code here:
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
             /*Finding ID*/  
            /* Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT company_id FROM company");
            while (resultSet.next()) {    
                row++;
            }
            row+=1000;*/
              /*Finding ID*/  
            String query = "INSERT INTO company(password,company_name, website_url,company_email, company_contact) values(?,?,?,?,?)";
             PreparedStatement pst = connection.prepareStatement(query);
             email=company_mail.getText();
            pst.setString(1, company_pass.getText());
            pst.setString(2, company_name.getText());
            pst.setString(3, company_url.getText());
            pst.setString(4, company_mail.getText());
            pst.setString(5, company_contact.getText());
            
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "account created successfully!\n Your ID ="+(row+1)+"\n\nRemember ID for the next login\n\n");
             after_job_giver_login f1 = new after_job_giver_login(""+(row+1));
                f1.setVisible(true);
                setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_company_signupActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        login_as_job_giver f= new login_as_job_giver();
             f.setVisible(true);
             setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(job_giver_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(job_giver_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(job_giver_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(job_giver_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new job_giver_sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField company_contact;
    private javax.swing.JTextField company_mail;
    private javax.swing.JTextField company_name;
    private javax.swing.JPasswordField company_pass;
    private javax.swing.JButton company_reset;
    private javax.swing.JButton company_signup;
    private javax.swing.JTextField company_url;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}