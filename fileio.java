import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class PS5_Files {

    static ArrayList<String> Q1(String filename){
    	ArrayList<String> line1 = new ArrayList<String>();
    		try {
				for (String line: Files.readAllLines(Paths.get(filename))) {
					line1.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

    		 return line1;
    }

        // Return all lines of the file in an ArrayList with 1 String for each line in the file




    static int Q2(String filename){

    		ArrayList<String> line1 = new ArrayList<String>();

    		try {
				for (String line: Files.readAllLines(Paths.get(filename))) {
					line1.add(line);
					
				}
			} catch (IOException ex) {

				ex.printStackTrace();
			}
    		int k = line1.size();
    		 return k;


    }
        // return the number of lines in the input file




    static double Q3(String number){
    	double j= new Double (number);
        // Return the double represented by the input String. You can assume the String contains a well-formed double.

        return j;
    }


    static int Q4(String filename, char letter){

    	ArrayList<String> line1 = new ArrayList<String>();

		try {
			for (String line: Files.readAllLines(Paths.get(filename))) {
				if (line.contains("letter")) {
					line1.add("letter");
				}

			}
		} catch (IOException ex) {

			ex.printStackTrace();
		}
		int k = line1.size();
		 return k;
        // return the number of times letter appears in the input file


    }


    static boolean Q5(String filename){

		try {
			for (String line: Files.readAllLines(Paths.get(filename))) {
				return true;

			}
		} catch (IOException ex) {

			ex.printStackTrace();

		}
		return false;
    }
        // return true if the file can be successfully opened, false otherwise. Hint: If the file cannot be opened, an
        // IOException will be thrown.




    static String Q6(String line){
    	String [] data = line.split(",");


        // Given a line containing comma-separated values, return the second value.

        return data[1];
    }


    static int Q7(String line){
    	String [] data = line.split(",");
    	int k = new Integer (data[1]);
        // Given a line containing comma-separated values, return the second value as an int. You can assume the second
        // value is a well-formed integer.

        return k;
    }


    static ArrayList<Integer> Q8(String filename){
    	ArrayList<Integer> line1 = new ArrayList<Integer>(Arrays.asList());
		try {
			for (String line: Files.readAllLines(Paths.get(filename))) {
				int k = new Integer (line);
				line1.add(k);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain a well-formed integer.

        return line1;
    }


    static ArrayList<String> Q9(String line){
    	String [] data= line.split(",");
    	ArrayList<String> line1 = new ArrayList<String>(Arrays.asList(data));
        // Given a line containing comma-separated values, return an ArrayList of Strings containing each value in the
        // line separately. Example: Given "comma,separated,values" return ["comma","separated","values"] as 3 entries
        // in an ArrayList.

        return line1;
    }


    static HashMap<String, Integer> Q10(String filename){
    	HashMap<String, Integer> myHash = new HashMap<String,Integer>();
    	try {
    		for (String line: Files.readAllLines(Paths.get(filename))){
    			String [] data = line.split(",");
    			int k = new Integer (data[1]);
    			myHash.put(data[0], k);
    		}
    	}
    	catch (IOException ex){
    		ex.printStackTrace();
    	}



        // Read the input file and add an entry into a HashMap for each line. The lines will contain comma separated
        // values with a String then an int (ex: "text,5"). For each line enter the String as the key and the int as
        // a value into the map and return the map.

        return myHash;
    }


    static ArrayList<String> Q11(String filename){
    	ArrayList<String> myString = new ArrayList<String>();
    	try {
    		for (String line: Files.readAllLines(Paths.get(filename))){
    			String [] data = line.split(",");
    			myString.add(data[1]);
    		}
    	} catch (IOException ex){
    		ex.printStackTrace();
    	}

        // Read the file to populate an ArrayList of Strings and return the ArrayList. The file will be comma separated
        // and only the 2nd value (index 1) is to be added into the ArrayList

        return myString;
    }


    static ArrayList<Integer> Q12(String filename){
    	ArrayList<Integer> myInt = new ArrayList<Integer>();
    	try {
    		for (String line: Files.readAllLines(Paths.get(filename))){
    			String [] data = line.split(",");
    			int k = new Integer (data[2]);
    			myInt.add(k);
    		}
    	} catch (IOException ex){
    		ex.printStackTrace();
    	}
        // Read the file to populate an ArrayList of Integers and return the ArrayList. Each line of the file will
        // contain comma separated data and only the 3rd value (index 2) is to be added into the ArrayList as Integers.
        // You can assume the 3rd value on each line is a well-formed Integer.

        return myInt;
    }


    static void Q13(String filename, String data){
    	try {
    		String textToWrite= data;
    		Files.write(Paths.get(filename), textToWrite.getBytes());
    	} catch (IOException ex){
    		ex.printStackTrace();
    	}
        // create a new file named filename and write the contents of data into it

    }


    static void Q14(String filename, String data){

    	try{
    		String textToWrite = data;
    		Files.write(Paths.get(filename), textToWrite.getBytes(),StandardOpenOption.APPEND);
    	} catch (IOException ex){
    		ex.printStackTrace();
    	}
        // append the contents of data to the end of filename. You can assume a file named filename already exists

    }


    static void Q15(String inputFilename, String outputFilename){
    	String textToWrite = null;
    	try {
    		for (String line: Files.readAllLines(Paths.get(inputFilename))){
    			 textToWrite = line;
    		}
    		Files.write(Paths.get(outputFilename), textToWrite.getBytes());
    	} catch (IOException ex) {
    		ex.printStackTrace();
    	}
        // read every line in inputFilename and write it to a file named outputFilename (make a copy of the file)

    }



    public static void main(String[] args) {
        // sample usage
        System.out.println(Q1("data/test0.txt"));
    }

}
