package websiteGenerator.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class Parse implements Parsers {

    public static String CSVtoHTMLTable(String filename, String parsingSign) {

        StringBuilder htmlTable = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            htmlTable.append("<table>");

            line = bufferedReader.readLine();

            String[] tableHeader = line.split(parsingSign);

            htmlTable.append("<tr>");

            for (String s : tableHeader) {
                htmlTable.append("<th>");
                htmlTable.append(s);
                htmlTable.append("</th>");

            }

            htmlTable.append("</tr>");

            System.out.println(tableHeader[0]);

            while ((line = bufferedReader.readLine()) != null) {
                String[] tableData = line.split(parsingSign);

                htmlTable.append("<tr>");

                for (String s : tableData) {
                    htmlTable.append("<td>");
                    htmlTable.append(s);
                    htmlTable.append("</td>");

                }

                htmlTable.append("</tr>");

            }

            htmlTable.append("</table>");


        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return htmlTable.toString();
    }

}
