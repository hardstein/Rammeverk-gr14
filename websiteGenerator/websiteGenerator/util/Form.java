package websiteGenerator.util;

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

    public StringBuilder createForm() {
        form.append("   </form>\n");
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

    public static class Builder {
        private StringBuilder form = new StringBuilder("   <form>" + "\n");
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

        public Builder addEmailField() {
            this.emailField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"emailInp" + y + "\">Email</label>\n" +
                            "      <input type=\"email\" class=\"form-control\" id=\"emailInp" + y + "\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email\">\n" +
                            "   </div>\n";
            y++;
            form.append(emailField);
            return this;
        }

        public Builder addTextLabel(String textLabel) {
            this.textLabel = textLabel;
            return this;
        }

        public Builder addTextField() {
            this.textField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"textInp" + i + "\">" + textLabel + "</label>\n" +
                            "      <input type=\"text\" class=\"form-control\" id=\"textInp" + i + "\" aria-describedby=\"nameHelp\" placeholder=\"Enter " + textLabel + "\">\n" +
                            "   </div>\n";
            i++;
            form.append(textField);
            return this;
        }

        public Builder addSubmitButton() {
            this.submitButton =
                    "      <button type=\"submit\" class=\"btn btn-primary\">" + buttonLabel + "</button>\n";
            form.append(submitButton);
            return this;
        }

        public Builder addPasswordField() {
            this.passwordField =
                    "   <div class=\"form-group\">\n" +
                            "      <label for=\"passwordInp" + j + "\">Password</label>\n" +
                            "      <input type=\"password\" class=\"form-control\" id=\"passwordInp" + j + "\" placeholder=\"Password\">\n" +
                            "   </div>\n";
            j++;
            form.append(passwordField);
            return this;
        }

        public Builder addNumberField() {
            this.numberField =
                    "   <div class=\"form-group mt-3 mb-3\">\n" +
                            "      <label for=\"number\">" + numberLabel + "</label>\n" +
                            "      <input type=\"number\" class=\"col-md-3\" id=\"number\" aria-describedby=\"number\" placeholder=\"...\">\n" +
                            "   </div>\n";
            form.append(numberField);
            return this;
        }

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
