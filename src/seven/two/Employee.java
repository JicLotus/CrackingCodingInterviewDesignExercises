package seven.two;

public class Employee {
	Employee nextEmployee;
	boolean enable=true;
	
	public Employee(Employee _nextEmployee)
	{
		this.nextEmployee = _nextEmployee;
	}
	
	public void dispatchCall() 
	{
		if (enable)enable=false;
		else nextEmployee.dispatchCall();
	}
	
}
