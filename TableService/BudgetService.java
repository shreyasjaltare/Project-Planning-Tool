/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;
import Entityclass.Budget;
import Entityclass.ProjectInfor;
import javax.persistence.*;
import java.util.*;
/**
 *
 * @author Ivy
 */
public class BudgetService {
    private EntityManager manager;
    public BudgetService(EntityManager manager){
        this.manager=manager;
    }
    
    //method to create a new record
    public List<Budget> search(String budgetID){
        TypedQuery<Budget> query = manager.createQuery("SELECT e FROM Budget e WHERE e.budgetID = :budgetID", Budget.class);
         query.setParameter("budgetID", budgetID);
         
         List<Budget> result = query.getResultList();
         return result;
       }
    public Budget createBudget(String budgetID,int labor,int supply,int total, ProjectInfor project){
       Budget budget=new Budget();
       budget.setBudgetID(budgetID);//project.getProjectID());
       budget.setLabor(labor);
       budget.setSupply(supply);
       budget.setTotal(total);
      
      
      
       budget.setProject(project);
        manager.persist(budget);
       return budget;
    }
     
    //method to read a record
    public Budget readBudget(String projectID){
          Budget budget=manager.find(Budget.class,projectID);
          return budget;
    }
    //method to read all records
    public List<Budget> readALL(){
          TypedQuery<Budget> query=manager.createQuery(
                  "SELECT e FROM Budget e", Budget.class);
          List<Budget> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public Budget updateBudget(String projectID,int labor,int supply,
            int total){
            Budget budget=manager.find(Budget.class, projectID);
            if(budget!=null){
            budget.setLabor(labor);
            budget.setSupply(supply);
            budget.setTotal(total);
            }
            return budget;
    }
    //method to delete a record
    public void deleteBudget(String projectID){
         Budget budget=manager.find(Budget.class,projectID);
         if(budget!=null){
           manager.remove(budget);
         }
    }
}
