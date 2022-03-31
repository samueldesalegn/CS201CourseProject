package src.lesson4;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    File: Student.java

*/

class Student {

    // Data Member   
    private String name;
    
    private String email;
    
    //Constructor
    public Student() {
        name = "Unassigned";
        email = "Unassigned";
    }
    
    //Returns the email of this student
    public String getEmail( ) {
        
        return email;
    }
    
    //Returns the name of this student
    public String getName( ) {
        
        return name;
    }

    //Assigns the name of this student
    public void setName(String studentName) {
    
        name = studentName;
    }    
    
    //Assigns the email of this student
    public void setEmail(String address) {
        
        email = address;
    }
 }