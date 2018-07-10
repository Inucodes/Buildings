package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    private String mOwner = null; // owner of the building
    private boolean mPool = false; // true if building has a pool

    /**
     * basic house object constructor
     *
     * @param length    of the house
     * @param width     of the house
     * @param lotLength length of the loot
     * @param lotWidth  width of the loot
     */
    public House(int length, int width, int lotLength, int lotWidth) {

        super(length, width, lotLength, lotWidth); // uses Building constructor
    }

    /**
     * house object constructor with owner
     *
     * @param length    of the house
     * @param width     of the house
     * @param lotLength length of the loot
     * @param lotWidth  width of the loot
     * @param owner     of the house
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner) {

        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    /**
     * house object constructor with owner
     *
     * @param length    of the house
     * @param width     of the house
     * @param lotLength length of the loot
     * @param lotWidth  width of the loot
     * @param owner     of the house
     * @param pool      informs if the house has a pool
     */
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {

        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }

    /**
     * gets the value of the owner
     *
     * @return the owner or n/a
     */
    public String getOwner() {

        if (mOwner == null) {

            return "n/a";  // n/a if there is no owner
        }

        return mOwner; // returns the owner if it exists
    }

    /**
     * modifies the value of the owner
     *
     * @param owner input value
     */
    public void setOwner(String owner) {

        mOwner = owner;
    }

    /**
     * checks if house has a pool
     *
     * @return returns the pool value
     */
    public boolean hasPool() {

        return mPool;
    }

    /**
     * modifies the pool value
     *
     * @param pool input value
     */
    public void setPool(boolean pool) {

        mPool = pool;
    }

    /**
     * creates the string representation of the house class
     *
     * @return this total string representation
     */

    public String toString() {

        String message = "Owner: " + getOwner(); // adds owner if exists

        if (hasPool()) {

            message += "; has a pool"; // adds info if there is a pool
        }

        if (calcLotArea() > calcBuildingArea()) {

            message += "; has a big open space"; // informs when the loot is bigger than the house
        }

        return message;


    }

    /**
     * checks if two house objects are equal
     *
     * @param other object to compare
     * @return result of comparison or false if not a house object
     */
    public boolean equals(Object other) {

        if (other instanceof House) {
            House otherHouse = (House) other;
            return calcBuildingArea() == otherHouse.calcBuildingArea()
                    && hasPool() == otherHouse.hasPool(); // compares and returns true or false

        }

        return false; // other object was not a House object
    }

}
