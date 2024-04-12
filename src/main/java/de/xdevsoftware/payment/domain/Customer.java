package de.xdevsoftware.payment.domain;

public class Customer {
    private final String firstname;
    private final String lastname;
    private final String createdAt;

    private Customer(String firstname, String lastname, String createdAt) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.createdAt = createdAt;
    }

    public static Customer New(final String firstname, final String lastname, final String createdAt) {
        return new Customer(firstname, lastname, createdAt);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
