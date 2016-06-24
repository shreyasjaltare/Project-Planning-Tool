/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;
import Entityclass.Budget;
import javax.persistence.*;
import java.util.*;
import Entityclass.ProjectInfor;
/**
 *
 * @author Ivy
 */
public class ProjectInforService {
    private EntityManager manager;
    public ProjectInforService(EntityManager manager){
        this.manager=manager;
    }
    
    //method to create a new record
    public List<ProjectInfor> search(String projectID){
        TypedQuery<ProjectInfor> query;
        query = manager.createQuery("SELECT e FROM ProjectInfor e WHERE e.projectID = :projectID", ProjectInfor.class);
         query.setParameter("projectID", projectID);
         
         List<ProjectInfor> result = query.getResultList();
         return result;
       }
    public ProjectInfor createProject(String projectID,String projectName,String projectDescription,String projectOutcome,String endDate,String startDate,String partnerName)
    {
       ProjectInfor project=new ProjectInfor();
       project.setProjectID(projectID);
       project.setEndDate(endDate);
       project.setPartnername(partnerName);
       project.setProjectDescription(projectDescription);
       project.setProjectName(projectName);
       project.setProjectOutcome(projectOutcome);
       project.setStartDate(startDate);
       
       //manager.persist(project);
     
       return project;
    }
    
     
    //method to read a record
    public ProjectInfor readProjectInfor(String projectID){
          ProjectInfor project=manager.find(ProjectInfor.class,projectID);
          return project;
    }
    //method to read all records
    public List<ProjectInfor> readALL(){
          TypedQuery<ProjectInfor> query=manager.createQuery(
                  "SELECT e FROM ProjectInfor e", ProjectInfor.class);
          List<ProjectInfor> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public ProjectInfor updateProjectInfor(String projectID,String projectName,String projectDescription,String projectOutcome,String partnerName,String startDate,String endDate){
            ProjectInfor project=manager.find(ProjectInfor.class, projectID);
            if(project!=null){
          project.setProjectID(projectID);
       project.setEndDate(endDate);
       project.setPartnername(partnerName);
       project.setProjectDescription(projectDescription);
       project.setProjectName(projectName);
       project.setProjectOutcome(projectOutcome);
       project.setStartDate(startDate);
      
            }
            return project;
    }
    //method to delete a record
    public void deleteProjectInfor(String projectID){
         ProjectInfor project=manager.find(ProjectInfor.class,projectID);
         if(project!=null){
           manager.remove(project);
         }
    }
}
