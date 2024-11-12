package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.Calendar;

/**
 * The CustomerRecord class represents a record for a customer, containing information such as the customer's name,
 * date of birth, date of issue for their customer number, and whether they have a garden.
 */
public class CustomerRecord {

    /** The name of the customer. */
    private Name name;

    /** The date of birth of the customer. */
    private Calendar dob;

    /** The customer number associated with the customer. */
    private CustomerNumber customerNumber;

    /** Indicates whether the customer has a garden or not. */
    private boolean hasGarden;

    /** The date of issue for the customer record. */
    final Calendar doi;

    /**
     * Constructs a CustomerRecord object with the specified name, date of birth, date of issue,
     * and information about whether the customer has a garden.
     *
     * @param name The name of the customer.
     * @param dob The date of birth of the customer.
     * @param doi The date of issue for the customer record.
     * @param hasGarden A boolean value indicating whether the customer has a garden.
     */
    public CustomerRecord(Name name, Calendar dob, Calendar doi, boolean hasGarden) {
        this.name = name;
        this.dob = dob;
        this.customerNumber = new CustomerNumber(name, doi);
        this.doi = doi;
        this.hasGarden = hasGarden;
    }

    /**
     * Retrieves the name of the customer.
     *
     * @return The name of the customer.
     */
    public Name getName() {
        return this.name;
    }

    /**
     * Retrieves the date of birth of the customer.
     *
     * @return The date of birth of the customer.
     */
    public Calendar getDob() {
        return this.dob;
    }

    /**
     * Retrieves the customer number associated with the customer.
     *
     * @return The customer number associated with the customer.
     */
    public CustomerNumber getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * Retrieves the date of issue for the customer record.
     *
     * @return The date of issue for the customer record.
     */
    public Calendar getDoi() {
        return this.doi;
    }

    /**
     * Checks whether the customer has a garden.
     *
     * @return true if the customer has a garden, false otherwise.
     */
    public boolean hasGarden() {
        return this.hasGarden;
    }
}
