
package websiteGenerator.Pages; 

import websiteGenerator.SemanticElements.Header;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import websiteGenerator.SemanticElements.*;
import websiteGenerator.Util.Theme;

public class Article  {

   private String heading;
   private String content;


   private String fileName; 
   private Theme theme;
   private Header header;
   private Main main;
   private Nav nav;
   private Aside aside;
   private Footer footer; 

   public Article(Theme theme) {
       this.theme = theme;
       System.out.println("you have made a article object with chosen theme " + theme);
   }
   public Article() {
       System.out.println("you have made an article object");
   }

   public static Builder createArticlePageBuilder() {
    return new Builder();
    }   

   private Article(Builder builder) {
       this.heading = builder.heading; 
       this.content = builder.content; 
       this.fileName = builder.fileName; 
       this.header = builder.header;
       this.main = builder.main;
       this.nav = builder.nav;
       this.aside = builder.aside;
   }

   public static class Builder {
       private String fileName = "article.html"; 
       private String heading = "Starter template";
       private String content = "This is a starter article template.";

       private Header header;
       private Main main;
       private Nav nav;
       private Aside aside;
       private Footer footer; 

       public Builder addFileName(String fileName) {
           this.fileName = fileName; 
           return this; 

       }


       public Builder addHeader(Header header) {
           this.header = header;
           return this;
       }

       public Builder addMain(Main main) {
           this.main = main;
           return this;
       }

       public Builder addNav(Nav nav) {
           this.nav = nav;
           return this;
       }
       public Builder addAside(Aside aside) {
           this.aside = aside;
           return this;
       }
       public Builder addFooter(Footer footer) {
           this.footer = footer;
           return this;
       }
      
       public Article build() {

                    FileWriter fileWriter;
                    try {
                        //File file = new File(this.fileName);
                        fileWriter = new FileWriter(this.fileName);

                        fileWriter.write("<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "   <meta charset=\"UTF-8\">\n" +
                            "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                            "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                            "   <link rel=\"stylesheet\" href=\"" + "styles.css" + "\">\n" +
                            "   <title>Starter Project</title>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            this.header.content() + "\n" +
                            this.nav.content() + "\n" +
                            this.main.content() + "\n" +
                            this.aside.content() + "\n" +
                            this.footer.content() + "\n" +
                            "</body>\n" +
                            "</html>");

                        fileWriter.close();

                        System.out.println("HTML template with style was successfully filled");
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    return new Article(this);
       }
   }

   public void setTheme(Theme theme) {
       this.theme = theme;
   }

   public Theme getTheme() {
       return theme;
   }

}
