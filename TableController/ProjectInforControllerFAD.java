package TableController;


import Entityclass.ProjectInfor;
import GUI.FADCurrentProjectsGui;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import TableModel.ProjectInforTableModel;
import TableService.ProjectInforService;
import java.util.List;





public class ProjectInforControllerFAD implements ListSelectionListener, TableModelListener {
	
	private ProjectInforTableModel tableModel;
	private FADCurrentProjectsGui gui;


	public ProjectInforControllerFAD(FADCurrentProjectsGui gui) {
		this.gui = gui;   
         // create the tableModel using the data in the cachedRowSet
    		tableModel = new ProjectInforTableModel(); 
    		tableModel.addTableModelListener(this);
	}
	public TableModel getTableModel() {
		return tableModel;
	}
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
            int firstIndex =  e.getFirstRow();
	    	
	    	// create a new table model with the new data
	        tableModel = new ProjectInforTableModel(tableModel.getList(), tableModel.getEntityManager());
	        tableModel.addTableModelListener(this);
	        // update the JTable with the data
	    	gui.updateTable();
                gui.textArea.setText("Project ID :"+(String) tableModel.getValueAt(firstIndex, 0));
                                gui.textArea.append("\nProject Name :"+(String) tableModel.getValueAt(firstIndex, 1));
    				gui.textArea.append("\nProject Description :"+(String) tableModel.getValueAt(firstIndex, 2));
    	                        gui.textArea.append("\nProject Outcome :"+(String) tableModel.getValueAt(firstIndex, 3));
                                   gui.textArea.append("\nPartner Name :"+(String) tableModel.getValueAt(firstIndex, 5));
                                      gui.textArea.append("\nStart Date :"+(String) tableModel.getValueAt(firstIndex, 6));
                                         gui.textArea.append("\nEnd Dare :"+(String) tableModel.getValueAt(firstIndex, 4));
	        // read the data in each column using getValueAt and display it on corresponding textfield
			
			//gui.setEndDateTextField( (String) tableModel.getValueAt(firstIndex, 4));
	} 
	
		
			

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		ListSelectionModel selectModel = (ListSelectionModel)e.getSource();
				int firstIndex = selectModel.getMinSelectionIndex();
                                    gui.displayInTextArea(firstIndex);
                                //managerGui.displayInProjectsTextArea(firstIndex);
			//	managerGui.displayValueInTextArea(firstIndex);
				
				
	}
	public void addRow(String[] array) {
             
            tableModel.addRow(array);			
	}
        public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
  public List<ProjectInfor> getSearchList(String Id)
     {      
            List<ProjectInfor> searchList = tableModel.getSearchList(Id);
            return searchList;
    }

}
