/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.aed.view;

import com.aed.aedlab2.AedLab2;
import com.aed.model.Community;
import com.aed.model.Docter;
import com.aed.model.Hospital;
import java.awt.Color;
import static java.awt.Frame.NORMAL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DishaPatil
 */
public class HospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    Map<Integer, Hospital> hmap = AedLab2.hospitalMap;
    Hospital hos;
    Map<Integer, Hospital> sampleMap = new HashMap<>();
    int adDoc = 0;

    public HospitalJPanel() {
        initComponents();
        
        searchButton.setForeground(Color.white);
        createButton.setForeground(Color.white);
        updateButton.setForeground(Color.white);
        deleteButton.setForeground(Color.white);
        resetButton.setForeground(Color.white);
        addDocterButton.setForeground(Color.white);
        deleteDocterButton.setForeground(Color.white);
        
        if(SystemAdminJFrame.ad.equalsIgnoreCase("SYSTEMADMIN"))
            SystemAdminJFrame.backButton.setVisible(false);
        setHospitalsTable(hmap);
//        adminIdField.setEditable(false);
//        adminNameField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalsTable = new javax.swing.JTable();
        hospitalDetailsPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        adminIdLabel = new javax.swing.JLabel();
        adminIdField = new javax.swing.JTextField();
        adminNameLabel = new javax.swing.JLabel();
        adminNameField = new javax.swing.JTextField();
        communityIdLabel = new javax.swing.JLabel();
        communityIdComboBox = new javax.swing.JComboBox<>();
        DocterIdLabel = new javax.swing.JLabel();
        docterIdComboBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        searchComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        addDocterButton = new javax.swing.JButton();
        deleteDocterButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(504, 0));

        hospitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        hospitalsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitalsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitalsTable);

        hospitalDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hospital Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        nameLabel.setText("Name:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        cityLabel.setText("City:");

        cityField.setToolTipText("");

        adminIdLabel.setText("Admin Id:");

        adminIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminIdFieldKeyPressed(evt);
            }
        });

        adminNameLabel.setText("Admin Name:");

        adminNameField.setToolTipText("");
        adminNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNameFieldActionPerformed(evt);
            }
        });

        communityIdLabel.setText("Community ID:");

        DocterIdLabel.setText("Docter ID:");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "City", "Admin Id", "Community Name", "Docter Name" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.setToolTipText("");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hospitalDetailsPanelLayout = new javax.swing.GroupLayout(hospitalDetailsPanel);
        hospitalDetailsPanel.setLayout(hospitalDetailsPanelLayout);
        hospitalDetailsPanelLayout.setHorizontalGroup(
            hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalDetailsPanelLayout.createSequentialGroup()
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hospitalDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hospitalDetailsPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DocterIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(communityIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminIdLabel)
                            .addComponent(adminNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchField)
                            .addComponent(adminNameField)
                            .addComponent(communityIdComboBox, 0, 159, Short.MAX_VALUE)
                            .addComponent(docterIdComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameField)
                            .addComponent(cityField)
                            .addComponent(adminIdField))))
                .addGap(40, 40, 40))
        );
        hospitalDetailsPanelLayout.setVerticalGroup(
            hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalDetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminIdLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communityIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityIdLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docterIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocterIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hospitalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setToolTipText("");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        addDocterButton.setText("Add Docter");
        addDocterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocterButtonActionPerformed(evt);
            }
        });

        deleteDocterButton.setText("Delete Docter");
        deleteDocterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDocterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteDocterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGap(18, 18, 18)
                .addComponent(addDocterButton)
                .addGap(18, 18, 18)
                .addComponent(deleteDocterButton)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hospitalDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setHospitalsTable(Map<Integer, Hospital> hmap) {
        int rIndex = 0;

        String[][] data = new String[hmap.size()][7];
        for (Map.Entry<Integer, Hospital> e
                : hmap.entrySet()) {
            data[rIndex][0] = String.valueOf(e.getKey());
            data[rIndex][1] = e.getValue().getName();
            data[rIndex][2] = e.getValue().getCity();
            data[rIndex][3] = String.valueOf(e.getValue().getPersonId());
            data[rIndex][4] = AedLab2.personMap.get(e.getValue().getPersonId()).getName();
            //StringUtils.join(<List>, "|");
            data[rIndex][5] = e.getValue().getCommunityId().toString();
            data[rIndex][6] = e.getValue().getDocterId().toString();
            rIndex++;
        }

        String[] col = {"ID", "Name", "City", "AdminId", "AdminName", "CommunityId", "DocterId"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        hospitalsTable.setModel(model);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Do you want to delete Hospital?",
                "Are you sure ?",
                JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            for (Integer i : hos.getDocterId()) {
                AedLab2.docterMap.get(i).setHospitalId(utility.UtilityFunctions.removeIntFromList(
                        AedLab2.docterMap.get(i).getHospitalId(), hos.getHospitalId()));
            }
            for (Integer i : hos.getCommunityId()) {
                AedLab2.communityMap.get(i).setHospitalId(utility.UtilityFunctions.removeIntFromList(
                        AedLab2.communityMap.get(i).getHospitalId(), hos.getHospitalId()));
            }
            AedLab2.hospitalMap.remove(hos.getHospitalId(), hos);
            hmap = AedLab2.hospitalMap;
            resetAction();
            setHospitalsTable(hmap);
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void adminNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNameFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void hospitalsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalsTableMouseClicked
        // TODO add your handling code here:
        //int z=0;
        adminIdField.setEditable(false);
        adminNameField.setEditable(false);
        if (adDoc == 1) {
            int id1 = Integer.parseInt(hospitalsTable.getValueAt(hospitalsTable.getSelectedRow(), 0).toString());
            //Docter d= AedLab2.docterMap.get(id1);
            System.out.println("id=" + id1);
            //hos.getDocterId().addAll(Arrays.asList(id1));
            hos.setDocterId(utility.UtilityFunctions.addInttoList(hos.getDocterId(), id1));
            docterIdComboBox.addItem(AedLab2.personMap.get(AedLab2.docterMap.get(id1).getPersonId()).getName());
            hos.setDocterId(utility.UtilityFunctions.sortList(hos.getDocterId()));
            JOptionPane.showMessageDialog(this, "Docter Added");
            adDoc = 0;
            AedLab2.hospitalMap.replace(hos.getHospitalId(), hos);
            hmap = AedLab2.hospitalMap;
            //AedLab2.docterMap.get(id1).getHospitalId().add(hos.getHospitalId());
            AedLab2.docterMap.get(id1).setHospitalId(utility.UtilityFunctions.
                    addInttoList(AedLab2.docterMap.get(id1).getHospitalId(), hos.getHospitalId()));
            docterIdComboBox.removeAllItems();
            for (Integer i : hos.getDocterId()) {
                //comboBox.add(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
                docterIdComboBox.addItem(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
            }
            setHospitalsTable(hmap);
        } else {
            communityIdComboBox.removeAllItems();
            docterIdComboBox.removeAllItems();
            //Set<String> comboBox=new HashSet<>();
            int id = Integer.parseInt(hospitalsTable.getValueAt(hospitalsTable.getSelectedRow(), NORMAL).toString());
            hos = AedLab2.hospitalMap.get(id);
            //System.out.println("List elements="+communityIdComboBox.getItemCount());
            //System.out.println(hos.getName()+hos.getHospitalId());
            nameField.setText(hos.getName());
            cityField.setText(hos.getCity());
            adminIdField.setText(String.valueOf(hos.getPersonId()));
            adminNameField.setText(AedLab2.personMap.get(hos.getPersonId()).getName());
            for (Integer i : hos.getCommunityId()) {
                //comboBox.add(AedLab2.communityMap.get(i).getName());
                communityIdComboBox.addItem(AedLab2.communityMap.get(i).getName());
            }
//            for(String s: comboBox)
//                communityIdComboBox.addItem(s);
//            comboBox.clear();
            for (Integer i : hos.getDocterId()) {
                //comboBox.add(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
                docterIdComboBox.addItem(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
            }
//            for(String s: comboBox)
//                docterIdComboBox.addItem(s);
//            comboBox.clear();
        }//else
    }//GEN-LAST:event_hospitalsTableMouseClicked

    public void resetAction() {
        nameField.setText("");
        cityField.setText("");
        adminIdField.setText("");
        adminNameField.setText("");
        searchField.setText("");
        communityIdComboBox.removeAllItems();
        docterIdComboBox.removeAllItems();
        adminIdField.setEditable(true);
        adminNameField.setEditable(true);
        setHospitalsTable(hmap);
    }
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        resetAction();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // Name, City, Admin Id, Community Name, Docter Name
        sampleMap.clear();
        if (searchComboBox.getSelectedIndex() == 0) {
            for (Hospital h : hmap.values()) {
                if (h.getName().equalsIgnoreCase(searchField.getText())) {
                    sampleMap.put(h.getHospitalId(), h);
                }
            }
            setHospitalsTable(sampleMap);
        }//name

        if (searchComboBox.getSelectedIndex() == 1) {
            sampleMap.clear();
            for (Hospital h : hmap.values()) {
                if (h.getCity().equalsIgnoreCase(searchField.getText())) {
                    sampleMap.put(h.getHospitalId(), h);
                }
            }
            setHospitalsTable(sampleMap);
        }//city
        if (searchComboBox.getSelectedIndex() == 2) {
            sampleMap.clear();
            for (Hospital h : hmap.values()) {
                if (String.valueOf(h.getPersonId()).equalsIgnoreCase(searchField.getText())) {
                    sampleMap.put(h.getHospitalId(), h);
                }
            }
            setHospitalsTable(sampleMap);
        }//adminId
        if (searchComboBox.getSelectedIndex() == 3) {
            sampleMap.clear();
            for (Community c : AedLab2.communityMap.values()) {
                if (c.getName().equalsIgnoreCase(searchField.getText())) {
                    for (Integer i : c.getHospitalId()) {
                        sampleMap.put(i, AedLab2.hospitalMap.get(i));
                    }
                }
            }
            setHospitalsTable(sampleMap);
        }//Community Name
        if (searchComboBox.getSelectedIndex() == 4) {
            sampleMap.clear();
            for (Docter c : AedLab2.docterMap.values()) {
                if (AedLab2.personMap.get(c.getPersonId()).getName().equalsIgnoreCase(searchField.getText())) {
                    for (Integer i : c.getHospitalId()) {
                        sampleMap.put(i, AedLab2.hospitalMap.get(i));
                    }
                }
            }
            setHospitalsTable(sampleMap);
        }//Docter Name

    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteDocterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocterButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Docter from docter Combobox will be deleted");
        for (Docter d : AedLab2.docterMap.values()) {
            if (AedLab2.personMap.get(d.getPersonId()).getName().equals(docterIdComboBox.getSelectedItem())) {
                hos.setDocterId(utility.UtilityFunctions.removeIntFromList(hos.getDocterId(), d.getDocterId()));
                //hos.getDocterId().remove(d.getDocterId());//Update Table Entry
                AedLab2.hospitalMap.replace(hos.getHospitalId(), hos); //update hospitalMap
                hmap = AedLab2.hospitalMap;
                AedLab2.docterMap.get(d.getDocterId()).setHospitalId(
                        utility.UtilityFunctions.removeIntFromList(d.getHospitalId(), hos.getHospitalId()));
            }
        }
        docterIdComboBox.removeAllItems();
        for (Integer i : hos.getDocterId()) {
            //comboBox.add(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
            docterIdComboBox.addItem(AedLab2.personMap.get(AedLab2.docterMap.get(i).getPersonId()).getName());
        }
        JOptionPane.showMessageDialog(this, "Docter deleted");
    }//GEN-LAST:event_deleteDocterButtonActionPerformed

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(nameField.getText().isEmpty()||cityField.getText().isEmpty()||
                adminIdField.getText().isEmpty()||adminNameField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please select hospital from Table");
        else{ 
        hos.setName(nameField.getText());
        hos.setCity(cityField.getText());
        AedLab2.hospitalMap.replace(hos.getHospitalId(), hos);
        hmap = AedLab2.hospitalMap;
        resetAction();
        JOptionPane.showMessageDialog(this, "Hospital Updated");
        }//validation else
    }//GEN-LAST:event_updateButtonActionPerformed

    private void setDoctersTable(Map<Integer, Docter> doc) {
        int rIndex = 0;

        String[][] data = new String[doc.size() - hos.getDocterId().size()][4];
        for (Map.Entry<Integer, Docter> e
                : doc.entrySet()) {
            if (!hos.getDocterId().contains(e.getValue().getDocterId())) {
                data[rIndex][0] = String.valueOf(e.getValue().getDocterId());
                data[rIndex][1] = AedLab2.personMap.get(e.getValue().getPersonId()).getName();
                data[rIndex][2] = String.valueOf(AedLab2.personMap.get(e.getValue().getPersonId()).getAge());
                data[rIndex][3] = AedLab2.personMap.get(e.getValue().getPersonId()).getGender();
                rIndex++;
            }
        }
        String[] col = {"ID", "Name", "Age", "Gender"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        hospitalsTable.setModel(model);
    }
    private void addDocterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocterButtonActionPerformed
        // TODO add your handling code here:
        adDoc = 1;
        //String doc = JOptionPane.showInputDialog("Please enter Docter Name");
        //setting doctors table to a hospital
        setDoctersTable(AedLab2.docterMap);
        JOptionPane.showMessageDialog(this, "Please select Docter from table to add");
    }//GEN-LAST:event_addDocterButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        if(nameField.getText().isEmpty()||cityField.getText().isEmpty()||
                adminIdField.getText().isEmpty()||adminNameField.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Please Enter All fields");
        else{            
        communityIdComboBox.removeAllItems();
        docterIdComboBox.removeAllItems();
        for (Integer i : AedLab2.communityMap.keySet()) {
            //comboBox.add(AedLab2.communityMap.get(i).getName());
            communityIdComboBox.addItem(String.valueOf(i));
        }
        for (Integer i : AedLab2.docterMap.keySet()) {
            //comboBox.add(AedLab2.communityMap.get(i).getName());
            docterIdComboBox.addItem(String.valueOf(i));
        }
//        List<Integer> l=new ArrayList<>();
//        List<Integer> f=new ArrayList<>();
//        ComboBoxModel model= communityIdComboBox.getModel();
//        for(int i = 0;i<model.getSize();i++)
//            l.add((Integer) model.getElementAt(i));
//        ComboBoxModel mod= docterIdComboBox.getModel();
//        for(int i=0;i<mod.getSize();i++)
//            f.add((Integer) mod.getElementAt(i));

        int selectedOption = JOptionPane.showConfirmDialog(null,
                "current CommunityId and Docter Id from dropbox will be added",
                "Are you sure to add the current values?",
                JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            if (cityField.getText().equalsIgnoreCase(AedLab2.communityMap.get(Integer.parseInt(communityIdComboBox.getSelectedItem().toString())).getCity())
                    &&AedLab2.personMap.containsKey(Integer.parseInt(adminIdField.getText()))
                    && AedLab2.personMap.get(Integer.parseInt(adminIdField.getText())).getName().equalsIgnoreCase(adminNameField.getText())
                    && utility.UtilityFunctions.validateRole(Integer.parseInt(adminIdField.getText()), "HOSPITALADMIN")) {
                //add hospital
                AedLab2.hospitalMap.put(AedLab2.hospitalId,
                        new Hospital(AedLab2.hospitalId++, nameField.getText(), cityField.getText(),
                                Arrays.asList(Integer.parseInt(communityIdComboBox.getSelectedItem().toString())),
                                Arrays.asList(Integer.parseInt(docterIdComboBox.getSelectedItem().toString())),
                                Integer.parseInt(adminIdField.getText())));
                System.out.println("Hospital id after creating"+AedLab2.hospitalId);
                
                //updating hospital in docter
                AedLab2.docterMap.get(Integer.parseInt(docterIdComboBox.getSelectedItem().toString()))
                        .setHospitalId(utility.UtilityFunctions.addInttoList(
                                AedLab2.docterMap.get(Integer.parseInt(docterIdComboBox.getSelectedItem().toString()))
                                      .getHospitalId(), (AedLab2.hospitalId-1)));
                System.out.println("hospital added in docter");
                //add hospital in community
                AedLab2.communityMap.get(Integer.parseInt(communityIdComboBox.getSelectedItem().toString()))
                        .setHospitalId(utility.UtilityFunctions.addInttoList( 
                              AedLab2.communityMap.get(Integer.parseInt(communityIdComboBox.getSelectedItem().toString())).getHospitalId() , (AedLab2.hospitalId-1)));
                
                
                System.out.println("docter hospital list=" + (AedLab2.hospitalId-1));
                
                //updating
            }//for
            hmap = AedLab2.hospitalMap;
            resetAction();
        }
        }//validation else
    }//GEN-LAST:event_createButtonActionPerformed

    private void adminIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminIdFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c==' ') {
            adminIdField.setEditable(false);
            JOptionPane.showMessageDialog(this, "AdminID should be a number");
        } else {
        }
        adminIdField.setEditable(true);
    }//GEN-LAST:event_adminIdFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DocterIdLabel;
    private javax.swing.JButton addDocterButton;
    private javax.swing.JTextField adminIdField;
    private javax.swing.JLabel adminIdLabel;
    private javax.swing.JTextField adminNameField;
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JComboBox<String> communityIdComboBox;
    private javax.swing.JLabel communityIdLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDocterButton;
    private javax.swing.JComboBox<String> docterIdComboBox;
    private javax.swing.JPanel hospitalDetailsPanel;
    public javax.swing.JTable hospitalsTable;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
