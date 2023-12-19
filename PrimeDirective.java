// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  //check if an integer is prime number
  public boolean isPrime(int number) {
    //true if number is prime
    //false if number is not prime
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    //if (number % 2 != 0 && number % number-1 != 0)
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    } return true;
  }

  //check if an integer is even number
  public boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  //check if an integer is odd number
  public boolean isOdd(int number) {
    if (number % 2 == 0) {
      return false;
    } else {
      return true;
    }
  }

  //METHOD THAT RUN ON ARRAY LIST
  //get only prime numbers 
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>(); 

    for (int number: numbers) {
      if (isPrime(number) == true) {
        primes.add(number);
      }
    }
     return primes;
  }

   //get only even numbers 
  public ArrayList<Integer> onlyEven(int[] numbers){
    ArrayList<Integer> evens = new ArrayList<>();

    for (int number: numbers) {
      if(isEven(number) == true) {
        evens.add(number);
      }
    }
    return evens;
  }

   //get only odd numbers 
  public ArrayList<Integer> onlyOdd(int[] numbers){
    ArrayList<Integer> odds = new ArrayList<>();

    for (int number: numbers) {
      if(isOdd(number) == true) {
        odds.add(number);
      }
    }
    return odds;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    
    System.out.println(pd.isOdd(2));
    System.out.println(pd.isOdd(3));

  // System.out.println(pd.onlyPrimes(numbers));
    System.out.println(pd.onlyEven(numbers));
    System.out.println(pd.onlyOdd(numbers));
    
  }  

}
