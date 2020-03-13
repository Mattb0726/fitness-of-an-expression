import java.util.Random;

public class TerminalFactory {

	private int numIndepVar;
	
	/**
	 * Constructor that sets TerminalFactories number of independent variables
	 * @param n The number of independent variables
	 */
	public TerminalFactory(int n) {
		numIndepVar = n;
	}
	
	/**
	 * Generates either a constant or variable
	 * @param rand Random object
	 * @return either a constant or a variable
	 */
	public Node getTerminal(Random rand) {
		int x = rand.nextInt(numIndepVar + 1); //Chooses the number between 0 and numIndepVar
		if(x < numIndepVar) {
			return new Variable(x);
		}else { //This will only happen when x is equal to numIndepVar
			return new Const(rand.nextDouble());
		}
	}
	
	/**
	 * Returns the number of independent variables
	 * @return the number of independent variables
	 */
	public int getNumIndepVar(){
		return numIndepVar;
	}
}
