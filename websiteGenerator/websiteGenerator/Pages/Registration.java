package websiteGenerator.Pages;


import websiteGenerator.Util.Theme;

public class Registration {
   Theme theme;

   public Registration(Theme theme) {
       System.out.println("You have made registration object template");
       this.theme = theme;
   }

   public Registration() {
       System.out.println("You have made registration object template with theme " + theme);
   }

   public void header(String image) {

       System.out.println("header with chosen picture");

   }

   public void setTheme(Theme theme) {
       this.theme = theme;
   }


   public Theme getTheme() {
       return theme;
   }

}
