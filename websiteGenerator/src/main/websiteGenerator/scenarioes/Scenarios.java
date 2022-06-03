package src.main.websiteGenerator.scenarioes;

import src.main.websiteGenerator.WebsiteBuilder;
import src.main.websiteGenerator.htmlTags.body.*;
import src.main.websiteGenerator.htmlTags.head.Head;
import src.main.websiteGenerator.pages.*;
import src.main.websiteGenerator.util.Theme;

import java.io.IOException;

import static src.main.websiteGenerator.util.FontFamily.ARIAL;
import static src.main.websiteGenerator.util.FontFamily.TimesNewRoman;
import static src.main.websiteGenerator.util.FontSize.FONTSIZE3;
import static src.main.websiteGenerator.util.FontSize.FONTSIZE4;
import static src.main.websiteGenerator.util.FontWeight.BOLD;
import static src.main.websiteGenerator.util.FontWeight.LIGHT;


/**
 * @hidden demonstration of framework, not a part of the library
 */
public class Scenarios {
    public static void main(String[] args) throws IOException {

        String heroImageUrl = "https://images.unsplash.com/photo-1534171472159-edb6d1e0b63c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjR8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60";
        // Demonstration of our API (We will show a solution for all the scenarios here)
        // You can find scenario: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13

        // These will be the same for all pages (footer, nav) :
        // Scenario 7: (create a footer that includes -> contact info, copyright, social media)
        Footer footer = Footer.createElementBuilder()
                .addContactName("Group 14")
                .addContactEmail("gr14@email.com")
                .addContactPhoneNumber(14326969)
                .addTwitterSocialMediaLink("Twitter link")
                .addInstagramSocialMediaLink("Instagram link")
                .addFacebookSocialMediaLink("facebook link")
                .build();

        Aside aside = Aside.createElementBuilder()
                .addAsideTitle("Lorem ipsum")
                .addAsideText("Aliquam elementum dolor porta ligula euismod venenatis. Curabitur sit amet malesuada elit. Proin ultrices id velit eu consectetur. Cras ex nunc, venenatis ut urna eu, maximus pulvinar ligula. Proin ut est metus. Curabitur et lorem sodales nunc lacinia blandit vitae efficitur leo. Nunc dapibus leo eget orci porta placerat. Phasellus efficitur, tortor ac rutrum fringilla, nisl ante fermentum est, eget congue massa augue at quam. Ut accumsan imperdiet felis dapibus sagittis. Morbi eget placerat leo, sed dapibus nisl. Maecenas at urna posuere, suscipit mauris in, aliquet diam. ")
                .addAsideText("Fusce sed enim eu augue sagittis fringilla sit amet ac ante. Cras vitae vehicula nunc, at ullamcorper nibh. In nulla lectus, vehicula et eros id, pharetra porta libero. ")
                .build();

        // Scenario 4:  (creating a logo on top of the webpage adapting to the screen)
        Nav nav = Nav.createElementBuilder()
                .addLogoImage("https://images.unsplash.com/photo-1650447973536-f2c1019c62e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fDE0JTIwbnVtYmVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
                .build();

        // Scenario 10 part 1 (Create a signup form, the form shall consist of input fields -> name, address, email, password)
        Form registrationForm = Form.createFormBuilder()
                .addTextLabel("Name")
                .addTextField()
                .addTextLabel("Address")
                .addTextField()
                .addTextLabel("ZIP")
                .addTextField()
                .addEmailField()
                .addNumberLabel("Age")
                .addNumberField()
                .addButtonLabel("Register")
                .addSubmitButton()
                .build();

        // Scenario 11 Part 1 ( Create a login form, the form shall consist of username and password )
        Form loginForm = Form.createFormBuilder()
                .addTextLabel("username")
                .addTextField()
                .addTextLabel("password")
                .addPasswordField()
                .addButtonLabel("Login")
                .addSubmitButton()
                .build();

        // Scenario 5 Part 1. (create an article page and populate it with text from a txt file)
        Main articleMain = Main.createElementBuilder()
                .addMainHeading("Title in the article template")
                .addIntroduction("Praesent placerat mattis purus id consectetur. Sed condimentum tempor mattis. Vestibulum convallis quis leo eu tincidunt. Nam in eros ac tortor ultricies rhoncus.")
                .addFontFamily(TimesNewRoman)
                .addTxtToHtml("src/main/websiteGenerator/scenarioes/Scenario5.txt")
                .addConclusion("Duis hendrerit at augue et efficitur. Phasellus ut magna varius, rhoncus eros id, molestie lectus. Cras ultricies vestibulum accumsan. Nulla hendrerit justo metus, ut suscipit velit aliquam ut. ")
                .build();

        // Scenario 6 (Create a CSV file and populate it with text from a CSV file )
        Table premiereLeagueTable = Table.createTableBuilder()
                .addCSVToHTMLTable("src/main/websiteGenerator/scenarioes/100_Sales_Records.csv", ",")
                .build();

        System.out.println("This is the output for scenario 6:");
        System.out.println(premiereLeagueTable.getTable());

        Header articleHeader = Header.createElementBuilder()
                .addHeaderHeading("ARTICLE ER NICE")
                .addHeaderImageUrl("background.png")
                .build();

        // Scenario 1 part 1 (Adding hero)
        Header homeHeader = Header.createElementBuilder()
                .addHeroHeading("Hero-Title")
                .addHeroImageUrl(heroImageUrl)
                .createHeroHeader()
                .createHeroHeader()
                .build();

        // Scenario 2 ( choose text size and weight )
        // Scenario 12 ( Add functionality for changing the font family in the article)
        Main homeMain = Main.createElementBuilder()
                .addMainHeading("Main Title")
                .addIntroduction("The homepage is nice")
                .addBody("A sentence in font size 3, choose between FONTSIZE1 - FONTSIZE6.", FONTSIZE3)
                .addBody("Another sentence now this one with font size 4 and bold.", FONTSIZE4, BOLD)
                .addBody("Just as sentence that has light font weight", LIGHT)
                .addFontFamily(ARIAL)
                .build();

        Header loginHeader = Header.createElementBuilder().build();

        // Scenario 4 (adding main tag with txtToHTML)
        Article article = Article.createArticlePageBuilder()
                .addMain(articleMain)
                .addNav(nav)
                .addHeader(articleHeader)
                .addAside(aside)
                .addFooter(footer)
                .build();

        // remember to add head as well, removed it because of temporary faults (hva er dette?)
        // Scenario 1 (add the hero header to the home page)
        // Scenario 8 (Create a HTML page that adapts to the screen size)
        Home homePage = Home.createPageBuilder()
                .addFileName("homepage.html")
                .addHead(Head.createHeadBuilder()
                        .addTitle("Homepage")
                        .build())
                .addHeader(homeHeader)
                .addNav(nav)
                .addMain(homeMain)
                .addAside(aside)
                .addFooter(footer)
                .build();

        // Scenario 10 part 2 ( create a main section with a signup up user form )
        Main registrationMain = Main.createElementBuilder()
                .addMainHeading("Sign up")
                .addForm(registrationForm)
                .build();

        // Scenario 11 part 2 ( create a main section with a login form )
        Main loginMain = Main.createElementBuilder()
                .addMainHeading("Login")
                .addForm(loginForm)
                .build();

        Login loginPage = Login.createPageBuilder()
                .addMain(loginMain)
                .addHead(Head.createHeadBuilder()
                        .addTitle("Login")
                        .addStyle("styles")
                        .build())
                .addNav(nav)
                .addHeader(loginHeader)
                .addFooter(footer)
                .build();

        Registration registrationPage = Registration.createPageBuilder()
                .addMain(registrationMain)
                .addHead(Head.createHeadBuilder()
                        .addTitle("Registration")
                        .addStyle("styles")
                        .build())
                .addNav(nav)
                .addHeader(loginHeader)
                .addFooter(footer)
                .build();


        Styles styles = Styles.createStylesBuilder()
                .addFilename("styles.css")
                .build();
        // Making project:
        // Scenario 3 (Generation a project folder with CSS and HTML files)
        // Scenario 9 (Style the built pages in the project with a specific design theme
        // Scenario 13 (Add robots.txt file to the project )
        Page[] HTMLpages = new Page[]{homePage, article, loginPage, registrationPage};
        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
                .addProjectFolder("testFolder")
//                .addTheme(Theme.DARK)
                .addHTMLPages(HTMLpages)
                .addRobots()
                .addStylesheetFile(styles)
                .build();

    }

}
