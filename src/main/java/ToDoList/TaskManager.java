/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToDoList;

import java.util.ArrayList;

/**
 *
 * @author Khush Patel

 
 */
public class TaskManager {
    
    public ArrayList<ToDo> tasks = new ArrayList<>();

    public ArrayList<ToDo> getTasks() {
        return tasks;
    }
    
    
    
//    public void addTask(int id, String title, String description, boolean state){
//        ToDo t = new ToDo(id, title, description, false);
//        
//        tasks.add(t);
//        
//    }
     public boolean addTask(int id, String title, String description, boolean state){
        
         ToDo t = new ToDo(id, title, description, false);
        
        boolean t1 =tasks.add(t);
        
        return t1;
        
    }

    public boolean deleteTask(int id) {
        //using removeif to check side by side if the id exists or not0
        return tasks.removeIf(task -> task.getId() == id);
    }
    
    
    public boolean updateTask(int id, String title, String description) {
       for (ToDo task : tasks) {
        if (task.getId() == id) {
            task.setTitle(title);
            task.setDescription(description);
            return true;
        }
    }
    return false;
       
    }
    
    public boolean state(int id, boolean isState) {
        for (ToDo task : tasks) {
            if (task.getId() == id) {
                task.setState(isState);
                return true;
            }
        }
        return false;
    }
    
    public double add(double x, double y){
        return x+y;
    }
    
}
