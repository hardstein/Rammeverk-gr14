package ApiCreation;

public class HTML implements ConstructingSite  { 
    public Article article; 
    public Home home; 
    public StarterProject starterProject; 
    public Registration registration; 
    public Login login; 
    

    public HTML() {

    }

    public HTML(SiteType siteType) {

        if (siteType.equals(SiteType.STARTERPROJECT)) {

            this.starterProject = new StarterProject();

        } else if (siteType.equals(SiteType.HOME)) {
            
            this.home = new Home();

        } else if (siteType.equals(SiteType.ARTICLE)) {
            
            this.article = new Article(); 

        } else if (siteType.equals(SiteType.REGISTRATION)) {

            this.registration = new Registration(); 
            
        } else if (siteType.equals(SiteType.LOGIN)) {

            this.login = new Login();  
        }
    }

    public HTML(SiteType siteType, SiteType siteType2) {
        if (siteType.equals(SiteType.STARTERPROJECT) || siteType2.equals(SiteType.STARTERPROJECT)) {
            this.starterProject = new StarterProject();
        } 
        if (siteType.equals(SiteType.HOME) || siteType2.equals(SiteType.HOME)) {
            this.home = new Home();
        } 
        if (siteType.equals(SiteType.ARTICLE) || siteType2.equals(SiteType.ARTICLE)) {
            this.article = new Article(); 
        } 
        if (siteType.equals(SiteType.REGISTRATION) || siteType2.equals(SiteType.REGISTRATION)) {

            this.registration = new Registration(); 
        } 
        if (siteType.equals(SiteType.LOGIN) || siteType2.equals(SiteType.LOGIN)) {

            this.login = new Login();  

        }
    }

    public HTML(SiteType siteType, SiteType siteType2, SiteType siteType3 ) {

        if (siteType.equals(SiteType.STARTERPROJECT) || siteType2.equals(SiteType.STARTERPROJECT) || siteType3.equals(SiteType.STARTERPROJECT)) {
            this.starterProject = new StarterProject();
        } 
        if (siteType.equals(SiteType.HOME) || siteType2.equals(SiteType.HOME) || siteType3.equals(SiteType.HOME)) {
            this.home = new Home();
        } 
        if (siteType.equals(SiteType.ARTICLE) || siteType2.equals(SiteType.ARTICLE) || siteType3.equals(SiteType.ARTICLE)) {
            this.article = new Article(); 
        } 
        if (siteType.equals(SiteType.REGISTRATION) || siteType2.equals(SiteType.REGISTRATION) || siteType3.equals(SiteType.REGISTRATION)) {

            this.registration = new Registration(); 
        } 
        if (siteType.equals(SiteType.LOGIN) || siteType2.equals(SiteType.LOGIN) || siteType3.equals(SiteType.LOGIN) ) {

            this.login = new Login();  

        }
    }

    public HTML(SiteType siteType, SiteType siteType2, SiteType siteType3, SiteType siteType4 ) {

        if (siteType.equals(SiteType.STARTERPROJECT) || siteType2.equals(SiteType.STARTERPROJECT) || siteType3.equals(SiteType.STARTERPROJECT) || siteType4.equals(SiteType.STARTERPROJECT)) {
            this.starterProject = new StarterProject();
        } 
        if (siteType.equals(SiteType.HOME) || siteType2.equals(SiteType.HOME) || siteType3.equals(SiteType.HOME) || siteType4.equals(SiteType.HOME)) {
            this.home = new Home();
        } 
        if (siteType.equals(SiteType.ARTICLE) || siteType2.equals(SiteType.ARTICLE) || siteType3.equals(SiteType.ARTICLE) || siteType4.equals(SiteType.ARTICLE)) {
            this.article = new Article(); 
        } 
        if (siteType.equals(SiteType.REGISTRATION) || siteType2.equals(SiteType.REGISTRATION) || siteType3.equals(SiteType.REGISTRATION) || siteType4.equals(SiteType.REGISTRATION)) {

            this.registration = new Registration(); 
        } 
        if (siteType.equals(SiteType.LOGIN) || siteType2.equals(SiteType.LOGIN) || siteType3.equals(SiteType.LOGIN) || siteType4.equals(SiteType.LOGIN)  ) {

            this.login = new Login();  
        }
    }

    public HTML(SiteType siteType, SiteType siteType2, SiteType siteType3, SiteType siteType4, SiteType siteType5 ) {

        if (siteType.equals(SiteType.STARTERPROJECT) || siteType2.equals(SiteType.STARTERPROJECT) || siteType3.equals(SiteType.STARTERPROJECT) || siteType4.equals(SiteType.STARTERPROJECT) || siteType5.equals(SiteType.STARTERPROJECT)) {
            this.starterProject = new StarterProject();
        } 
        if (siteType.equals(SiteType.HOME) || siteType2.equals(SiteType.HOME) || siteType3.equals(SiteType.HOME) || siteType4.equals(SiteType.HOME) || siteType5.equals(SiteType.HOME)) {
            this.home = new Home();
        } 
        if (siteType.equals(SiteType.ARTICLE) || siteType2.equals(SiteType.ARTICLE) || siteType3.equals(SiteType.ARTICLE) || siteType4.equals(SiteType.ARTICLE) || siteType5.equals(SiteType.ARTICLE)) {
            this.article = new Article(); 
        } 
        
        if (siteType.equals(SiteType.REGISTRATION) || siteType2.equals(SiteType.REGISTRATION) || siteType3.equals(SiteType.REGISTRATION) || siteType4.equals(SiteType.REGISTRATION) || siteType5.equals(SiteType.REGISTRATION)) {

            this.registration = new Registration(); 
        } 
        if (siteType.equals(SiteType.LOGIN) || siteType2.equals(SiteType.LOGIN) || siteType3.equals(SiteType.LOGIN) || siteType4.equals(SiteType.LOGIN) || siteType5.equals(SiteType.LOGIN)  ) {

            this.login = new Login();  
        }
    }

    public void header() {
        System.out.println("header"); 
   
    }

    public void nav() {
        System.out.println("nav"); 
      
    }
    public void main() {
        System.out.println("main"); 

    }

    public void aside() {
        System.out.println("aside"); 

    }
    public void footer() {
        System.out.println("footer"); 

    }

    public void completeTemplate() {
        header();
        nav();
        main();
        aside();
        footer();
        System.out.println("complete template"); 
    }

    public void robots(String robots) {
        System.out.println("generated robots text file");
    }

    public void textFileParser(String textfile) {
        System.out.println("You have parsed your textfile"); 

    }

    public void CSVcontentParser(String fileToParsem, String parsingOn) {
        System.out.println("You have parsed CSV your content");

    }

    
    
}