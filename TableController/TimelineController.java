/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableController;

import Entityclass.Timeline;
import TableModel.ProjectInforTableModel;
import TableModel.TimelineTableModel;
import GUI.TimelineGUI;
import TableService.TimelineService;
import java.awt.SystemColor;
import java.util.List;

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
public class TimelineController implements ListSelectionListener, TableModelListener {

    
    
        private TimelineTableModel tableModel;
	private TimelineGUI timelineGui;
    
        public TimelineController(TimelineGUI timelineGui) {
        this.timelineGui = timelineGui;
        tableModel = new TimelineTableModel(); 
    		tableModel.addTableModelListener(this);
    }
        public TableModel getTableModel() {
		return tableModel;
	}

        public void valueChanged(ListSelectionEvent e) {
    		// TODO Auto-generated method stub
    		ListSelectionModel selectModel = (ListSelectionModel)e.getSource();
    				int firstIndex = selectModel.getMinSelectionIndex();
                                timelineGui.setstartDate((String) tableModel.getValueAt(firstIndex, 1));
                                timelineGui.setEndTextField((String) tableModel.getValueAt(firstIndex, 2));
                                timelineGui.setStatusTextField((String) tableModel.getValueAt(firstIndex, 3));
    				//timelineGui.displayValueInTextArea(firstIndex);
    				
    				
    	}
    @Override
    public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		int firstIndex =  e.getFirstRow();
    	
    	// create a new table model with the new data
        tableModel = new TimelineTableModel(tableModel.getList(), tableModel.getEntityManager());
        tableModel.addTableModelListener(this);
        // update the JTable with the data
    	timelineGui.updateTable();
	
	}		
    public List<Timeline> getSearchList(String Id)
     {      List<Timeline> searchList = tableModel.getSearchList(Id);
            return searchList;
    }
    public void addRow(String[] array) {
		tableModel.addRow(array);			
	}
    public void deleteRow(String row){
		tableModel.deleteRow(row);
	}
    
}
