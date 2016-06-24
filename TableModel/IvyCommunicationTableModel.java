/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;
import javax.swing.table.*;
import javax.persistence.*;
import java.util.*;
import Entityclass.Communication;
import TableService.IvyCommunicationService;
/**
 *
 * @author Ivy
 */
public class IvyCommunicationTableModel extends AbstractTableModel{
          List<Communication> communicationResultList;   // stores the model data in a List collection of type Communication
	  private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit";  // Used in persistence.xml
	  private static EntityManagerFactory factory;  // JPA  
	  private EntityManager manager;               // JPA 
	  private Communication communication;			    // represents the entity communication
	  private IvyCommunicationService communicationService;
	
	   // This field contains additional information about the results   
	    int numcols, numrows;           // number of rows and columns

	public IvyCommunicationTableModel() {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    manager = factory.createEntityManager();
	    communication = new Communication();
	    communicationService = new IvyCommunicationService(manager);
	    
	    // read all the records from communication
	    communicationResultList = communicationService.readALL();
	    
	    // update the number of rows and columns in the model
	    numrows = communicationResultList.size();
	    numcols = communication.getNumberOfColumns();
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
		  return communicationResultList.get(row).getColumnData(col);
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
		          return communication.getColumnName(col);
			} catch (Exception err) {
	             return err.toString();
	       }             
	 }
	
	 // update the data in the given row and column to aValue
	 public void setValueAt(Object aValue, int row, int col) {
		//data[rowIndex][columnIndex] = (String) aValue;
		try {
		   Communication element = communicationResultList.get(row);
                  element.setColumnData(col, aValue); 
           fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}	
	 }
	
	 public List<Communication> getList() {
		 return communicationResultList;
	 }

	 public EntityManager getEntityManager() {
	      return manager;
	 }

	 // create a new table model using the existing data in list
	 public IvyCommunicationTableModel(List<Communication> list, EntityManager em)  {
	    communicationResultList = list;
	    numrows = communicationResultList.size();
	    communication = new Communication();
	   	numcols = communication.getNumberOfColumns();     
		manager = em;  
		communicationService = new IvyCommunicationService(manager);
	 }
	 
	 // In this method, a newly inserted row in the GUI is added to the table model as well as the database table
	 // The argument to this method is an array containing the data in the textfields of the new row.
	 public void addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
			
	    // add row to database
		EntityTransaction userTransaction = manager.getTransaction();  
		userTransaction.begin();
                Communication newRecord = communicationService.createCommunication((String) array[0],
                        (String) array[1], (String) array[2],(String) array[3],(String) array[4]);
		userTransaction.commit();
		 
		// set the current row to rowIndex
       communicationResultList.add(newRecord);
       int row = communicationResultList.size();  
       int col = 0;

       // update the data in the model to the entries in array
        for (Object data : array) {
         	 setValueAt((String) data, row-1, col++);
        }
        
        numrows++;
	}	
	 public void deleteRow(Object obj) {
			try {
				int row = Integer.parseInt((String) obj);
				communication = communicationResultList.get(row);
				
				EntityTransaction userTransaction = manager.getTransaction();
				userTransaction.begin();
				communicationService.deleteCommunication(communication.getCommunicationID());
				userTransaction.commit();
				
				communicationResultList.remove(communication);
				fireTableRowsDeleted(row, row);
				numrows--;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
}
