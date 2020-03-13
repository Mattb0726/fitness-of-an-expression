
public class Mult extends Binop{
	
	/**
	 * Generic constructor that does nothing
	 */
	public Mult() {}
	
	/**
	 * Constructor that uses the superclass Binop constructor to set the left and the right child given two nodes
	 * @param l left child
	 * @param r right child
	 */
	public Mult(Node l, Node r) {
		//Call the superclass constructor and give it the left and right child
		super(l, r);
	}
	
	/**
	 * Evaluates the operation by multiplying the left child by the right child
	 * @param data The double array you want to use to evaluate the node
	 * @return left child multiplied by the right child
	 */
	public double eval(double[] data) {
		//Get the left child and right child and multiply them
		return lChild.eval(data) * rChild.eval(data);
	}
	
	/**
	 * Displays the left child multiplied by the right child as a string
	 */
	public String toString() {
		//Return the operation in string format
		return "(" + lChild + " * " + rChild + ")";
	}
}
