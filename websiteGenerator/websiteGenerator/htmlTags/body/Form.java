package websiteGenerator.htmlTags.body;

import static websiteGenerator.util.FindIndexBeforeTag.findIndexBeforeTag;

/**
 * class for defining and building a form element for a Page {@link websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Form {
    private final StringBuilder form;
    private final String emailField;
    private final String textLabel;
    private final String textField;
    private final String passwordField;
    private final String numberLabel;
    private final String numberField;
    private final String buttonLabel;
    private final String submitButton;


    private Form(Builder builder) {
        this.form = builder.form;
        this.emailField = builder.emailField;
        this.textLabel = builder.textLabel;
        this.textField = builder.textField;
        this.passwordField = builder.passwordField;
        this.numberLabel = builder.numberLabel;
        this.numberField = builder.numberField;
        this.buttonLabel = builder.buttonLabel;
        this.submitButton = builder.submitButton;
    }

    /**
     * Used the get the content from the form build.
     *
     * @return StringBuilder form
     */
    public StringBuilder createForm() {
        return form;
    }

    /**
     * Starts the building process with returning a new builder object
     *
     * @return Builder object
     */
    public static Builder createFormBuilder() {
        return new Builder();
    }

    /**
     * A builder for {@link Form}
     */
    public static class Builder {
        private final StringBuilder form = new StringBuilder("   <form>" + "\n" + "   </form>\n");
        // Used to make sure id for a label and input is unique.
        int i = 0;
        int j = 0;
        int y = 0;
        // Default values used if nothing else is specified.
        private String emailField = "";
        private String textLabel = "Text";
        private String textField = "";
        private String passwordField = "";
        private String numberField = "";
        private String numberLabel = "Number";
        private String submitButton = "";
        private String buttonLabel = "Submit";

        /**
         * Adds email input field
         *
         * @return Builder object
         */
        public Builder addEmailField() {
            this.emailField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"emailInp" + y + "\">Email</label>\n" +
                            "      <input type=\"email\" class=\"form-control\" id=\"emailInp" + y + "\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email\">\n" +
                            "   </div>\n";
            y++;
            int index = findIndexBeforeTag(form, "</form>");
            form.insert(index, emailField);
            return this;
        }

        /**
         * Adds text label
         *
         * @param textLabel
         * @return Builder object
         */
        public Builder addTextLabel(String textLabel) {
            this.textLabel = textLabel;
            return this;
        }

        /**
         * Adds text input field
         *
         * @return Builder object
         */
        public Builder addTextField() {
            this.textField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"textInp" + i + "\">" + textLabel + "</label>\n" +
                            "      <input type=\"text\" class=\"form-control\" id=\"textInp" + i + "\" aria-describedby=\"nameHelp\" placeholder=\"Enter " + textLabel + "\">\n" +
                            "   </div>\n";
            i++;
            int index = findIndexBeforeTag(form, "</form>");
            form.insert(index, textField);
            return this;
        }

        /**
         * Adds submit button
         *
         * @return Builder object
         */
        public Builder addSubmitButton() {
            this.submitButton =
                    "      <button type=\"submit\" class=\"btn btn-primary\">" + buttonLabel + "</button>\n";
            int index = findIndexBeforeTag(form, "</form>");
            form.insert(index, submitButton);
            return this;
        }

        /**
         * Adds password field
         *
         * @return Builder object
         */
        public Builder addPasswordField() {
            this.passwordField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"passwordInp" + j + "\">Password</label>\n" +
                            "      <input type=\"password\" class=\"form-control\" id=\"passwordInp" + j + "\" placeholder=\"Password\">\n" +
                            "   </div>\n";
            j++;
            int index = findIndexBeforeTag(form, "</form>");
            form.insert(index, passwordField);
            return this;
        }

        /**
         * Adds number field
         *
         * @return Builder object
         */
        public Builder addNumberField() {
            this.numberField =
                    "   <div class=\"form-group mt-3 mb-3\">\n" +
                            "      <label for=\"number\">" + numberLabel + "</label>\n" +
                            "      <input type=\"number\" class=\"col-md-3\" id=\"number\" aria-describedby=\"number\" placeholder=\"...\">\n" +
                            "   </div>\n";
            int index = findIndexBeforeTag(form, "</form>");
            form.insert(index, numberField);
            return this;
        }

        /**
         * Adds number label text
         *
         * @return Builder object
         */
        public Builder addNumberLabel(String numberLabel) {
            this.numberLabel = numberLabel;
            return this;
        }

        /**
         * Adds text to button
         *
         * @param buttonLabel
         * @return form button
         */
        public Builder addButtonLabel(String buttonLabel) {
            this.buttonLabel = buttonLabel;
            return this;
        }

        /**
         * Builds and make a new Form object
         *
         * @return Form object
         */
        public Form build() {
            return new Form(this);
        }

    }

}
