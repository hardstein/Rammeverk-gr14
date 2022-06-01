package scenarioes;

import websiteGenerator.htmlTags.body.Table;
import websiteGenerator.util.Parse;

public class MainTwo {

    public static void main(String[] args) {

        //System.out.println(Parse.CSVtoHTMLTable("annual-enterprise-survey-2020-financial-year-provisional-csv.csv", ","));

        Table table = Table.createTableBuilder().addCSVToHTMLTable("planets_100.csv", ";").build();

        System.out.println(table.getTable());

        //System.out.println(Parse.CSVtoHTMLTable("planets_100.csv", ";"));



    }
}
