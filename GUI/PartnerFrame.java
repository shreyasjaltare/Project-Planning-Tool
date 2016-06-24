/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
//import TableController.CommunicationTableController;

import Entityclass.Budget;
import Entityclass.ProjectInfor;
import Entityclass.Timeline;
import java.awt.BorderLayout;
import TableService.IvyBudgetService;
import TableService.IvyProjectInforService;
import TableService.IvyTimelineService;
import java.awt.Color;
import javax.swing.DefaultListModel;
/**
 *
 * @author Ivy
 */
public class PartnerFrame extends javax.swing.JFrame { 
                
                  
    /**
     * Creates new form PartnerFrame
     */
    public PartnerFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
   
    }
     public void projectidtextfield(String value) {
    	searchprojectTextField.setText(value);
    }
    
    
    public void budgettextfield(String value) {
    	searchbudgetTextField.setText(value);
    }
    
    
    public void timelineidtextfield(String value) {
    	searchtimelineTextField.setText(value);
    }

    public void addelementtojlist(DefaultListModel model){
        jList1.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersistenceUnitEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
        projectInforQuery = java.beans.Beans.isDesignTime() ? null : PersistenceUnitEntityManager.createQuery("SELECT p FROM ProjectInfor p");
        projectInforList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : projectInforQuery.getResultList();
        viewLabel = new javax.swing.JLabel();
        viewComboBox = new javax.swing.JComboBox();
        searchLabel = new javax.swing.JLabel();
        searchprojectTextField = new javax.swing.JTextField();
        ok1Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchbudgetTextField = new javax.swing.JTextField();
        searchtimelineTextField = new javax.swing.JTextField();
        ok2Button = new javax.swing.JButton();
        ok3Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        clearButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        chatButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        viewLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewLabel.setText("View");

        viewComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ", "Project", "Budget", "Timeline"}));
        viewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboBoxActionPerformed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchLabel.setText("Search");

        searchprojectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchprojectTextFieldActionPerformed(evt);
            }
        });

        ok1Button.setText("OK");
        ok1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Project");

        jLabel2.setText("Budget");

        jLabel3.setText("Timeline");

        searchbudgetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbudgetTextFieldActionPerformed(evt);
            }
        });

        searchtimelineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtimelineTextFieldActionPerformed(evt);
            }
        });

        ok2Button.setText("OK");
        ok2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ButtonActionPerformed(evt);
            }
        });

        ok3Button.setText("OK");
        ok3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok3ButtonActionPerformed(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        chatButton.setText("Chat");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Partner Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chatButton)
                .addGap(278, 278, 278)
                .addComponent(jLabel4)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chatButton)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchLabel)
                    .addComponent(viewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchbudgetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13)
                                .addComponent(searchtimelineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(searchprojectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ok1Button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ok3Button))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ok2Button))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchprojectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(ok1Button))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbudgetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ok2Button))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(viewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchtimelineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ok3Button))
                                    .addComponent(jLabel3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(clearButton)))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboBoxActionPerformed
        // TODO add your handling code here:
        int d=viewComboBox.getSelectedIndex();
        
        if (d==1){
            currentProjectGUI gui=new currentProjectGUI();
            currentProjectInforFrame f=new currentProjectInforFrame();
            f.setSize(1000, 600);
            f.setTitle("Current Project");
            f.setLayout(new BorderLayout());
            f.add(gui, BorderLayout.CENTER);
            f.setContentPane(gui);
            f.setVisible(true);

        }
        if (d==2){
            currentBudgetGUI gui=new currentBudgetGUI();
            currentBudgetFrame f=new currentBudgetFrame();
            f.setSize(500, 500);
            f.setTitle("Current Budget");
            f.setLayout(new BorderLayout());
            f.add(gui, BorderLayout.CENTER);
            f.setContentPane(gui);
            f.setVisible(true);
        }
        if (d==3){
            currentTimelineGUI gui=new currentTimelineGUI();
            currentTimelineFrame f=new currentTimelineFrame();
            f.setTitle("Current Timeline");
            f.setSize(1000, 600);
            f.setLayout(new BorderLayout());
            f.add(gui, BorderLayout.CENTER);
            f.setContentPane(gui);
            f.setVisible(true);

        }
    }//GEN-LAST:event_viewComboBoxActionPerformed

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        // TODO add your handling code here:
        IvyCommunicationGUI gui=new IvyCommunicationGUI();
        CommunicationFrame f=new CommunicationFrame();
        f.setTitle("Communication Window");
        f.setContentPane(gui);
        f.setSize(1000,1000);
        f.setVisible(true);
    }//GEN-LAST:event_chatButtonActionPerformed

    private void ok1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ButtonActionPerformed
        // TODO add your handling code here:
         addelementtojlist1(0);
    }//GEN-LAST:event_ok1ButtonActionPerformed

    private void ok2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ButtonActionPerformed
        // TODO add your handling code here:
         addelementtojlist2(0);
    }//GEN-LAST:event_ok2ButtonActionPerformed

    private void ok3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok3ButtonActionPerformed
        // TODO add your handling code here:
         addelementtojlist3(0);
    }//GEN-LAST:event_ok3ButtonActionPerformed

    private void searchprojectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchprojectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchprojectTextFieldActionPerformed

    private void searchbudgetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbudgetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbudgetTextFieldActionPerformed

    private void searchtimelineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtimelineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtimelineTextFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        searchprojectTextField.setText(null);
        searchbudgetTextField.setText(null);
        searchtimelineTextField.setText(null);
        if(evt.getSource()==clearButton) {
        DefaultListModel Model1 = (DefaultListModel) jList1.getModel();
        Model1.removeAllElements();
    }//GEN-LAST:event_clearButtonActionPerformed
    }
    /**
     *
     * @param Row
     */
    public void addelementtojlist1(int Row) {

    java.util.List<ProjectInfor> task = new IvyProjectInforService().readsearch(searchprojectTextField.getText());

        DefaultListModel model1 = new DefaultListModel();
        for (int i = 0; i < task.size(); i++) {
            ProjectInfor element = (ProjectInfor) task.get(i);
            model1.addElement(element.getProjectID());
            model1.addElement(element.getProjectName());
            model1.addElement(element.getProjectDescription());
            model1.addElement(element.getProjectOutcome());
            model1.addElement(element.getPartnername());
            model1.addElement(element.getStartDate());
            model1.addElement(element.getEndDate());
        }
        addelementtojlist(model1);
    }
    public void addelementtojlist2(int Row) {

    java.util.List<Budget> item = new IvyBudgetService().readsearch(searchbudgetTextField.getText());

        DefaultListModel model1 = new DefaultListModel();
        for (int i = 0; i < item.size(); i++) {
            Budget element = (Budget) item.get(i);
            model1.addElement(element.getBudgetID());
            model1.addElement(element.getLabor());
            model1.addElement(element.getSupply());
            model1.addElement(element.getTotal());
        }
        addelementtojlist(model1);
    }
public void addelementtojlist3(int Row) {

    java.util.List<Timeline> task = new IvyTimelineService().readsearch(searchtimelineTextField.getText());

        DefaultListModel model1 = new DefaultListModel();
        for (int i = 0; i < task.size(); i++) {
            Timeline element = (Timeline) task.get(i);
            model1.addElement(element.getTimelineID());
            model1.addElement(element.getStartDate());
            model1.addElement(element.getEndDate());
            model1.addElement(element.getStatus());
        }
        addelementtojlist(model1);
    }
       
    
  
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
            java.util.logging.Logger.getLogger(PartnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               PartnerFrame f= new PartnerFrame();
               
                f.setTitle("Partner Window");
                f.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager PersistenceUnitEntityManager;
    private javax.swing.JButton chatButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok1Button;
    private javax.swing.JButton ok2Button;
    private javax.swing.JButton ok3Button;
    private java.util.List<Entityclass.ProjectInfor> projectInforList;
    private javax.persistence.Query projectInforQuery;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchbudgetTextField;
    private javax.swing.JTextField searchprojectTextField;
    private javax.swing.JTextField searchtimelineTextField;
    private javax.swing.JComboBox viewComboBox;
    private javax.swing.JLabel viewLabel;
    // End of variables declaration//GEN-END:variables
}