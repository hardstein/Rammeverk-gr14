//package websiteGenerator;
//
//public class BuilderWebsiteTemplate {
//
//    private final Home home;
//    private final StarterProject starterProject;
//
//    public Home getHome() {
//        return home;
//    }
//
//    public StarterProject getStarterProject() {
//        return starterProject;
//    }
//
//    private BuilderWebsiteTemplate(Builder builder) {
//        this.home = builder.home;
//        this.starterProject = builder.starterProject;
//    }
//
//    public static class Builder {
//        private Home home;
//        private StarterProject starterProject;
//
//        public Builder home(final Home home) {
//            this.home = home;
//            return this;
//        }
//
//        public Builder starterProject(final StarterProject starterProject) {
//            this.starterProject = starterProject;
//            return this;
//        }
//
//        public BuilderWebsiteTemplate build() {
//            return new BuilderWebsiteTemplate(this);
//        }
//    }
//}
