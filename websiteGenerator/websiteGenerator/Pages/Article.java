
package websiteGenerator.Pages; 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.HTMLTags.Html;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Util.HTMLLanguageOptions;
import websiteGenerator.Util.Theme;

public class Article extends Page  {

   private String heading;
   private Theme theme;

   public static Builder createArticlePageBuilder() {
    return new Builder();
    }   

   private Article(Builder builder) {
       this.heading = builder.heading; 
       super.content = builder.content; 
       super.fileName = builder.fileName; 
       super.header = builder.header;
       super.main = builder.main;
       super.nav = builder.nav;
       super.aside = builder.aside;
       super.html = builder.html; 
       super.head = builder.head;
   }

   public static class Builder {
       private String fileName = "article.html"; 
       private String heading = "Starter template";
       private String content = "This is a starter article template.";

       private Html html = Html.createHTMLTag(HTMLLanguageOptions.EN); 

       private Header header;
       private Head head;
       private Main main;
       private Nav nav;
       private Aside aside;
       private Footer footer; 

       public Builder addFileName(String fileName) {
           this.fileName = fileName; 
           return this; 

       }
       public Builder addLanguage(HTMLLanguageOptions lang) {
           this.html.setStartTag(lang);; 
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
       public Builder addHead(Head head) {
           this.head = head;
           return this;
       }
      
       public Article build() {
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
