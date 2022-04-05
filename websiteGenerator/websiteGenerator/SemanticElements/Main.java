package websiteGenerator.SemanticElements;

import websiteGenerator.Util.SemanticElementContent;

public class Main implements SemanticElementContent {

    private final String mainHeading;
    private final String mainContent;

    public String getMainHeading() {
        return mainHeading;
    }

    public String getMainContent() {
        return mainContent;
    }

    private Main(Builder builder) {
        this.mainHeading = builder.mainHeading;
        this.mainContent = builder.mainContent;
    }

    public static Builder createElementBuilder() {
        return new Builder();
    }

    @Override
    public String content() {
        String s = "" +
                "    <main>\n" +
                "        <h1>"+mainHeading+"</h1>\n" +
                "        <p>"+mainContent+"</p>\n" +
                "    </main>";
        return s;
    }

    public static class Builder {
        private String mainHeading;
        private String mainContent;

        public Builder addMainHeading(final String mainHeading) {
            this.mainHeading = mainHeading;
            return this;
        }

        public Builder addMainContent(final String mainContent) {
            this.mainContent = mainContent;
            return this;
        }

        public Main build() {
            return new Main(this);
        }
    }
}
