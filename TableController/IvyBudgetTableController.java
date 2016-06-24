/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import TableModel.IvyBudgetTableModel;
import GUI.IvyBudgetGUI;
import GUI.currentBudgetGUI;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;

/**
 *
 * @author Ivy
 */
public class IvyBudgetTableController implements ListSelectionListener, TableModelListener{
        private IvyBudgetTableModel tableModel;
	private IvyBudgetGUI gui;
	private currentBudgetGUI gui1;
	public IvyBudgetTableController(IvyBudgetGUI gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new IvyBudgetTableModel(); 
    		tableModel.addTableModelListener(this);
	}
	
	public IvyBudgetTableController(currentBudgetGUI gui1){
            this. gui1=gui1;
            tableModel=new IvyBudgetTableModel();
            tableModel.addTableModelListener(this);
        }
	// new code
	public TableModel getTableModel() {
		return tableModel;
	}
	
	public void tableChanged(TableModelEvent e)
	{
	   try {
	    	// get the index of the inserted row
	        //tableModel.getRowSet().moveToCurrentRow();
	    	int firstIndex =  e.getFirstRow();
	    	
	    	// create a new table model with the new data
	        tableModel = new IvyBudgetTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			gui.setProjectIDTextField( (String) tableModel.getValueAt(firstIndex, 0));
			gui.setLaborTextField( (String) tableModel.getValueAt(firstIndex, 1));
			gui.setSupplyTextField( (String) tableModel.getValueAt(firstIndex, 2));
			gui.setTotalTextField( (String) tableModel.getValueAt(firstIndex, 3));
			//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	} catch(Exception exp) {
		exp.getMessage();
		exp.printStackTrace();
	}
}


	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		
		// read the data in each column using getValueAt and display it on corresponding textfield
		gui.setProjectIDTextField( (String) tableModel.getValueAt(firstIndex, 0));
		gui.setLaborTextField( (String) tableModel.getValueAt(firstIndex, 1));
		gui.setSupplyTextField( (String) tableModel.getValueAt(firstIndex, 2));
		gui.setTotalTextField( (String) tableModel.getValueAt(firstIndex, 3));
		//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	}
	
	public void addRow(String[] array) {
		tableModel.addRow(array);			
	}
	public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
}
