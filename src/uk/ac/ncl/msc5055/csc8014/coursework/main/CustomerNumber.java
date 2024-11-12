package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.Calendar;
import java.util.Random;

/**
 * The CustomerNumber class represents a unique identifier assigned to a customer.
 * It consists of two components: a randomly generated alphanumeric string and a
 * concatenation of the month and year of the date of issue.
 */
public class CustomerNumber {

    /** The first component of the customer number, generated based on the customer's name. */
    private final String firstComponent;

    /** The second component of the customer number, representing the month and year of the date of issue. */
    private final String secondComponent;

    /** The complete customer number, combining the first and second components. */
    private String customerNumber;

    /**
     * Constructs a CustomerNumber object using the specified name and date of issue.
     * The first component of the customer number is generated based on the initial of the first name
     * and a random serial number. The second component is composed of the month and year of the date of issue.
     *
     * @param name The name of the customer.
     * @param dateOfIssue The date of issue for the customer number.
     */
    public CustomerNumber(Name name, Calendar dateOfIssue) {
        final Random random = new Random();
        final char initial = name.getFirstName().charAt(0);
        final int serialNo = random.nextInt(99) + 1;
        this.firstComponent = initial + String.format("%02d", serialNo);

        int year = dateOfIssue.get(Calendar.YEAR);
        int month = dateOfIssue.get(Calendar.MONTH);

        this.secondComponent = Integer.toString(month) + Integer.toString(year);
        String customerNumber = firstComponent + "." + secondComponent;
    }

    /**
     * Retrieves the first component of the customer number.
     *
     * @return The first component of the customer number.
     */
    public String getFirstComponent() {
        return firstComponent;
    }

    /**
     * Retrieves the second component of the customer number.
     *
     * @return The second component of the customer number.
     */
    public String getSecondComponent() {
        return secondComponent;
    }

    /**
     * Retrieves the complete customer number.
     *
     * @return The complete customer number.
     */
    public String getCustomerNumber() {
        return customerNumber;
    }
}
