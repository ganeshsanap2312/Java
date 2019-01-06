class MyownException extends Exception
{
	public MyownException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}	
	
	}
public class Test{
		
	
	public void ageTest(int age) throws MyownException
	{
		if(age < 5)
		{
			throw new MyownException(" Age can't lesss than 5");
		}
		else
			System.out.println("valid input");
	}
	
	public static void main(String args[])
	{
		Test t = new Test();
		
		try {
			t.ageTest(6);
		} catch (MyownException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Age is less");
		}
		
	}
	
}
