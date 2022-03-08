public class Home extends HTML {
    Theme theme; 

    public Home(Theme theme) {
        this.theme = theme; 
	}
	public Home() {
    }

    public void header(String image) {

        System.out.println("header with chosen picture");
   
    }

    @Override
    public void header() {
        System.out.println("header"); 
   
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
    

    public void hero(String text, String image) {

        System.out.println("hero header with chosen text " + text + " and image " + image);

    }
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    
    
}
