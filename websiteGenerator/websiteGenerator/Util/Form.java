package websiteGenerator.Util;

public class Form {
    private final String emailLabel;
    private final String emailField;
    private final String nameField;
    private final String passwordField;
    private final String numberField;
    private final String numberLabel;
    private final String submitButton;
    private final String passwordLabel;
    private final String buttonLabel;

    public String getEmailLabel() {
        return emailLabel;
    }

    public String getPasswordLabel() {
        return passwordLabel;
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    private Form(Builder builder) {
        this.emailLabel = builder.emailLabel;
        this.emailField = builder.emailField;
        this.nameField = builder.nameField;
        this.passwordField = builder.passwordField;
        this.numberField = builder.numberField;
        this.numberLabel = builder.numberLabel;
        this.submitButton = builder.submitButton;
        this.passwordLabel = builder.passwordLabel;
        this.buttonLabel = builder.buttonLabel;
    }

    public String createLoginForm() {
        String loginForm = String.format("""
                <form>

                  <div class="form-group">
                    <label for="emailInp">%s</label>
                    <input type="email" class="form-control" id="emailInp" aria-describedby="emailHelp" placeholder="Enter email">
                  </div>

                  <div class="form-group">
                    <label for="passwordInp">%s</label>
                    <input type="password" class="form-control" id="passwordInp" placeholder="Password">
                  </div>

                  <button type="submit" class="btn btn-primary">%s</button>

                </form>
                """, emailLabel, passwordLabel, buttonLabel);
        return loginForm;
    }

    public StringBuilder createForm() {
        StringBuilder form = new StringBuilder();
        form.append("<form>" + "\n");
        form.append(emailField + "\n");
        form.append(nameField + "\n");
        form.append(passwordField + "\n");
        form.append(numberField + "\n");
        form.append(submitButton + "\n");
        form.append("</form>");
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
        // Default values used if nothing else is specified.
        private String emailLabel = "Email";
        private String emailField = "";
        private String nameField = "";
        private String passwordField = "";
        private String numberField = "";
        private String numberLabel = "Number";
        private String submitButton = "";
        private String passwordLabel = "Password";
        private String buttonLabel = "Submit";

        /**
         * Adds label to email input
         *
         * @param emailLabel
         * @return form input label
         */
        public Builder addEmailLabel(String emailLabel) {
            this.emailLabel = emailLabel;
            return this;
        }

        public Builder addNameField() {
            this.emailField =
                    "<div class=\"form-group\">\n" +
                    "   <label for=\"nameInp\">Name</label>\n" +
                    "   <input type=\"text\" class=\"form-control\" id=\"nameInp\" aria-describedby=\"nameHelp\" placeholder=\"Enter name\">\n" +
                    "</div>";
            return this;
        }

        public Builder addEmailField() {
            this.nameField =
                    "<div class=\"form-group\">\n" +
                    "   <label for=\"emailInp\">Email</label>\n" +
                    "   <input type=\"email\" class=\"form-control\" id=\"emailInp\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n" +
                    "</div>";
            return this;
        }

        public Builder addSubmitButton() {
            this.submitButton =
                "   <button type=\"submit\" class=\"btn btn-primary\">" + buttonLabel + "</button>";
            return this;
        }

        public Builder addPasswordField() {
            this.passwordField =
                    "<div class=\"form-group\">\n" +
                    "   <label for=\"passwordInp\">Password</label>\n" +
                    "   <input type=\"password\" class=\"form-control\" id=\"passwordInp\" placeholder=\"Password\">\n" +
                    "</div>";
            return this;
        }



        public Builder addNumberField() {
            this.numberField =
            "<div class=\"form-group mt-3 mb-3\">\n" +
            "   <label for=\"number\">" + numberLabel + "</label>\n" +
            "   <input type=\"number\" class=\"col-md-3\" id=\"number\" aria-describedby=\"number\" placeholder=\"...\">\n" +
            "</div>";
            return this;
        }

        public Builder addNumberLabel(String numberLabel) {
            this.numberLabel = numberLabel;
            return this;
        }

        /**
         * Adds label to password input
         *
         * @param passwordLabel
         * @return form input label
         */
        public Builder addPasswordLabel(String passwordLabel) {
            this.passwordLabel = passwordLabel;
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
