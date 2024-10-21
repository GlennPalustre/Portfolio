public class JavaZoo {

    // attribute
    private static String zooName = "Java Park n Zoo";

    // constructor
    public JavaZoo() {
    }

    public static void main(String[] args) {

        // instantiate the ZooAnimal class;
        // create a copy

        ZooAnimal animal = new ZooAnimal();
        ZooAnimal animal2 = new ZooAnimal();
        ZooAnimal animal3 = new ZooAnimal("Sam", "Orangutan", 17, true);

        // setter
        // reference.method;
        animal.setName("Bugoy");
        animal.setType("Gorilla");
        animal.setAge(16);
        animal.setHungry(true);
        // getter

        System.out.println("The name of the animal is " + animal.getName());
        System.out.println("The type of the animal is " + animal.getType());
        System.out.println("The age of the animal is " + animal.getAge());
        System.out.println("The animal is hungry: " + animal.isHungry());

        System.out.println("The second\n");
        System.out.println("Name: " + animal2.getName());
        System.out.println("Type: " + animal2.getType());
        System.out.println("Age: " + animal2.getAge());
        // System.out.println("Hungry: " + animal2.isHungry()); // No need to print since default is false

        System.out.println("The third\n");
        System.out.println("Name: " + animal3.getName());
        System.out.println("Type: " + animal3.getType());
        System.out.println("Age: " + animal3.getAge());
        System.out.println("Hungry: " + animal3.isHungry());

    } // end of main method
} // end of class

class ZooAnimal {
    private String name;
    private String type;
    private int age;
    private boolean hungry;

    public ZooAnimal() {
        this.name = "Katoy";
        this.type = "Monkey";
        this.age = 16;
        this.hungry = false;
    }

    public ZooAnimal(String name, String type, int age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return this.hungry;
    }
    
    public String toString() {
        return "ZooAnimal{" + "name='" + name + '\'' + ", type='" + type + '\'' + ", age=" + age + ", hungry=" + hungry + '}';
    }
}