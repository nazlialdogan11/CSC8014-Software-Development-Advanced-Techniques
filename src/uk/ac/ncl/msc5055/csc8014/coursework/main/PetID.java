package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * The PetID class represents a unique identifier for pets.
 * Each PetID consists of a combination of a letter and a number,
 * providing a unique identification for each pet.
 */
public final class PetID {

    /**
     * A map to store existing PetIDs to ensure uniqueness.
     * The key is the string representation of the PetID.
     */
    private static final Map<String, PetID> PET_ID = new HashMap<String, PetID>();

    /**
     * The letter component of the PetID.
     */
    private final char letter;

    /**
     * The number component of the PetID.
     */
    private final int number;

    /**
     * The string representation of the PetID.
     */
    private final String petID;

    /**
     * Constructs a new PetID with the specified components.
     *
     * @param letter The letter component of the PetID.
     * @param number The number component of the PetID.
     * @param petID  The string representation of the PetID.
     */
    private PetID(char letter, int number, String petID) {
        this.letter = letter;
        this.number = number;
        this.petID = petID;
    }

    /**
     * Retrieves the letter component of the PetID.
     *
     * @return The letter component of the PetID.
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Retrieves the number component of the PetID.
     *
     * @return The number component of the PetID.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Retrieves the string representation of the PetID.
     *
     * @return The string representation of the PetID.
     */
    public String getPetID() {
        return petID;
    }

    /**
     * Overrides the toString() method to return the string representation of the PetID.
     *
     * @return The string representation of the PetID.
     */
    @Override
    public String toString() {
        return petID;
    }

    /**
     * Retrieves an instance of PetID.
     * If a PetID with the generated ID already exists, returns the existing one;
     * otherwise, creates a new PetID object and adds it to the map.
     *
     * @return An instance of PetID.
     */
    public static PetID getInstance() {
        final Random random = new Random();
        final int randomLetter = random.nextInt(26) + 97;
        final char convertedLetter = (char) randomLetter;
        final int randomNumber = random.nextInt(99) + 1;
        final String petId = convertedLetter + String.format("%02d", randomNumber);
        PetID PetID = PET_ID.get(petId);
        if (PetID == null) {
            PetID= new PetID(convertedLetter, randomNumber, petId);
            PET_ID.put(petId, PetID);
        }
        return PetID;
    }
}

