package book_package;

public abstract class AbstractBook {
    private final String author;
    private final String name;
    protected String lang;
    
    AbstractBook(String name, String author, String lang){
        this.author = author;
        this.name = name;
        this.lang = lang;
    } 
    public String getLang(){
        return this.lang;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
}
