public class Droid {
  /*
  This is a droid program to learn Object Oriented by building Droid class.
  First we define class, and then attribute.
  Second we create constructor to object and attribute together
  Third we can define class method and using it on main function
  Remember, void method always has no return, so when we want to print something just put it on the method
  */
  //attribute
  String name;
  int batteryLevel;

  //constructor
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyLevel() {
    System.out.println(name + " current battery level is " + batteryLevel);
  }

  public void energyTransfer(Droid recipient, int amount){
    if (batteryLevel >= amount) {
      batteryLevel -= amount;   // Decrease energy from the source instance
      recipient.batteryLevel += amount;  // Increase energy for the recipient instance
      System.out.println(recipient + " just got " + amount + " of energy.");
    } else {
      System.out.println("The droid does not have enough energy.");
    }
  }

  
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    Droid namek = new Droid("Namek");

    System.out.println(codey);
    System.out.println(namek);

    codey.energyLevel();
    namek.energyLevel();

    codey.performTask("killing");
    codey.performTask("cooking");
    codey.energyLevel();

    namek.performTask("farming");
    namek.performTask("gambling");
    namek.energyLevel();

    codey.energyTransfer(namek, 60);
    codey.energyLevel();
    namek.energyLevel();

    namek.energyTransfer(codey, 130);
    
  }
}
