/**
 * A driver that can be used to test the Length class.
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 1.0
 */
public class Driver1
{
    /**
     * The entry point of the application
     *
     * @param args   The command line arguments
     */
    public static void main(String[] args)
    {
	Length         billsHeight, growth, mikesHeight;


	mikesHeight = new Length(5, 5);
	billsHeight = new Length(5, 5);
	System.out.println("Age 12: ");
	printSummary("Mike", mikesHeight, "Bill", billsHeight);

	growth = new Length();
	mikesHeight.changeBy(growth);
	growth = new Length(0, 4);
	billsHeight.changeBy(growth);
	System.out.println("Age 16: ");
	printSummary("Mike", mikesHeight, "Bill", billsHeight);

	growth = new Length(1, 1);
	mikesHeight.changeBy(growth);
	growth = new Length(0,10);
	billsHeight.changeBy(growth);
	System.out.println("Age 20: ");
	printSummary("Mike", mikesHeight, "Bill", billsHeight);

	growth = new Length(0,-1);
	billsHeight.changeBy(growth);
	System.out.println("Age 70: ");
	printSummary("Mike", mikesHeight, "Bill", billsHeight);
    }



    /**
     * Print summary information for two Length objects
     *
     * @param name1   The name for the first Length
     * @param length1 The first Length object
     * @param name2   The name for the second Length
     * @param length2 The second Length object
     */
    private static void printSummary(String name1, Length length1, 
				     String name2, Length length2)
    {
        String    s1, s2;
        
        s1 = length1.toString();
        s2 = length2.toString();
        
	System.out.println("  " + name1 + ": " + s1);
	System.out.println("  " + name2 + ": " + s2);

	if (s1.equals(s2)) System.out.println("    ==   SAME    ==");
        else System.out.println("    == DIFFERENT ==");

	System.out.println("\n");
    }
}
