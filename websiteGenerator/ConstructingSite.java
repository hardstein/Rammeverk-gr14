interface ConstructingSite {

    void header(); 
    void nav(); 
    void main(); 
    void aside(); 
    void footer();   
    
    void completeTemplate();
    void textFileParser(String textfile);
    void CSVcontentParser(String fileToParse, String parsingSign); 
}
