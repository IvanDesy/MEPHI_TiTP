package book_package;

public class EducBookENG extends AbstractBook{

    private final String university;
    private final String level;
    public EducBookENG(String name, String author, String university, String level) {
        super(name, author, "ENG");
        this.university = university;
        this.level = level;
    }
    public String getUniversity(){
        return university;
    }
    public String getLevel(){
        return level;
    }    
}
