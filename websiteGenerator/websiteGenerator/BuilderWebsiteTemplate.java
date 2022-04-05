package websiteGenerator;

public class BuilderWebsiteTemplate {

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

   private BuilderWebsiteTemplate(Builder builder) {
       this.home = builder.home;
       this.starterProject = builder.starterProject;
   }

   public static class Builder {
       private Home home;
       private StarterProject StarterProject;
       private Article article;
       private Registration registration;
       private Login login;

       public Builder addHome(final Home home) {
           this.Home = home;
           return this;
       }

       public Builder addStarterProject(final StarterProject starterProject) {
           this.addStarterProject = starterProject;
           return this;
       }

       public Builder addarticle(final StarterProject starterProject) {
           this.addStarterProject = starterProject;
           return this;
       }

      
       public BuilderWebsiteTemplate build() {
           return new BuilderWebsiteTemplate(this);
       }
   }
}
