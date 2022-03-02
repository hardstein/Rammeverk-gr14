package com.company.models;

import com.company.PageType;
import com.company.SemanticElement;

public class Home extends PageType implements SemanticElement {

    @Override
    public void header() {

    }

    public void header(String heading, String imagePath) {

    }

    @Override
    public void main() {

    }

    @Override
    public void aside() {

    }

    @Override
    public void footer() {

    }

    // Another name?
    // Scenario 8
    public void completeTemplate() {
        header();
        main();
        aside();
        footer();
    }

}
