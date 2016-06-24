/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

/**
 *
 * @author shreyasjaltare
 */
import GUI.TaskGUI;
import TableModel.TaskTableModel;
import Entityclass.Task;
import GUI.currentTaskGUI;
import TableModel.TaskTableModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;

public class TaskTableController implements ListSelectionListener, TableModelListener{
	private TaskTableModel tableModel;
	private TaskGUI gui;
        private currentTaskGUI gui1;
        private int r;
        int currentrow;
	
	public TaskTableController(TaskGUI gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new TaskTableModel(); 
    		tableModel.addTableModelListener(this);
	}
	public TaskTableController(currentTaskGUI gui1) {
		this.gui1 = gui1;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new TaskTableModel(); 
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
	        tableModel = new TaskTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			gui.useridtextfield( (String) tableModel.getValueAt(firstIndex, 0));
			gui.tasknametextfield( (String) tableModel.getValueAt(firstIndex, 1));
			gui.startdatetextfield( (String) tableModel.getValueAt(firstIndex, 2));
			gui.enddatetextfield( (String) tableModel.getValueAt(firstIndex, 3));
                        gui.projectidtextfield( (String) tableModel.getValueAt(firstIndex, 4));
                        gui.usernametextfield( (String) tableModel.getValueAt(firstIndex, 5));
                        
			
	} catch(Exception exp) {
		exp.getMessage();
		exp.printStackTrace();
	}
}


	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		r=firstIndex;
		// read the data in each column using getValueAt and display it on corresponding textfield
		gui.useridtextfield( (String) tableModel.getValueAt(firstIndex, 0));
		gui.tasknametextfield( (String) tableModel.getValueAt(firstIndex, 1));
		gui.startdatetextfield( (String) tableModel.getValueAt(firstIndex, 2));
		gui.enddatetextfield( (String) tableModel.getValueAt(firstIndex, 3));
                gui.projectidtextfield( (String) tableModel.getValueAt(firstIndex, 4));
                gui.usernametextfield( (String) tableModel.getValueAt(firstIndex, 5));
		
	}
	
	public void addRow(String[] array) {
		tableModel.addRow(array);			
	}
        public void deleteRow(String array){
            tableModel.deleteRow(array,r);
        }
        public void updateRow(String[] array){
            tableModel.updateRow(array,r);
        }
        
        

}



