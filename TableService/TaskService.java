/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;

import javax.persistence.*;
import java.util.*;
import Entityclass.Task;
/**
 *
 
 */
public class TaskService {
    private EntityManager manager;
    public TaskService(EntityManager manager){
    this.manager=manager;
    }
    public TaskService(){
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("PersistenceUnit");
        manager = factory.createEntityManager();
    }
    //method to create a new record
    public Task createTask(String UserID,String TaskName,String StartDate,
            String EndDate,String ProjectID,String UserName){
       Task team=new Task();
       team.setUserID(UserID);
       team.setTaskName(TaskName);
       team.setStartDate(StartDate);
       team.setEndDate(EndDate);
       team.setProjectID(ProjectID);
       team.setUserName(UserName);
       
       manager.persist(team);
       return team;
    }
     public List<Task> read(String username){
        TypedQuery<Task> query = manager.createQuery("SELECT e FROM Task e WHERE e.username = :username", Task.class);
         query.setParameter("username", username);
         
         List<Task> result = query.getResultList();
         return result;
       }
     
     public List<Task> readsearch(String userID){
        TypedQuery<Task> query = manager.createQuery("SELECT e FROM Task e WHERE e.userID = :userID", Task.class);
         query.setParameter("userID", userID);
         
         List<Task> result = query.getResultList();
         return result;
       }
     
    //method to read a record
    public Task readTask(String taskID){
          Task task=manager.find(Task.class,taskID);
          return task;
    }
    //method to read all records
    public List<Task> readALL(){
          TypedQuery<Task> query=manager.createQuery("SELECT e FROM Task e", Task.class);
          List<Task> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public Task updateTask(String UserID,String TaskName,String StartDate,
            String EndDate,String ProjectID,String UserName){
            Task task=manager.find(Task.class, UserID);
            if(task!=null){
           task.setTaskName(TaskName);
       task.setStartDate(StartDate);
       task.setEndDate(EndDate);
       task.setProjectID(ProjectID);
       task.setUserName(UserName);
       
            }
            return task;
    }
    //method to delete a record
    public void deleteTask(String taskID){
         Task task=manager.find(Task.class,taskID);
         if(task!=null){
           manager.remove(task);
         }
    }
}

