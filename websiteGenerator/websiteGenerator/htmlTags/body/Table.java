package websiteGenerator.htmlTags.body;

import websiteGenerator.util.Parse;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {

    public String table;

        /**
         * Getter for html table string
         * @return string
         */
    public String getTable() {
        return table;
    }


    private Table(Builder builder) {

        this.table = builder.table;

     if(!(builder.tableHeaderRow.isEmpty() || builder.tableDataRows.isEmpty())) {

         StringBuilder createdTable = new StringBuilder();

         createdTable.append("<div class=\"").append(Builder.BOOTSTRAP_DIV_DESIGN).append("\"");;
         createdTable.append("<table class=\"").append(builder.tableTagBootstrapDesignString).append("\"");
         createdTable.append("<thead>");

         for (int i = 0; i < builder.tableHeaderRow.size(); i++) {

             createdTable.append("<tr>");
             createdTable.append("<th>");
             createdTable.append(builder.tableHeaderRow.get(i));
             createdTable.append("</th>");
             createdTable.append("</tr>");
         }
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

        public final static String BOOTSTRAP_DIV_DESIGN = "table-responsive-sm";
        private final static String DEFAULT_BOOTSTRAP_TABLE_DESIGN = "table";

        private String table;
        private ArrayList<String> tableHeaderRow = new ArrayList<>();
        private ArrayList<ArrayList<String>> tableDataRows = new ArrayList<>();
        private String tableTagBootstrapDesignString = DEFAULT_BOOTSTRAP_TABLE_DESIGN;

        public Builder addCSVToHTMLTable(String filepath, String parsingCharacter) {
            this.table = Parse.CSVtoHTMLTable(filepath, parsingCharacter);
            return this;
        }

        public Builder addTableHeaderRow(String[] headerRow) {
            this.tableHeaderRow.addAll(Arrays.asList(headerRow));
            return this;
        }

        public Builder addTableDataRow(String[] dataRow) {
            ArrayList<String> tableDataRow = new ArrayList<>(Arrays.asList(dataRow));
            this.tableDataRows.add(tableDataRow);
            return this;
        }

        public Builder addTableDesign(String bootstrapTableValue) {
            this.tableTagBootstrapDesignString = bootstrapTableValue;
            return this;
        }

        public Table build() {

            return new Table(this);
        }

        }
}
