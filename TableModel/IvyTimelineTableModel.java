package TableModel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;


import Entityclass.Timeline;

//import ServiceClass.CommunicationService;
//import ServiceClass.ProjectInforService;
import TableService.IvyTimelineService;

public class IvyTimelineTableModel extends AbstractTableModel {
	List<Timeline> TimelineList;
	private static final String PERSISTENCE_UNIT_NAME ="PersistenceUnit"; 
	private static EntityManagerFactory factory; // JPA
	private EntityManager manager; // JPA
	private	Timeline timeline;// represents the entity
	private IvyTimelineService service ;
	private int numcols, numrows;
        
	
	

	public IvyTimelineTableModel() {
		super();
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				manager = factory.createEntityManager();
				timeline = new Timeline();
				service = new IvyTimelineService(manager);
			    
			    // read all the records from ProjectInformationList
				TimelineList = service.readALL();
			    
			    // update the number of rows and columns in the model
			    numrows = TimelineList.size();
			    numcols = timeline.getNumberOfColumns();
			    
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return numrows;
		
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return numcols;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		try {
			  return TimelineList.get(rowIndex).getColumnData(columnIndex);
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
	}
	
	public boolean isCellEditable(int rowIndex, int colIndex) {
		return false;
	 }
	
	public Class<?> getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	 }
        public String getColumnName(int col) {
		   try {
				return timeline.getColumnName(col);
			} catch (Exception err) {
	             return err.toString();
	       }             
	 }
	public void setValueAt(Object aValue, int row, int col) {
		
		try {
			Timeline element = TimelineList.get(row);
                   element.setColumnData(col, aValue); 
            fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}	
	 }
	
	public List<Timeline> getList() {
		 return TimelineList;
	 }
	
	 public EntityManager getEntityManager() {
	      return manager;
	 }
	 
	 public IvyTimelineTableModel(List<Timeline> list, EntityManager em)  {
		 TimelineList = list;
		    numrows = TimelineList.size();
		    timeline = new Timeline();
		   	numcols = timeline.getNumberOfColumns();     
			manager = em;  
			service = new IvyTimelineService(manager);
		 }
	 public void addRow(Object[] array) {
		
			EntityTransaction userTransaction = manager.getTransaction();  
			userTransaction.begin();
			Timeline newRecord = service.createTimeline((String)array[0],(String)array[1],(String)array[2],(String)array[3]);
					
			userTransaction.commit();
			 
			// set the current row to rowIndex
			TimelineList.add(newRecord);
	        int row = TimelineList.size();  
	        int col = 0;

	        // update the data in the model to the entries in array
	         for (Object data : array) {
	          	 setValueAt((String) data, row-1, col++);
	         }
	         
	         numrows++;
		}
	 
	 public void deleteRow(Object obj)
		{	try{
			int row = Integer.parseInt((String) obj);
				timeline = TimelineList.get(row);
				
				EntityTransaction userTransaction = manager.getTransaction();
				userTransaction.begin();
				service.deleteTimeline(timeline.getTimelineID());
				userTransaction.commit();
				
				TimelineList.remove(timeline);
				fireTableRowsDeleted(row, row);
				numrows--;
                               }
                            catch (Exception e) {
				e.printStackTrace();}
                
                
                }           

}
