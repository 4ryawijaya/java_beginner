public class CarLoan {
	public static void main(String[] args) {
    /*
    This a car loan project that will check if its valid or not first
    and then check if its possible to fully paid by the user 
    When all condition is false, we can calculate remain payment and 
    make it into monthly payment with adding interest for each month.
    The total printed based on car price, loan length, down payment, and 
    we add interest rate.
    */
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      //transcation without interest
      int remainingBalance = carLoan - downPayment; //GET remaining balance when all condition above is false
      int months = loanLength * 12; //years to months for monthly payment
      int monthlyBalance = remainingBalance / months;

      //interest rate
      int interest = monthlyBalance * interestRate / 100;

      //monthly payment
      int monthlyPayment = monthlyBalance + interest;

      //get the check print out for payment
      System.out.println("It will spent " + monthlyPayment + " for monthly car loan payment.");
    }

	

	}
}
