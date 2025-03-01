//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Giovani Zuniga

public class Number {
    private int theValue; // The integer value stored in this object

    /**
     * Constructs a Number object with the specified value
     * @param value The integer value to be stored
     */
    public Number(int value) {
        theValue = value;
    }

    /**
     * gets the integer value stored in this object.
     * @return The stored integer value
     */
    public int getValue() {
        return theValue;
    }

    /**
     * Compares this Number object with another for equality
     * @param obj The object to compare with
     * @return true if the objects store the same integer value, false otherwise
     */
    public boolean equals(Object obj) {
        Number other = (Number) obj;
        if(this.theValue == other.theValue){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Gets a hash code for this Number object
     * @return The remainder when the integer value is divided by 10
     */
    public int hashCode() {
        return theValue % 10;
    }

    /**
     * Returns a string representation of the stored integer value
     * @return A string representation of the integer
     */
    public String toString() {
        return Integer.toString(theValue);
    }
}
