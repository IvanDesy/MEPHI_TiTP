package book_package;

public class BookFactory {
        
    public static AbstractBook createBook(String what, String name, String author, String info){
        if(what.equals("EducationRU")){
            return new EducBookRU(name, author, info);
        } else if (what.equals("FictionENG")){
            return new FictionBookENG(name, author, info);
        }
        return null;
    }
    public static AbstractBook createBook(String what, String name, String author, String university, int level){
        return new EducBookENG(name, author, university, level);
    }
    public static AbstractBook createBook(String what, String name, String author){
        return new FictionBookRU(name, author);
    }
}
