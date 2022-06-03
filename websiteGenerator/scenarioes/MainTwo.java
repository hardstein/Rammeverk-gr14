package scenarioes;

import websiteGenerator.htmlTags.body.Table;
import websiteGenerator.htmlTags.body.Main;
import websiteGenerator.pages.Article;
import websiteGenerator.util.Parse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTwo {

    public static void main(String[] args) throws IOException {

        //System.out.println(Parse.CSVtoHTMLTable("annual-enterprise-survey-2020-financial-year-provisional-csv.csv", ","));

       /* Table csvTable = Table.createTableBuilder().
                addCSVToHTMLTable("planets_100.csv", ";").
                build();*/

        //System.out.println(csvTable.getTable());

        String[] tableHeader1 = new String[]
                {"Club","MP", "W", "D", "L", "Pts"};
        String[] tableData2 = new String[]
                {"Man City", "38", "29", "6", "3", "93"};

        Table createdTable = Table.createTableBuilder()
                .addTableHeaderRow(tableHeader1)
                .addTableDataRow(tableData2)
                .build();

        Main tableMain = Main.createElementBuilder().addTable(createdTable).build();
        Article tablePage = Article.createArticlePageBuilder().addMain(tableMain).build();
        tablePage.generateHTMLPageFile();


        System.out.println(createdTable.getTable());

        System.out.println(Parse.txtToHtml("Scenario5.txt"));

        //System.out.println(Parse.CSVtoHTMLTable("planets_100.csv", ";"));

    }
}
