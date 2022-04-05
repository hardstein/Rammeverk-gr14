package ApiCreation;
import ApiCreation.Models.*; 

public class Article extends HTML {
    Theme theme; 
    Header header; 
    Main main; 
    Nav nav; 
    Aside aside; 
    



    public Article(Theme theme) {
        this.theme = theme; 
        System.out.println("you have made a article object with chosen theme " + theme);
    }
    public Article() {

        System.out.println("you have made a article object");
    }
 
    @Override
    public void header() {
        System.out.println("header"); 
   
    }

    public void header(String image) {

        System.out.println("header with chosen picture");
   
    }
    @Override
    public void nav() {
        System.out.println("nav"); 
      
    }
    @Override
    public void main() {
        System.out.println("main"); 

    }

    public void main(int textSize) {
        System.out.println("main"); 

    }
    @Override
    public void aside() {
        System.out.println("aside"); 

    }
    @Override
    public void footer() {
        System.out.println("footer"); 

    }
    @Override
    public void completeTemplate() {
        header();
        nav();
        main();
        aside();
        footer();
        System.out.println("complete template"); 
    }

    public void title(String titleText, String h1, int textSize) {
        System.out.println("title with " + titleText + " and header size " + h1 + " text size " + textSize);

    }
    public void title(String titleText, String h1, int textSize, String bold) {
        System.out.println("title with text " + titleText + " and header size " + h1 + " text size " + textSize + " and bold text type " + bold);

    }

    public void body(String titleText, String h1, int textSize) {
        System.out.println("body with " + titleText + " and header size " + h1 + " text size " + textSize);

    }

    public void body(String titleText, String h1, int textSize, String bold) {
        System.out.println("body with text " + titleText + " and header size " + h1 + " text size " + textSize + " and bold text type " + bold);

    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
    
    public Theme getTheme() {
        return theme;
    }
    
}
