
public class Divide extends Binop{
	
	/**
	 * Generic constructor that does nothing
	 */
	public Divide() {}
	
	/**
	 * Constructor that uses the superclass Binop constructor to set the left and the right child given two nodes
	 * @param l left child
	 * @param r right child
	 */
	public Divide(Node l, Node r) {
		//Call the superclass constructor and give it the left and right child
		super(l, r);
	}
	
	/**
	 * Evaluates the operation by dividing the left child by the right child. If the right child is less than 0.0001, then it returns one
	 * @param data The double array you want to use to evaluate the node
	 * @return left child divided by the right child. Returns 1 if the right child is less than 0.0001
	 */
	public double eval(double[] data) {
		//Get the left child and right child and divide them
		if(rChild.eval(data) < Math.abs(0.0001)) {
			return 1.0;
		}else {
			return lChild.eval(data) / rChild.eval(data);
		}
	}
	
	/**
	 * Displays the left child divided by the right child as a string
	 */
	public String toString() {
		//Return the operation in string format
		return "(" + lChild + " / " + rChild + ")";
	}
}
