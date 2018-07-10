package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {

    private boolean mSecondFloor = false;

    /**
     * cottage object constructor based on super class
     *
     * @param dimension of the house (length and width of the cottage are equal)
     * @param lotLength length of the loot
     * @param lotWidth  width of the loot
     */
    public Cottage(int dimension, int lotLength, int lotWidth) {

        super(dimension, dimension, lotLength, lotWidth); // uses super class constructor
    }

    /**
     * cottage object constructor based on super class extended with owner and second floor
     *
     * @param dimension   of the house (length and width of the cottage are equal)
     * @param lotLength   length of the loot
     * @param lotWidth    width of the loot
     * @param owner       owner of the cottage
     * @param secondFloor informs if there is a second floor
     */
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {

        super(dimension, dimension, lotLength, lotWidth, owner); // uses super class constructor
        mSecondFloor = secondFloor; // creates second flore value
    }

    /**
     * checks if the cottage has second floor
     *
     * @return returns the value
     */
    public boolean hasSecondFloor() {

        return mSecondFloor;
    }

    /**
     * creates the string representation of the house class with cottage additional values
     *
     * @return this total string representation
     */
    public String toString() {

        if (hasSecondFloor()) {

            return super.toString() + "; is a two story cottage"; // return for two stores
        }

        return super.toString() + "; is a cottage"; // standard one store cottage
    }

}

