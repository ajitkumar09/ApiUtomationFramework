package com.api.models.request;

public class ProfileRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    // Constructor
    public ProfileRequest(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Setters (optional – keep if required)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "ProfileRequest [firstName=" + firstName +
               ", lastName=" + lastName +
               ", email=" + email +
               ", mobileNumber=" + mobileNumber + "]";
    }

    // ================= BUILDER CLASS =================
    public static class Builder {

        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public ProfileRequest build() {
            return new ProfileRequest(firstName, lastName, email, mobileNumber);
        }
    }
}

