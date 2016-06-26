/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;
import TableModel.IvyCommunicationTableModel;
import GUI.IvyCommunicationGUI;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;

public class IvyCommunicationTableController implements ListSelectionListener, TableModelListener{
      private IvyCommunicationTableModel tableModel;
	private IvyCommunicationGUI gui;
	
	public IvyCommunicationTableController(IvyCommunicationGUI gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new IvyCommunicationTableModel(); 
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
	        tableModel = new IvyCommunicationTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			gui.setCommunicationIDTextField((String) tableModel.getValueAt(firstIndex,0));
                        gui.setProjectIDTextField( (String) tableModel.getValueAt(firstIndex, 1));
			gui.setDateTextField( (String) tableModel.getValueAt(firstIndex, 2));
			gui.setNameTextField( (String) tableModel.getValueAt(firstIndex, 3));
			gui.setSummaryTextField( (String) tableModel.getValueAt(firstIndex, 4));
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
                gui.setCommunicationIDTextField((String) tableModel.getValueAt(firstIndex,0));
		gui.setProjectIDTextField( (String) tableModel.getValueAt(firstIndex, 1));
		gui.setDateTextField( (String) tableModel.getValueAt(firstIndex, 2));
		gui.setNameTextField( (String) tableModel.getValueAt(firstIndex, 3));
		gui.setSummaryTextField( (String) tableModel.getValueAt(firstIndex, 4));
		//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	}
	
	public void addRow(String[] array) {
		tableModel.addRow(array);			
	}
	public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
}
