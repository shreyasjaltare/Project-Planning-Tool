package Entityclass;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserInfor")
public  class UserInfor implements Serializable {


    @Column(name="Password",table="UserInfor",length=45)
    @Basic
    private String password;


    @Column(name="AccountType",table="UserInfor",length=45)
    @Basic
    private String accountType;


    @Column(name="Name",table="UserInfor",length=45)
    @Basic
    private String name;


    @Column(name="UserID",table="UserInfor",nullable=false,length=45)
    @Id
    private String userID;


    @Column(name="Email",table="UserInfor",length=45)
    @Basic
    private String email;

    public UserInfor(){

    }


   public String getPassword() {
        return this.password;
    }


  public void setPassword (String password) {
        this.password = password;
    }



   public String getAccountType() {
        return this.accountType;
    }


  public void setAccountType (String accountType) {
        this.accountType = accountType;
    }



   public String getName() {
        return this.name;
    }


  public void setName (String name) {
        this.name = name;
    }



   public String getUserID() {
        return this.userID;
    }


  public void setUserID (String userID) {
        this.userID = userID;
    }



   public String getEmail() {
        return this.email;
    }


  public void setEmail (String email) {
        this.email = email;
    }
 public int getNumberOfColumns() {
		   return 5;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return getUserID();
		   else if (i == 1)
			   return getAccountType();
		   else if (i == 2) 
			   return getName();
		   else if (i == 3)
			   return getPassword();
                    else if (i == 4)
			   return getEmail();
		   else
			   throw new Exception("Error: invalid column index in UserInfor table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "UserID";
		   else if (i == 1)
			   colName = "AccountType";
		   else if (i == 2)
			   colName = "Name";
		   else if (i == 3)
			   colName = "Password";
                   else if (i == 3)
			   colName = "Email";
		   else 
			   throw new Exception("Access to invalid column number in UserInfor table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   userID = (String) value;
		   else if (i == 1) 
			   accountType = (String) value;
		   else if (i == 2) 
			   name = (String) value;
		   else if (i == 3)
			   password = (String) value;
                   else if (i == 4)
			   email = (String) value;
                 
		   else
			   throw new Exception("Error: invalid column index in UserInfor table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "UserInfor [UserID =" + userID + ", "
	    	    + " AccountType =" + accountType + ","
	    	    + " Name =" + name + ","
	    	    + " Password =" + password + ","
                    + " email =" + email + ","
	        + "]";
	  }
}

