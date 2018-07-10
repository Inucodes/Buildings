package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    /**
     * Building class constructor
     *
     * @param length    of the building
     * @param width     of the building
     * @param lotLength of the lot
     * @param lotWidth  of the lot
     */
    public Building(int length, int width, int lotLength, int lotWidth) {
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    /**
     * method gets the length of the building
     *
     * @return length
     */
    public int getLength() {

        return mLength;
    }

    /**
     * modifies the length value
     *
     * @param length input value of length
     */
    public void setLength(int length) {

        mLength = length;
    }

    /**
     * method gets width of the building
     *
     * @return width
     */
    public int getWidth() {

        return mWidth;
    }

    /**
     * modifies the width value
     *
     * @param width input value of width
     */
    public void setWidth(int width) {

        mWidth = width;
    }

    /**
     * method gets length of the lot
     *
     * @return length of the loot
     */
    public int getLotLength() {

        return mLotLength;
    }

    /**
     * modifies the lot length value
     *
     * @param lotLength input value of lot length
     */
    public void setLotLength(int lotLength) {

        mLotLength = lotLength;
    }

    /**
     * method gets width of the lot
     *
     * @return width of the lot
     */
    public int getLotWidth() {

        return mLotWidth;
    }

    /**
     * modifies the lot width value
     *
     * @param lotWidth input value of lot width
     */
    public void setLotWidth(int lotWidth) {

        mLotWidth = lotWidth;
    }

    /**
     * calculates the area of the building
     *
     * @return the area of the building
     */
    public int calcBuildingArea() {

        return mLength * mWidth;
    }

    /**
     * calculates the area of the lot
     *
     * @return the area of the lot
     */
    public int calcLotArea() {

        return mLotLength * mLotWidth;
    }

    /**
     * creates the string representation of the building class
     *
     * @return this string representation
     */
    public String toString() {

        return "Building area: " + calcBuildingArea() + "\nLot Area: " + calcLotArea();
    }

}
