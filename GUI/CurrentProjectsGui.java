/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import TableController.ProjectInforController;

/**
 *
 * @author yash
 */
public class CurrentProjectsGui extends javax.swing.JPanel {
    ProjectInforController control;
    ManagerFrame mainFrame;
    Manager1Gui managerPanel;
    /**
     * Creates new form CurrentProjectsGui
     */
    public CurrentProjectsGui(ProjectInforController control,ManagerFrame mainFrame, Manager1Gui managerPanel) 
    {   this.managerPanel= managerPanel;
        this.control = control;
        this.mainFrame = mainFrame;
        initComponents();
    }
    public void updateTable() {
    	jTable1.setModel(control.getTableModel());
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        deleteProject = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));

        jTable1.setModel(control.getTableModel());
        jScrollPane1.setViewportView(jTable1);
        jTable1.getSelectionModel().addListSelectionListener(control);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jScrollPane2.setViewportView(textArea);

        deleteProject.setText("Delete");
        deleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProjectActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        backButton.setText("Back To Add projects");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("View Current Projects");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backButton)
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(53, 53, 53)
                .addComponent(deleteProject)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(deleteProject)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void displayTextArea(String[] array)
    {
       /* textArea.setText("Project ID :"+(String) array[0]);
                                textArea.append("\nProject Name :"+array[1]);
    				textArea.append("\nProject Description :"+array[2]);
    	                        textArea.append("\nProject Outcome :"+array[3]);
                                textArea.append("\nStart Date :"+array[4]);
                               textArea.append("\nEnd Date :"+array[5]);
                                  textArea.append("\nPartner Name :"+array[6]);*/
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        mainFrame.setContentPane(managerPanel);
        managerPanel.setVisible(true);
        mainFrame.pack();
                mainFrame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProjectActionPerformed
             int row = jTable1.getSelectedRow();
	control.deleteRow(String.valueOf(row));        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProjectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    void displayInTextArea(int index) {
        textArea.setText("Project ID"+jTable1.getValueAt(index, 0).toString() );
        textArea.append("Project Name"+jTable1.getValueAt(index, 1).toString() );    
        textArea.append("Project Descriptiomn"+jTable1.getValueAt(index, 2).toString() );  
        textArea.append("Project Outcome"+jTable1.getValueAt(index, 3).toString() );
        textArea.append("Start Date"+jTable1.getValueAt(index, 4).toString() );  
        textArea.append("End Date"+jTable1.getValueAt(index, 5).toString() ); 
        textArea.append("Partner Name"+jTable1.getValueAt(index, 6).toString() );   
    }
}