package websiteGenerator.htmlTags.body;

import websiteGenerator.util.Parse;

import java.util.ArrayList;

public class Table {

    public String table;

        /**
         * Getter for the html table string
         * @return string
         */
    public String getTable() {
        return table;
    }


    private Table(Builder builder) {

        this.table = builder.table;

     if(!(builder.tableHeaderRow.isEmpty() || builder.tableDataRow.isEmpty())) {

         StringBuilder createdTable = new StringBuilder();

         createdTable.append("<table>");
         createdTable.append("<tr>");

         for (int i = 0; i < builder.tableHeaderRow.size(); i++) {

             createdTable.append("<th>");
             createdTable.append(builder.tableHeaderRow.get(i));
             createdTable.append("</th>");
         }
         createdTable.append("</tr>");

         for (int i = 0; i < builder.tableDataRow.size(); i++) {

             createdTable.append("<tr>");
             for (int j = 0; j < builder.tableDataRow.get(i).size(); j++) {

                 createdTable.append("<td>");
                 createdTable.append(builder.tableDataRow.get(i).get(j));
                 createdTable.append("</td>");
             }
             createdTable.append("</tr>");

         }
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
        private String table;
        private ArrayList<String> tableHeaderRow;
        private ArrayList<ArrayList<String>> tableDataRow = new ArrayList<>();

        public Builder addCSVToHTMLTable(String filepath, String parsingCharacter) {
            this.table = Parse.CSVtoHTMLTable(filepath, parsingCharacter);
            return this;
        }

        public Builder addTableHeaderRow(ArrayList<String> headerRow) {
            this.tableHeaderRow = headerRow;
            return this;
        }

        public Builder addTableDataRow(ArrayList<String> dataRow) {
            this.tableDataRow.add(dataRow);
            return this;
        }

        public Table build() {

            return new Table(this);
        }

        }
}
