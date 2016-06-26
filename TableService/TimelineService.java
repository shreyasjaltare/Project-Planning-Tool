/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;
import javax.persistence.*;
import java.util.*;
import Entityclass.Timeline;

public class TimelineService {
    private EntityManager manager;
    public TimelineService(EntityManager manager){
    this.manager=manager;
    }
    
      //method to create a new record
    public Timeline createTimeline(String timelineID,String startDate,String endDate,
            String status){
       Timeline timeline=new Timeline();
       timeline.setTimelineID(timelineID);
       timeline.setStartDate(startDate);
       timeline.setEndDate(endDate);
       timeline.setStatus(status);
       manager.persist(timeline);
       return timeline;
    }
     
    //method to read a record
    public List<Timeline> search(String timelineID){
        TypedQuery<Timeline> query = manager.createQuery("SELECT e FROM Timeline e WHERE e.timelineID = :timelineID", Timeline.class);
         query.setParameter("timelineID", timelineID);
         
         List<Timeline> result = query.getResultList();
         return result;
       }
    public Timeline readTimeline(String userID){
          Timeline timeline=manager.find(Timeline.class,userID);
          return timeline;
    }
    //method to read all records
    public List<Timeline> readALL(){
          TypedQuery<Timeline> query=manager.createQuery(
                  "SELECT e FROM Timeline e", Timeline.class);
          List<Timeline> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public Timeline updateTimeline(String timelineID,String startDate,String endDate,
            String status){
            Timeline timeline=manager.find(Timeline.class,timelineID);
            if(timeline!=null){
              
                timeline.setTimelineID(timelineID);
                timeline.setStartDate(startDate);
                timeline.setEndDate(endDate);
                timeline.setStatus(status); 
            }
            
            return timeline;
    }
    //method to delete a record
    public void deleteTimeline(String userID){
         Timeline timeline=manager.find(Timeline.class,userID);
         if(timeline!=null){
           manager.remove(timeline);
         }
    }
}
