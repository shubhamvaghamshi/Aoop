class Rectangle {
  int length;
  int width;

  
  Rectangle() {
      length = 5;
      width = 10;
      System.out.println("Default Constructor: Length = " + length + ", Width = " + width);
  }

  
  Rectangle(int l, int w) {
      length = l;
      width = w;
      System.out.println("Parameterized Constructor: Length = " + length + ", Width = " + width);
  }
}

class SSS {
  public static void main(String[] args) {
      
      Rectangle r1 = new Rectangle();

            Rectangle r2 = new Rectangle(7, 12);
  }
}

