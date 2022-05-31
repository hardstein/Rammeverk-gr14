package scenarioes;

import websiteGenerator.util.Parse;

public class MainTwo {

    public static void main(String[] args) {

        System.out.println(Parse.CSVtoHTMLTable("annual-enterprise-survey-2020-financial-year-provisional-csv.csv", ","));

        //System.out.println(Parse.CSVtoHTMLTable("planets_100.csv", ";"));



    }
}
