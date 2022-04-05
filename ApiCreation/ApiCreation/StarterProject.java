package ApiCreation;
public class StarterProject extends HTML {
    public Theme theme; 

    public StarterProject() {

    }

    public StarterProject(Theme theme) {

        this.theme = theme; 
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

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Theme getTheme() {
        return theme;
    }
    
}