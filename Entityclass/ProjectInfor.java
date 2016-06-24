package Entityclass;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProjectInfor")
public  class ProjectInfor implements Serializable {
    

   

    @Column(name="EndDate",table="ProjectInfor",length=45)
    @Basic
    private String endDate;


    @Column(name="Partnername",table="ProjectInfor",length=45)
    @Basic
    private String partnername;


    @Column(name="ProjectDescription",table="ProjectInfor",length=1000)
    @Basic
    private String projectDescription;


    @Column(name="ProjectName",table="ProjectInfor",length=45)
    @Basic
    private String projectName;


    @Column(name="ProjectID",table="ProjectInfor",nullable=false,length=45)
    @Id
    private String projectID;


    @Column(name="ProjectOutcome",table="ProjectInfor",length=1000)
    @Basic
    private String projectOutcome;


    @Column(name="StartDate",table="ProjectInfor",length=45)
    @Basic
    private String startDate;

    public ProjectInfor(){

    }


   public String getEndDate() {
        return this.endDate;
    }


  public void setEndDate (String endDate) {
        this.endDate = endDate;
    }



   public String getPartnername() {
        return this.partnername;
    }


  public void setPartnername (String partnername) {
        this.partnername = partnername;
    }



   public String getProjectDescription() {
        return this.projectDescription;
    }


  public void setProjectDescription (String projectDescription) {
        this.projectDescription = projectDescription;
    }



   public String getProjectName() {
        return this.projectName;
    }


  public void setProjectName (String projectName) {
        this.projectName = projectName;
    }



   public String getProjectID() {
        return this.projectID;
    }


  public void setProjectID (String projectID) {
        this.projectID = projectID;
    }



   public String getProjectOutcome() {
        return this.projectOutcome;
    }


  public void setProjectOutcome (String projectOutcome) {
        this.projectOutcome = projectOutcome;
    }



   public String getStartDate() {
        return this.startDate;
    }


  public void setStartDate (String startDate) {
        this.startDate = startDate;
    }

public int getNumberOfColumns() {
		   return 7;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getProjectID();
		   else if (i == 1)
			   return getProjectName();
		   else if (i == 2) 
			   return getProjectDescription();
		   else if (i == 3)
			   return getProjectOutcome();
                   
			  
                   
                   else if (i == 4)
			   return getPartnername();
                   
                   else if (i == 5)
			   return getStartDate();
                   else if (i == 6)
			   return getEndDate();
                   
		   else
			   throw new Exception("Error: invalid column index in ProjectInfor table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "ProjectID";
		   else if (i == 1)
			   colName = "ProjectName";
		   else if (i == 2)
			   colName = "ProjectDescription";
		   else if (i == 3)
			   colName = "ProjectOutcome";
                   else if (i == 4)
			   colName = "PartnernName";
                   
                   else if (i == 5)
			   colName = "StartDate";
                   else if (i == 6)
			   colName = "EndDate";
                   else 
			   throw new Exception("Access to invalid column number in ProjectInfor table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   projectID = (String) value;
		   else if (i == 1) 
			   projectName = (String) value;
		   else if (i == 2) 
			   projectDescription = (String) value;
		   else if (i == 3)
			   projectOutcome = (String) value;
                   else if (i == 4)
			   partnername = (String) value;
                  
                   else if (i == 5)
			   startDate = (String) value;
                   else if (i == 6)
			   endDate = (String) value;
                  
		   else
			   throw new Exception("Error: invalid column index in ProjectInfor table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "ProjectInfor [ProjectID =" + projectID + ", "
	    	    + " ProjectName =" + projectName + ","
	    	    + " ProjectDescription =" + projectDescription + ","
	    	    + " ProjectOutcome =" + projectOutcome + ","
                    + " Partner =" + partnername + ","
                    
                    + " StartDate =" + startDate + ","
                    + " EndDate =" + endDate + ","
                    
	        + "]";
	  }
}

