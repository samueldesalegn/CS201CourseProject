package lesson4;


/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill
    
    Wu/Otani

    File: Bicycle.java

*/

class Bicycle {

    // Data Member   
    private String ownerName;
    
    //Constructor
    public Bicycle( ) {
        ownerName = "Unassigned";
    }
    
    //Returns the name of this bicycle's owner
    public String getOwnerName( ) {
        
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
    
        ownerName = name;
    }    
 }