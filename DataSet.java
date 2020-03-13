import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
	
	//Each data set has a set of DataRows, an amount of x values in the data set, and the total amount of data rows
	ArrayList<DataRow> values;
	private int amountOfX = 0;
	private int amountOfData = 0;
	
	/**
	 * This constructor reads the data from a file given the file name, and creates DataRow objects and stores them in values
	 * @param str Name of the file you want to open
	 * @throws IOException This throws an IOException since we are opening a file
	 */
	public DataSet(String str) throws IOException{
		values = new ArrayList<DataRow>();
		//Try and use the scanner with the file name
		File file = new File(str);
		Scanner input = new Scanner(file);
		
		//First, the amount of x's, then the amount of data
		amountOfX = input.nextInt();
		amountOfData = input.nextInt();
		
		
		//Data goes y value, then the corresponding x values
		double[] tempArray = new double[amountOfX];
		double tempY = 0;
		for(int i = 0; i < amountOfData; i++) {
			//Get the Y value
			tempY = input.nextDouble();
			//Fill the tempArray with x values
			for(int k = 0; k < amountOfX; k++) {
				tempArray[k] = input.nextDouble();
			}
			
			//Add the new DataRow object to values
			values.add(new DataRow(tempY, tempArray));
		}
	}
	
	/**
	 * Returns the amount of x values in each DataRow
	 * @return amount of x values in each DataRow
	 */
	public int getAmountOfX() {
		return amountOfX;
	}
	
	/**
	 * Returns the amount of DataRows in the DataSet
	 * @return amount of DataRows in the DataSet
	 */
	public int getAmountOfData() {
		return amountOfData;
	}
}

