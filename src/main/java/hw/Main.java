package hw;

public class Main {

  public static void main(String[] args) {
  
  int input;
  
   if(args[0]!=null){
    input = Integer.parseInt(args[0]);
    
    if ( input <= 0) System.out.println("Need a positive input");
    else{
     for(int i=0; i<input; i++){
      if(i%3 == 0 ) System.out.print("Fizz ");
      if(i%5 == 0 )  System.out.print("Buzz");
      if(i%3 != 0 && i%5 != 0) System.out.print(i);

      System.out.println();
      }
    }
    
   }
   
  }
}
