import java.util.Random;

public class GPTree {
	private Node root;
	private int mySize;
	
	/**
	 * Generic GPTree constructor. This sets the root node that is being evaluated to null;
	 */
	public GPTree() {
		root = null;
	}
	
	/**
	 * GPTree constructor. Creates a root node that is filled with random kids given a max depth
	 * @param o OperatorFactory object
	 * @param t TerminalFacotry object
	 * @param maxDepth maximum depth of the tree
	 * @param rand Random object
	 */
	public GPTree(OperatorFactory o , TerminalFactory t, int maxDepth, Random rand) {
		root = o.getOperator(rand);
		root.addRandomKids(o, t, maxDepth, rand);
	}
	
	/**
	 * Prints out the root node in string form
	 */
	public String toString() {
		return root.toString();
	}
	
	/**
	 * Calculates the fitness of the tree. This runs through all of the DataRows in the DataSet and calculates the fitness by evaluating the root node,
	 * subtracting the y value, and squaring the answer
	 * @param dSet The DataSet you want to use to evaluate the tree
	 * @return fitness of the tree
	 */
	public double eval(DataSet dSet) {
		//Keep a count for the fitness
		double fitness = 0.0;
		//Loop through all of the DataRow's in the data set
		for(int i = 0; i < dSet.getAmountOfData(); i++) {
			//Evaluate the root, subtract y, and square it. Add this to the fitness count
			fitness += Math.pow(root.eval(dSet.values.get(i).x) - dSet.values.get(i).getY(), 2);
		}
		return fitness;
	}
	
	/**
	 * This returns the size of the root node
	 * @return size of the root node
	 */
	public int mySize() {
		return root.mySize();
	}
}
