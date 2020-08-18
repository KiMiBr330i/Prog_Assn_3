import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class NearestNeighbor {

	public static void main(String[] args) throws FileNotFoundException {
		
	
		Scanner testing = new Scanner(System.in);
		Scanner training = new Scanner(System.in);

//System.out.print("Enter the name for the training file: ");
String trainingFile = "/Users/kipbrower/Downloads/iris-training-data.csv";
//System.out.print("Enter the name for the testing file: ");
String testingFile = "/Users/kipbrower/Downloads/iris-testing-data.csv";
File testingData = new File("/Users/kipbrower/Downloads/iris-testing-data.csv");
File trainingData = new File("/Users/kipbrower/Downloads/iris-training-data.csv");
Scanner trainScan = new Scanner(trainingData);
Scanner testScan = new Scanner(testingData);


// making arrays for training data ----------------------------------------------------------------
while (trainScan.hasNext()) {
	String aData = trainScan.nextLine();
	String[] aData1 = aData.split(",");

//Double.parseDouble(aData1[0]);
double S_LENGTH = Double.parseDouble(aData1[0]);
System.out.println(S_LENGTH);
//String S_WIDTH = aData1[1];
//Double.parseDouble(aData1[1]);
double S_WIDTH = Double.parseDouble(aData1[1]);
System.out.println(S_WIDTH);
//String[] P_LENGTH = aData1[2];
//String[] P_WIDTH = aData1[3];
//String[] clas = aData1[4];
double[][] sepal = {Double.parseDouble(aData1[0]),
					Double.parseDouble(aData1[1])};
}




//String eData = testScan.nextLine();{
}

}
