class Shubham {
 
    final int MAX_VALUE = 100;

    final void displayMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        Shubham s1 = new Shubham();
 
        System.out.println("MAX_VALUE: " + s1.MAX_VALUE);

        s1.displayMessage();
    }
}

