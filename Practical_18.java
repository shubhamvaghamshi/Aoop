
class Bike {
    String name;
    int topSpeed;

   
   Bike (String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return "Bike Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
       
        Bike Bike1 = new Bike("Sphonda",150);
        Bike Bike2 = new Bike("shin", 150);
        Bike Bike3 = new Bike("splender", 100);
       Bike Bike4 = new Bike("rider", 110);
       Bike Bike5 = new Bike("Zx 10r", 299);

        
        System.out.println(Bike1);
        System.out.println(Bike2);
        System.out.println(Bike3);
        System.out.println(Bike4);
        System.out.println(Bike5);
    }
}
