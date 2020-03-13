import java.util.Random;

public class OperatorFactory{

	private Node[] currentOps;
	
	/**
	 * Constructor that sets the currentOps node array 
	 * @param n The array of operators you can choose from
	 */
	public OperatorFactory(Node[] n) {
		currentOps = n.clone();
	}
	
	/**
	 * Returns a random cloned operator
	 * @param rand Random object
	 * @return A random cloned operator
	 */
	public Node getOperator(Random rand) {
		int x = rand.nextInt(4);
		switch(x) {
		case 0:
			return (Node) currentOps[0].clone();
		case 1:
			return (Node) currentOps[1].clone();
		case 2:
			return (Node) currentOps[2].clone();
		case 3:
			return (Node) currentOps[3].clone();
		default:
			return (Node) currentOps[0].clone();
		}
	}
	
	/**
	 * This returns the number of operators that can be used in the OperatorFactory
	 * @return the number of operators than can be used
	 */
	public int getNumOps() {
		return currentOps.length;
	}

}
