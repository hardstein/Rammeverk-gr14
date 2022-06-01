package websiteGenerator.htmlTags.body;

import websiteGenerator.util.Parse;

public class Table {

    public String table;

        /**
         * Getter for the html table string
         * @return string
         */
    public void getTable() {
        System.out.println(table);
    }


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
        private String table;

        public Builder addCSVToHTMLTable(String filepath, String parsingCharacter) {
            this.table = Parse.CSVtoHTMLTable(filepath, parsingCharacter);
            System.out.println(table);
            return this;
        }

        public Table build() {

            return new Table(this);
        }

        }
}
