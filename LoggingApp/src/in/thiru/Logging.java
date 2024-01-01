package in.thiru;

import java.util.logging.Logger;


/*
 
[12:20] Soumya (Guest)
Logger library with capabilities listed below

	- Write 3 types of log ERROR, INFO, DEBUG

	- Read logs based on 3 criteria 1) All the logs 2) Based on type 3) Based on date range

	- Configurable option to decide where to keep log 1) file system 2) DB
 
How to manage log files?
 
What is there is 1 GB logs, how to maintain logs for years?

 */

//TRACE, DEBUG, INFO,WARN, ERROR, FATAL
public class Logging 
{

	public  boolean getLogging()
	{
		Logger logger = Logger.getLogger("");
		
		try {
			logger.getLogger("Error message  :: ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		
		
		
		
		
	}
	
}
