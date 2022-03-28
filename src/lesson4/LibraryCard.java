package lesson4;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    File: LibraryCard.java

*/

class LibraryCard {

    // Data Members   
    
    //student owner of this card
    private Student owner;
    
    //number of books borrowed
    private int borrowCnt; 
    
    //numOfBooks are checked out
    public void checkOut(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }
    
    //Returns the name of the owner of this card
    public String getOwnerName( ) {
        return owner.getName( );
    }
    
    //Returns the number of books borrowed
    public int getNumberOfBooks( ) {
        return borrowCnt;
    }
    
    //Sets the owner of this card to student
    public void setOwner(Student student) {
        owner = student;
    }
    
    
    //Returns the string representation of this card
    public String toString( ) {
        return  "Owner Name:     " + owner.getName( ) + "\n" + 
                "      Email:    " + owner.getEmail( ) + "\n" +
                "Books Borrowed: " + borrowCnt;
    }
       
 }