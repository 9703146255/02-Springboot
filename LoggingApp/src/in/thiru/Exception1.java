package in.thiru;

public class Exception1 {
	
	
	public int getStudentId(int num) {

		try 
		{
			
			return 1;
		} 
		catch (Exception e) 
		{
			return 2;
		}
		finally
		{
			System.out.println("finally block ");
			
			return 3;
		}
		
		
		

	}

}



