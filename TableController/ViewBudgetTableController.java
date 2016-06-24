/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import Entityclass.Budget;
import TableModel.BudgetTableModel;
import GUI.ViewBudget;
import TableService.BudgetService;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;

/**
 *
 * @author Ivy
 */
public class ViewBudgetTableController implements ListSelectionListener, TableModelListener{
        private BudgetTableModel tableModel;
	private ViewBudget gui;
        
	
	public ViewBudgetTableController(ViewBudget gui) {
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
			
			//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	} catch(Exception exp) {
		exp.getMessage();
		exp.printStackTrace();
	}
}


	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		gui.textArea.setText("Project ID :"+(String) tableModel.getValueAt(firstIndex, 0));
                                gui.textArea.append("\nLabour :"+(String) tableModel.getValueAt(firstIndex, 1));
    				gui.textArea.append("\nSupply :"+(String) tableModel.getValueAt(firstIndex, 2));
    	                          gui.textArea.append("\nTotal :"+(String) tableModel.getValueAt(firstIndex, 3));
	}
	public List<Budget> getSearchList(String Id)
     {      
            List<Budget> searchList = tableModel.getSearchList(Id);
            return searchList;
    } 
	
	public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
}
