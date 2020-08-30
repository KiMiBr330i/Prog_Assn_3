import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class NearestNeighbor {
	Scanner testing = new Scanner(System.in);
	Scanner training = new Scanner(System.in);

//System.out.print("Enter the name for the training file: ");
	String trainingFile = "/Users/kipbrower/Desktop/iris-training-data.csv";
//System.out.print("Enter the name for the testing file: ");
	String testingFile = "/Users/kipbrower/Desktop/iris-testing-data.csv";
	static File testingData = new File("/Users/kipbrower/Desktop/iris-testing-data.csv");
	static File trainingData = new File("/Users/kipbrower/Desktop/iris-training-data.csv");
	
	double dist;
	double[][] s_l = new double[75][4];
	int track = 0;
	double train;
	String class_t;
	String[] classTrain = new String[75];
	double[][] a_l = new double[75][4];
	int track_e = 0;
	double test;
	String class_test;
	String[] classTest = new String[75];
	

	public static void main(String[] args) throws FileNotFoundException {
		
		
	}

		// making arrays for training
		// data----------------------------------------------------------------
		public  void trainData() throws FileNotFoundException {
			Scanner trainScan = new Scanner(trainingData);
			while (trainScan.hasNext()) {
			String aData = trainScan.nextLine();

			String[] aData1 = aData.split(",");
			for (int i = 0; i < aData1.length - 1; i++) {
				train = Double.parseDouble(aData1[i]);
				s_l[track][i] = train;

				for (int k = 4; k < aData1.length; k++) {
					class_t = aData1[k];
					classTrain[track] = class_t;

				}

			}
			track++;
			System.out.println();}
			}

		
	
// making arrays for testing data -------------------------------------------------------------------
		
		public void testData() throws FileNotFoundException {
			Scanner testScan = new Scanner(testingData);
	
		while (testScan.hasNext()) {
			String bData = testScan.nextLine();

			String[] bData1 = bData.split(",");
			for (int j = 0; j < bData1.length - 1; j++) {
				test = Double.parseDouble(bData1[j]);
				a_l[track_e][j] = test;

				for (int l = 4; l < bData1.length; l++) {
					class_test = bData1[l];
					classTest[track_e] = class_test;
				}

			}
			track_e++;
		}
		System.out.println();
		dist = Math.sqrt(Math.pow((train - test),2));
		System.out.println(dist);
	}


	
	}
