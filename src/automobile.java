
public class automobile {

	int doors;
	int cylinders;
	int transmission;
	String color;
	String name;

	public automobile() {
		doors = 4;
		cylinders = 4;
		transmission = 4;
		color = "white";
		name = "car";
	}

	public int setNumberOfDoors(int d) {
		doors = d;
		return doors;
	}

	public int setNumberOfCylinders(int c) {
		cylinders = c;
		return cylinders;
	}

	public int setTransmission(int t) {
		transmission = t;
		return transmission;
	}

	public String setColor(String c) {
		color = c;
		return color;
	}

	public String setName(String n) {
		name = n;
		return name;
	}

	public String about() 
     { 
         String nameA = "Number of doors: " + doors+ "Number of cylinders: " + cylinders; 
        nameA = nameA +"Transmission: " + transmission; 
        nameA= nameA +"Color: " + color; 
        nameA = nameA +"Name: " + name; 
         return nameA; 
}
}