package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Finally block is used to write all our closing statements....
 * In all cases whether exception occurs or not the finally block will be executed hence 
 * making sure that all the open streams or files are closed properly before terminating the 
 * program.
 * 
 *  
 *  try{}
 *  catch(){}
 *  finally{}

 * try{}
 * finally{}
 */
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis =null;
		
		try {
		fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
