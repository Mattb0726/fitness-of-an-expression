import java.util.Random;

//abstract class so I can't make an instance of this class
public abstract class Node implements Cloneable{
	static int totalDepth = 0;
	int depth;
	
	/**
	 * Generic constructor that increments the depth by 1 when the object is created
	 */
	public Node() {
		depth = totalDepth + 1;
		totalDepth++;
	}
	
	/**
	 * Evaluates the node. However, since this is an abstract class and this method will be overwritten, just return 0
	 * @param data The double array you want to use to evaluate the node
	 * @return nothing
	 */
	public double eval(double[] data) {
		return 0;
	}
	
	/**
	 * Generic set child method. Nothing is implemented because this is an abstract class
	 * @param position The position where you want to insert the node
	 * @param n The node you want to inserts
	 */
	public void setChild(int position, Node n) {}
	
	/**
	 * Abstract method that will be overwritten.
	 * @param o OperatorFactory object
	 * @param t TerminalFactory object
	 * @param maxDepth The maximum depth of the tree
	 * @param rand Random object
	 */
	public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);
	
	/**
	 * Method that returns a cloned object
	 * @return cloned object
	 */
	public Object clone() {
		Object o = null;
		
		try {
			o = super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("SimpleClass cannot clone");
		}
		return o;
	}
	
	/**
	 * This returns the total depth of the node
	 * @return total depth of the node
	 */
	public int mySize() {
		return totalDepth;
	}
}
