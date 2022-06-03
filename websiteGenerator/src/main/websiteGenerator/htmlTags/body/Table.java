package src.main.websiteGenerator.htmlTags.body;

import src.main.websiteGenerator.util.Parse;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * class for defining and building a Table element for a Page {@link src.main.websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Table {

    public String table;

    /**
     * Getter for html table string
     *
     * @return string
     */
    public String getTable() {
        return table;
    }


    private Table(Builder builder) {

        this.table = builder.table;

        if (!(builder.tableHeaderRow.isEmpty() || builder.tableDataRows.isEmpty())) {

            StringBuilder createdTable = new StringBuilder();

            createdTable.append("<div class=\"").append(Builder.BOOTSTRAP_DIV_DESIGN).append("\">");
            createdTable.append("<table class=\"").append(builder.tableTagBootstrapDesignString).append("\">");
            createdTable.append("<thead>");
            createdTable.append("<tr>");

            for (int i = 0; i < builder.tableHeaderRow.size(); i++) {

                createdTable.append("<th>");
                createdTable.append(builder.tableHeaderRow.get(i));
                createdTable.append("</th>");

            }
            createdTable.append("</tr>");
            createdTable.append("</thead>");
            createdTable.append("<tbody>");

            for (int i = 0; i < builder.tableDataRows.size(); i++) {

                createdTable.append("<tr>");
                for (int j = 0; j < builder.tableDataRows.get(i).size(); j++) {

                    createdTable.append("<td>");
                    createdTable.append(builder.tableDataRows.get(i).get(j));
                    createdTable.append("</td>");
                }
                createdTable.append("</tr>");

            }
            createdTable.append("</tbody>");
            createdTable.append("</table>");
            createdTable.append("</div>");


            this.table = createdTable.toString();

        }

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
        /**
         * Variable for default dic design
         */
        public final static String BOOTSTRAP_DIV_DESIGN = "table-responsive-sm";
        private final static String DEFAULT_BOOTSTRAP_TABLE_DESIGN = "table";

        private String table;
        private final ArrayList<String> tableHeaderRow = new ArrayList<>();
        private final ArrayList<ArrayList<String>> tableDataRows = new ArrayList<>();
        private String tableTagBootstrapDesignString = DEFAULT_BOOTSTRAP_TABLE_DESIGN;

        /**
         * Parse CSV file to Table
         *
         * @param filepath
         * @param parsingCharacter
         * @return Builder object
         */
        public Builder addCSVToHTMLTable(String filepath, String parsingCharacter) {
            this.table = Parse.CSVtoHTMLTable(filepath, parsingCharacter);
            return this;
        }

        /**
         * Adds table header row
         *
         * @param headerRow
         * @return Builder object
         */
        public Builder addTableHeaderRow(String[] headerRow) {
            this.tableHeaderRow.addAll(Arrays.asList(headerRow));
            return this;
        }

        /**
         * Adds table data row
         *
         * @param dataRow
         * @return Builder object
         */
        public Builder addTableDataRow(String[] dataRow) {
            ArrayList<String> tableDataRow = new ArrayList<>(Arrays.asList(dataRow));
            this.tableDataRows.add(tableDataRow);
            return this;
        }

        /**
         * Adds custom boostrap design on table
         *
         * @param bootstrapTableValue
         * @return Builder object
         */
        public Builder addBoostrapTableDesign(String bootstrapTableValue) {
            this.tableTagBootstrapDesignString = bootstrapTableValue;
            return this;
        }

        /**
         * @return new Table object
         */
        public Table build() {

            return new Table(this);
        }

    }
}
