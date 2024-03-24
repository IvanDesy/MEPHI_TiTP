package people_package;

import book_package.AbstractBook;
import java.util.ArrayList;

public abstract class AbstractPeople {
    private final String name;
    private final String patronymic;
    private final String lastname;
    private ArrayList<AbstractBook> books = new ArrayList<>();
    
    AbstractPeople(String name, String patronymic, String lastname){
        this.name = name;
        this.patronymic = patronymic;
        this.lastname = lastname;
    }
    
    public String getFullName(){
        return lastname + name + patronymic;
    }
    public void addBook(AbstractBook book){
        books.add(book);
    }
}
