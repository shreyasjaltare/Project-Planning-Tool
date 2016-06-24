package TableController;

import Entityclass.Budget;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import TableModel.IvyProjectInforTableModel;
import GUI.currentProjectGUI;




public class IvyProjectInforController implements ListSelectionListener, TableModelListener {
	
	private IvyProjectInforTableModel tableModel;
        private currentProjectGUI gui1;
	//private Manager1Gui managerGui;


	public IvyProjectInforController() {
		//this.managerGui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new IvyProjectInforTableModel(); 
    		tableModel.addTableModelListener(this);
	}
        public IvyProjectInforController(currentProjectGUI gui1){
            this.gui1=gui1;
            tableModel=new IvyProjectInforTableModel();
            tableModel.addTableModelListener(this);
        }
	public TableModel getTableModel() {
		return tableModel;
	}
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
            int firstIndex =  e.getFirstRow();
	    	
	    	// create a new table model with the new data
	        tableModel = new IvyProjectInforTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	//managerGui.updateTable();
	    
	        // read the data in each column using getValueAt and display it on corresponding textfield
			
			//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	} 
	
		
			

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		ListSelectionModel selectModel = (ListSelectionModel)e.getSource();
				int firstIndex = selectModel.getMinSelectionIndex();
                                
                                //managerGui.displayInProjectsTextArea(firstIndex);
			//	managerGui.displayValueInTextArea(firstIndex);
				
				
	}
	public void addRow(String[] array) {
             
            tableModel.addRow(array);			
	}
        public void deleteRow(String row){
		tableModel.deleteRow(row);
	}

}
