package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.GetHTMLTagContent;

/**
 * class for defining and building a footer element for a Page {@link websiteGenerator.Pages.Page}
 *
 * @version 1.0.0
 */
public class Footer implements GetHTMLTagContent {
    private final String contactName;
    private final int contactPhoneNumber;
    private final String contactEmail;
    private final String socialMediaLink;

    /**
     * Getter for contactName property
     *
     * @return String with contact name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Getter for contactPhoneNumber property
     *
     * @return String with contact phone number
     */
    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Getter for contactEmail property
     *
     * @return String with email
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Getter for socialMediaLink property
     *
     * @return String with social media link info
     */
    public String getSocialMediaLink() {
        return socialMediaLink;
    }

    /**
     * A constructor for adding properties from inner builder class to the Footer class properties
     *
     * @param builder the builder for footer element
     */
    private Footer(Builder builder) {
        this.contactName = builder.contactName;
        this.contactPhoneNumber = builder.contactPhoneNumber;
        this.contactEmail = builder.contactEmail;
        this.socialMediaLink = builder.socialMediaLink;
    }

    /**
     * Starts the building process with returning a new builder object
     *
     * @return Builder object
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * Builds the complete footer tag information
     *
     * @return StringBuilder with the complete build for footer tag
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <footer>\n")
                .append("        <p>Contact name:").append(contactName).append("</p>\n")
                .append("        <p>Email:").append(contactEmail).append(" </p>\n")
                .append("        <p><a href=\"mailto:").append(contactEmail).append("\">").append(contactEmail).append("</a></p>\n")
                .append("        <p>&copy; <em id=\"date\"></em>").append(contactName).append("</p>\n")
                .append("        <p>Contact name:").append(contactName).append("</p>\n")
                .append("    </footer>");
        return content;
    }

    /**
     * A builder for {@link Footer}
     */
    public static class Builder {
        private String contactName;
        private int contactPhoneNumber;
        private String contactEmail;
        private String socialMediaLink;

        /**
         * Adds contact information in the footer
         *
         * @param contactName
         * @return footer contact name string
         */
        public Builder addContactName(final String contactName) {
            this.contactName = contactName;
            return this;
        }

        /**
         * Adds contact
         *
         * @param contactPhoneNumber
         * @return contact phone number string
         */
        public Builder addContactPhoneNumber(final int contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }

        /**
         *  Adds contact mail
         *
         * @param contactEmail
         * @return  contact email string
         */
        public Builder addContactEmail(final String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * Adds social media link
         *
         * @param socialMediaLink
         * @return social media link string
         */

        public Builder addSocialMediaLink(final String socialMediaLink) {
            this.socialMediaLink = socialMediaLink;
            return this;
        }

        /**
         * Builds and make a new Footer object
         *
         * @return Footer object
         */
        public Footer build() {
            return new Footer(this);
        }
    }
}
