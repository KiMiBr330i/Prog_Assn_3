import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class NearestNeighbor {
	static double s_len, s_wid, p_len, p_wid;
	public static void main(String[] args) throws FileNotFoundException {

		Scanner testing = new Scanner(System.in);
		Scanner training = new Scanner(System.in);

//System.out.print("Enter the name for the training file: ");
		String trainingFile = "/Users/kipbrower/Desktop/iris-training-data.csv";
//System.out.print("Enter the name for the testing file: ");
		String testingFile = "/Users/kipbrower/Desktop/iris-testing-data.csv";
		File testingData = new File("/Users/kipbrower/Desktop/iris-testing-data.csv");
		File trainingData = new File("/Users/kipbrower/Desktop/iris-training-data.csv");
		Scanner trainScan = new Scanner(trainingData);
		Scanner testScan = new Scanner(testingData);
		
		//String [] aData1;
// making arrays for training data ----------------------------------------------------------------
		while (trainScan.hasNext()) {
			String aData = trainScan.nextLine();
			
			String[] aData1 = aData.split(",");
				
			String[] aData2 = aData1[0].split(",");
			String aData2_1 = Arrays.toString(aData2);
			
			//final double s_len = Double.parseDouble(aData1[0]);
			//final double s_wid = Double.parseDouble(aData1[1]);
			//final double p_len = Double.parseDouble(aData1[2]);
			//final double p_wid = Double.parseDouble(aData1[3]);
			
			double[] s_l = new double[75];
			for(int i = 0; i < s_l.length; i++)
				s_l[i] = Double.parseDouble(aData2_1);
				System.out.println(s_l);
			
			
			
				
		//double[][] train_dat = {{s_len, s_wid, p_len, p_wid}};
		//System.out.println(s_len);		
			}
		
// making arrays for testing data -------------------------------------------------------------------
			
			/* while (testScan.hasNext()) { 
				  String bData = testScan.nextLine(); 
			  String[] bData1 = bData.split(","); 
			  final double bS_LENGTH = Double.parseDouble(bData1[0]); 
			  final double bS_WIDTH = Double.parseDouble(bData1[1]); 
			  final double bP_LENGTH = Double.parseDouble(bData1[2]); 
			  final double bP_WIDTH = Double.parseDouble(bData1[3]);
			  String[] test_class = {bData1[4]};
			  double[][] test_dat = { { Double.parseDouble(bData1[0]) }, { Double.parseDouble(bData1[1]) },
						{ Double.parseDouble(bData1[2]) }, { Double.parseDouble(bData1[3]) } };
				
			  for (int row = 0; row < test_dat.length; row++) {
					for (int col = 0; col < test_dat[row].length; col++)
						System.out.println(test_dat[row][col]);
					System.out.println();
			  }
			
			 * double sepal_l = Math.pow((aS_LENGTH - bS_LENGTH), 2); double sepal_w =
			 * Math.pow((aS_WIDTH - bS_WIDTH), 2); double petal_l = Math.pow((aP_LENGTH -
			 * bP_LENGTH), 2); double petal_w = Math.pow((aP_WIDTH - bP_WIDTH), 2); double
			 * dist = Math.sqrt((sepal_l) +(sepal_w) + (petal_l) + (petal_w));
			 * System.out.println(dist);
			 */
		
	}
}
