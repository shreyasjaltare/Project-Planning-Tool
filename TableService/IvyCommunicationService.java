/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;
import javax.persistence.*;
import java.util.*;
import Entityclass.Communication;

public class IvyCommunicationService {
    private EntityManager manager;
    public IvyCommunicationService(EntityManager manager){
        this.manager=manager;
    }
    
    //method to create a new record
    public Communication createCommunication(String CommunicationID,String projectID,String date,String name,String summary)
    {
       Communication communication=new Communication();
       communication.setCommunicationID(CommunicationID);
       communication.setProjectID(projectID);
       communication.setDate(date);
       communication.setName(name);
       communication.setSummary(summary);
       manager.persist(communication);
       return communication;
    }
     
    //method to read a record
    public Communication readCommunication(String CommunicationID){
          Communication communication=manager.find(Communication.class,CommunicationID);
          return communication;
    }
    //method to read all records
    public List<Communication> readALL(){
          TypedQuery<Communication> query=manager.createQuery(
                  "SELECT e FROM Communication e", Communication.class);
          List<Communication> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public Communication updateCommunication(String CommunicationID,String projectID,String date,
            String name,String summary){
            Communication communication=manager.find(Communication.class, CommunicationID);
            if(communication!=null){
            communication.setProjectID(projectID);
            communication.setDate(date);
            communication.setName(name);
            communication.setSummary(summary);
            }
            return communication;
    }
    //method to delete a record
    public void deleteCommunication(String CommunicationID){
         Communication communication=manager.find(Communication.class,CommunicationID);
         if(communication!=null){
           manager.remove(communication);
         }
    }
}
