package testProject;


public class ArrayWithoutStatic {

	private Employee1[] employees;
	private int counter;
	
	public ArrayWithoutStatic (){
		
		this.employees = new Employee1[10]; //employee is a class defined others
		this.counter = 0;
	}
	
	public void addEmpmloyee (Employee1 employee){
		if(this.counter < employees.length){
			this.employees[counter] = employee;
			this.counter++;
 		}
	}
	
	public Employee1[] getAllEmployees (){
		return this.employees; //returning array of objects
	}
	
	
}
