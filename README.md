# 🐱🐶 Shelter Management System

*Shelter Management System was completed as a coursework for the CSC8014 module(Software Development Advanced Techniques) taught for the MSc Computer Science programme within the School of Computing at Newcastle University during the 2023/2024 Academic Year.*

This project aims to deliver a management system for a shelter providing temporary homes for stray or unwanted pet animals which can later be adopted.

>___Feedback:___
> `"Good use of constants in abstract class for cat and dog.
> Good use of equalsIgnoreCase() for checking if the type is a cat or a dog.
> Good use of private helper functions."`
> -*Dr R Yassin Kassab, Module Leader*

## ⚙️ How to Install 

Clone the project to your computer.

```
> https://github.com/nazlialdogan11/CSC8014-Software-Development-Advanced-Techniques.git
```

Open the files.

# ℹ About the Shelter Management System

The Shelter Management System aims to assist the employees of a shelter to keep track of the adoption process and maintain the required records. This system has a set of interfaces and classes to manage pets’ adoption. The system issues a unique ID to the pet added to the shelter and as the shelter accepts only cats and dogs, the system also divides cat and dog IDs by their own groups for easier management. The system maintains a record on the pets as well as another record for associating the customers with the pets they have adopted. Finally, certain restrictions prevalent in the adoption process were adapted to the system.

# 🔖 Achievements

***Upon completing this system, successfully demonstrated the following achievements:***
- created an abstract class that implements the Pet Interface.
- avoided code duplication with a constructor in the abstract class.
- included a factory method within the abstract class.
- utilised the right nse of attributes.
- correctly implemented the methods provided in the interface.
- created a Cat class as well as a Dog class which both extend the abstract class.
- provided a constructor that re-used the behaviour from the parent for both the Cat and Dog classes.
- correctly implemented getCareInstructions() for the Cat class.
- provided a private attribute for the raining status of the dog.
- correctly created set/get training status methods.
- correctly set the right care instructions.
- created a Name class with appropriate final properties and ensured no public setter methods added to this class.
- overrode the toString method for the Name class.
- additional to the specifications, ensured uniqueness in the Name class.
- created a PetID class with a private constructor as well as appropriate final attributes.
- implemented toString and ensured no public setter methods were added for the PetID class.
- provided a public static factory method within the PetID class.
- created a PetID with the correct pattern.
- made good use of a private map to store the PetIDs.
- created a CustomerNumber class with appropriate private final attributes.
- created a CustomerNumber with the correct pattern.
- created a CustomerRecord class as well as a ShelterManager class.
- created data structurees to store pets, customers and customer with their adopted pets.
- implemented the addPet method.
- validated that the petType is either a cat or a dog.
- correctly implemented the noOfAvailablePets method as well as the updatePetRecord method.
- correctly validated that the pet exists in te shelter and it is of the type Dog.
- implemented the addCustomerRecord method.
- correctly implemented the adoptedPetsByCustomer method.
- ensured the returned collection of all pets currently adopted by the customer is unmodifiable.
- correctly validated the input parameters of the adoptPet method, which behaves correctly when there are no pets in the shelter.
- unabled a customer to adopt more than three pets.
- ensured any deprecated Date methods were not used.
- ensured separating the test classes from other classes with a package.
- provided a class description at the beginning for each class.
- povided method description at the beginning of the methods.
- provided in-line comments for more complicated methods.
- made good use of JavaDocs and variable names.
- followed the Java notation agreement for the notation of the variables, methods, classes and packages.
- created a seperate class for each class tested.
- made good use of constants in abstract class for cat and dog.
- made good use of equalsIgnoreCase() for checking whether the type is a cat or a dog.
- made good use of private helper functions.
  
***The learning outcomes achieved upon the completion of this project were summarised below.***
- Implemented appropriate overriding of Object class methods, including overriding toString and providing a static valueOf method when appropriate.
- Designed interface-based hierarchies, programming through interfaces,casting and late binding.
- Used factories to control instantiation of objects, including how to guarantee the instantiation of unique instances.
- Utilised defensive programming, including use of immutability, appropriate error handling, validation of input and using appropriate accessors and modifiers on instance variables, methods, and classes.
- Employed appropriate interfaces and classes from the Collections framework.
- Appropriately utilised Javadocs to document interfaces and classes.
- Applied proper testing.

# 📄 Program Output

Program output demonstrates the system capabilities.

After executing the code, the system displays a menu for user interaction (Figure 1).
[TBR]

# ❇️ Future Improvements

***The following remarks were made by Dr R Yassin Kassab for future improvements.***
- The factory method inside the Abstract class is good. No need to pass getAdopted or careInstructions(getAdopted is false by default and careInstructions is specific to either a Cat or a Dog).
- Good, the Abstract class has the right set of attributes. Better for getAdopted not to be final as this will change.
- Better to override the toString method in the Abstract class to avoid code duplication in the Cat and Dog classes.
- Add a method to change the adoption status of the pet.
- Better to override toString method for both the Cat and Dog classes.
- Ensure validity check for all constructor's parameters concerning Name class.
- Consider overriding the equals and hashCode methods for Name class.
- Utilise static factory methods to ensure uniqueness in the CustomerNumber class(provide a private constructor for this class as well as a public static factory method to be used to create unique objects).
- Better to create a map to store CustomerNumber to ensure uniqueness.
- Better to override toString for the CustomerNumber class.
- Set CustomerNumber properly by using "this.customerNumber = firstComponent + "." + secondComponent;".
- Have attributes as final for the CustomerRecord class.
- Make dob and doi of type Date instead of Calendar.
- Use defensive copying in the constructor to create new objects of Date in the CustomerRecord class.
- Use defensive copying in the getter methods of date of birth and date of issue to create new objects of Date in the CustomerRecord class.
- Override the toString method in the CustomerRecord class.
- Use the getInstance method from the AbstractPet class instead of using the Cat and Dog constructors explicitly for the ShelterManager class.
- Validate the petType to see if it is either a cat or a dog.
- Pass dob to the constructor when creating the customer record via addCustomerRecord method.
- Validate input parameters for the ShelterManager class.
- Ensure that a customer with the same name and dob is not added twice by carrying out a proper check.
- Ensure the proper implementation of the getAvailablePetsByType and isCustomerEligibleForDog methods(Ensure customers ithout a garden are unable to adopt a dog regardless of their age).
- Set adoption status to True once a pet is adopted.
- Take training status into consideration when checking the customer age.
- Calculate custome age by using "Calendar dob = Calendar.getInstance(); dob.setTime(customerRecord.getDob().getTime());".
-  Print the reason why a customer cannot adopt a pet.
-  Better to use at least two packages to group related classes with each other(base classes and main classes).
-  Include a header comment at the beginning of each class with author and Date information.
-  Provide a class description at the beginning of each class.
-  Use the Assertions class instead of the Asset command for testing classes.
-  Ensure checking 3 classes.
-  Provide more normal test cases(especially for the ShelterManager test), boundary test cases(for instance, adopting a cat by under 18) and Exception test cases.
  
  # ⛓️ References

- [*Detailed information on the CSC8014 module.*](https://www.ncl.ac.uk/module-catalogue/module.php?code=CSC8014)
