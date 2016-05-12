/**
 * 
 */
package labPrintTable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Cyanuro
 *
 */
public class PrintTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiplyBy = 1;
		
		try {
			
			PrintWriter newWriter = new PrintWriter(new FileWriter("TimesTable.txt", false));
			
			for(int i = 0; i < 5; i++) {
			
				int nextMultiplyBy = multiplyBy + 1;
			
				for(int j = 1; j <= 10; j++) {
					
					int multiplyByTimesJ = multiplyBy * j;
					int nextMultiplyByTimesJ = nextMultiplyBy * j;
					
					newWriter.println(j + " * " + multiplyBy + " = " + multiplyByTimesJ + "\t\t\t" + 
							j + " * " + nextMultiplyBy + " = " + nextMultiplyByTimesJ);
				}
					
			multiplyBy = nextMultiplyBy + 1;
			newWriter.println();
			
			}
			
		newWriter.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
