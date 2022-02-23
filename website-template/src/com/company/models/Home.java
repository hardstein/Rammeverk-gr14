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

    public void main(String textFile) {

    }

    // Log in or sign up form
    // Maybe create a model class for login and register instead?
    public void main(String component) {

    }

    @Override
    public void aside() {

    }

    @Override
    public void footer() {

    }

    // Another name?
    public void completeTemplate() {
        header();
        main();
        aside();
        footer();
    }

}
