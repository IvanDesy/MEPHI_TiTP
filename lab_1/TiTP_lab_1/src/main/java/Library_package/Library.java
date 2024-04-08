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
public class Library {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<AbstractBook> books = new ArrayList<>();
    
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
}
