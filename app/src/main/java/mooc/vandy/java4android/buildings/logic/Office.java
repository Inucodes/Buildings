package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    private static int sTotalOffices = 0;
    private String mBusinessName;
    private int mParkingSpaces = 0;

    /**
     * basic office object constructor with counter
     *
     * @param length    of the office
     * @param width     of the office
     * @param lotLength length of the loot
     * @param lotWidth  width of the loot
     */

    public Office(int length, int width, int lotLength, int lotWidth) {

        super(length, width, lotLength, lotWidth); // uses super class constructor
        sTotalOffices += 1;
    }

    /**
     * office object constructor with counter and business
     *
     * @param length       of the office
     * @param width        of the office
     * @param lotLength    length of the loot
     * @param lotWidth     width of the loot
     * @param businessName name of the business
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {

        this(length, width, lotLength, lotWidth); // uses super class constructor
        mBusinessName = businessName;

    }

    /**
     * office object constructor with counter, business name and parking spaces number
     *
     * @param length        of the office
     * @param width         of the office
     * @param lotLength     length of the loot
     * @param lotWidth      width of the loot
     * @param businessName  name of the business
     * @param parkingSpaces number of parking spaces
     */
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {

        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    /**
     * gets the name of the business
     *
     * @return name of the business if any
     */
    public String getBusinessName() {

        if (mBusinessName == null) {

            return "unoccupied"; // return when there is no name
        }

        return mBusinessName;
    }

    /**
     * Method changes the name of the business
     *
     * @param businessName input value
     */
    public void setBusinessName(String businessName) {

        mBusinessName = businessName;
    }

    /**
     * gets the number of parking spaces
     *
     * @return number of parking spaces
     */
    public int getParkingSpaces() {

        return mParkingSpaces;
    }

    /**
     * Method changes the value of parking spaces
     *
     * @param parkingSpaces input value
     */
    public void setParkingSpaces(int parkingSpaces) {

        mParkingSpaces = parkingSpaces;
    }

    /**
     * creates the string representation of the office
     *
     * @return this total string representation
     */
    public String toString() {

        String message = "Business: " + getBusinessName(); // business name

        if (getParkingSpaces() > 0) {

            message += "; has " + getParkingSpaces() + " parking spaces"; // number of parking spaces if any

        }

        message += " (total offices: " + sTotalOffices + ")"; // number of total offices

        return message;

    }

    /**
     * checks if two house objects are equal
     *
     * @param other object to compare
     * @return result of comparison or false if not an office object
     */
    public boolean equals(Object other) {

        if (other instanceof Office) {
            Office otherOffice = (Office) other;
            return calcBuildingArea() == otherOffice.calcBuildingArea()
                    && getParkingSpaces() == otherOffice.getParkingSpaces(); // compares and returns true or false

        }

        return false; // other object was not an Office object

    }

}
