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

***Upon completion of this system, successfully demonstrated the following achievements:***
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
- The factory method inside the Abstract class is good. No need to pass getAdopted or careInstructions (getAdopted is false by default and careInstructions is specific to either a Cat or a Dog).
- Good, the Abstract class has the right set of attributes. Better for getAdopted not to be final as this will change.
- It would be better to override the toString method in the Abstract class to avoid code duplication in the Cat and Dog classes.
- Add a method to change the adoption status of the pet.

  # ⛓️ References

- [*Detailed information on the CSC8014 module.*](https://www.ncl.ac.uk/module-catalogue/module.php?code=CSC8014)
