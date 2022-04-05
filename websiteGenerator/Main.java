import websiteGenerator.Pages.Home;
import websiteGenerator.SemanticElements.Footer;
import websiteGenerator.SemanticElements.Header;
import websiteGenerator.SemanticElements.Nav;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Home home = Home.createPageBuilder()
                .mainContent("Cool content")
                .header(Header.createElementBuilder()
                        .addHeaderHeading("Nice Title")
                        .addHeaderImageUrl("background.png")
                        .addHeroHeading("Hero-Title")
                        .addHeroImageUrl("hero.png")
                        .build()
                )
                .nav(Nav.createElementBuilder()
                        .addPageLinks(new String[]{"home", "registration", "login"})
                        .addLogoImage("GR14.logo")
                        .build()
                )
                .footer(Footer.createElementBuilder()
                        .addContactName("Group 14")
                        .addContactEmail("gr14@email.com")
                        .addContactPhoneNumber(14326969)
                        .addSocialMediaLink("github.com/gr14-template")
                        .build()
                )
                .build();

    }

}
