package websiteGenerator.pages;

import websiteGenerator.htmlTags.body.*;
import websiteGenerator.htmlTags.head.Head;
import websiteGenerator.htmlTags.Html;
import websiteGenerator.htmlTags.body.semanticElements.*;
import websiteGenerator.util.*;

/**
 * Abstract class for pages.
 */
public abstract class Page {
   /**
    * The file name of a page.
    */
   protected String fileName;
   /**
    * The html element of the page.
    */
   protected Html html;
   /**
    * The head element of the page.
    */
   protected Head head;
   /**
    * The theme used by the page.
    */
   protected Theme theme;
   /**
    * The header element of the page.
    */
   protected Header header;
   /**
    * The main element of the page.
    */
   protected Main main;
   /**
    * The nav element of the page.
    */
   protected Nav nav;
   /**
    * The aside element of the page.
    */
   protected Aside aside;
   /**
    * The footer element of the page.
    */
   protected Footer footer;

   /**
    * Sets the html element for the page.
    * @param html The page html element.
    */
   public void setHtml(Html html) {
      this.html = html;
   }

   /**
    * Gets the head element of the page.
    * @return The head element of the
    */
   public Head getHead() {
      return head;
   }

   /**
    * Sets the head element for the page.
    * @param head The page head element.
    */
   public void setHead(Head head) {
      this.head = head;
   }

   /**
    * Gets the file name of the page.
    * @return The page file name.
    */
   public String getFileName() {
      return fileName;
   }

   /**
    * Sets the file name of the page.
    * @param fileName The page file name.
    */
   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   /**
    * Gets the theme used by the page.
    * @return The page theme.
    */
   public Theme getTheme() {
      return theme;
   }

   /**
    * Sets the theme of the page
    * @param theme The page theme.
    */
   public void setTheme(Theme theme) {
      this.theme = theme;
   }

   /**
    * Gets the header of the page.
    * @return The page header.
    */
   public Header getHeader() {
      return header;
   }

   /**
    * Sets the header for the page.
    * @param header The page header.
    */
   public void setHeader(Header header) {
      this.header = header;
   }

   /**
    * Gets the main of the page.
    * @return The page main.
    */
   public Main getMain() {
      return main;
   }

   /**
    * Sets the main of the page.
    * @param main The page main.
    */
   public void setMain(Main main) {
      this.main = main;
   }

   /**
    * Gets the nav of the page.
    * @return The nav of the page.
    */
   public Nav getNav() {
      return nav;
   }

   /**
    * Sets the nav for the page.
    * @param nav The page nav.
    */
   public void setNav(Nav nav) {
      this.nav = nav;
   }

   /**
    * Gets the aside of the page.
    * @return The aside of the page.
    */
   public Aside getAside() {
      return aside;
   }

   /**
    * Sets the aside for the page.
    * @param aside The page aside.
    */
   public void setAside(Aside aside) {
      this.aside = aside;
   }

   /**
    * Gets the footer of the page.
    * @return The footer of the page.
    */
   public Footer getFooter() {
      return footer;
   }

   /**
    * Sets the footer for the page.
    * @param footer The page footer.
    */
   public void setFooter(Footer footer) {
      this.footer = footer;
   }

   /**
    * Gets the html of the page.
    * @return The html element of the page.
    */
   public Html getHtml() {
       return html;
   }
}
