import java.util.Random;

public class Variable extends Node{
	private int index;

	/**
	 * Constructor that sets the index of the Variable object
	 * @param i The index of the variable
	 */
	public Variable(int i) {
		//This sets the index equal to 0 at first, because the indexesCreated variable doesnt increment until after this line
		index = i;
	}
	
	/**
	 * Evaluates the Variable object by returning the double at the specified index in the array
	 * @param data The double array you want to use to evaluate the node
	 * @return the value of the Variable by using the double at the specified index in the array
	 */
	public double eval(double[] data) {
		return data[index];
	}
	
	/**
	 * Returns an X followed by the index of the variable
	 * @return an X followed by the index of the variable
	 */
	public String toString() {
		return "X" + index;
	}
	
	/**
	 * This method doesnt do anything for the Variable class
	 * @param o OperatorFactory object
	 * @param t TerminalFacotry object
	 * @param maxDepth The maximum depth of the tree
	 * @param rand Random object
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
