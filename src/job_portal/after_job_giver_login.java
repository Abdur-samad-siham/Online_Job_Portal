package job_portal;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

 
public class after_job_giver_login extends javax.swing.JFrame {
public Connection connection;
    /**
     * Creates new form after_job_giver_login
     */
        String companyID;
    public after_job_giver_login() {
        initComponents();
    }
    public after_job_giver_login(String id) {
        initComponents();
            
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM company where company_id="+id);

            while (resultSet.next()) {
                companyID=resultSet.getString("company_id");
                company_id.setText(companyID);
                company_name.setText(resultSet.getString("company_name"));
                company_website.setText(resultSet.getString("website_url"));
                company_mail.setText(resultSet.getString("company_email"));
                company_phn.setText(resultSet.getString("company_contact"));
            
            }
           
        }catch (Exception e) {
            e.printStackTrace();
        }       
        show_user();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        company_id = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        company_name = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        company_mail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        company_phn = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        company_website = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        post_job = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        job_id_show = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        go_to_applicant_table = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        posted_job_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1973, 992));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_btn.setBackground(new java.awt.Color(153, 255, 255));
        back_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/logout (1).png"))); // NOI18N
        back_btn.setText("Logout");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel4.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, 170, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 250, 60));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Company ID : ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        company_id.setBackground(new java.awt.Color(153, 255, 255));
        company_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        company_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.add(company_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 150, 20));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 250, 60));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Company Name : ");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        company_name.setBackground(new java.awt.Color(153, 255, 255));
        company_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        company_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.add(company_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 140, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 60));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Email : ");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        company_mail.setBackground(new java.awt.Color(153, 255, 255));
        company_mail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        company_mail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.add(company_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 166, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 60));

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Contact No : ");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        company_phn.setBackground(new java.awt.Color(153, 255, 255));
        company_phn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        company_phn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.add(company_phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 60));

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Website:");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        company_website.setBackground(new java.awt.Color(153, 255, 255));
        company_website.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        company_website.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel9.add(company_website, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 166, -1));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, 60));

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        post_job.setBackground(new java.awt.Color(153, 255, 255));
        post_job.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        post_job.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/recruit.png"))); // NOI18N
        post_job.setText("Post A Job");
        post_job.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        post_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_jobActionPerformed(evt);
            }
        });
        jPanel10.add(post_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 40));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 650));

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Job ID : ");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        job_id_show.setBackground(new java.awt.Color(204, 255, 204));
        job_id_show.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        job_id_show.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel11.add(job_id_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 128, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Application : ");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        total.setBackground(new java.awt.Color(204, 255, 204));
        total.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel11.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/businessman (1).png"))); // NOI18N
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 83, 72, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/collaboration (1).png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/analysis.png"))); // NOI18N
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 42, 42));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/bulb.png"))); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, 40));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 530, 180));

        go_to_applicant_table.setBackground(new java.awt.Color(0, 0, 0));
        go_to_applicant_table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        go_to_applicant_table.setForeground(new java.awt.Color(255, 255, 255));
        go_to_applicant_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/tap.png"))); // NOI18N
        go_to_applicant_table.setText("View Applicant List");
        go_to_applicant_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_to_applicant_tableActionPerformed(evt);
            }
        });
        jPanel2.add(go_to_applicant_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 320, 40));

        posted_job_table.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        posted_job_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Application Last Date", "Job Category", "No Of Vacancy"
            }
        ));
        posted_job_table.setRowHeight(32);
        posted_job_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posted_job_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(posted_job_table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 650, 270));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/search.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 650));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1970, 890));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("TATU", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("  Job Giver Information");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 550, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/businessman (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Hello, Giver");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void post_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_jobActionPerformed
        // TODO add your handling code here:
         post_a_job f1 = new post_a_job(companyID);
        f1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_post_jobActionPerformed

    private void posted_job_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posted_job_tableMouseClicked
        // TODO add your handling code here:
         int i = posted_job_table.getSelectedRow();
        TableModel model =posted_job_table.getModel();
        String jobID=model.getValueAt(i,0).toString();
        job_id_show.setText(jobID);
        count_application(jobID);
        
       // lastdate_show.setText(model.getValueAt(i,8).toString());
    }//GEN-LAST:event_posted_job_tableMouseClicked

    private void go_to_applicant_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_to_applicant_tableActionPerformed
        // TODO add your handling code here:
        if(job_id_show.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null, "Select a Job First");
        }
        else{
         applicant_list f= new applicant_list(job_id_show.getText(),companyID);
         f.setVisible(true);
         setVisible(false);
        }
        
        
    }//GEN-LAST:event_go_to_applicant_tableActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
         login_selection f= new login_selection();
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
            java.util.logging.Logger.getLogger(after_job_giver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(after_job_giver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(after_job_giver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(after_job_giver_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new after_job_giver_login().setVisible(true);
            }
        });
        
    }
  
     public ArrayList<posted_job_class> userList(){
      ArrayList<posted_job_class> usersList = new ArrayList<>();
      try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
            String query1="SELECT job_id,application_LastDate,job_category,No_of_vacancy FROM Job_Information where company_id = "+companyID;
             Statement st1= connection.createStatement();
            ResultSet rs1= st1.executeQuery(query1);
            posted_job_class user;
             while(rs1.next()){
                user=new posted_job_class(rs1.getString("job_id"),rs1.getString("application_LastDate"),rs1.getString("job_category"),
                rs1.getString("No_of_vacancy"));
                usersList.add(user);
            }
            
      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }

      return usersList;
     }
     
     
    public void show_user(){
        ArrayList<posted_job_class> list = userList();
        DefaultTableModel model = (DefaultTableModel)posted_job_table.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getJob_id();
            row[1]=list.get(i).getLast_date();
            row[2]=list.get(i).getJob_cat();
            row[3]=list.get(i).getVacancy();  
            model.addRow(row);
        }
    }
   public void count_application(String jobID)
   {
   try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
            String query2="SELECT COUNT(*) as total_no FROM application_details WHERE job_id = "+jobID;
             Statement st2= connection.createStatement();
            ResultSet rs2= st2.executeQuery(query2);
            while(rs2.next()){
          total.setText(rs2.getString("total_no"));
              
            }

      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField company_id;
    private javax.swing.JTextField company_mail;
    private javax.swing.JTextField company_name;
    private javax.swing.JTextField company_phn;
    private javax.swing.JTextField company_website;
    private javax.swing.JButton go_to_applicant_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField job_id_show;
    private javax.swing.JButton post_job;
    private javax.swing.JTable posted_job_table;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}

