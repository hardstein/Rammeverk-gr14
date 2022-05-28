package websiteGenerator.Util;

public class Form {
    private final String emailLabel;
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
