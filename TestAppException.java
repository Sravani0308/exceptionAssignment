package exceptionassignment;

class AgeException extends RuntimeException
{
	int age;
	public AgeException(int age)
	{
		super();
		this.age= age;
		System.out.println(age +" is lessthan 18");
	}
}
class User
{
	void checkAge(int age) 
	{
		if(age<18)
		{
			throw new AgeException(age);
			
		}
		else
		{
			System.out.println("you can vote");
		}
	}
	
}


public class TestAppException {

	public static void main(String[] args) {
		User user=new User();
		user.checkAge(28);
		

	}

}
