

import websiteGenerator.WebsiteBuilder; 

public class AnotherMain {
    public static void main(String[] args) {



        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
                                    .addArticle()
                                    .addLogin()
                                    .addHome()
                                    .build(); 
        
        
    }
    
}
