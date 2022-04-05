package websiteGenerator;

import websiteGenerator.Pages.*; 

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

   public static Builder createWebsiteBuilder() {
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

       public Builder addHome(Home home) {
            this.home = home; 
           return this;
       }

       public Builder addStarterProject(StarterProject starterProject) {
           this.starterProject = starterProject;
           return this;
       }

       public Builder addArticle(Article article) {
           this.article = article ;
           return this;
       }

       public Builder addRegistration() {
           this.registration = new Registration();
           return this;
       }
       public Builder addLogin() {
           this.login = new Login();
           return this;
       }
      
       public WebsiteBuilder build() {
           return new WebsiteBuilder(this);
       }
   }
}
