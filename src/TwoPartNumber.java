/**
 * A compound number with two parts (e.g., a length in feet and inches, a
 * weight in pounds and ounces, ...).
 *
 * Internally, a two-part number is represented using only the small units.
 *
 * This class is abstract.  Concrete children must implement the
 * initializeUnits() method that initializes various "constants"
 * that are used throughout the class.
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 1.0  
 */
public abstract class TwoPartNumber
{
    private int           value;
   
    protected int         smallsPerLarge;
    protected String      largeUnitsSingular, largeUnitsPlural;
    protected String      smallUnitsSingular, smallUnitsPlural;

    /**
     * Default Constructor.
     */
    public TwoPartNumber()
    {
	this(0, 0);
    }

    /**
     * Explicit Value Constructor.
     *
     * @param large    The number of large units
     * @param small    The number of small units
     */
    public TwoPartNumber(int large, int small)
    {
        initializeUnits();

        value = toSmall(large, small);
    }

    /**
     * Change this TwoPartNumber by a given amount.
     *
     * @param other   The amount to change this TwoPartNumber by
     */
    public void changeBy(TwoPartNumber other)
    {
        this.value = this.value + other.value;
    }

    /**
     * Get the large part of this TwoPartNumber.
     *
     * @return  The large part
     */
    private int getLargePart()
    {
        return value / smallsPerLarge;
    }

    /**
     * Get the small part of this TwoPartNumber.
     *
     * @return  The small part
     */
    private int getSmallPart()
    {
        return value % smallsPerLarge;
    }

    /**
     * Initialize the "constants" used by a TwoPartNumber.
     * Specifically:
     *
     *    smallsPerLarge     (e.g., inches per foot, ounces per pound)
     *    largeUnitsSingular (e.g., "foot", "pound")
     *    largeUnitsPlural   (e.g., "feet", "pounds")
     *    smallUnitsSingular (e.g., "inch", "ounce")
     *    smallUnitsPlural   (e.g., "inches", "ounces")
     */
    protected abstract void initializeUnits();


    /**
     * Convert large and small units to small-only units.
     *
     * @param large    The number of large units
     * @param small    The number of small units
     * @return         The small-only units
     */
    private int toSmall(int large, int small)
    {
        return large*smallsPerLarge + small;
    }

    /**
     * Get a String representation of this TwoPartNumber.
     *
     * @return  The String
     */ 
    public String toString()
    {
        int        large, small;        
	String     s;

	s     = new String();
        large = getLargePart();
        small = getSmallPart();

	if (large == 1) s += large + " " + largeUnitsSingular;
	else            s += large + " " + largeUnitsPlural;

	if (small == 1) s += "  " + small + " " + smallUnitsSingular;
	else            s += "  " + small + " " + smallUnitsPlural;

	return s;
    }
}
