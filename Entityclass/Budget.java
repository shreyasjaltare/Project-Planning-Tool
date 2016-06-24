package Entityclass;

import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Budget")
public  class Budget implements Serializable {
    
    @OneToOne(cascade=CascadeType.ALL)

@JoinColumn(name="BudgetID", insertable = false, updatable = false)

private ProjectInfor project ;

    

    @Column(name="Total",table="Budget")
    @Basic
    private Integer total;


    @Column(name="BudgetID",table="Budget",length=45)
    @Id
    private String budgetID;


    @Column(name="Supply",table="Budget")
    @Basic
    private Integer supply;


    @Column(name="Labor",table="Budget")
    @Basic
    private Integer labor;

    public Budget(){
        
    }


   public ProjectInfor getProject() {
        return project;
    }

    public void setProject(ProjectInfor project) {
        this.project = project;
    }
    public Integer getTotal() {
        return this.total;
    }


  public void setTotal (Integer total) {
        this.total = total;
    }



   public String getBudgetID() {
        return this.budgetID;
    }


  public void setBudgetID (String projectID) {
        this.budgetID = projectID;
    }



   public Integer getSupply() {
        return this.supply;
    }


  public void setSupply (Integer supply) {
        this.supply = supply;
    }



   public Integer getLabor() {
        return this.labor;
    }


  public void setLabor (Integer labor) {
        this.labor = labor;
    }
// return number of columns in the table
	   public int getNumberOfColumns() {
		   return 4;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getBudgetID();
		   else if (i == 1)
			   return Integer.toString(getLabor());
		   else if (i == 2) 
			   return Integer.toString(getSupply());
		   else if (i == 3)
			   return Integer.toString(getTotal());
		   else
			   throw new Exception("Error: invalid column index in Budget table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "BudgetID";
		   else if (i == 1)
			   colName = "Labor";
		   else if (i == 2)
			   colName = "Supply";
		   else if (i == 3)
			   colName = "Total";
		   else 
			   throw new Exception("Access to invalid column number in Budget table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   budgetID = (String) value;
		   else if (i == 1) 
			   labor = Integer.parseInt((String) value);
		   else if (i == 2) 
			   supply = Integer.parseInt((String) value);
		   else if (i == 3)
			   total = Integer.parseInt((String) value);
		   else
			   throw new Exception("Error: invalid column index in Budget table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "Budget [BudgetID =" + budgetID + ", "
	    	    + " Labor =" + labor + ","
	    	    + " Supply =" + supply + ","
	    	    + " Total =" + total + ","
	        + "]";
	  }

}
  
  
  


