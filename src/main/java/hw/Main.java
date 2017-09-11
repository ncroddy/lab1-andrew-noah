package hw;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  
  int input;
  Scanner keyboard = new Scanner(System.in);
    
  input = keyboard.nextInt(); 
   
   for(int i=0; i<input; i++){
      if(i%3 == 0 ) System.out.print("Fizz ");
      if(i%5 == 0 )  System.out.print("Buzz");
      if(i%3 != 0 && i%5 != 0) System.out.print(i);

      System.out.println();
      }
      
    keyboard.close(); 
    
    return;
  }
}
