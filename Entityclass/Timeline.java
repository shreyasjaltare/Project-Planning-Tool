package Entityclass;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Timeline")
public  class Timeline implements Serializable {


    @Column(name="EndDate",table="Timeline",length=45)
    @Basic
    private String endDate;


    @Column(name="TimelineID",table="Timeline",nullable=false,length=45)
    @Id
    private String timelineID;


    @Column(name="StartDate",table="Timeline",length=45)
    @Basic
    private String startDate;


    @Column(name="Status",table="Timeline",length=45)
    @Basic
    private String status;

    public Timeline(){

    }


   public String getEndDate() {
        return this.endDate;
    }


  public void setEndDate (String endDate) {
        this.endDate = endDate;
    }



   public String getTimelineID() {
        return this.timelineID;
    }


  public void setTimelineID (String timelineID) {
        this.timelineID = timelineID;
    }



   public String getStartDate() {
        return this.startDate;
    }


  public void setStartDate (String startDate) {
        this.startDate = startDate;
    }



   public String getStatus() {
        return this.status;
    }


  public void setStatus (String status) {
        this.status = status;
    }
 public int getNumberOfColumns() {
		   return 4;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getTimelineID();
		   else if (i == 1)
			   return getStartDate();
		   else if (i == 2) 
			   return getEndDate();
		   else if (i == 3)
			   return getStatus();
               
		   else
			   throw new Exception("Error: invalid column index in Timeline table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "TimelineID";
		   else if (i == 1)
			   colName = "StartDate";
		   else if (i == 2)
			   colName = "EndDate";
		   else if (i == 3)
			   colName = "Status";
                 
		   else 
			   throw new Exception("Access to invalid column number in Timeline table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   timelineID = (String) value;
		   else if (i == 1) 
			   startDate = (String) value;
		   else if (i == 2) 
			   endDate = (String) value;
		   else if (i == 3)
			   status = (String) value;
                 
		   else
			   throw new Exception("Error: invalid column index in Timeline table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "Timeline [UserID =" + timelineID + ", "
	    	    + " Task =" + startDate + ","
	    	    + " StartDate =" + endDate + ","
	    	    + " EndDate =" + status + ","
                    
	        + "]";
	  }



}

