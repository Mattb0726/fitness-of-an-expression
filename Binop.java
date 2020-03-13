import java.util.Random;

public class Binop extends Node{
	protected Node lChild;
	protected Node rChild;
	
	/**
	 * Constructor that leaves lChild and rChild null
	 */
	public Binop() {}
	
	/**
	 * Constructor that sets the lChild and rChild
	 * @param l left child
	 * @param r right child
	 */
	public Binop(Node l, Node r) {
		lChild = l;
		rChild = r;
	}
	
	/**
	 * Adds random left and right children to the binary tree. This can be either an operator or terminal
	 * @param o OperatorFactory object
	 * @param t TerminalFacotry object
	 * @param maxDepth maximum depth of the node
	 * @param rand Random object
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
		
		if(this.depth == maxDepth) {
			//Have the left and right children be either a const or Variable
			lChild = t.getTerminal(rand);
			rChild = t.getTerminal(rand);
		}else {
			//Repeat the recursive step for the left and right child
			if(rand.nextInt(o.getNumOps() + t.getNumIndepVar()) < o.getNumOps()) {
				lChild = o.getOperator(rand);
				lChild.depth = this.depth + 1;
				lChild.addRandomKids(o, t, maxDepth, rand);
			}else {
				lChild = t.getTerminal(rand);
				lChild.depth = this.depth + 1;
			}
			if(rand.nextInt(o.getNumOps() + t.getNumIndepVar()) < o.getNumOps()) {
				rChild = o.getOperator(rand);
				rChild.depth = this.depth + 1;
				rChild.addRandomKids(o, t, maxDepth, rand);
			}else {
				rChild = t.getTerminal(rand);
				rChild.depth = this.depth + 1;
			}
		}
	}
	
	/**
	 * Sets the child as either the left or right child. The child is only the left child if position is 1
	 * @param position Position of the node you want to insert
	 * @param n The node you want to insert
	 */
	public void setChild(int postion, Node n) {
		if(postion == 1) {
			lChild = n;
		}else {
			rChild = n;
		}
	}
}