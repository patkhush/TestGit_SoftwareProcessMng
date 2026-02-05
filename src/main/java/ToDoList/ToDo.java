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
class ToDo {
    
    public int id;
    public String title;
    public String description;
    public boolean state;
    
    


    public ToDo(int id, String title, String description, boolean state) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    
    
    
    
    
    
     
    
}
