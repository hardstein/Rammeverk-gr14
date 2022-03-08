public class Main {
    public static void main(String[] args) {
        // Write your user testing code here: 

        //Example code, delete this and write your own user testing code, run the code and see what happens, try solving some scenarioes: 
        HTML project = new HTML(SiteType.LOGIN, SiteType.ARTICLE, SiteType.HOME, SiteType.REGISTRATION, SiteType.STARTERPROJECT); 

        project.home.main(); 
        project.article.main(); 
        project.article.completeTemplate();
        project.login.header();
        project.login.setTheme(Theme.DARK);
        project.article.title("Title text", "h2", 14, "b");
        project.registration.main(); 
        project.starterProject.main(); 

    }
    
}
