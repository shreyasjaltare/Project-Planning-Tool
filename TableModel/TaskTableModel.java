/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

/**
 *
 * @author shreyasjaltare
 */
import Entityclass.Task;
import TableService.TaskService;
import TableService.TaskService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.*;
import javax.persistence.*;
import java.util.*;



public class TaskTableModel extends AbstractTableModel {

	  List<Task> TaskResultList;   // stores the model data in a List collection of type TeamInfor
	  private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit";  // Used in persistence.xml
	  private static EntityManagerFactory factory;  // JPA  
	  private EntityManager manager;				// JPA 
	  private Task Task;			    // represents the entity Teaminfor
	  private TaskService TaskService;
	
	   // This field contains additional information about the results   
	    int numcols, numrows;           // number of rows and columns

	public TaskTableModel() {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    manager = factory.createEntityManager();
	    Task = new Task();
	    TaskService = new TaskService(manager);
	    
	    // read all the records from Teaminfor
	    TaskResultList = TaskService.readALL();
	    
	    // update the number of rows and columns in the model
	    numrows = TaskResultList.size();
	    numcols = Task.getNumberOfColumns();
      }

    

	 // returns a count of the number of rows
	 public int getRowCount() {
		return numrows;
	 }
	
	 // returns a count of the number of columns
	 public int getColumnCount() {
		return numcols;
	 }
	
	 // returns the data at the given row and column number
	 public Object getValueAt(int row, int col) {
		try {
		  return TaskResultList.get(row).getColumnData(col);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	 }
	
	 // table cells are not editable
	 public boolean isCellEditable(int rowIndex, int colIndex) {
		return false;
	 }
	
	 public Class<?> getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	 }
	
	 // returns the name of the column
	 public String getColumnName(int col) {
		   try {
				return Task.getColumnName(col);
			} catch (Exception err) {
	             return err.toString();
	       }             
	 }
	
	 // update the data in the given row and column to aValue
	 public void setValueAt(Object aValue, int row, int col) {
		//data[rowIndex][columnIndex] = (String) aValue;
		try {
		   Task element = TaskResultList.get(row);
                   element.setColumnData(col, aValue); 
            fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}	
	 }
	
	 public List<Task> getList() {
		 return TaskResultList;
	 }

	 public EntityManager getEntityManager() {
	      return manager;
	 }

	 // create a new table model using the existing data in list
	 public TaskTableModel(List<Task> list, EntityManager em)  {
	    TaskResultList = list;
	    numrows = TaskResultList.size();
	    Task = new Task();
	   	numcols = Task.getNumberOfColumns();     
		manager = em;  
		TaskService = new TaskService(manager);
	 }
          public void remove(int row){
             try {
		  // User element = userResultList.get(row);
                         //ListIterator<User> itr = userResultList.listIterator();
                        
                         
		
				 TaskResultList.remove(row);
                                /// fireTableRowsDeleted(row, row);
                                 fireTableDataChanged();
                                
                                numrows--;
                    } catch(Exception err) {
			err.toString();
		}	
         }
	 public void deleteRow(String arr, int selectedRow){
             try{
                  remove(selectedRow);
                 
                 EntityTransaction userTransaction = manager.getTransaction();
				userTransaction.begin();
				TaskService.deleteTask(arr);
				userTransaction.commit();
				numrows--;
				
                                TaskResultList.remove(Task);
				fireTableRowsDeleted(1, getRowCount());
				
             }
             catch(Exception e){
             e.printStackTrace();
             }
         }
	 // In this method, a newly inserted row in the GUI is added to the table model as well as the database table
	 // The argument to this method is an array containing the data in the textfields of the new row.
	 public void addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
			
	    // add row to database
		EntityTransaction userTransaction = manager.getTransaction();  
		userTransaction.begin();
		Task newRecord = TaskService.createTask((String) array[0], (String) array[1], (String) array[2], (String) array[3],(String) array[4],(String) array[5]);
		userTransaction.commit();
		 
		// set the current row to rowIndex
        TaskResultList.add(newRecord);
        int row = TaskResultList.size();  
        int col = 0;

        // update the data in the model to the entries in array
         for (Object data : array) {
          	 setValueAt((String) data, row-1, col++);
         }
         
         numrows++;
	}	
         public void updateRow(String[] array, int row){
             for (int i=0;i<5;i++) {
          	 setValueAt( array[i+1], row, i+1);
         }
            EntityTransaction userTransaction = manager.getTransaction();
             userTransaction.begin();
             TaskService.updateTask(array[0],array[1],array[2],array[3],array[4],array[5]);
             userTransaction.commit();
         }
}



