/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Entityclass.ProjectInfor;
import Entityclass.Task;
import Entityclass.Timeline;
import TableService.IvyProjectInforService;
import TableService.TaskService;
import TableService.IvyTimelineService;
import javax.swing.*;
import java.awt.*;

public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }
    public void projectidtextfield(String value) {
    	searchprojectTextField.setText(value);
    }
    
    
    public void taskidtextfield(String value) {
    	searchtaskTextField.setText(value);
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ok1Button = new javax.swing.JButton();
        searchprojectTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchtaskTextField = new javax.swing.JTextField();
        searchtimelineTextField = new javax.swing.JTextField();
        ok2Button = new javax.swing.JButton();
        ok3Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        clearButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        chatButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Search");

        ok1Button.setText("OK");
        ok1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ButtonActionPerformed(evt);
            }
        });

        searchprojectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchprojectTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Project");

        jLabel5.setText("Task");

        jLabel6.setText("Timeline");

        searchtaskTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtaskTextFieldActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("View");

        viewComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Project", "Task", "Timeline" }));
        viewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchtimelineTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(searchtaskTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchprojectTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ok2Button))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ok3Button, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ok1Button, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok1Button)
                    .addComponent(searchprojectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(searchtaskTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ok2Button)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(searchtimelineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok3Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39))
        );

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        chatButton.setText("Chat");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel7.setText("Student Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(chatButton)
                .addGap(232, 232, 232)
                .addComponent(jLabel7)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chatButton)
                    .addComponent(jLabel7))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(clearButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(clearButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboBoxActionPerformed
        // TODO add your handling code here:
        int d=viewComboBox.getSelectedIndex();
        
    if (d==1){
        currentProjectGUI gui=new currentProjectGUI();
        currentProjectInforFrame f=new currentProjectInforFrame();
        f.setLayout(new BorderLayout());
    		f.add(gui, BorderLayout.CENTER);
        f.setContentPane(gui);
        f.setVisible(true);
    
         }
    if (d==2){
                currentTaskGUI gui=new currentTaskGUI();
                currentTaskFrame f=new currentTaskFrame();
                f.setSize(500, 500);
                f.setLayout(new BorderLayout());
    		f.add(gui, BorderLayout.CENTER);
                f.setContentPane(gui);
                f.setVisible(true);
         }
    if (d==3){
       currentTimelineGUI gui=new currentTimelineGUI();
        currentTimelineFrame f=new currentTimelineFrame();
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
                f.setSize(1000, 600);
                f.setVisible(true);
    }//GEN-LAST:event_chatButtonActionPerformed

    private void searchprojectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchprojectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchprojectTextFieldActionPerformed

    private void searchtaskTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtaskTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtaskTextFieldActionPerformed

    private void searchtimelineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtimelineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtimelineTextFieldActionPerformed

    private void ok2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ButtonActionPerformed
        // TODO add your handling code here:
         addelementtojlist2(0);
    }//GEN-LAST:event_ok2ButtonActionPerformed

    private void ok3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok3ButtonActionPerformed
        // TODO add your handling code here:
         addelementtojlist3(0);
    }//GEN-LAST:event_ok3ButtonActionPerformed

    private void ok1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ButtonActionPerformed
        // TODO add your handling code here:
        addelementtojlist1(0);
    }//GEN-LAST:event_ok1ButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        searchprojectTextField.setText(null);
        searchtaskTextField.setText(null);
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

    java.util.List<Task> item = new TaskService().readsearch(searchtaskTextField.getText());

        DefaultListModel model1 = new DefaultListModel();
        for (int i = 0; i < item.size(); i++) {
            Task element = (Task) item.get(i);
            model1.addElement(element.getUserID());
            model1.addElement(element.getTaskName());
            model1.addElement(element.getStartDate());
            model1.addElement(element.getEndDate());
          
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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                StudentFrame f= new StudentFrame();
                
                f.setTitle("Student Window");
                f.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chatButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok1Button;
    private javax.swing.JButton ok2Button;
    private javax.swing.JButton ok3Button;
    private javax.swing.JTextField searchprojectTextField;
    private javax.swing.JTextField searchtaskTextField;
    private javax.swing.JTextField searchtimelineTextField;
    private javax.swing.JComboBox viewComboBox;
    // End of variables declaration//GEN-END:variables
}
