/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_portal;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Siham
 */
public class apply_for_job_frame extends javax.swing.JFrame {

    /**
     * Creates new form apply_for_job_frame
     */
    public apply_for_job_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apply_experience = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        apply_reason = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        apply_skills = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        apply_doc1 = new javax.swing.JLabel();
        choose1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        apply_doc2 = new javax.swing.JLabel();
        choose2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        apply_doc3 = new javax.swing.JLabel();
        choose3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        apply_doc4 = new javax.swing.JLabel();
        choose4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        apply_doc6 = new javax.swing.JLabel();
        choose6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        apply_doc5 = new javax.swing.JLabel();
        choose5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        doc_details1 = new javax.swing.JTextField();
        doc_details2 = new javax.swing.JTextField();
        doc_details3 = new javax.swing.JTextField();
        doc_details5 = new javax.swing.JTextField();
        doc_details6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        doc_details4 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Skills : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Experience : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Reason For Hiring You : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, -1, 60));
        jPanel1.add(apply_experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 200, 100));

        apply_reason.setColumns(20);
        apply_reason.setRows(5);
        jScrollPane1.setViewportView(apply_reason);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 200, 100));

        apply_skills.setColumns(20);
        apply_skills.setRows(5);
        jScrollPane2.setViewportView(apply_skills);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Document 01 : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        jPanel1.add(apply_doc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 90, 70));

        choose1.setText("Choose");
        choose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose1ActionPerformed(evt);
            }
        });
        jPanel1.add(choose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Document 02 : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));
        jPanel1.add(apply_doc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, 70));

        choose2.setText("Choose");
        choose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose2ActionPerformed(evt);
            }
        });
        jPanel1.add(choose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Documents 03:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));
        jPanel1.add(apply_doc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 90, 70));

        choose3.setText("Choose");
        choose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose3ActionPerformed(evt);
            }
        });
        jPanel1.add(choose3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Document 04 : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));
        jPanel1.add(apply_doc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 90, 70));

        choose4.setText("Choose");
        choose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose4ActionPerformed(evt);
            }
        });
        jPanel1.add(choose4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Document 06 : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, -1, -1));
        jPanel1.add(apply_doc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 290, 90, 70));

        choose6.setText("Choose");
        choose6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose6ActionPerformed(evt);
            }
        });
        jPanel1.add(choose6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Documents 05:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));
        jPanel1.add(apply_doc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 90, 70));

        choose5.setText("Choose");
        choose5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose5ActionPerformed(evt);
            }
        });
        jPanel1.add(choose5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("Document 02 : ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("Document 03 : ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("Document 01 : ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("Document 04 : ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("Document 05 : ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("Document 06 : ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, -1, -1));
        jPanel1.add(doc_details1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 120, -1));
        jPanel1.add(doc_details2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 120, -1));
        jPanel1.add(doc_details3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 120, -1));
        jPanel1.add(doc_details5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 120, -1));
        jPanel1.add(doc_details6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 540, 120, -1));

        jLabel5.setFont(new java.awt.Font("TATU", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Documents picture upload");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 40));
        jPanel1.add(doc_details4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 120, -1));

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/upload.png"))); // NOI18N
        submit.setText("Submit");
        submit.setBorder(new javax.swing.border.MatteBorder(null));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 629, 110, 40));

        jLabel7.setFont(new java.awt.Font("TATU", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Name of The Documents");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 280, 40));

        cancel_btn.setBackground(new java.awt.Color(0, 0, 0));
        cancel_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/Close.png"))); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(new javax.swing.border.MatteBorder(null));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 629, 100, 40));

        back_btn.setBackground(new java.awt.Color(0, 0, 0));
        back_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/undo.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.setBorder(new javax.swing.border.MatteBorder(null));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 650, 90, -1));

        jLabel11.setFont(new java.awt.Font("TATU", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Attachments of Applicant");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 320, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/sponsor-background.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1522, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(966, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public Connection connection;
  String job_id,applicant_id;
  
  public apply_for_job_frame(String job_id,String applicant_id) {
        initComponents();
        this.job_id=job_id;
        this.applicant_id=applicant_id;
    }
  
String Filename1,Filename2,Filename3,Filename4,Filename5,Filename6;
byte [] img1=null;
byte [] img2=null;
byte [] img3=null;
byte [] img4=null;
byte [] img5=null;
byte [] img6=null;


    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=job_portal;selectMethod=cursor", "sa", "123456");
             String query1 = "INSERT INTO applicant_credential(job_id, applicant_id,image1, image2,image3,image4,image5,image6,doc_name_1,doc_name_2,doc_name_3,doc_name_4,doc_name_5,doc_name_6) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             String query2 = "INSERT INTO application_details(job_id, applicant_id,skills, experience,reason_for_hiring) values(?,?,?,?,?)";
             String skills,experience,reason,d1,d2,d3,d4,d5,d6;
            skills = apply_skills.getText();
            experience = apply_experience.getText();
            reason = apply_reason.getText();
            d1=doc_details1.getText();
            d2=doc_details2.getText();
            d3=doc_details3.getText();
            d4=doc_details4.getText();
            d5=doc_details5.getText();
            d6=doc_details6.getText();
            
            PreparedStatement pst = connection.prepareStatement(query1);
            pst.setString(1,job_id );
            pst.setString(2, applicant_id);
            pst.setBytes(3, img1);
            pst.setBytes(4, img2);
            pst.setBytes(5, img3);
            pst.setBytes(6, img4);
            pst.setBytes(7, img5);
            pst.setBytes(8, img6);
            pst.setString(9, d1);
            pst.setString(10, d2);
            pst.setString(11, d3);
            pst.setString(12, d4);
            pst.setString(13, d5);
            pst.setString(14, d6);
            
            pst.executeUpdate();
            
            PreparedStatement pst1 = connection.prepareStatement(query2);
            
             pst1.setString(1,job_id );
             pst1.setString(2, applicant_id);
             pst1.setString(3, skills);
             pst1.setString(4, experience);
             pst1.setString(5, reason);
             
             pst1.executeUpdate();
         
            JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");
             transection_table_entry f= new transection_table_entry(job_id,applicant_id);
             f.setVisible(true);
             setVisible(false);


        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon1=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc1.getWidth(), apply_doc1.getHeight(), Image.SCALE_SMOOTH));
        apply_doc1.setIcon(imageicon1);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img1=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose1ActionPerformed

    private void choose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose2ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc2.getWidth(), apply_doc2.getHeight(), Image.SCALE_SMOOTH));
        apply_doc2.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img2=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose2ActionPerformed

    private void choose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose3ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc3.getWidth(), apply_doc3.getHeight(), Image.SCALE_SMOOTH));
        apply_doc3.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img3=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose3ActionPerformed

    private void choose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose4ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc4.getWidth(), apply_doc4.getHeight(), Image.SCALE_SMOOTH));
        apply_doc4.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img4=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose4ActionPerformed

    private void choose5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose5ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc5.getWidth(), apply_doc5.getHeight(), Image.SCALE_SMOOTH));
        apply_doc5.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img5=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose5ActionPerformed

    private void choose6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose6ActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(apply_doc6.getWidth(), apply_doc6.getHeight(), Image.SCALE_SMOOTH));
        apply_doc6.setIcon(imageicon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;) {
                bos.write(buf,0,readNum);
            }
            img6=bos.toByteArray();
        }catch(Exception e)
        { }
    }//GEN-LAST:event_choose6ActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        after_job_seeker_login f= new after_job_seeker_login(applicant_id);
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
            java.util.logging.Logger.getLogger(apply_for_job_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apply_for_job_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apply_for_job_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apply_for_job_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apply_for_job_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apply_doc1;
    private javax.swing.JLabel apply_doc2;
    private javax.swing.JLabel apply_doc3;
    private javax.swing.JLabel apply_doc4;
    private javax.swing.JLabel apply_doc5;
    private javax.swing.JLabel apply_doc6;
    private javax.swing.JTextField apply_experience;
    private javax.swing.JTextArea apply_reason;
    private javax.swing.JTextArea apply_skills;
    private javax.swing.JButton back_btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton choose1;
    private javax.swing.JButton choose2;
    private javax.swing.JButton choose3;
    private javax.swing.JButton choose4;
    private javax.swing.JButton choose5;
    private javax.swing.JButton choose6;
    private javax.swing.JTextField doc_details1;
    private javax.swing.JTextField doc_details2;
    private javax.swing.JTextField doc_details3;
    private javax.swing.JTextField doc_details4;
    private javax.swing.JTextField doc_details5;
    private javax.swing.JTextField doc_details6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
