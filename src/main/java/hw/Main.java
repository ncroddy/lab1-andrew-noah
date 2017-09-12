package hw;

import java.util.*;

public class Main {

  public static void main(String[] args) {
  
  int input;
  
   if(args[0]!=null){
    input = Integer.parseInt(args[0]);
   
    for(int i = 0; i < input; i++){
     System.out.println(fizzBuzzList(input).get(i));  
  
    }
   }
  }
  
public static List<String> fizzBuzzList(final int n){
 if(n>0){
 List<String> output = new ArrayList<String>();
 
  if ( n <= 0) System.out.println("Need a positive input");
    else{
     for(int i=1; i<=n; i++){
      if(i%3 == 0 ) output.add(i-1,"Fizz");
      if(i%5 == 0 ) output.add(i-1,"Buzz");
      if(i%3 == 0 && i%5 == 0) output.add(i-1,"Fizz Buzz");
      if(i%3 != 0 && i%5 != 0) output.add(i-1,Integer.toString(i));
     }
    }
    return output;
   }
   else{
    return null;
   }
  }
}