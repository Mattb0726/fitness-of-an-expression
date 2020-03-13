import java.util.*;
public class Generation {
	private int numTrees;
    private GPTree[] population;
    private double[] fitness;

     /** Creates a generation of GPTrees with the specified number of trees
     * @param numTrees Number of trees in the generation
     * @param o OperatorFactory object
     * @param t TerminalFacotry object
     * @param m maximum depth of the tree
     * @param r Random object
     */
    Generation(int numTrees, OperatorFactory o, TerminalFactory t, int m, Random r) {
        this.numTrees = numTrees;
        population = new GPTree[numTrees];
        fitness = new double[numTrees];
         for (int i = 0; i < numTrees; i++)
            population[i] = new GPTree(o, t, m, r);
    }
    /**
     * Creates a generation of GPTrees with the specified number of trees. The population array is left empty
     * @param n Specifies the number of trees
     */
    Generation(int n) {
        numTrees = n;
        population = new GPTree[numTrees];
        fitness = new double[numTrees];
    }

    /**
     * Evaluates all of the GPTrees in a DataSet. All fitness values are stored in an array
     * @param data The DataSet you want to use to evaluate the tree
     */
    public void evalAll(DataSet data) {
        for(int i=0;i<numTrees;i++)
        	fitness[i] = population[i].eval(data);

    }

    /**
     * Returns the GPTree at the specified index
     * @param i The index of the tree
     * @return GPTree at the specified index
     */
    public GPTree getTree(int i) {
        return population[i];
    }

    /** Prints the tree with the lowest fitness value. */
    public void printBestTree() {
    	int i=0;
        double[] tempFitness = fitness.clone(); //create a clone of fitness array in case of that its original order 
                                               //would be changed after sorting
        Arrays.sort(tempFitness);// sort the cloned array
        while(tempFitness[0]!=fitness[i]){  //find the smallest value within fitness[]
        	i++;
        }
        
        System.out.println(population[i]);
        System.out.println("The smallest fitness is "+tempFitness[0]);
    }
    /**
     * Returns the number of trees in the generation
     * @return numTrees
     */
    public int getNumTrees() { 
    	return numTrees; 
    }
    
    /**
     * Prints the entire generation of GPTrees
     */
    public void printGeneration() {
        for (int i = 0; i < numTrees; i++) {
            System.out.println(population[i]);
        }
    }
}
