package websiteGenerator;

import javax.management.openmbean.SimpleType;

import Util.SiteType; 

public class WebsiteBuilder {

   private final Home home;
   private final StarterProject starterProject;
   private Article article;
   private Registration registration;
   private Login login;

   public Home getHome() {
       return home;
   }

   public StarterProject getStarterProject() {
       return starterProject;
   }


   public static Builder createBuilder() {
    return new Builder();
    }   

   private WebsiteBuilder(Builder builder) {
       this.home = builder.home;
       this.starterProject = builder.starterProject;
   }

   public static class Builder {
       private Home home;
       private StarterProject starterProject;
       private Article article;
       private Registration registration;
       private Login login;

       public Builder addHome(SiteType home) {
           this.home = home;
           return this;
       }

       public Builder addStarterProject(SiteType starterProject) {
           this.starterProject = starterProject;
           return this;
       }

       public Builder addarticle(SiteType article) {
           this.article = article;
           return this;
       }

      
       public WebsiteBuilder build() {
           return new WebsiteBuilder(this);
       }
   }
}
