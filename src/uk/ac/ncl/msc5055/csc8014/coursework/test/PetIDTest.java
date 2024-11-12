package uk.ac.ncl.msc5055.csc8014.coursework.test;

import uk.ac.ncl.msc5055.csc8014.coursework.main.PetID;

public class PetIDTest {

        public static void main(String[] args) {
            testGetInstance();
            testGetters();
        }

        public static void testGetInstance() {
            // Test normal cases
            PetID petID1 = PetID.getInstance();
            PetID petID2 = PetID.getInstance();
            assert !petID1.getPetID().equals(petID2.getPetID()): "Normal case: Two different PetIDs shouldn't be equal";

            // Test boundary conditions (test upper bounds)
            for (int i = 0; i < 98; i++) {
                petID1 = PetID.getInstance();
            }

            // Test exceptional cases (testing for maximum number of PetIDs generated)
            try {
                PetID.getInstance();
                assert false:
                        "Exceptional case: Maximum number of PetIDs reached. getInstance() should throw an exception";
            } catch (Exception e) {
                assert true;
            }
        }

        public static void testGetters() {
            // Test getters
            PetID petID = PetID.getInstance();
            char letter = petID.getLetter();
            int number = petID.getNumber();
            String petIDString = petID.getPetID();

            assert Character.isLetter(letter): "The letter component should be a character";
            assert number >= 1 && number <= 99: "The number component should be between 1 and 99";
            assert petIDString.matches("[a-z][0-9]{2}"):
                    "The petID String should match the format '[letter][two digits]'";
        }
    }

