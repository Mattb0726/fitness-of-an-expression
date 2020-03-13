public class DataRow {
	
	//Each row has a y value and some x values
	double y;
	double[] x;
	
	/**
	 * Constructor that sets the y value, and the array of x values
	 * @param yVal Y value of the DataRow
	 * @param values All of the X values in the DataRow
	 */
	public DataRow(double yVal, double[] values) {
		this.y = yVal;
		x = new double[values.length];
		//Copy all of the x's from values into the x array
		for(int i = 0; i < values.length; i++) {
			x[i] = values[i];
		}
		
	}
	
	/**
	 * Gets the y value from the DataRow object
	 * @return the y value of the DataRow object
	 */
	public double getY() {
		return y;
	}

}
