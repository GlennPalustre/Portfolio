public class JavaZoo {
    // Attribute
    private static String zooName = "Java Park n Zoo";

    // Constructor for the outer JavaZoo class
    public JavaZoo() {
    }

    public static String getZooName() {
        return zooName;
    }

    @Override
    public String toString() {
        return "Zoo Name: " + zooName;
    }

    public static void main(String[] args) {
        // Instantiate the ZooAnimal class
        ZooAnimal animal1 = new JavaZoo().new ZooAnimal("Sam ", "Dog ", 17, true);
        ZooAnimal animal2 = new JavaZoo().new ZooAnimal(); // Default constructor
        ZooAnimal animal3 = new JavaZoo().new ZooAnimal("Katoy", "Monkey", 16, true);

        // Print the zoo information using the toString method
        JavaZoo zoo = new JavaZoo();
        System.out.println(zoo.toString());

        // Using toString method for animals
        System.out.println("Animal 1: " + animal1.toString());
        System.out.println("Animal 2: " + animal2.toString());
        System.out.println("Animal 3: " + animal3.toString());

        // Instantiate the Cage class
        Cage cage = new Cage();
        cage.setLength(5);
        cage.setWidth(5);
        cage.setHeight(5);
        System.out.println(cage.toString()); // Use toString method

        // Instantiate the ZooKeeper class
        ZooKeeper keeper = new ZooKeeper();
        keeper.setName("Ritsard");
        keeper.setTitle("Manager");
        keeper.setPlayRate(13.00);
        System.out.println(keeper.toString()); // Use toString method
    }

    public class ZooAnimal {
        private String name;
        private String type;
        private int age;
        private boolean hungry;

        // Null constructor
        public ZooAnimal() {
            this.name = "Bugoy";
            this.type = "Gorilla";
            this.age = 16;
            this.hungry = true;
        }

        // Constructor overloading
        public ZooAnimal(String name, String type, int age, boolean hungry) {
            this.name = name;
            this.type = type;
            this.age = age;
            this.hungry = hungry;
        }

        // Setters and Getters
        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHungry(boolean hungry) {
            this.hungry = hungry;
        }

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

        @Override
        public String toString() {
            return "ZooAnimal{name='" + name + "', type='" + type + "', age=" + age + ", hungry=" + hungry + "}";
        }
    } // end of ZooAnimal class

    public static class Cage {
        private int length;
        private int width;
        private int height;
        private boolean clean;
        private boolean covered;

        public Cage() {
            this.clean = true;
            this.covered = true;
        }

        // Setters and Getters
        public void setLength(int length) {
            this.length = length;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public boolean isClean() {
            return clean;
        }

        public boolean isCovered() {
            return covered;
        }

        @Override
        public String toString() {
            return "Cage{length=" + length + ", width=" + width + ", height=" + height + ", clean=" + clean + ", covered=" + covered + "}";
        }
    } // end of Cage class

    public static class ZooKeeper {
        private String name;
        private String title;
        private double playRate;
        private boolean degree;

        public ZooKeeper() {
            this.degree = false; // Initialize degree
        }

        // Setters and Getters
        public void setName(String name) {
            this.name = name;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPlayRate(double playRate) {
            this.playRate = playRate;
        }

        public String getName() {
            return name;
        }

        public String getTitle() {
            return title;
        }

        public double getPlayRate() {
            return playRate;
        }

        public boolean hasDegree() {
            return degree;
        }

        @Override
        public String toString() {
            return "ZooKeeper{name='" + name + "', title='" + title + "', playRate=" + playRate + ", hasDegree=" + degree + "}";
        }
    } // end of ZooKeeper class
}
