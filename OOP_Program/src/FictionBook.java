import java.lang.Character.UnicodeBlock;

public class FictionBook {
    private String author_name;
    private String email;
    private String title;
    private int publicYear;
    
    public  FictionBook(String title,int publicYear){
        this.title = title;
        this.publicYear = publicYear;
    }
    public void setAuthorName(String name){
        this.author_name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public boolean checkFormatName(){
        return true;
    }
    public String getLastName(){
        return getLastName().toUpperCase();
    }
    public String getFirstName(){
        return getFirstName().toLowerCase();
    }
    
}
