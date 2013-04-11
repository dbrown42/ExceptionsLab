package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    private String[] nameParts;
    private String lastName;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    /**
     * check for 2 spaces and ".", split at each space and take index[1]
     * check for comas, split at coma and take LAST_NAME_INDEX = 0 (first half)
     * 
     * 
     * @param fullName
     * @return 
     */
    public String extractLastName(String fullName) {
        /*
        if(fullName == null || fullName.length() == 0){
            
        }
        */
        if (fullName.contains(" ")){
            nameParts = fullName.split(" ");
            lastName = nameParts[LAST_NAME_IDX];
        }
        else if (fullName.contains(",")){
            nameParts = fullName.split(",");
            lastName = nameParts[0];
        }
        return lastName;
    }

}
