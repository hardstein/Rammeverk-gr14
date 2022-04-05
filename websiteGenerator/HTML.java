import websiteGenerator.Pages.Home;
import websiteGenerator.Pages.StarterProject;

public class HTML implements ConstructingSite  {
   public Article article;
   public Home home;
   public StarterProject starterProject;
   public Registration registration;
   public Login login;


   public HTML() {

   }

   public HTML(websiteGenerator.Util.SiteType siteType) {

       if (siteType.equals(websiteGenerator.Util.SiteType.STARTERPROJECT)) {

           this.starterProject = new StarterProject();

       } else if (siteType.equals(websiteGenerator.Util.SiteType.HOME)) {

           this.home = new Home();

       } else if (siteType.equals(websiteGenerator.Util.SiteType.ARTICLE)) {

           this.article = new Article();

       } else if (siteType.equals(websiteGenerator.Util.SiteType.REGISTRATION)) {

           this.registration = new Registration();

       } else if (siteType.equals(websiteGenerator.Util.SiteType.LOGIN)) {

           this.login = new Login();
       }
   }

   public HTML(websiteGenerator.Util.SiteType siteType, websiteGenerator.Util.SiteType siteType2) {
       if (siteType.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType2.equals(websiteGenerator.Util.SiteType.STARTERPROJECT)) {
           this.starterProject = new StarterProject();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.HOME) || siteType2.equals(websiteGenerator.Util.SiteType.HOME)) {
           this.home = new Home();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType2.equals(websiteGenerator.Util.SiteType.ARTICLE)) {
           this.article = new Article();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType2.equals(websiteGenerator.Util.SiteType.REGISTRATION)) {

           this.registration = new Registration();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType2.equals(websiteGenerator.Util.SiteType.LOGIN)) {

           this.login = new Login();

       }
   }

   public HTML(websiteGenerator.Util.SiteType siteType, websiteGenerator.Util.SiteType siteType2, websiteGenerator.Util.SiteType siteType3 ) {

       if (siteType.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType2.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType3.equals(websiteGenerator.Util.SiteType.STARTERPROJECT)) {
           this.starterProject = new StarterProject();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.HOME) || siteType2.equals(websiteGenerator.Util.SiteType.HOME) || siteType3.equals(websiteGenerator.Util.SiteType.HOME)) {
           this.home = new Home();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType2.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType3.equals(websiteGenerator.Util.SiteType.ARTICLE)) {
           this.article = new Article();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType2.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType3.equals(websiteGenerator.Util.SiteType.REGISTRATION)) {

           this.registration = new Registration();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType2.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType3.equals(websiteGenerator.Util.SiteType.LOGIN) ) {

           this.login = new Login();

       }
   }

   public HTML(websiteGenerator.Util.SiteType siteType, websiteGenerator.Util.SiteType siteType2, websiteGenerator.Util.SiteType siteType3, websiteGenerator.Util.SiteType siteType4 ) {

       if (siteType.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType2.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType3.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType4.equals(websiteGenerator.Util.SiteType.STARTERPROJECT)) {
           this.starterProject = new StarterProject();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.HOME) || siteType2.equals(websiteGenerator.Util.SiteType.HOME) || siteType3.equals(websiteGenerator.Util.SiteType.HOME) || siteType4.equals(websiteGenerator.Util.SiteType.HOME)) {
           this.home = new Home();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType2.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType3.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType4.equals(websiteGenerator.Util.SiteType.ARTICLE)) {
           this.article = new Article();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType2.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType3.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType4.equals(websiteGenerator.Util.SiteType.REGISTRATION)) {

           this.registration = new Registration();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType2.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType3.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType4.equals(websiteGenerator.Util.SiteType.LOGIN)  ) {

           this.login = new Login();
       }
   }

   public HTML(websiteGenerator.Util.SiteType siteType, websiteGenerator.Util.SiteType siteType2, websiteGenerator.Util.SiteType siteType3, websiteGenerator.Util.SiteType siteType4, websiteGenerator.Util.SiteType siteType5 ) {

       if (siteType.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType2.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType3.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType4.equals(websiteGenerator.Util.SiteType.STARTERPROJECT) || siteType5.equals(websiteGenerator.Util.SiteType.STARTERPROJECT)) {
           this.starterProject = new StarterProject();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.HOME) || siteType2.equals(websiteGenerator.Util.SiteType.HOME) || siteType3.equals(websiteGenerator.Util.SiteType.HOME) || siteType4.equals(websiteGenerator.Util.SiteType.HOME) || siteType5.equals(websiteGenerator.Util.SiteType.HOME)) {
           this.home = new Home();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType2.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType3.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType4.equals(websiteGenerator.Util.SiteType.ARTICLE) || siteType5.equals(websiteGenerator.Util.SiteType.ARTICLE)) {
           this.article = new Article();
       }

       if (siteType.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType2.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType3.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType4.equals(websiteGenerator.Util.SiteType.REGISTRATION) || siteType5.equals(websiteGenerator.Util.SiteType.REGISTRATION)) {

           this.registration = new Registration();
       }
       if (siteType.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType2.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType3.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType4.equals(websiteGenerator.Util.SiteType.LOGIN) || siteType5.equals(websiteGenerator.Util.SiteType.LOGIN)  ) {

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