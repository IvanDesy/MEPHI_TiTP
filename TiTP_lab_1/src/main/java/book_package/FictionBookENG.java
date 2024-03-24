package book_package;

public class FictionBookENG extends AbstractBook{
    private final String country;
    public FictionBookENG(String name, String author, String country) {
        super(name, author, "ENG");
        this.country = country;
    }
    public String getcountry(){
        return country;
    }
}
