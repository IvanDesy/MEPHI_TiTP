package book_package;

public class EducBookENG extends AbstractBook{

    private final String university;
    private final int level;
    public EducBookENG(String name, String author, String university, int level) {
        super(name, author, "ENG");
        this.university = university;
        this.level = level;
    }
    public String getUniversity(){
        return university;
    }
    public int getLevel(){
        return level;
    }    
}
