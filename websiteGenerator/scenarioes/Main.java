package scenarioes;

import websiteGenerator.WebsiteBuilder;
import websiteGenerator.htmlTags.body.*;
import websiteGenerator.htmlTags.head.Head;
import websiteGenerator.pages.*;
import websiteGenerator.util.HTMLLanguageOptions;
import websiteGenerator.util.Theme;

import java.io.IOException;

import static websiteGenerator.util.FontFamily.ARIAL;
import static websiteGenerator.util.FontFamily.TimesNewRoman;
import static websiteGenerator.util.FontSize.FONTSIZE3;
import static websiteGenerator.util.FontSize.FONTSIZE4;
import static websiteGenerator.util.FontWeight.BOLD;
import static websiteGenerator.util.FontWeight.LIGHT;


/**
 * @hidden demonstration of framework, not a part of the library
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String heroImageUrl = "https://images.unsplash.com/photo-1534171472159-edb6d1e0b63c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjR8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60";
        // Demonstration of our API (We will show a solution for all the scenarios here)
        // For now you can find scenario: 1, 3, 7, 9, 14

        //Creating page content
        //Head mainHead = Head.createHead("styles.css", "Frontpage");
        // These will be the same for all pages:
        // Scenario 7:
        Footer footer = Footer.createElementBuilder()
//                .addContactInformationContainer()
//                .addSocialMediaLinksContainer()
                .addContactName("Group 14")
                .addContactEmail("gr14@email.com")
                .addContactPhoneNumber(14326969)
                .addTwitterSocialMediaLink("Twitter link")
                .addInstagramSocialMediaLink("Instagram link")
                .addFacebookSocialMediaLink("facebook link")
                .build();

        Footer articleFooter = Footer.createElementBuilder()
//                .addSocialMediaLinksContainer()
//                .addContactInformationContainer()
                .addContactName("Per")
                .addTwitterSocialMediaLink("Twitter link")
                .addContactName("Pål")
                .addContactPhoneNumber(32352345)
                .addContactName("Per")
                .addContactPhoneNumber(765476548)
                .addTwitterSocialMediaLink("Twitter link")
                .addFacebookSocialMediaLink("facebook link")
                .addFacebookSocialMediaLink("facebook link")
                .addContactName("Askeladden")
                .build();

        Aside aside = Aside.createElementBuilder()
                .addAsideTitle("Lorem ipsum")
                .addAsideText("Aliquam elementum dolor porta ligula euismod venenatis. Curabitur sit amet malesuada elit. Proin ultrices id velit eu consectetur. Cras ex nunc, venenatis ut urna eu, maximus pulvinar ligula. Proin ut est metus. Curabitur et lorem sodales nunc lacinia blandit vitae efficitur leo. Nunc dapibus leo eget orci porta placerat. Phasellus efficitur, tortor ac rutrum fringilla, nisl ante fermentum est, eget congue massa augue at quam. Ut accumsan imperdiet felis dapibus sagittis. Morbi eget placerat leo, sed dapibus nisl. Maecenas at urna posuere, suscipit mauris in, aliquet diam. ")
                .addAsideText("Fusce sed enim eu augue sagittis fringilla sit amet ac ante. Cras vitae vehicula nunc, at ullamcorper nibh. In nulla lectus, vehicula et eros id, pharetra porta libero. ")
                .build();

        // Scenario 3:
        Nav nav = Nav.createElementBuilder()
                .addLogoImage("https://images.unsplash.com/photo-1650447973536-f2c1019c62e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fDE0JTIwbnVtYmVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
                .build();

        // Testing form
        Form loginForm = Form.createFormBuilder()
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
        // Different main content on pages:
        // Article: 
        websiteGenerator.htmlTags.body.Main articleMain = websiteGenerator.htmlTags.body.Main.createElementBuilder()
                .addMainHeading("Title in the article template")
                .addIntroduction("Praesent placerat mattis purus id consectetur. Sed condimentum tempor mattis. Vestibulum convallis quis leo eu tincidunt. Nam in eros ac tortor ultricies rhoncus.")
                .addFontFamily(TimesNewRoman)
                .addConclusion("Duis hendrerit at augue et efficitur. Phasellus ut magna varius, rhoncus eros id, molestie lectus. Cras ultricies vestibulum accumsan. Nulla hendrerit justo metus, ut suscipit velit aliquam ut. ")
                .build();

        Header articleHeader = Header.createElementBuilder()
                .addHeaderHeading("ARTICLE ER NICE")
                .addHeaderImageUrl("background.png")
                .build();

        // Home: 
        Header homeHeader = Header.createElementBuilder()
                .addHeroHeading("Hero-Title")
                .addHeroImageUrl(heroImageUrl)
                .createHeroHeader()
                .createHeroHeader()
                .build();

        websiteGenerator.htmlTags.body.Main homeMain = websiteGenerator.htmlTags.body.Main.createElementBuilder()
                .addMainHeading("Main Title")
                .addIntroduction("The homepage is nice")
                .addBody("A sentence in font size 3, choose between FONTSIZE1 - FONTSIZE6.", FONTSIZE3)
                .addBody("Another sentence now this one with font size 4 and bold.", FONTSIZE4, BOLD)
                .addBody("Just as sentence that has light font weight", LIGHT)
                .addFontFamily(ARIAL)
                .build();

        // Creating pages
        Header loginHeader = Header.createElementBuilder().build();

        // Only using default values
        Article article = Article.createArticlePageBuilder()
                .build();

        // remember to add head aswell, removed it because of temporary faults
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

        websiteGenerator.htmlTags.body.Main loginMain = websiteGenerator.htmlTags.body.Main.createElementBuilder()
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

        Styles styles = Styles.createStylesBuilder()
                .addFilename("styles.css")
                .build();
        // Making project:
        // Scenario 1, 9 and 14:
        Page[] HTMLpages = new Page[]{homePage, article, loginPage};
        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
                .addProjectFolder("testFolder")
                .addTheme(Theme.LIGHT)
                .addHTMLPages(HTMLpages)
                .addRobots()
                .addStylesheetFile(styles)
                .build();

//        project.generate();

        System.out.println();
    }

}
