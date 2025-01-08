# 🐱🐶 Shelter Management System

*Shelter Management System was completed as a coursework for the CSC8014 module(Software Development Advanced Techniques) taught for the MSc Computer Science programme within the School of Computing at Newcastle University during the 2023/2024 Academic Year.*

This project aims to deliver a management system for a shelter providing temporary homes for stray or unwanted pet animals which can later be adopted.

>___Feedback:___
> `"Good, an abstract class that implements the Pet Interface has been created.
>Good, the Abstract class has  a constructor to avoid code duplication.
>Correct implementation of the methods provided in the interface.
>Good use of constants in abstract class for cat and dog.
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

***The system successfully:***
- 
  
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

# ❇️ Future Improvements

***The following remarks were made by Dr R Yassin Kassab for future improvements.***
- The factory method inside the Abstract class is good. No need to pass getAdopted or careInstructions (getAdopted is false by default and careInstructions is specific to either a Cat or a Dog).
- Good, the Abstract class has the right set of attributes. Better for getAdopted not to be final as this will change.
- It would be better to override the toString method in the Abstract class to avoid code duplication in the Cat and Dog classes.
- Add a method to change the adoption status of the pet.

  # ⛓️ References

- [*Click for detailed information on the CSC8014 module.*](https://www.ncl.ac.uk/module-catalogue/module.php?code=CSC8014)
