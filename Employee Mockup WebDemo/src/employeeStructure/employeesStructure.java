/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeStructure;

/**
 *
 * @author Wendell
 */
public class employeesStructure {
    int ID;
    String firstName, lastName, email, name;
    
    public employeesStructure() {
        
    }
    
    public employeesStructure(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName, String lastName) {
        String name;
        name = firstName +" "+lastName;
        this.name = name;
    }
    
    
}
