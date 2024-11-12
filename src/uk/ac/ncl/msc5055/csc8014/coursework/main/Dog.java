package uk.ac.ncl.msc5055.csc8014.coursework.main;

/**
 * The Dog class represents a type of pet which is a dog.
 * It extends the AbstractPet class and provides specific behavior and attributes for dogs.
 */
public class Dog extends AbstractPet {

    /**
     * Constant representing the type of pet - Dog.
     */
    final static String DOG = "Dog";

    /**
     * Constant representing the care instructions for dogs.
     */
    final static String dogCareInstructions = "Dogs must be fed three times a day and go on walks once a day.";

    /**
     * Indicates whether the dog is trained or not.
     */
    private boolean isTrained;

    /**
     * Constructs a new Dog object with the specified parameters.
     *
     * @param petId            The unique identifier for the dog.
     * @param petType          The type of the pet (always "Dog").
     * @param getAdopted       Indicates whether the dog has been adopted.
     * @param careInstructions Instructions for the care of the dog.
     * @param isTrained        Indicates whether the dog is trained.
     */
    public Dog(PetID petId, String petType, boolean getAdopted, String careInstructions, boolean isTrained) {
        super(petId, petType, getAdopted, careInstructions);
        this.isTrained = isTrained;
    }

    /**
     * Retrieves the type of the pet.
     *
     * @return The type of the pet, which is always "Dog".
     */
    @Override
    public String getPetType() {
        return DOG;
    }

    /**
     * Retrieves the care instructions for dogs.
     *
     * @return Instructions for the care of the dog.
     */
    @Override
    public String getCareInstructions() {
        return dogCareInstructions;
    }

    /**
     * Retrieves the training status of the dog.
     *
     * @return True if the dog is trained, false otherwise.
     */
    public boolean getIsTrained() {
        return isTrained;
    }

    /**
     * Sets the training status of the dog.
     *
     * @param isTrained True if the dog is trained, false otherwise.
     */
    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

}
