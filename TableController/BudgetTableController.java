/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import Entityclass.Budget;
import Entityclass.ProjectInfor;
import TableModel.BudgetTableModel;
import GUI.BudgetGUI;
import TableService.BudgetService;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;

public class BudgetTableController implements ListSelectionListener, TableModelListener{
        private BudgetTableModel tableModel;
	private BudgetGUI gui;
        
	
	public BudgetTableController(BudgetGUI gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new BudgetTableModel(); 
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
	        tableModel = new BudgetTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			
			gui.setLaborTextField( (String) tableModel.getValueAt(firstIndex, 1));
			gui.setSupplyTextField( (String) tableModel.getValueAt(firstIndex, 2));
			gui.setTotalTextField( (String) tableModel.getValueAt(firstIndex, 3));
			//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	} catch(Exception exp) {
		exp.getMessage();
		exp.printStackTrace();
	}
}   
       public List<Budget> getSearchList(String Id)
     {      
            List<Budget> searchList = tableModel.getSearchList(Id);
            return searchList;
    } 


	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		
		// read the data in each column using getValueAt and display it on corresponding textfield
		
		gui.setLaborTextField( (String) tableModel.getValueAt(firstIndex, 1));
		gui.setSupplyTextField( (String) tableModel.getValueAt(firstIndex, 2));
		gui.setTotalTextField( (String) tableModel.getValueAt(firstIndex, 3));
		//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	}
	
	public void addRow(String[] array,ProjectInfor newProjectRecord) {
		tableModel.addRow(array,newProjectRecord);			
	}
	public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
}
