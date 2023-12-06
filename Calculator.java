public class Calculator {
  /*
  This is basic calculator. 
  We construct the calculator object and activate the method to put the parameter
  Mostly recieve two int parameter.
  You just need to choose the method that you need.
  Method: add, substract, multiply, divide, modulo. 
  */
  public Calculator() {

  }

  static int add(int a, int b) {
    return a + b;
  }

  static int substract(int a, int b) {
    return a - b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  static int divide(int a, int b) {
    return a / b;
  }

  static int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();

    System.out.println("5 + 7 = ");
    System.out.println(myCalculator.add(5,7));

    System.out.println("45 - 11 = ");
    System.out.println(myCalculator.substract(45, 11));

    System.out.println("45 - 11 = ");
    System.out.println(myCalculator.substract(45, 11));


  }

}
