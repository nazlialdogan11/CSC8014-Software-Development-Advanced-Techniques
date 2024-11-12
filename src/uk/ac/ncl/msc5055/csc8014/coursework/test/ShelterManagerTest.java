package uk.ac.ncl.msc5055.csc8014.coursework.test;

import uk.ac.ncl.msc5055.csc8014.coursework.main.*;

import java.util.Calendar;
import java.util.Date;

/**
 * Unit tests for the ShelterManager class.
 */
public class ShelterManagerTest {

    /**
     * Test for adding a new pet to the shelter.
     */
    public static void testAddPet() {
        ShelterManager shelterManager = new ShelterManager();
        Pet pet = shelterManager.addPet("Cat");
        assert pet != null : "Adding pet failed";
        assert "Cat".equals(pet.getPetType()) : "Incorrect pet type";
    }

    /**
     * Test for updating the trained status of a pet.
     */
    public static void testUpdatePetRecord() {
        ShelterManager shelterManager = new ShelterManager();
        Pet pet = shelterManager.addPet("Dog");
        assert shelterManager.updatePetRecord(pet.getPetID(), true) : "Updating pet record failed";
        assert ((Dog) pet).getIsTrained() : "Pet is not trained";
    }

    /**
     * Test for counting the number of available pets of a specified type.
     */
    public static void testNoOfAvailablePets() {
        ShelterManager shelterManager = new ShelterManager();
        shelterManager.addPet("Cat");
        shelterManager.addPet("Cat");
        shelterManager.addPet("Dog");
        assert shelterManager.noOfAvailablePets("Cat") == 2 : "Incorrect number of available cats";
    }

    /**
     * Test for adding a new customer record to the shelter database.
     */
    public static void testAddCustomerRecord() {
        ShelterManager shelterManager = new ShelterManager();
        Calendar dob = Calendar.getInstance();
        dob.set(1990, Calendar.JANUARY, 1);
        CustomerRecord customerRecord = shelterManager.addCustomerRecord("John", "Doe", dob.getTime(), true);
        assert customerRecord != null : "Adding customer record failed";
        assert "John Doe".equals(customerRecord.getName().toString()) : "Incorrect customer name";
    }

    /**
     * Main method to run the tests.
     */
    public static void main(String[] args) {
        testAddPet();
        testUpdatePetRecord();
        testNoOfAvailablePets();
        testAddCustomerRecord();
        System.out.println("All tests passed successfully.");
    }
}

