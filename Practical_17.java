class Shubham {
   
    void behaviour() {
        System.out.println("na padya baad msti na krvi");
    }
}


class Anger extends Shubham {
 
    void moves() {
        System.out.println("ignore kro guyssss");
    }
}

public class Main {
    public static void main(String[] args) {
      Shubham myd = new Shubham();
        myd.behaviour();  

        Anger mined = new Anger();
        mined.moves();  
    }
}
