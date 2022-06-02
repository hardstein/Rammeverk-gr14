package websiteGenerator.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Parse implements Parsers {

    /**
     *
     * @param filename
     * @param parsingCharacter
     * @return html string containing the table from the CSV file
     */
    public static String CSVtoHTMLTable(String filename, String parsingCharacter) {

        StringBuilder htmlTable = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            htmlTable.append("<table>");

            line = bufferedReader.readLine();

            String[] tableHeader = line.split(parsingCharacter);
            htmlTable.append("<thead>");
            htmlTable.append("<tr>");

            for (String s : tableHeader) {
                htmlTable.append("<th>");
                htmlTable.append(s);
                htmlTable.append("</th>");

            }

            htmlTable.append("</tr>");
            htmlTable.append("</thead>");

            System.out.println(tableHeader[0]);

            htmlTable.append("</tbody>");

            while ((line = bufferedReader.readLine()) != null) {
                String[] tableData = line.split(parsingCharacter);

                htmlTable.append("<tr>");

                for (String s : tableData) {
                    htmlTable.append("<td>");
                    htmlTable.append(s);
                    htmlTable.append("</td>");
                }

                htmlTable.append("</tr>");

            }

            htmlTable.append("</tbody>");
            htmlTable.append("</table>");


        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return htmlTable.toString();
    }

    public static String txtToHtml(String fileName)  {

        StringBuilder htmlTxt = new StringBuilder();

        try (BufferedReader buffer = new BufferedReader(
                new FileReader(fileName))) {

            String line;

            htmlTxt.append("<section>").append("\n");
            htmlTxt.append("<p>").append("\n");
            while ((line = buffer.readLine()) != null) {

                if(line.equals("")) {
                    htmlTxt.append("</p>").append("\n").append("<p>");
                }

                htmlTxt.append(line).append("\n");
            }

            htmlTxt.append("</p>").append("\n");
            htmlTxt.append("</section>");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        return htmlTxt.toString();

    }

}
