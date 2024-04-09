package Library_package;
import book_package.*;
import java.util.ArrayList;
import Storage_package.Storage;

public class Library {
    public ArrayList<Ticket> tickets;
    public ArrayList<AbstractBook> books;
    
    public Library(){
        DataMaster dataMaster = new DataMaster();
        tickets = dataMaster.generateTickets();
        books = Storage.books;
    }
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
}
