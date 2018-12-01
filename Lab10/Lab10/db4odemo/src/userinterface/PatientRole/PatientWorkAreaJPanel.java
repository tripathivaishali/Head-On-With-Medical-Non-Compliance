/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Medicine.MedicineDirectory;
import Business.Organization.PatientOrganization;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;

import javax.swing.JPanel;

/**
 *
 * @author Vaishali Tripathi
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form test
     */
    private JPanel userProcessContainer;
    private MedicineDirectory med;
    private Pharmacy phar;
    private UserAccount account;
    private PatientOrganization organization;
    private Enterprise enterprise;
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PatientOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization = organization;
        this.enterprise=enterprise;
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rightpaneldashboard = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AlternateMedicinesBtn = new javax.swing.JButton();
        OverthecounterBtn = new javax.swing.JButton();

        Rightpaneldashboard.setLayout(new java.awt.CardLayout());

        AlternateMedicinesBtn.setText("Shop for Alternate Medicines");
        AlternateMedicinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternateMedicinesBtnActionPerformed(evt);
            }
        });

        OverthecounterBtn.setText("Shop for Over The Counter Medicines");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OverthecounterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlternateMedicinesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AlternateMedicinesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OverthecounterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rightpaneldashboard.add(jPanel3, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Rightpaneldashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Rightpaneldashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AlternateMedicinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternateMedicinesBtnActionPerformed
        // TODO add your handling code here:
        //       CreateAccountPage createAccountPage = new CreateAccountPage(container);
        //       container.add("CreateAccountPageJPanel",createAccountPage);
        //       CardLayout layout = (CardLayout)container.getLayout();
        //       layout.next(container);

        AlternateMedicinePage alternateMedicinePage = new AlternateMedicinePage(Rightpaneldashboard,med,phar,account,enterprise);
        Rightpaneldashboard.add("AlternateMedicinePageJpanel", alternateMedicinePage);
        CardLayout layout = (CardLayout)Rightpaneldashboard.getLayout();
        layout.next(Rightpaneldashboard);

    }//GEN-LAST:event_AlternateMedicinesBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlternateMedicinesBtn;
    private javax.swing.JButton OverthecounterBtn;
    private javax.swing.JPanel Rightpaneldashboard;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}