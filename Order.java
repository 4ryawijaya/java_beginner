public class Order {
  /*
  Create OOP for order and shipping cost
  learn to built up method by using switch case for checking on parameter inputted
  First define the instance
  and then input the paramter based on constructor
  now we can call the class method one by one.
  Good luck!
  
  */
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // create instances and call methods here!
    Order order1 = new Order(true, 90.00, "Express");
    order1.ship();
    order1.calculateShipping();

    Order order2 = new Order(false, 200.0, "promo50");
    order2.ship();
    order2.calculateShipping();
  }
}
