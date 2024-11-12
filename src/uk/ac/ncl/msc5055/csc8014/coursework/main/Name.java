package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.HashMap;
import java.util.Map;

/**
 * The Name class represents a person's name, consisting of a first name and a last name.
 * It ensures that only one Name object exists for each unique combination of first name and last name.
 */
public final class Name {

    /**
     * A map containing unique Name objects indexed by their string representation.
     */
    private static final Map<String, Name> CUSTOMER_NAMES = new HashMap<String, Name>();

    /**
     * The first name, last name and the String representation(composed of the previous attributes) of the person.
     */
    private final String firstName, lastName, strRep;

    /**
     * Constructs a Name object with the specified first name, last name, and string representation.
     * This constructor is private to enforce the use of getInstance method for object creation.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param strRep The string representation of the name.
     */
    private Name (String firstName, String lastName, String strRep) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.strRep = strRep;
    }

    /**
     * Returns a Name instance for the specified first name and last name.
     * If a Name instance with the same first name and last name already exists,
     * it returns the existing instance; otherwise, it creates a new instance.
     *
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @return The Name instance corresponding to the specified first name and last name.
     */
    public static Name getInstance (String firstName, String lastName) {
        String strRep = firstName + " " + lastName;
        Name name = CUSTOMER_NAMES.get(strRep);
        if (name == null) {
            name = new Name(firstName, lastName, strRep);
            CUSTOMER_NAMES.put(strRep, name);
        }
        return name;
    }

    /**
     * Returns the first name of the person.
     *
     * @return The first name of the person.
     */
    public String getFirstName() {return firstName;}

    /**
     * Returns the last name of the person.
     *
     * @return The last name of the person.
     */
    public String getLastName() {return lastName;}

    /**
     * Returns the string representation of the name, which is composed of the first name and last name.
     *
     * @return The string representation of the name.
     */
    @Override
    public String toString() {return strRep;}

}
