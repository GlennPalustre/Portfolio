public class JavaZoo1 {
    public static void main(String[] args) {
		
		
        ZooAnimal animal = new ZooAnimal(); 
        
		System.out.println("ZOO ANIMAL");
        animal.setName("Sam");
        animal.setType("Monkey");
        animal.setAge(17);
        
        System.out.println("Name: " + animal.getName());  
        System.out.println("Type: " + animal.getType());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Is Hungry: " + animal.isHungry()); 
		
		Cage cage = new Cage();
		
		System.out.println(" ");
		System.out.println("CAGE");
		cage.setLength(25);
		cage.setWidth(30);
		cage.setHeight(25);
		
		System.out.println("Length: " + cage.getLength());
		System.out.println("Width: " + cage.getWidth());
		System.out.println("Height: " + cage.getHeight());
		System.out.println("Clean: " + cage.isClean());
		System.out.println("Covered: " + cage.isCovered());
		
		
		ZooKeeper keeper = new ZooKeeper();
		
		System.out.println(" ");
		System.out.println("ZOO KEEPER");
		keeper.setName("Ritsard");
		keeper.setTitle("Manager");
		keeper.setplayRate(15.00);
		
		System.out.println("Name: " + keeper.getName());
		System.out.println("Title: " + keeper.getName());
		System.out.println("playRate: " + keeper.getplayRate());
		System.out.println("Degree: " + keeper.hasDegree());



    }
}

class ZooAnimal { 

    private String name;
    private String type;
    private int age;
    private boolean hungry;
    
    public ZooAnimal() {
        this.hungry = true; 
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setType(String type) {
        this.type = type; 
    }
    
    public void setAge(int age) {
        this.age = age; 
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean isHungry() {
        return hungry;
    }
}

class Cage{
	
	private int length;
	private int width;
	private int height;
	private boolean clean;
	private boolean covered;
	
	public Cage(){
		this.clean = true;
		this.covered = true;
	}
	
	//setters
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
    //getters
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public boolean isClean(){
		return clean;
	}
	public boolean isCovered(){
		return covered;
	}
}

class ZooKeeper{
	
	private String name;
	private String title;
	private double playRate;
	private boolean degree;
	
	public ZooKeeper(){
		this.degree = false;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setplayRate(double playRate){
		this.playRate = playRate;
	}

    //getters
	public String getName(){
		return name;
	}
	public String getTitle(){
		return title;
	}
	public double getplayRate(){
		return playRate;
	}
	public boolean hasDegree(){
		return degree;
	}
}