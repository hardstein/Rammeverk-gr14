
package websiteGenerator.Pages; 

import websiteGenerator.SemanticElements.Header;
import websiteGenerator.SemanticElements.*;
import websiteGenerator.Util.Theme;

public class Article  {
   private Theme theme;
   private Header header;
   private Main main;
   private Nav nav;
   private Aside aside;

   public Article(Theme theme) {
       this.theme = theme;
       System.out.println("you have made a article object with chosen theme " + theme);
   }
   public Article() {

       System.out.println("you have made a article object");
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
