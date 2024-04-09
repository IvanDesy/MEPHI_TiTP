package Library_package;
import people_package.*;
import book_package.*;
import java.util.ArrayList;

public class Ticket {
    public AbstractPeople people;
    private final ArrayList<AbstractBook> books;
    
    public Ticket(AbstractPeople people){
        this.people = people;
        books = new ArrayList<>();
    }
    public AbstractPeople getPeople(){
        return people;
    }
    public void addBook(AbstractBook book){
        books.add(book);
    }
    public ArrayList<AbstractBook> getBooks(){
        return books;
    }
    public void delBook(AbstractBook book){
        books.remove(book);
    }
}
