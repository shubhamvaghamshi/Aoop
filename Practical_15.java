class Car {
    void sound() {
        System.out.println("its makes happyy");
    }
}


class Dodge extends Car {
    void model() {
        System.out.println("Dodge Charger");
    }
}


class BayerischeMotorenWerke extends Dodge {
    void speed() {
        System.out.println("top speed 300+kmph");
    }
}


public class Main {
    public static void main(String[] args) {
        BayerischeMotorenWerke Suiii = new BayerischeMotorenWerke();
        Suiii.sound(); 
        Suiii.model();   
        Suiii.speed();   
    }
}
