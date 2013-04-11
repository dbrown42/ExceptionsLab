package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    private String[] nameParts;
    private String lastName;
    private String firstName;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName){
        if (fullName.contains(" ")){
            nameParts = fullName.split(" ");
            lastName = nameParts[LAST_NAME_IDX];
        }
        else if (fullName.contains(",")){
            nameParts = fullName.split(",");
            lastName = nameParts[FIRST_NAME_IDX];
        }
        return lastName;
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
        if (fullName.contains(" ")){
            nameParts = fullName.split(" ");
            firstName = nameParts[FIRST_NAME_IDX];
        }
        else if (fullName.contains(",")){
            nameParts = fullName.split(",");
            firstName = nameParts[LAST_NAME_IDX];
        }
        return firstName;
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
