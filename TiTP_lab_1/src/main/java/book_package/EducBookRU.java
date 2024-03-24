package book_package;

public class EducBookRU extends AbstractBook{
    private final String kind;
    public EducBookRU(String name, String author, String kind) {
        super(name, author, "RU");
        this.kind = kind;
    }
    public String getKind(){
        return kind;
    }
}
