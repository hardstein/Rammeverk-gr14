package websiteGenerator.Pages;

import websiteGenerator.HTMLTags.Html;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Util.*;

public abstract class Page {
   protected String fileName; 
   protected String content; 

   protected Html html; 
   protected Theme theme;
   protected Header header;
   protected Main main;
   protected Nav nav;
   protected Aside aside;
   protected Footer footer;

   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public Theme getTheme() {
      return theme;
   }

   public void setTheme(Theme theme) {
      this.theme = theme;
   }

   public Header getHeader() {
      return header;
   }

   public void setHeader(Header header) {
      this.header = header;
   }

   public Main getMain() {
      return main;
   }

   public void setMain(Main main) {
      this.main = main;
   }

   public Nav getNav() {
      return nav;
   }

   public void setNav(Nav nav) {
      this.nav = nav;
   }

   public Aside getAside() {
      return aside;
   }

   public void setAside(Aside aside) {
      this.aside = aside;
   }

   public Footer getFooter() {
      return footer;
   }

   public void setFooter(Footer footer) {
      this.footer = footer;
   }

   public Html getHtml() {
       return html;
   }
}
