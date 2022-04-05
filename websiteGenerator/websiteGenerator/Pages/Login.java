package websiteGenerator.Pages;

import websiteGenerator.WebsiteBuilder;
import websiteGenerator.Util.Theme;

public class Login {
   Theme theme;

   public Login() {
       System.out.println("You have made Login object");
   }

   public Login(Theme theme) {
       System.out.println("You have made Login object with chosen theme " + theme);
       this.theme = theme;
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
