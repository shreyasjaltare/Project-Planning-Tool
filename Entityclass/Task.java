package Entityclass;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public  class Task implements Serializable {


    @Column(name="EndDate",table="Task",length=45)
    @Basic
    private String endDate;


    @Column(name="TaskName",table="Task",length=45)
    @Basic
    private String taskName;


    @Column(name="UserID",table="Task",length=45)
    @Basic
    @Id
    private String userID;


    @Column(name="StartDate",table="Task",length=45)
    @Basic
    private String startDate;
    
    @Column(name="ProjectID",table="Task",length=45)
    @Basic
    private String projectID;
    
    @Column(name="UserName",table="Task",length=45)
    @Basic
    private String username;
    

    public Task(){

    }


   public String getEndDate() {
        return this.endDate;
    }


  public void setEndDate (String endDate) {
        this.endDate = endDate;
    }



   public String getTaskName() {
        return this.taskName;
    }


  public void setTaskName (String taskName) {
        this.taskName = taskName;
    }



   public String getUserID() {
        return this.userID;
    }


  public void setUserID (String userID) {
        this.userID = userID;
    }



   public String getStartDate() {
        return this.startDate;
    }


  public void setStartDate (String startDate) {
        this.startDate = startDate;
    }
  
  
  public String getProjectID() {
        return this.projectID;
    }


  public void setProjectID (String projectID) {
        this.projectID = projectID;
    }
  
  public String getUserName() {
        return this.username;
    }


  public void setUserName (String username) {
        this.username = username;
    }

// return number of columns in the table
	   public int getNumberOfColumns() {
		   return 6;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getUserID();
		   else if (i == 1)
			   return getTaskName();
		   else if (i == 2) 
			   return getStartDate();
		   else if (i == 3)
			   return getEndDate();
                   else if (i == 4)
			   return getProjectID();
                   else if (i == 5)
			   return getUserName();
		   else
			   throw new Exception("Error: invalid column index in Task table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "UserID";
		   else if (i == 1)
			   colName = "TaskName";
		   else if (i == 2)
			   colName = "StartDate";
		   else if (i == 3)
			   colName = "EndDate";
                   else if (i == 4)
			   colName = "ProjectID";
                   else if (i == 5)
			   colName = "UserName";
		   else 
			   throw new Exception("Access to invalid column number in Task table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   userID = (String) value;
		   else if (i == 1) 
			   taskName = (String) value;
		   else if (i == 2) 
			   startDate = (String) value;
		   else if (i == 3)
			   endDate = (String) value;
                   else if (i == 4)
			   projectID = (String) value;
                   else if (i == 5)
			   username = (String) value;
		   else
			   throw new Exception("Error: invalid column index in Task table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "Task [UserID =" + userID + ", "
	    	    + " TaskName =" + taskName + ","
	    	    + " StartDate =" + startDate + ","
	    	    + " EndDate =" + endDate + ","
                    + " ProjectID =" + projectID + ","
                    + " UserName =" + username + ","
	        + "]";
	  }

}

