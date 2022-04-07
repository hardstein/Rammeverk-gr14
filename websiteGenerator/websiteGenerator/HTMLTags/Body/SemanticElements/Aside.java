package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.SemanticElementContent;

public class Aside implements SemanticElementContent {
    private final String asideTitle;
    private final String asideText;

    public String getAsideTitle() {
        return asideTitle;
    }

    public String getAsideText() {
        return asideText;
    }

    private Aside(Builder builder) {
        this.asideTitle = builder.asideTitle;
        this.asideText = builder.asideText;

    }

    public static Builder createElementBuilder() {
        return new Builder();
    }

//    @Override
//    public String content() {
//        String content = "" +
//                "    <aside>\n" +
//                "        <h2>" + asideTitle + "</h2>\n" +
//                "        <p>" + asideText + "</p>\n" +
//                "    </aside>" +
//                "";
//        return content;
//    }

    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <aside>\n" + "        <h2>")
                .append(asideTitle)
                .append("</h2>\n")
                .append("        <p>")
                .append(asideText)
                .append("</p>\n")
                .append("    </aside>");
        return content;
    }

    public static class Builder {
        private String asideTitle;
        private String asideText;

        public Builder addAsideTitle(final String asideTitle) {
            this.asideTitle = asideTitle;
            return this;
        }

        public Builder addAsideText(final String asideText) {
            this.asideText = asideText;
            return this;
        }

        public Aside build() {
            return new Aside(this);
        }
    }

}
