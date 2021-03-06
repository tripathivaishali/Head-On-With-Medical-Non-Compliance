/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManageMedicineInventory;

import userinterface.ManageMedicineInventory.ViewMedicineInventoryPage;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import static Business.Medicine.MedicineDirectory.ManufacturerMedicineList;
import Business.Network.Network;
import Business.Organization.ManufacturingManagerOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.SupplyManager;
import Business.Organization.PharmacistOrganization;
import Business.Organization.SupplyManagerOrganization;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.BookDirectory;
import userinterface.PatientRole.ViewMedicineDetailsPage;

/**
 *
 * @author Vaishali Tripathi
 */
public class AddToInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddToInventoryJPanel
     */
    private Enterprise enterprise;
    //private Supplier supp;
    //private DataReader commentReader;
    private MedicineDirectory b;
    private BookDirectory b1;
    private Enterprise e;
    private Organization org;

    public AddToInventoryJPanel(JPanel userProcessContainer, Organization org, Enterprise e, MedicineDirectory med) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.e = e;
        this.b = med;
        this.org = org;
        brandNameTxt.setEditable(false);
        brandNameTxt.setForeground(Color.gray);
        medNameTxt.setEditable(false);
        medNameTxt.setForeground(Color.gray);
        populateComboBox();
    }

    private void populateComboBox() {
        brandNameCombo.removeAllItems();

        SaltNameCombo.removeAllItems();
        int Price = 0;

        for (Medicine medi : b.getManufacturerMedicineList()) {
            SaltNameCombo.addItem(medi);
        }
        SaltNameCombo.addItem("Other");
        for (Medicine medi : b.getManufacturerMedicineList()) {
            brandNameCombo.addItem(medi.getBrand());
        }
        brandNameCombo.addItem("Other");

        for (Medicine.MedicineType type : Medicine.MedicineType.values()) {
            TypeCombo.addItem(type);
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

        userProcessContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PriceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Noofunitstxt = new javax.swing.JTextField();
        TypeCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        addMedBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        viewInvenBtn = new javax.swing.JButton();
        SaltNameCombo = new javax.swing.JComboBox<Object>();
        jLabel8 = new javax.swing.JLabel();
        brandNameCombo = new javax.swing.JComboBox<String>();
        composition1Txt = new javax.swing.JTextField();
        composition2Txt = new javax.swing.JTextField();
        composition3Txt = new javax.swing.JTextField();
        brandNameTxt = new javax.swing.JTextField();
        medNameTxt = new javax.swing.JTextField();
        diseasename = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Add Medicines To Inventory");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 50);

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medicine Name ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(69, 131, 160, 33);

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salt Composition ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(69, 259, 160, 34);

        PriceTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PriceTxt.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(PriceTxt);
        PriceTxt.setBounds(326, 189, 362, 40);

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price Per Medicine");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(69, 182, 160, 47);

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(69, 387, 170, 31);

        Noofunitstxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Noofunitstxt.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(Noofunitstxt);
        Noofunitstxt.setBounds(326, 440, 362, 46);

        TypeCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TypeCombo.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(TypeCombo);
        TypeCombo.setBounds(326, 384, 362, 37);

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of Units");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(69, 442, 190, 42);

        addMedBtn.setBackground(new java.awt.Color(255, 255, 255));
        addMedBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMedBtn.setForeground(new java.awt.Color(0, 51, 102));
        addMedBtn.setText("ADD");
        addMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addMedBtn);
        addMedBtn.setBounds(340, 580, 170, 50);

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 51, 102));
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn);
        backBtn.setBounds(80, 580, 150, 50);

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disease Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(69, 497, 190, 45);

        viewInvenBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewInvenBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewInvenBtn.setForeground(new java.awt.Color(0, 51, 102));
        viewInvenBtn.setText("View Inventory");
        viewInvenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvenBtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewInvenBtn);
        viewInvenBtn.setBounds(590, 580, 160, 50);

        SaltNameCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaltNameCombo.setForeground(new java.awt.Color(0, 51, 102));
        SaltNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaltNameComboActionPerformed(evt);
            }
        });
        jPanel2.add(SaltNameCombo);
        SaltNameCombo.setBounds(326, 131, 362, 33);

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brand");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(69, 79, 180, 34);

        brandNameCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brandNameCombo.setForeground(new java.awt.Color(0, 51, 102));
        brandNameCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandNameComboMouseClicked(evt);
            }
        });
        brandNameCombo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                brandNameComboInputMethodTextChanged(evt);
            }
        });
        brandNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameComboActionPerformed(evt);
            }
        });
        jPanel2.add(brandNameCombo);
        brandNameCombo.setBounds(326, 79, 362, 34);

        composition1Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        composition1Txt.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(composition1Txt);
        composition1Txt.setBounds(69, 311, 168, 42);

        composition2Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        composition2Txt.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(composition2Txt);
        composition2Txt.setBounds(283, 311, 180, 42);

        composition3Txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        composition3Txt.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(composition3Txt);
        composition3Txt.setBounds(492, 311, 196, 42);

        brandNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brandNameTxt.setForeground(new java.awt.Color(0, 51, 102));
        brandNameTxt.setText("Other");
        brandNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(brandNameTxt);
        brandNameTxt.setBounds(710, 80, 120, 30);

        medNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medNameTxt.setForeground(new java.awt.Color(0, 51, 102));
        medNameTxt.setText("Other");
        jPanel2.add(medNameTxt);
        medNameTxt.setBounds(710, 130, 120, 30);

        diseasename.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diseasename.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.add(diseasename);
        diseasename.setBounds(326, 497, 362, 45);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ManageMedicineInventory/medicine.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, -120, 850, 900);

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(userProcessContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedBtnActionPerformed
        // TODO add your handling code here:
        try {
            String brand;

            if (String.valueOf(brandNameCombo.getSelectedItem()).equalsIgnoreCase("Other")) {
                brandNameTxt.setEditable(true);
                brand = brandNameTxt.getText();
                brandNameTxt.setForeground(Color.black);

            } else {
                brand = String.valueOf(brandNameCombo.getSelectedItem());
            }

            String SaltName;
            if (String.valueOf(SaltNameCombo.getSelectedItem()).equals("Other")) {
                medNameTxt.setEditable(true);
                SaltName = medNameTxt.getText();
                medNameTxt.setForeground(Color.black);
            } else {
                SaltName = String.valueOf(SaltNameCombo.getSelectedItem());
            }

            int Price = Integer.parseInt(PriceTxt.getText());

            String saltc1 = composition1Txt.getText();
            String saltc2 = composition2Txt.getText();
            String saltc3 = composition3Txt.getText();

            String type = TypeCombo.getSelectedItem().toString();
            int units = Integer.parseInt(Noofunitstxt.getText());
            String disease = diseasename.getText();

            String[] s = new String[9];

            s[0] = brand;
            s[1] = SaltName;
            s[2] = saltc1;
            s[3] = saltc2;
            s[4] = saltc3;
            s[5] = type;
            s[6] = disease;
            s[7] = String.valueOf(units);
            s[8] = String.valueOf(Price);

            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ManufacturingManagerOrganization) {
                    boolean flag = false;
                    for (Medicine m : b.getManufacturerMedicineList()) {

                        if (m.getBrand().equalsIgnoreCase(brand)
                                && m.getSaltComposition1().equalsIgnoreCase(saltc1)
                                && m.getSaltComposition2().equalsIgnoreCase(saltc2)
                                && m.getSaltComposition3().equalsIgnoreCase(saltc3)
                                && m.getSaltname().equalsIgnoreCase(SaltName)
                                && m.getDisease().equalsIgnoreCase(disease)
                                && m.getType().equalsIgnoreCase(type)
                                && m.getPrice() == (Price)) {
                                m.setUnits(m.getUnits() + units);
                                JOptionPane.showMessageDialog(this, "Units Updated");
                                flag = true;
                                break;
                            }}
                    if (flag == false){
                    for (Medicine m : b.getManufacturerMedicineList()) {
                        if (m.getBrand().equalsIgnoreCase(brand)
                                && m.getSaltComposition1().equalsIgnoreCase(saltc1)
                                && m.getSaltComposition2().equalsIgnoreCase(saltc2)
                                && m.getSaltComposition3().equalsIgnoreCase(saltc3)
                                && m.getSaltname().equalsIgnoreCase(SaltName)
                                && m.getDisease().equalsIgnoreCase(disease)
                                && m.getType().equalsIgnoreCase(type)
                                && m.getPrice() != (Price)) {int selectionButton = JOptionPane.YES_NO_OPTION;
                             int selectionResult = JOptionPane.showConfirmDialog(null, "Price has been changed. Do you want to update the inventory price?","Warning",selectionButton);
                            if (selectionResult == JOptionPane.YES_OPTION) {
                                m.setUnits(m.getUnits() + units);
                                m.setPrice(Price);
                                JOptionPane.showMessageDialog(this, "Units and price updated");
                                flag = true;    
                            }
                            break;
                            }}}
                    if(flag==false){
                        b.AddManufacturerMedicine(s);
                        JOptionPane.showMessageDialog(this, "Medicines added successfully!");
                    break;
                        
                    }
                    
                    }
                    
                    

                 else if (organization instanceof PharmacistOrganization) {
                    
                    boolean flag = false;
                    for (Medicine m : b.getMedicineList()) {

                        if (m.getBrand().equalsIgnoreCase(brand)
                                && m.getSaltComposition1().equalsIgnoreCase(saltc1)
                                && m.getSaltComposition2().equalsIgnoreCase(saltc2)
                                && m.getSaltComposition3().equalsIgnoreCase(saltc3)
                                && m.getSaltname().equalsIgnoreCase(SaltName)
                                && m.getDisease().equalsIgnoreCase(disease)
                                && m.getType().equalsIgnoreCase(type)
                                && m.getPrice() == (Price)) {

                            
                                m.setUnits(m.getUnits() + units);

                                JOptionPane.showMessageDialog(this, "Units Updated");
                                flag = true;
                                break;
                            }}
                    if (flag == false){
                    for (Medicine m : b.getMedicineList()) {
                        if (m.getBrand().equalsIgnoreCase(brand)
                                && m.getSaltComposition1().equalsIgnoreCase(saltc1)
                                && m.getSaltComposition2().equalsIgnoreCase(saltc2)
                                && m.getSaltComposition3().equalsIgnoreCase(saltc3)
                                && m.getSaltname().equalsIgnoreCase(SaltName)
                                && m.getDisease().equalsIgnoreCase(disease)
                                && m.getType().equalsIgnoreCase(type)
                                && m.getPrice() != (Price)) {int selectionButton = JOptionPane.YES_NO_OPTION;
                             int selectionResult = JOptionPane.showConfirmDialog(null, "Price has been changed. Do you want to update the inventory price?","Warning",selectionButton);
                            if (selectionResult == JOptionPane.YES_OPTION) {
                                m.setUnits(m.getUnits() + units);
                                m.setPrice(Price);
                                JOptionPane.showMessageDialog(this, "Units and price updated");
                                flag = true;    
                            }
                            break;
                            }}}
                    if(flag==false){
                        b.AddMedicine(s);
                        JOptionPane.showMessageDialog(this, "Medicines added successfully!");
                    break;
                        
                    }
                    
                    
                }
            }

        } catch (NumberFormatException e) {
            if (medNameTxt.getText().equals("") || brandNameTxt.getText().equals("") || PriceTxt.getText().equals("") || composition1Txt.getText().equals("")
                    || composition2Txt.getText().equals("") || composition3Txt.getText().equals("") || Noofunitstxt.getText().equals("") || diseasename.getText().equals("")) {
                JOptionPane.showMessageDialog(TypeCombo, "All the details are required.");
                return;
            }
            JOptionPane.showMessageDialog(TypeCombo, "Please check the input format.");

        }
    }//GEN-LAST:event_addMedBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void viewInvenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvenBtnActionPerformed
        // TODO add your handling code here:
        ViewMedicineInventoryPage view = new ViewMedicineInventoryPage(userProcessContainer, org, e, b);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", view);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewInvenBtnActionPerformed

    private void brandNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameTxtActionPerformed

    private void brandNameComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandNameComboMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_brandNameComboMouseClicked

    private void brandNameComboInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_brandNameComboInputMethodTextChanged

    }//GEN-LAST:event_brandNameComboInputMethodTextChanged

    private void brandNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameComboActionPerformed
        // TODO add your handling code here:
        if (String.valueOf(brandNameCombo.getSelectedItem()).equalsIgnoreCase("Other")) {
            brandNameTxt.setEnabled(true);
            brandNameTxt.setEditable(true);
            brandNameCombo.setForeground(Color.gray);
            brandNameTxt.setText("");
            brandNameTxt.setForeground(Color.black);
        } else {
            brandNameTxt.setText("Other");
            brandNameTxt.setEnabled(false);
            brandNameTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_brandNameComboActionPerformed

    private void SaltNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaltNameComboActionPerformed
        // TODO add your handling code here:
        if (String.valueOf(SaltNameCombo.getSelectedItem()).equalsIgnoreCase("Other")) {
            medNameTxt.setEnabled(true);
            medNameTxt.setEditable(true);
            SaltNameCombo.setForeground(Color.gray);
            medNameTxt.setText("");
            medNameTxt.setForeground(Color.black);
        } else {
            medNameTxt.setText("Other");
            medNameTxt.setEnabled(false);
            medNameTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_SaltNameComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Noofunitstxt;
    private javax.swing.JTextField PriceTxt;
    private javax.swing.JComboBox<Object> SaltNameCombo;
    private javax.swing.JComboBox TypeCombo;
    private javax.swing.JButton addMedBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> brandNameCombo;
    private javax.swing.JTextField brandNameTxt;
    private javax.swing.JTextField composition1Txt;
    private javax.swing.JTextField composition2Txt;
    private javax.swing.JTextField composition3Txt;
    private javax.swing.JTextField diseasename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField medNameTxt;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JButton viewInvenBtn;
    // End of variables declaration//GEN-END:variables
}
