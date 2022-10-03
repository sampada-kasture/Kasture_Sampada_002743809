/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Employee;
import model.EmployeeHistory;
/**
 *
 * @author Sampada Kasture
 */

  

public class EmployeeHistory {
    private ArrayList<Employee> history ;
    
    Employee EmployeeHistory;
    private Employee Employee;
    
    
    public EmployeeHistory() {
        this.history = new ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        history.addNew(Employee);
        return Employee;
        
    }
    
    
}
