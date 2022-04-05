package websiteGenerator;

import javax.management.openmbean.SimpleType;

import ApiCreation.Article;
import ApiCreation.Login;
import ApiCreation.Registration;
import ApiCreation.StarterProject;

public class WebsiteBuilder {

   private Home home;
   private StarterProject starterProject;
   private Article article;
   private Registration registration;
   private Login login;

   public Home getHome() {
       return home;
   }

   public StarterProject getStarterProject() {
       return starterProject;
   }

   public Article getArticle() {
       return article; 
   }
   public Registration getRegistration() {
       return registration; 
   }
   public Login getLogin() {
       return login; 
   }


   public static Builder createBuilder() {
    return new Builder();
    }   

   private WebsiteBuilder(Builder builder) {
       this.home = builder.home;
       this.starterProject = builder.starterProject;
       this.article = builder.article;
       this.login = builder.login;
       this.registration = builder.registration;
   }

   public static class Builder {
       private Home home;
       private StarterProject starterProject;
       private Article article;
       private Registration registration;
       private Login login;

       public Builder addHome() {
           this.home = new Home();
           return this;
       }

       public Builder addStarterProject() {
           this.starterProject = new StarterProject();
           return this;
       }

       public Builder addArticle() {
           this.article = new Article() ;
           return this;
       }

       public Builder addRegistration() {
           this.registration = new Registration();
           return this;
       }
       public Builder addLogin() {
           this.article = new Login();
           return this;
       }
      
       public WebsiteBuilder build() {
           return new WebsiteBuilder(this);
       }
   }
}
