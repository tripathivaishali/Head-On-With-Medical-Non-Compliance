/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaishali Tripathi
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    AlternateMedicinePage alternateMedicinePage;
   
    private EcoSystem system;
   private UserAccount account;
   private Enterprise enterprise;
  //  public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PatientOrganization organization, Enterprise enterprise) {
     public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system){ 
        initComponents();
        this.setSize(1680, 1050);
        this.Rightpaneldashboard = userProcessContainer;
        this.account = account;
        
     
        this.system = system;
        populateTable();
    }
public void populateTable(){
       DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();

       model.setRowCount(0);
       System.out.println("size"+account.getWorkQueue().getWorkRequestList().size());
       for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
           Object[] row = new Object[4];
           row[0] = request;
           row[1] = request.getSender().getUsername();

         row[2]= account;
           row[3] = request.getStatus();

           model.addRow(row);
       }
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Rightpaneldashboard = new javax.swing.JPanel();
        AlternateMedicinesBtn = new javax.swing.JButton();
        OverthecounterBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        progressbar = new javax.swing.JPanel();
        CheckStatusBtn = new javax.swing.JButton();
        JP_Progress = new ProgressBar.CustomPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/blue.jpg"))); // NOI18N

        setLayout(new java.awt.CardLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 102));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1680, 1050));

        Rightpaneldashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AlternateMedicinesBtn.setBackground(new java.awt.Color(255, 255, 255));
        AlternateMedicinesBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AlternateMedicinesBtn.setForeground(new java.awt.Color(0, 51, 153));
        AlternateMedicinesBtn.setText("Shop for Alternate Medicines");
        AlternateMedicinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternateMedicinesBtnActionPerformed(evt);
            }
        });
        Rightpaneldashboard.add(AlternateMedicinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 414, 73));

        OverthecounterBtn.setBackground(new java.awt.Color(255, 255, 255));
        OverthecounterBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OverthecounterBtn.setForeground(new java.awt.Color(0, 51, 153));
        OverthecounterBtn.setText("Shop for Over The Counter Medicines");
        OverthecounterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverthecounterBtnActionPerformed(evt);
            }
        });
        Rightpaneldashboard.add(OverthecounterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 414, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/blue.jpg"))); // NOI18N
        Rightpaneldashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 530));

        jTabbedPane1.addTab("Dashboard", Rightpaneldashboard);

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setLayout(null);

        CheckStatusBtn.setBackground(new java.awt.Color(255, 255, 255));
        CheckStatusBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckStatusBtn.setForeground(new java.awt.Color(0, 51, 153));
        CheckStatusBtn.setText("Check Application Status");
        CheckStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusBtnActionPerformed(evt);
            }
        });
        progressbar.add(CheckStatusBtn);
        CheckStatusBtn.setBounds(10, 10, 216, 52);

        JP_Progress.setBackground(new java.awt.Color(255, 255, 255));
        JP_Progress.setForeground(new java.awt.Color(255, 255, 255));
        JP_Progress.setLayout(null);
        progressbar.add(JP_Progress);
        JP_Progress.setBounds(90, 90, 460, 240);

        jTabbedPane1.addTab("Progress Bar", progressbar);

        jPanel5.setLayout(null);

        jPanel4.setLayout(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(50, 170, 620, 130);

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel4.add(refreshJButton);
        refreshJButton.setBounds(570, 120, 95, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("            Customer Work Area");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(210, 60, 370, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("Order Medicines");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(300, 550, 190, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/blue.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 790, 610);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(0, 0, 800, 610);

        jTabbedPane1.addTab("Request Details", jPanel5);

        jScrollPane2.setViewportView(jTabbedPane1);

        add(jScrollPane2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        RequestMedicinesJPanel pmed = new RequestMedicinesJPanel(Rightpaneldashboard, account, system);
       Rightpaneldashboard.add("ViewProductDetailJPanelSupplier", pmed);
       CardLayout layout1 = (CardLayout) Rightpaneldashboard.getLayout();
       layout1.next(Rightpaneldashboard);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void CheckStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusBtnActionPerformed
        // TODO add your handling code here:
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int num = 1; num <= 100; num++) {
                    try {
                        JP_Progress.UpdateProgress(num);
                        JP_Progress.repaint();
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PatientWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        }).start();
    }//GEN-LAST:event_CheckStatusBtnActionPerformed

    private void OverthecounterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverthecounterBtnActionPerformed
        // TODO add your handling code here:
        RequestMedicinesJPanel pmed = new RequestMedicinesJPanel(Rightpaneldashboard, account, system);
        Rightpaneldashboard.add("ViewProductDetailJPanelSupplier", pmed);
        CardLayout layout1 = (CardLayout) Rightpaneldashboard.getLayout();
        layout1.next(Rightpaneldashboard);
    }//GEN-LAST:event_OverthecounterBtnActionPerformed

    private void AlternateMedicinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternateMedicinesBtnActionPerformed
        // TODO add your handling code here:
        //       CreateAccountPage createAccountPage = new CreateAccountPage(container);
        //       container.add("CreateAccountPageJPanel",createAccountPage);
        //       CardLayout layout = (CardLayout)container.getLayout();
        //       layout.next(container);

        AlternateMedicinePage alternateMedicinePage = new AlternateMedicinePage(Rightpaneldashboard, account, system);
        Rightpaneldashboard.add("AlternateMedicinePageJpanel", alternateMedicinePage);
        CardLayout layout = (CardLayout) Rightpaneldashboard.getLayout();
        layout.next(Rightpaneldashboard);
    }//GEN-LAST:event_AlternateMedicinesBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlternateMedicinesBtn;
    private javax.swing.JButton CheckStatusBtn;
    private ProgressBar.CustomPanel JP_Progress;
    private javax.swing.JButton OverthecounterBtn;
    private javax.swing.JPanel Rightpaneldashboard;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel progressbar;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
