package foo;


public class Robot {
	
	
	private String name;
	
	private float wage;
	
	private Weapon weapon;

	
	public void robot_init(){
		System.out.println("robot init method called");
	}
	
	public void setName(String name) {
		System.out.println("Setting :   " + name);
		this.name = name;
	}

	public Robot(){
		System.out.println("Robot done!");
	}
	
	public Robot(float w){
		wage = w;
		System.out.println("seeting wage to via Float : " + w);
	}

	public Robot(int w){
		wage = w;
		System.out.println("seeting wage to via Integer : " + w);
	}

	public Robot(Weapon w){
		super();
		this.weapon = w;
		System.out.println("arming the robot through constructor");
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
		System.out.println("Arming hte Robot!!");
	}

	
}
