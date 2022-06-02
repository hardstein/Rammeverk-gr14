package scenarioes;

import websiteGenerator.htmlTags.body.Table;
import websiteGenerator.util.Parse;

public class MainTwo {

    public static void main(String[] args) {

        //System.out.println(Parse.CSVtoHTMLTable("annual-enterprise-survey-2020-financial-year-provisional-csv.csv", ","));

        Table csvTable = Table.createTableBuilder().
                addCSVToHTMLTable("planets_100.csv", ";").
                build();

        System.out.println(csvTable.getTable());



        Table createdTable = Table.createTableBuilder()
                .addTableHeaderRow()
                .addTableDataRow()
                .build();

        //System.out.println(Parse.CSVtoHTMLTable("planets_100.csv", ";"));

    }
}
