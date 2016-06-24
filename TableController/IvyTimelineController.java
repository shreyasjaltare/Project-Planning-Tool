/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import TableModel.IvyProjectInforTableModel;
import TableModel.IvyTimelineTableModel;

import GUI.currentTimelineGUI;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author yash
 */
public class IvyTimelineController implements ListSelectionListener, TableModelListener {

    
    
        private IvyTimelineTableModel tableModel;
	//private TimelineGUI timelineGui;
        private currentTimelineGUI currenttimelineGUI;
    
       /* public IvyTimelineController(TimelineGUI timelineGui) {
        this.timelineGui = timelineGui;
        tableModel = new IvyTimelineTableModel(); 
    		tableModel.addTableModelListener(this);
    }*/
        public IvyTimelineController(currentTimelineGUI currenttimelineGui) {
        this.currenttimelineGUI = currenttimelineGui;
        tableModel = new IvyTimelineTableModel(); 
    		tableModel.addTableModelListener(this);
    }
        public TableModel getTableModel() {
		return tableModel;
	}

        public void valueChanged(ListSelectionEvent e) {
    		// TODO Auto-generated method stub
    		ListSelectionModel selectModel = (ListSelectionModel)e.getSource();
    				int firstIndex = selectModel.getMinSelectionIndex();
    				//timelineGui.displayValueInTextArea(firstIndex);
    				
    				
    	}
    @Override
    public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		int firstIndex =  e.getFirstRow();
    	
    	// create a new table model with the new data
        tableModel = new IvyTimelineTableModel(tableModel.getList(), tableModel.getEntityManager());
        tableModel.addTableModelListener(this);
        // update the JTable with the data
    	currenttimelineGUI.updateTable();
	
	}		
    public void addRow(String[] array) {
		tableModel.addRow(array);			
	}
    public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
    
}
