package websiteGenerator.SemanticElements;

public class Footer {
    private final String contactName;
    private final int contactPhoneNumber;
    private final String contactEmail;
    private final String socialMediaLink;

    public String getContactName() {
        return contactName;
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getSocialMediaLink() {
        return socialMediaLink;
    }

    private Footer(Builder builder) {
        this.contactName = builder.contactName;
        this.contactPhoneNumber = builder.contactPhoneNumber;
        this.contactEmail = builder.contactEmail;
        this.socialMediaLink = builder.socialMediaLink;
    }

    public static Builder createElementBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String contactName;
        private int contactPhoneNumber;
        private String contactEmail;
        private String socialMediaLink;

        public Builder addContactName(final String contactName) {
            this.contactName = contactName;
            return this;
        }

        public Builder addContactPhoneNumber(final int contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            return this;
        }

        public Builder addContactEmail(final String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder addSocialMediaLink(final String socialMediaLink) {
            this.socialMediaLink = socialMediaLink;
            return this;
        }

        public Footer build() {
            return new Footer(this);
        }
    }
}
