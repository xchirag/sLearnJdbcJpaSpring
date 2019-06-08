package testProject;

public class Employee1 {

	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {

		Employee1 employee = new Employee1(15, "victor", "addressofHome"); // get
																			// data
																			// from
																			// client
		Employee1 employee2 = new Employee1(1, "pazzi", "addfHome"); // get data
																		// from
																		// client
		ArrayWithoutStatic ar = new ArrayWithoutStatic();
		ar.addEmpmloyee(employee);
		ar.addEmpmloyee(employee2);

		System.out.println(ar.getAllEmployees().length);

		for (Employee1 emp : ar.getAllEmployees()) {
			if (emp != null) {
				System.out.print(emp.getId() + " ");
				System.out.print(emp.getName() + " ");
				System.out.print(emp.getAddress() + " ");
				System.out.println();
			}
			else {
				System.out.println("location is available!");
			}

		}
		
	// ArrayWithoutStatic Ar1 = new Employee (employeeID, name, jobTitle);
	// annoymouse object can be created as 
	}

}
