/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_package;
import people_package.*;
import book_package.*;
import java.util.ArrayList;

/**
 *
 * @author vanya
 */
public class Ticket {
    public AbstractPeople people;
    private ArrayList<AbstractBook> books = new ArrayList<>();
    public AbstractPeople getPeople(){
        return people;
    }
    public ArrayList<AbstractBook> getBooks(){
        return books;
    }
}
