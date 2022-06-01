package websiteGenerator.htmlTags.body;

import websiteGenerator.util.Parse;

public class Table {

        private String table = "";
        /**
         * Getter for main heading
         * @return heading for main tag
         */


        private Table(Builder builder) {
            this.table = builder.table;

        }

        /**
         * Factory for building a main tag
         *
         * @return Builder
         */
        public static Builder createTableBuilder() {
            return new Builder();
        }

        public static class Builder {
            private String table = "";

            public Builder addCSVToHTMLTable(String filepath, String parsingCharacter) {
                this.table = Parse.CSVtoHTMLTable(filepath, parsingCharacter);
                return this;
            }

            private Table build() {

                return new Table(this);
            }

        }
}
