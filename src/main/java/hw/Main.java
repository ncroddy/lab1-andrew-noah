package hw;

public class Main {

  public static void main(String[] args) {
  
  int input;
  
   if(args[0]!=null){
    input = Integer.parseInt(args[0]);
   
    for(int i = 0; i < input; i++){
     System.out.println(fizzBuzzArray(input)[i]);  
  
    }
   }
  }
  
public static String[] fizzBuzzArray(final int n){
 String[] output = new String [n];
 
  if ( n <= 0) System.out.println("Need a positive input");
    else{
     for(int i=0; i<n; i++){
      if(i%3 == 0 ) output[i]= "Fizz";
      if(i%5 == 0 )  output[i] = "Buzz";
      if(i%3 == 0 && i%5 == 0) output[i] = "Fizz Buzz";
      if(i%3 != 0 && i%5 != 0) output[i] = Integer.toString(i);
     }
    }
    return output;
  }
}