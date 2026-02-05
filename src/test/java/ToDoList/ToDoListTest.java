/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ToDoList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
public class ToDoListTest {
    
//     @Test
//     void create(){
//         
//         System.out.println("Testing add case for toDo Task");
//     
//         TaskManager m = new TaskManager();
//         
//         m.addTask(1, "Dental Appointment", "wisdom tooth extraction", false);
//         
//         
//            //assertEquals(2, m.getTasks().size());
//            //assertEquals("Dental Appointment", m.getTasks().get(0).getTitle());
//        assertEquals(true, m.addTask(2, "Study Java", "Practice OOP concepts", false));
//         
//     }
     
      

    @Test
    void create() {

        System.out.println("Testing add case for ToDo Task");

        TaskManager m = new TaskManager();

        assertTrue(m.addTask(1, "Dental Appointment", "wisdom tooth extraction", false));
        assertTrue(m.addTask(2, "Study Java", "Practice OOP concepts", false));

        assertEquals(2, m.getTasks().size());
        assertEquals(true,m.addTask(2, "Study Java", "Practice OOP concepts", false) );
        assertEquals("Dental Appointment", m.getTasks().get(0).getTitle());
    }

    @Test
    void delete() {

        System.out.println("Testing delete case for ToDo Task");

        TaskManager m = new TaskManager();
        m.addTask(1, "Dental Appointment", "wisdom tooth extraction", false);

        assertTrue(m.deleteTask(1));
        assertEquals(0, m.getTasks().size());
    }

    @Test
    void update() {

        System.out.println("Testing update case for ToDo Task");

        TaskManager m = new TaskManager();
        m.addTask(1, "Dental Appointment", "wisdom tooth extraction", false);

        boolean result = m.updateTask(
                1,
                "Dental Appointment 1",
                "has been re-scheduled"
        );

        assertTrue(result);
        assertEquals("Dental Appointment 1", m.getTasks().get(0).getTitle());
        assertEquals("has been re-scheduled", m.getTasks().get(0).getDescription());
    }

    @Test
    void stateChange() {

        System.out.println("Testing state change for ToDo Task");

        TaskManager m = new TaskManager();
        m.addTask(1, "Dental Appointment", "wisdom tooth extraction", false);

        assertTrue(m.state(1, true));
        assertTrue(m.getTasks().get(0).isState());
    }
}



     
     

