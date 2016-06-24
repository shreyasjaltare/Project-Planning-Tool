/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableService;

/**
 *
 * @author shreyasjaltare
 */
import javax.persistence.*;
import java.util.List;
import Entityclass.UserInfor;

public class UserInforService {
    private EntityManager manager;
   
    
    public UserInforService(){
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("PersistenceUnit");
        manager = factory.createEntityManager();
    }
    public UserInforService(EntityManager manager){
    this.manager=manager;
    }

    
    
    //method to create a new record
    public UserInfor createUserInfor(String UserID,String AccountType,String Name,
            String Password,String Email){
       UserInfor user=new UserInfor();
       user.setUserID(UserID);
       user.setAccountType(AccountType);
       user.setName(Name);
       user.setPassword(Password);
       user.setEmail(Email);
       manager.persist(user);
       return user;
    }
    // select those rows which matches entered userId and password from UI
    public List<UserInfor> read(String userID, String password,String accountType){
        TypedQuery<UserInfor> query = manager.createQuery("SELECT e FROM UserInfor e WHERE e.userID = :userID AND e.password = :password AND e.accountType =:accountType", UserInfor.class);
         query.setParameter("password", password);
         query.setParameter("userID", userID);
         query.setParameter("accountType", accountType);
         List<UserInfor> result = query.getResultList();
         return result;
       }
    
    public List<UserInfor> readsearch(String name){
        TypedQuery<UserInfor> query = manager.createQuery("SELECT e FROM UserInfor e WHERE e.name = :name", UserInfor.class);
         query.setParameter("name", name);
         
         List<UserInfor> result = query.getResultList();
         return result;
       }
    
     
    //method to read a record
    public UserInfor readUserInfor(String userID){
          UserInfor user=manager.find(UserInfor.class,userID);
          return user;
    }
    //method to read all records
    public List<UserInfor> readALL(){
          TypedQuery<UserInfor> query=manager.createQuery("SELECT e FROM UserInfor e", UserInfor.class);
          List<UserInfor> result=query.getResultList();
          return result;
    }
    //method to upate a record
    public UserInfor updateUserInfor(String UserID,String AccountType,String Name,
            String Password, String Email){
            UserInfor userinfor=manager.find(UserInfor.class, UserID);
            if(userinfor!=null){
           userinfor.setAccountType(AccountType);
       userinfor.setName(Name);
       userinfor.setPassword(Password);
       userinfor.setEmail(Email);
       
            }
            return userinfor;
    }
    //method to delete a record
    public void deleteUserInfor(String userID){
         UserInfor userinfor=manager.find(UserInfor.class,userID);
         if(userinfor!=null){
           manager.remove(userinfor);
         }
    }
}


