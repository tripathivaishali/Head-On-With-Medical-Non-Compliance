package userinterface.DoctorRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Hospital.Hospital;
import Business.Medicine.Medicine;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Doctor;
import static Business.Role.Role.RoleType.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import Business.WorkQueue.HospitalWorkRequest;
//import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaishali Tripathi
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
  
    private Enterprise enterprise;
    private UserAccount userAccount;
   private Organization org;
    public HospitalAdminWorkAreaJPanel(JPanel rightPanel,  Organization organzation,UserAccount account, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
       this.org=organzation;
        this.enterprise = enterprise;
        this.userAccount = account;
       
       populateCombobox();
               
       
       populateTable();
    }

   

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getUsername();
           // row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
           row[2]= request.getReceiver().getUsername();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
    public void populateCombobox()
    {
        DoctorCombo.removeAllItems();

        for (Employee employee : org.getEmployeeDirectory().getEmployeeList()) {
            DoctorCombo.addItem(employee);
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

        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DoctorCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewtxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        container.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(0, 51, 102));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 620, 130);

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(0, 51, 102));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshJButton);
        refreshJButton.setBounds(570, 100, 110, 25);

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(0, 51, 102));
        assignJButton.setText("Assign Request to Doctor");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(assignJButton);
        assignJButton.setBounds(460, 410, 240, 25);

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(0, 51, 102));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(processJButton);
        processJButton.setBounds(520, 270, 160, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("          Hospital Work Area");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1, -1, 740, 60);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(60, 270, 170, 25);

        DoctorCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DoctorCombo.setForeground(new java.awt.Color(0, 51, 102));
        DoctorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorComboActionPerformed(evt);
            }
        });
        jPanel2.add(DoctorCombo);
        DoctorCombo.setBounds(460, 360, 230, 23);

        viewtxt.setColumns(20);
        viewtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewtxt.setForeground(new java.awt.Color(0, 51, 102));
        viewtxt.setRows(5);
        jScrollPane2.setViewportView(viewtxt);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(60, 360, 350, 91);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Detailed Message ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 310, 270, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/testtubes.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 610);

        container.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        String message = "Alternative Medicine List";
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(DoctorCombo, "Please select a row");
            return;
        }
        
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        //if((request.getReceiver().equals(userAccount))){
             Employee e = (Employee) DoctorCombo.getSelectedItem();
//        if((request.getStatus().equalsIgnoreCase("Pending"))){
//        JOptionPane.showMessageDialog(null,"Request is already processed");}
            
//        HospitalWorkRequest req = new HospitalWorkRequest();
        // Employee e = (Employee) DoctorCombo.getSelectedItem();
//         if(request.getReceiver().getEmployee().equals(e))
         if(!request.getStatus().equalsIgnoreCase("sent"))
                JOptionPane.showMessageDialog(null,"Request is already processed");
         else
         {
          request.setAlternativelist(request.getAlternativelist());
        System.out.println("size of altenative list:"+request.getAlternativelist().size());  
        request.setMessage(message);
      //  request.setSender(userAccount);
        
        UserAccount u=null;
       for(UserAccount user : org.getUserAccountDirectory().getUserAccountList()){
            if(user.getEmployee().equals(e))
            {
                u=user;
                request.setReceiver(u);
                System.out.println("useracc"+u);
                break;
            }
       }
       request.setStatus("Pending");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                for(Employee emp : organization.getEmployeeDirectory().getEmployeeList()){
                    if(emp.equals(e)){
                org = organization;
                
                break;
            }
        }
      }
            break;
        }
        if (u!=null){
            
       
          //org.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
            u.getWorkQueue().getWorkRequestList().add(request);
             System.out.println("size :"+u.getWorkQueue().getWorkRequestList().size());
            JOptionPane.showMessageDialog(null, "Request sent!");
        }
        }
        
         
        
        
        populateTable();
        
   
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("approved")){
        request.setStatus("Completed");
        populateTable();
        request.getSender().getWorkQueue().getWorkRequestList().add(request);}
        else{JOptionPane.showMessageDialog(DoctorCombo, "This request is not eligible to be processed");}
    
       
       
    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewtxt.setText("");
        String output = "Request for getting Alternative prescription\nPreferred Doctors :\n";
        
        HashSet<Medicine> m = new HashSet<Medicine>();
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
       
       
        for(Employee emp : request.getDoctorlist()) {
            output= output + emp.getName()+"\n";
        viewtxt.setText(output);
        viewtxt.setEditable(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DoctorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorComboActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_DoctorComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DoctorCombo;
    private javax.swing.JButton assignJButton;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextArea viewtxt;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
