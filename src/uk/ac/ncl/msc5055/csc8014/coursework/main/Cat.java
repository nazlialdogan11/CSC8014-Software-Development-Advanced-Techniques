package uk.ac.ncl.msc5055.csc8014.coursework.main;

/**
 * The Cat class represents a type of pet which is a cat.
 * It extends the AbstractPet class and provides specific behavior and attributes for cats.
 */
public class Cat extends AbstractPet {

    /**
     * Constant representing the type of pet - Cat.
     */
    final static String CAT = "Cat";

    /**
     * Constant representing the care instructions for cats.
     */
    final static String catCareInstructions = "Cats must be fed two times a day.";

    /**
     * Constructs a new Cat object with the specified parameters.
     *
     * @param petId            The unique identifier for the cat.
     * @param petType          The type of the pet (always "Cat").
     * @param getAdopted       Indicates whether the cat has been adopted.
     * @param careInstructions Instructions for the care of the cat.
     */
    public Cat(PetID petId, String petType, boolean getAdopted, String careInstructions) {
        super(petId, petType, getAdopted, careInstructions);
    }

    /**
     * Retrieves the type of the pet.
     *
     * @return The type of the pet, which is always "Cat".
     */
    @Override
    public String getPetType() {
        return CAT;
    }

    /**
     * Retrieves the care instructions for cats.
     *
     * @return Instructions for the care of the cat.
     */
    @Override
    public String getCareInstructions() {
        return catCareInstructions;
    }
}
