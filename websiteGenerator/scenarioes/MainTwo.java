package scenarioes;

import websiteGenerator.htmlTags.body.Table;
import websiteGenerator.util.Parse;

import java.util.ArrayList;

public class MainTwo {

    public static void main(String[] args) {

        //System.out.println(Parse.CSVtoHTMLTable("annual-enterprise-survey-2020-financial-year-provisional-csv.csv", ","));

        Table csvTable = Table.createTableBuilder().
                addCSVToHTMLTable("planets_100.csv", ";").
                build();

        System.out.println(csvTable.getTable());

        String[] tableHeader1 = new String[]
                {"Club","MP", "W", "D", "L", "Pts"};
        String[] tableData2 = new String[]
                {"Man City", "38", "29", "6", "3", "93"};

        Table createdTable = Table.createTableBuilder()
                .addTableHeaderRow(tableHeader1)
                .addTableDataRow(tableData2)
                .build();



        //System.out.println(Parse.CSVtoHTMLTable("planets_100.csv", ";"));

    }
}
