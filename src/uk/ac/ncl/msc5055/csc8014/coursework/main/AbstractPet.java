package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract class representing a generic pet.
 * This class provides basic functionality and attributes common to all types of pets.
 */
public abstract class AbstractPet implements Pet {

    /**
     * Constant representing the type of pet - Cat.
     */
    public static final String CAT = "Cat";

    /**
     * Constant representing the type of pet - Dog.
     */
    public static final String DOG = "Dog";

    /**
     * A map to store instances of pets along with their unique identifiers.
     */
    private static final Map<PetID, Pet> petMap = new HashMap<PetID, Pet>();

    /**
     * The unique identifier for the pet.
     */
    private final PetID petId;

    /**
     * The type of the pet.
     */
    private final String petType;

    /**
     * Indicates whether the pet has been adopted or not.
     */
    private final boolean getAdopted;

    /**
     * Instructions for the care of the pet.
     */
    private final String careInstructions;

    /**
     * Constructs a new AbstractPet object with the specified parameters.
     *
     * @param petId            The unique identifier for the pet.
     * @param petType          The type of the pet (e.g., Cat, Dog).
     * @param getAdopted       Indicates whether the pet has been adopted.
     * @param careInstructions Instructions for the care of the pet.
     */
    AbstractPet(PetID petId, String petType, boolean getAdopted, String careInstructions) {
        this.petId = petId;
        this.petType = petType;
        this.getAdopted = getAdopted;
        this.careInstructions = careInstructions;
    }

    /**
     * Factory method to create an instance of AbstractPet based on the specified parameters.
     *
     * @param petId             The unique identifier for the pet.
     * @param petType           The type of the pet (e.g., Cat, Dog).
     * @param getAdopted        Indicates whether the pet has been adopted.
     * @param careInstructions  Instructions for the care of the pet.
     * @return                  An instance of AbstractPet or its subclass (Cat or Dog).
     * @throws IllegalArgumentException if an invalid pet type is provided.
     */
    public static AbstractPet getInstance(PetID petId, String petType,
                                          boolean getAdopted, String careInstructions)
                                                throws IllegalArgumentException {

        try
        /** Check if the pet type is valid (either Cat or Dog) */
        { if(!(petType.equalsIgnoreCase(CAT) ^ petType.equalsIgnoreCase(DOG))) {
                throw new IllegalArgumentException("Invalid pet type.");
            }
        }

        catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        AbstractPet Pet = null;
        /** Create the appropriate subclass based on the pet type */
        if (petType.equalsIgnoreCase(CAT)) {
            Pet = new Cat(petId, petType, getAdopted, careInstructions);
        } else if (petType.equalsIgnoreCase(DOG)) {
            Pet = new Dog(petId, petType, getAdopted, careInstructions, false);
        }
        return Pet;
    }

    /**
     * Retrieves the unique identifier for the pet.
     *
     * @return The unique identifier for the pet.
     */
    public PetID getPetID() {
        return this.petId;
    }

    /**
     * Retrieves the type of the pet.
     *
     * @return The type of the pet (e.g., Cat, Dog).
     */
    public String getPetType() {
        return petType;
    }

    /**
     * Indicates whether the pet has been adopted or not.
     *
     * @return True if the pet has been adopted, false otherwise.
     */
    public boolean getAdopted() {
        return getAdopted;
    }

    /**
     * Retrieves the care instructions for the pet.
     *
     * @return Instructions for the care of the pet.
     */
    public String getCareInstructions() {
        return careInstructions;
    }
}
