package uk.ac.ncl.msc5055.csc8014.coursework.main;

import java.util.*;

/**
 * The ShelterManager class manages the operations and data related to a pet shelter.
 * It provides functionality to add, update, and retrieve information about pets and customers.
 */
public class ShelterManager {

	/**
	 * Map to store customer records, with customer names as keys and CustomerRecord objects as values.
	 */
	private Map<String, CustomerRecord> customerRecords;

	/**
	 * Map to store adopted pets by customers, with CustomerNumber objects as keys and sets of Pet objects as values.
	 */
	private Map<CustomerNumber, Set<Pet>> adoptedPetsByCustomer;

	/**
	 * List to store all pets in the shelter.
	 */
	private List<Pet> allPets;

	/**
	 * Constructs a new ShelterManager with empty data structures.
	 * Initializes customerRecords as a HashMap, adoptedPetsByCustomer as a HashMap, and allPets as an ArrayList.
	 */
	public ShelterManager() {
		this.customerRecords = new HashMap<>();
		this.adoptedPetsByCustomer = new HashMap<>();
		this.allPets = new ArrayList<>();
	}

	/**
	 * Adds a new pet to the shelter with the specified type.
	 *
	 * @param petType The type of pet to be added (e.g., "Cat" or "Dog").
	 * @return The newly added Pet object.
	 */
	public Pet addPet(String petType){
		/** Generates a new PetID */
		PetID petID = PetID.getInstance();

		/** Creates a new Pet object based on the specified type */
		Pet newPet = null;
		if (petType.equalsIgnoreCase(AbstractPet.CAT)) {
			/** Assuming none of the cats are adopted at first */
			newPet = new Cat(petID, petType, false, "");
		} else if (petType.equalsIgnoreCase(AbstractPet.DOG)) {
			/** Assuming none of the dogs are adopted and trained at first */
			newPet = new Dog(petID, petType, false, "", false);
		}

		/** Adding the new pet to the list of all pets in the shelter */
		allPets.add(newPet);
		return newPet;
	}

	/**
	 * Updates the trained status of a dog with the specified PetID.
	 *
	 * @param petID   The unique identifier of the pet whose record needs to be updated.
	 * @param trained The new trained status for the dog.
	 * @return True if the update was successful, false otherwise.
	 */
	public Boolean updatePetRecord (PetID petID, Boolean trained) {
		/** Searching for the pet with the stated PetID in the list of all pets */
		for (Pet pet : allPets) {
			if (pet.getPetID().equals(petID)) {
				/** If the pet is found, update its trained status if it's a dog */
				if (pet instanceof Dog) {
					((Dog) pet).setIsTrained(trained);
					return true; /** Update successful */
				} else {
					/** If the pet is not a dog, cannot update its trained status */
					return false; /** Update failed */
				}
			}
		}
		/** If the pet with the given PetID is not found, return false */
		return false; /** Update failed */
	}

	/**
	 * Retrieves the number of available pets of the specified type.
	 *
	 * @param petType The type of pet to count (e.g., "Cat" or "Dog").
	 * @return The number of available pets of the specified type.
	 */
	public int noOfAvailablePets(String petType) {
		int count = 0;
		/** Count the number of pets of the specified type that are not adopted */
		for (Pet pet : allPets) {
			if (pet.getPetType().equalsIgnoreCase(petType) && !pet.getAdopted()) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Adds a new customer record to the shelter database.
	 *
	 * @param firstName The first name of the customer.
	 * @param lastName  The last name of the customer.
	 * @param dob       The date of birth of the customer.
	 * @param hasGarden A boolean indicating whether the customer has a garden or not.
	 * @return The newly added CustomerRecord object.
	 * @throws IllegalArgumentException If a customer with the same name and date of birth already exists.
	 */
	public CustomerRecord addCustomerRecord(String firstName, String lastName, Date dob, Boolean hasGarden) {
		String fullName = firstName + " " + lastName;
		for (CustomerRecord record : customerRecords.values()) {
			if (record.getName().toString().equals(fullName) && record.getDob().equals(dob)) {
				throw new IllegalArgumentException("Customer with the same name and date of birth already exists.");
			}
		}
		Calendar today = Calendar.getInstance();
		CustomerRecord newCustomerRecord =
				new CustomerRecord(Name.getInstance(firstName, lastName), Calendar.getInstance(), today, hasGarden);

		/** Adding the new customer record to the data structure */
		customerRecords.put(newCustomerRecord.getCustomerNumber().getCustomerNumber(), newCustomerRecord);
		return newCustomerRecord;
	}

	/**
	 * Allows a customer to adopt a pet of the specified type if eligible.
	 *
	 * @param customerRecord The customer who wants to adopt a pet.
	 * @param petType        The type of pet to be adopted (e.g., "Cat" or "Dog").
	 * @return True if the adoption was successful, false otherwise.
	 * @throws IllegalArgumentException If the customer does not exist or if the pet type is invalid.
	 */
	public Boolean adoptPet(CustomerRecord customerRecord, String petType) {
		/** Checking whether the customer exists */
		if (!customerRecords.containsValue(customerRecord)) {
			throw new IllegalArgumentException("Customer doesn't exist.");
		}

		/** Checking whether the pet type is valid */
		if (!petType.equalsIgnoreCase(AbstractPet.CAT) && !petType.equalsIgnoreCase(AbstractPet.DOG)) {
			throw new IllegalArgumentException("Invalid pet type: " + petType);
		}

		/** Checking whether the customer has already adopted 3 pets */
		if (adoptedPetsByCustomer.containsKey(customerRecord.getCustomerNumber()) &&
				adoptedPetsByCustomer.get(customerRecord.getCustomerNumber()).size() >= 3) {
			System.out.println("Customer has already adopted the maximum adoption amount of 3 pets.");
			return false;
		}


		/** Checking the eligibility based on pet type, customer's age & garden */
		if (petType.equalsIgnoreCase(AbstractPet.CAT)) {
			if (!isCustomerEligibleForCat(customerRecord)) {
				System.out.println("Customer is not eligible to adopt a cat.");
				return false;
			}
		} else if (petType.equalsIgnoreCase(AbstractPet.DOG)) {
			if (!isCustomerEligibleForDog(customerRecord)) {
				System.out.println("Customer is not eligible to adopt a dog.");
				return false;
			}
		} else {
			throw new IllegalArgumentException("Invalid pet type.");
		}

		/** Get available pets of the specified type */
		List<Pet> availablePets = getAvailablePetsByType(petType);

		if (availablePets.isEmpty()) {
			System.out.println("There is no " + petType + " available for adoption.");
			return false;
		}

		/** Selecting a random pet from the available pets */
		Random random = new Random();
		Pet adoptedPet = availablePets.get(random.nextInt(availablePets.size()));

		/** Adding the adopted pet to the customer's adopted pets list */
		adoptedPetsByCustomer.computeIfAbsent
				(customerRecord.getCustomerNumber(), k -> new HashSet<>()).add(adoptedPet);

		/** Printing the adoption message */
		System.out.println("Customer " + customerRecord.getName() + " adopted a " + petType + ".");

		return true;
	}

	/**
	 * Retrieves the collection of pets adopted by a specific customer.
	 *
	 * @param customerNumber The unique identifier of the customer.
	 * @return An unmodifiable collection of Pet objects adopted by the specified customer.
	 */
	public Collection<Pet> adoptedPetsByCustomer (CustomerNumber customerNumber){
		return Collections.unmodifiableCollection
				(adoptedPetsByCustomer.getOrDefault(customerNumber, Collections.emptySet()));
	}

	/**
	 * Checks if a customer is eligible to adopt a cat based on their date of birth.
	 *
	 * @param customerRecord The CustomerRecord object representing the customer.
	 * @return True if the customer is eligible to adopt a cat, false otherwise.
	 */
	private boolean isCustomerEligibleForCat(CustomerRecord customerRecord) {
		Calendar dob = customerRecord.getDob();
		Calendar today = Calendar.getInstance();
		/** Minimum age to adopt a cat is 18 */
		dob.add(Calendar.YEAR, 18);
		return dob.before(today);
	}

	/**
	 * Checks if a customer is eligible to adopt a dog based on their date of birth and garden ownership.
	 *
	 * @param customerRecord The CustomerRecord object representing the customer.
	 * @return True if the customer is eligible to adopt a dog, false otherwise.
	 */
	private boolean isCustomerEligibleForDog(CustomerRecord customerRecord) {
		Calendar dob = customerRecord.getDob();
		Calendar today = Calendar.getInstance();
		boolean hasGarden = customerRecord.hasGarden();

		/** Minimum age to adopt an untrained dog is 21 */
		dob.add(Calendar.YEAR, 21);

		if (hasGarden) {
			return dob.before(today);
		} else {

			/** Minimum age to adopt a trained dog is 18 */
			dob.add(Calendar.YEAR, 3);
			return dob.before(today);
		}
	}

	/**
	 * Retrieves the list of available pets of the specified type.
	 *
	 * @param petType The type of pet to retrieve (e.g., "Cat" or "Dog").
	 * @return A list of available Pet objects of the specified type.
	 */
	private List<Pet> getAvailablePetsByType(String petType) {
		List<Pet> availablePets = new ArrayList<>();
		return availablePets;
	}
}
