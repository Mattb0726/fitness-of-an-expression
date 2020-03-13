import java.util.Random;

public class Const extends Node{
	private double value;
	
	/**
	 * Creates a new Const given a double
	 * @param d The double value you want to have your Const be
	 */
	public Const(double d) {
		value = d;
	}
	
	/**
	 * Given an array, this returns the value of the Const
	 * @param data The array you want to use to evaluate the Const
	 * @return the value of the Const object
	 */
	public double eval(double[] data) {
		return value;
	}
	
	/**
	 * Returns the value as a string
	 * @return the value as a string
	 */
	public String toString() {
		return "" + value;
	}
	
	/**
	 * This method does not do anything for the Const class
	 * @param o OperatorFactory object
	 * @param t TerminalFactory object
	 * @param maxDepth The maximum depth of the node
	 * @param rand Random Object
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
