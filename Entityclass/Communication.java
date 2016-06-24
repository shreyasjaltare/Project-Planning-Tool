package Entityclass;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Communication")
public  class Communication implements Serializable {


    @Column(name="Date",table="Communication",length=45)
    @Basic
    private String date;


    @Column(name="Summary",table="Communication",length=100)
    @Basic
    private String summary;


    @Column(name="CommunicationID",table="Communication",nullable=false,length=45)
    @Id
    private String communicationID;


    @Column(name="Name",table="Communication",length=45)
    @Basic
    private String name;


    @Column(name="ProjectID",table="Communication",length=45)
    @Basic
    private String projectID;

    public Communication(){

    }


   public String getDate() {
        return this.date;
    }


  public void setDate (String date) {
        this.date = date;
    }



   public String getSummary() {
        return this.summary;
    }


  public void setSummary (String summary) {
        this.summary = summary;
    }



   public String getCommunicationID() {
        return this.communicationID;
    }


  public void setCommunicationID (String communicationID) {
        this.communicationID = communicationID;
    }



   public String getName() {
        return this.name;
    }


  public void setName (String name) {
        this.name = name;
    }



   public String getProjectID() {
        return this.projectID;
    }


  public void setProjectID (String projectID) {
        this.projectID = projectID;
    }

// return number of columns in the table
	   public int getNumberOfColumns() {
		   return 5;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getCommunicationID();
		   else if (i == 1)
			   return getProjectID();
		   else if (i == 2) 
			   return getDate();
		   else if (i == 3)
			   return getName();
                   else if (i==4)
                           return getSummary();
		   else
			   throw new Exception("Error: invalid column index in Communication table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
                           colName="CommunicationID";
                   else if (i==1)
			   colName = "ProjectID";
		   else if (i == 2)
			   colName = "Date";
		   else if (i == 3)
			   colName = "Name";
		   else if (i == 4)
			   colName = "Summary";
		   else 
			   throw new Exception("Access to invalid column number in Communication table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   communicationID = (String) value;
		   else if (i == 1) 
			   projectID = (String) value;
		   else if (i == 2) 
			   date = (String) value;
		   else if (i == 3)
			   name = (String) value;
                   else if (i==4)
                           summary= (String) value;
		   else
			   throw new Exception("Error: invalid column index in Communication table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "Communication [CommunicationID =" + communicationID + "," 
                    + "ProjectID =" + projectID + ","
	    	    + " Date =" + date + ","
	    	    + " Name =" + name + ","
	    	    + " Summary =" + summary + ","
	        + "]";
	  }

}
  

