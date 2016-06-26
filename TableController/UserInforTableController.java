/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;



import GUI.UserInforGUI;
import TableModel.UserInforTableModel;
import TableModel.UserInforTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;
public class UserInforTableController implements ListSelectionListener, TableModelListener{
	private UserInforTableModel tableModel;
	private UserInforGUI gui;
        private int r;
	
	public UserInforTableController(UserInforGUI gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new UserInforTableModel(); 
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
	        tableModel = new UserInforTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			gui.useridtextfield( (String) tableModel.getValueAt(firstIndex, 0));
			gui.accounttypetextfield( (String) tableModel.getValueAt(firstIndex, 1));
			gui.nametextfield( (String) tableModel.getValueAt(firstIndex, 2));
			gui.passwordtextfield( (String) tableModel.getValueAt(firstIndex, 3));
                        gui.emailtextfield( (String) tableModel.getValueAt(firstIndex, 4));
			
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
		gui.accounttypetextfield( (String) tableModel.getValueAt(firstIndex, 1));
		gui.nametextfield( (String) tableModel.getValueAt(firstIndex, 2));
		gui.passwordtextfield( (String) tableModel.getValueAt(firstIndex, 3));
                gui.emailtextfield( (String) tableModel.getValueAt(firstIndex, 4));
		
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


