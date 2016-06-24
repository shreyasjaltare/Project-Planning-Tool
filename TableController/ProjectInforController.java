package TableController;

import Entityclass.Budget;
import Entityclass.ProjectInfor;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import TableModel.ProjectInforTableModel;
import GUI.Manager1Gui;
import TableService.ProjectInforService;
import java.util.List;




public class ProjectInforController implements ListSelectionListener, TableModelListener {
	
	private ProjectInforTableModel tableModel;
	private Manager1Gui gui;


	public ProjectInforController(Manager1Gui gui) {
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
                gui.updateTable();
                String array[] = new String [7];
                array[0] = (String) tableModel.getValueAt(firstIndex, 0);
                array[1] = (String) tableModel.getValueAt(firstIndex, 1);
                array[2] = (String) tableModel.getValueAt(firstIndex, 2);
                array[3] = (String) tableModel.getValueAt(firstIndex, 3);
                array[4] = (String) tableModel.getValueAt(firstIndex, 4);
                array[5] = (String) tableModel.getValueAt(firstIndex, 5);
                array[6] = (String) tableModel.getValueAt(firstIndex, 6);
	        // update the JTable with the data
	    	gui.displayText(array);
                 
	    
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
	  public List<ProjectInfor> getSearchList(String Id)
     {      
            List<ProjectInfor> searchList = tableModel.getSearchList(Id);
            return searchList;
    }
        public ProjectInfor addRow(String[] array) {
             
            ProjectInfor newRecord =tableModel.addRow(array);	
            return newRecord;
	}
        public void deleteRow(String row){
		tableModel.deleteRow(row);
	}

}
