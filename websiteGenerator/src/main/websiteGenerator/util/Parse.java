package src.main.websiteGenerator.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * abstract class for parsing files to html
 *
 * @version 1.0.0
 */
public abstract class Parse {

    /**
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

    /**
     * Parses the txt file and addes html paragraph tags in paragraph in txt file
     *
     * @param fileName
     * @return String
     */
    public static String txtToHtml(String fileName) {

        StringBuilder htmlTxt = new StringBuilder();

        try (BufferedReader buffer = new BufferedReader(
                new FileReader(fileName))) {

            String line;

            htmlTxt.append("<section>").append("\n");
            htmlTxt.append("<p>").append("\n");
            while ((line = buffer.readLine()) != null) {

                if (line.equals("")) {
                    htmlTxt.append("</p>").append("\n").append("<p>");
                }

                htmlTxt.append(line).append("\n");
            }

            htmlTxt.append("</p>").append("\n");
            htmlTxt.append("</section>").append("\n");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return htmlTxt.toString();

    }

}
