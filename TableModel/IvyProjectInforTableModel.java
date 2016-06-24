package TableModel;

import Entityclass.Budget;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

import Entityclass.ProjectInfor;
import TableService.IvyProjectInforService;

public class IvyProjectInforTableModel extends AbstractTableModel {
	List<ProjectInfor> projectInforList;
	private static final String PERSISTENCE_UNIT_NAME ="PersistenceUnit"; 
	private static EntityManagerFactory factory; // JPA
	private EntityManager manager; // JPA
	private ProjectInfor project;// represents the entity
	private IvyProjectInforService service ;
	private int numcols, numrows;
	
	

	public IvyProjectInforTableModel() {
		super();
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				manager = factory.createEntityManager();
				project = new ProjectInfor();
				service = new IvyProjectInforService(manager);
			    
			    // read all the records from ProjectInformationList
			    projectInforList = service.readALL();
			    
			    // update the number of rows and columns in the model
			    numrows = projectInforList.size();
			    numcols = project.getNumberOfColumns();
			    
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return numrows;
		
	}

	@Override
	public String getColumnName(int col) {
		try {
		return project.getColumnName(col);
		} catch (Exception err) {
		return err.toString();
		}
		}
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return numcols;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		try {
			  return projectInforList.get(rowIndex).getColumnData(columnIndex);
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
	public void setValueAt(Object aValue, int row, int col) {
		
		try {
		   ProjectInfor element = projectInforList.get(row);
                   element.setColumnData(col, aValue); 
            fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}	
	 }
	
	public List<ProjectInfor> getList() {
		 return projectInforList;
	 }
	
	 public EntityManager getEntityManager() {
	      return manager;
	 }
	 
	 public IvyProjectInforTableModel(List<ProjectInfor> list, EntityManager em)  {
		    projectInforList = list;
		    numrows = projectInforList.size();
		    project = new ProjectInfor();
		   	numcols = project.getNumberOfColumns();     
			manager = em;  
			service = new IvyProjectInforService(manager);
		 }
	 public void addRow(String[] array) {
		
			EntityTransaction userTransaction = manager.getTransaction();  
			userTransaction.begin();
			ProjectInfor newRecord = service.createProject(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
			userTransaction.commit();
			 
			// set the current row to rowIndex
			projectInforList.add(newRecord);
	        int row = projectInforList.size();  
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
				project = projectInforList.get(row);
				
				EntityTransaction userTransaction = manager.getTransaction();
				userTransaction.begin();
				service.deleteProjectInfor(project.getProjectID());
				userTransaction.commit();
				
				projectInforList.remove(project);
				fireTableRowsDeleted(row, row);
				numrows--;}
                                catch (Exception e) {
				e.printStackTrace();}
		}

}
