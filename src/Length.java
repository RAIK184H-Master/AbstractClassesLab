/**
 * A length in traditional U.S. units (i.e., feet and inches)
 *
 * This version extends the abstract TwoPartMeasure class that
 * implements most behaviors
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 2.0  
 */
public class Length extends TwoPartNumber
{
    /**
     * Default Constructor
     */
    public Length()
    {
	super(0, 0);
    }

    /**
     * Explicit Value Constructor
     *
     * @param feet   The number of feet (must be positive)
     * @param inches The number of inches (must be positive)
     */
    public Length(int feet, int inches)
    {
	super(feet, inches);
    }

    /**
     * Initialize the "constants" used by a TwoPartMeasure
     */
    protected void initializeUnits()
    {
	smallsPerLarge     = 12;

	largeUnitsSingular = "foot";
	largeUnitsPlural   = "feet";

	smallUnitsSingular = "inch";
	smallUnitsPlural   = "inches";
    }
}
