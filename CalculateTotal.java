import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses
    /*
    We can run through array and get value using .get(i)
    remember to run loop through array index 
    and store the value into new variable and adding it for total value in arrayList
    */
    for (int i = 0; i < expenses.size(); i++){
      total += expenses.get(i); //get -> catch the value based on index loop
    }
    
    System.out.println(total);
    
  }
  
}
