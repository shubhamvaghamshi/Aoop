
final class Car {
    String name;

   
    Car(String name) {
        this.name = name;
    }

    
    void display() {
        System.out.println("Car name: " + name);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Car myBmw = new Car("Dodge Chellenger ");
        myBmw.display();
    }
}
