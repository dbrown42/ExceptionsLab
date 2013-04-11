package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    /**
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    /**
     * 
     * @param hireDate 
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }
    
    /**
     * do not allow null or zero length.
     * ask about numerated first name / maybe allow number at end only.
     * allow only hyphens and spaces in last names.
     * allow any letter case (modify later depending on requirements.
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName == null || lastName.length() == 0){
            throw new IllegalArgumentException("Entry required.");
        }
        
        char[] chars = lastName.toCharArray();
        
        for(char c: chars){
            if (Character.isDigit(c)){
                throw new IllegalArgumentException();  
            }
        }
        /*
        for(char c: chars){
            if(!(c == '-' || c == ' ')){
                
            }
        }
        */
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    
}
