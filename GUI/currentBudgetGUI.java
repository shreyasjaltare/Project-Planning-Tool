/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import TableController.IvyBudgetTableController;
        

/**
 *
 * @author Ivy
 */
public class currentBudgetGUI extends javax.swing.JPanel {
      private JTable jtable1;
      private IvyBudgetTableController budgetTableController;
    /**
     * Creates new form BudgetGUI
     */
    public currentBudgetGUI() {
        
        budgetTableController=new IvyBudgetTableController(this);
        initComponents();
        addJTable();
        
       // budgetTableController=new IvyBudgetTableController(this);
    }
   public void addJTable(){
    // add the data and column names to a JTable
    		//jtable1  = new JTable(courseListTableController.getData(), courseListTableController.getColumnNames());
    	   
    	    jtable1 = new JTable(budgetTableController.getTableModel());
    		// add a ListSelectionListener to the table
    		jtable1.getSelectionModel().addListSelectionListener(budgetTableController);
    		
    		// add the table to a scrollpane
    		JScrollPane scrollpane = new JScrollPane(jtable1);
    		// create a window
    		jPanel1.setLayout(new BorderLayout());
    		jPanel1.add(scrollpane, BorderLayout.CENTER);
    
    }
    public void updateTable() {
    	jtable1.setModel(budgetTableController.getTableModel());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
